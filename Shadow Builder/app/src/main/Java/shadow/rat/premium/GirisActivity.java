package shadow.rat.premium;

import android.animation.*;
import android.app.*;
import android.content.*;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class GirisActivity extends AppCompatActivity {
	
	private HashMap<String, Object> map = new HashMap<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linearinfo;
	private LinearLayout linear5;
	private LinearLayout linearlogin;
	private TextView textview1;
	private LinearLayout linearkutucuk;
	private TextView textview3;
	private ImageView imageview1;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextInputLayout textinputlayoutmail;
	private LinearLayout linear9;
	private TextInputLayout textinputlayout2;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private TextView textview2;
	private EditText edittext1;
	private EditText edittext2;
	private TextView textview4;
	private Button button3;
	private LinearLayout linear12;
	private Button button4;
	
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
	private Intent intent = new Intent();
	private Intent web = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.giris);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linearinfo = findViewById(R.id.linearinfo);
		linear5 = findViewById(R.id.linear5);
		linearlogin = findViewById(R.id.linearlogin);
		textview1 = findViewById(R.id.textview1);
		linearkutucuk = findViewById(R.id.linearkutucuk);
		textview3 = findViewById(R.id.textview3);
		imageview1 = findViewById(R.id.imageview1);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		textinputlayoutmail = findViewById(R.id.textinputlayoutmail);
		linear9 = findViewById(R.id.linear9);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		textview4 = findViewById(R.id.textview4);
		button3 = findViewById(R.id.button3);
		linear12 = findViewById(R.id.linear12);
		button4 = findViewById(R.id.button4);
		fauth = FirebaseAuth.getInstance();
		
		linearinfo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					((EditText)edittext1).setError("Boş Olamaz!");
				} else {
					if (edittext2.getText().toString().equals("")) {
						((EditText)edittext2).setError("Boş Olamaz!");
					} else {
						map = new HashMap<>();
						map.put("mail", edittext1.getText().toString());
						map.put("sifre", edittext2.getText().toString());
						fauth.createUserWithEmailAndPassword(edittext1.getText().toString(), edittext2.getText().toString()).addOnCompleteListener(GirisActivity.this, _fauth_create_user_listener);
					}
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					((EditText)edittext1).setError("Boş Olamaz!");
				} else {
					if (edittext2.getText().toString().equals("")) {
						((EditText)edittext2).setError("Boş Olamaz!");
					} else {
						map = new HashMap<>();
						map.put("mail", edittext1.getText().toString());
						map.put("sifre", edittext2.getText().toString());
						fauth.signInWithEmailAndPassword(edittext1.getText().toString(), edittext2.getText().toString()).addOnCompleteListener(GirisActivity.this, _fauth_sign_in_listener);
					}
				}
			}
		});
		
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
				if (_success) {
					intent.setClass(getApplicationContext(), MenuActivity.class);
					startActivity(intent);
					finish();
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					intent.setClass(getApplicationContext(), MenuActivity.class);
					startActivity(intent);
					SketchwareUtil.showMessage(getApplicationContext(), "Hoşgeldiniz");
					finish();
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
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
		linearinfo.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearlogin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearkutucuk.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		textinputlayoutmail.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFF1A1A1A));
		textinputlayout2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFF1A1A1A));
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