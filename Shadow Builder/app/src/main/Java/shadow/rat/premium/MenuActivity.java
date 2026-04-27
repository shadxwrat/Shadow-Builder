package shadow.rat.premium;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MenuActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> lm = new ArrayList<>();
	
	private LinearLayout linear1;
	private BottomNavigationView bottomnavigation1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linearinfo;
	private LinearLayout linear5;
	private ListView listview1;
	private TextView textview1;
	private ImageView imageview2;
	private LinearLayout linearkutucuk;
	private TextView textview2;
	private ImageView imageview1;
	
	private Intent intent = new Intent();
	private SharedPreferences sp;
	private RequestNetwork req;
	private RequestNetwork.RequestListener _req_request_listener;
	private Intent web = new Intent();
	private com.google.android.material.bottomsheet.BottomSheetDialog bottom;
	private FirebaseAuth fauth;
	private OnCompleteListener<AuthResult> _fauth_create_user_listener;
	private OnCompleteListener<AuthResult> _fauth_sign_in_listener;
	private OnCompleteListener<Void> _fauth_reset_password_listener;
	private OnCompleteListener<Void> fauth_updateEmailListener;
	private OnCompleteListener<Void> fauth_updatePasswordListener;
	private OnCompleteListener<Void> fauth_emailVerificationSentListener;
	private OnCompleteListener<Void> fauth_deleteUserListener;
	private OnCompleteListener<Void> fauth_updateProfileListener;
	private OnCompleteListener<AuthResult> fauth_phoneAuthListener;
	private OnCompleteListener<AuthResult> fauth_googleSignInListener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		linear1 = findViewById(R.id.linear1);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linearinfo = findViewById(R.id.linearinfo);
		linear5 = findViewById(R.id.linear5);
		listview1 = findViewById(R.id.listview1);
		textview1 = findViewById(R.id.textview1);
		imageview2 = findViewById(R.id.imageview2);
		linearkutucuk = findViewById(R.id.linearkutucuk);
		textview2 = findViewById(R.id.textview2);
		imageview1 = findViewById(R.id.imageview1);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		req = new RequestNetwork(this);
		fauth = FirebaseAuth.getInstance();
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					
				}
				if (_itemId == 1) {
					if (SketchwareUtil.isConnected(getApplicationContext())) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://t.me/shadxwrat"));
						startActivity(web);
					} else {
						SketchwareUtil.showMessage(getApplicationContext(), "İnternete Bağlı Değilsiniz!");
					}
				}
				return true;
			}
		});
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				bottom = new com.google.android.material.bottomsheet.BottomSheetDialog(MenuActivity.this);
				View bottomV;
				bottomV = getLayoutInflater().inflate(R.layout.view,null );
				bottom.setContentView(bottomV);
				bottom.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				final LinearLayout lineargoruntule = (LinearLayout) bottomV.findViewById(R.id.lineargoruntule);
				final LinearLayout lineardosya = (LinearLayout) bottomV.findViewById(R.id.lineardosya);
				final LinearLayout lineartg = (LinearLayout) bottomV.findViewById(R.id.lineartg);
				bottom.show();
				lineargoruntule.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)40, (int)2, 0xFF212121, Color.TRANSPARENT));
				lineardosya.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)40, (int)2, 0xFF212121, Color.TRANSPARENT));
				lineartg.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)40, (int)2, 0xFF212121, Color.TRANSPARENT));
				lineardosya.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if (!FileUtil.isExistFile(FileUtil.getPublicDir(Environment.DIRECTORY_DOWNLOADS).concat("/".concat("Shadow Builder")))) {
							FileUtil.makeDir(FileUtil.getPublicDir(Environment.DIRECTORY_DOWNLOADS).concat("/".concat("Shadow Builder")));
							FileUtil.writeFile(FileUtil.getPublicDir(Environment.DIRECTORY_DOWNLOADS).concat("/".concat("Shadow Builder/").concat(lm.get((int)_position).get("başlık").toString().concat(".py"))), lm.get((int)_position).get("kod").toString());
							SketchwareUtil.showMessage(getApplicationContext(), "Proje".concat(FileUtil.getExternalStorageDir().concat("/Shadow Builder/".concat(lm.get((int)_position).get("başlık").toString().concat(".py".concat("Yoluna Kaydedildi."))))));
						} else {
							FileUtil.writeFile(FileUtil.getPublicDir(Environment.DIRECTORY_DOWNLOADS).concat("/".concat("Shadow Builder/").concat(lm.get((int)_position).get("başlık").toString().concat(".py"))), lm.get((int)_position).get("kod").toString());
							SketchwareUtil.showMessage(getApplicationContext(), "Proje".concat(FileUtil.getExternalStorageDir().concat("/Shadow Builder/".concat(lm.get((int)_position).get("başlık").toString().concat(".py".concat("Yoluna Kaydedildi."))))));
						}
					}
				});
				lineargoruntule.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "Mevcut Değil");
					}
				});
				lineartg.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://t.me/shadxwrat"));
						startActivity(web);
					}
				});
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), OlusturActivity.class);
				startActivity(intent);
			}
		});
		
		_req_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		fauth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					FirebaseAuth.getInstance().signOut();
					intent.setClass(getApplicationContext(), MainActivity.class);
					startActivity(intent);
					finish();
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		fauth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		fauth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_fauth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		if (sp.getString("data", "").equals("")) {
			
		} else {
			lm = new Gson().fromJson(sp.getString("data", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(lm));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
		bottomnavigation1.getMenu().add(0, 0, 0, "Menu").setIcon(R.drawable.menu);
		bottomnavigation1.getMenu().add(0, 1, 0, "Telegram").setIcon(R.drawable.telegram);
		linearinfo.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		if (sp.getString("data", "").equals("")) {
			
		} else {
			lm = new Gson().fromJson(sp.getString("data", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(lm));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
	}
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.list, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			textview1.setText(_data.get((int)_position).get("başlık").toString());
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)3, 0xFF263238, 0xFF212121));
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)3, 0xFF263238, 0xFF212121));
			
			return _view;
		}
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