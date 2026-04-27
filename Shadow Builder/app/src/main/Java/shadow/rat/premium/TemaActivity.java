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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class TemaActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String sablon = "";
	
	private LinearLayout linear1;
	private LinearLayout linearbaslik;
	private LinearLayout linear3;
	private ScrollView vscroll1;
	private TextView textview1;
	private ImageView imageview11;
	private LinearLayout linearbg;
	private LinearLayout linearhackergreen;
	private LinearLayout linear11;
	private LinearLayout linearredhacker;
	private LinearLayout linear55;
	private LinearLayout linearcyberblue;
	private LinearLayout linear60;
	private LinearLayout linearpurpledoom;
	private LinearLayout linear81;
	private LinearLayout linearyellowstandart;
	private LinearLayout linear94;
	private LinearLayout linearbigblue;
	private LinearLayout linear103;
	private LinearLayout linearwhitebanner;
	private LinearLayout linear108;
	private LinearLayout linearneonbold;
	private LinearLayout linear113;
	private LinearLayout linearwhitered;
	private LinearLayout linear118;
	private LinearLayout linearkalinmatrix;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private CardView cardview1;
	private ImageView imageview1;
	private TextView textview2;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private CardView cardview2;
	private ImageView imageview2;
	private TextView textview4;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private CardView cardview3;
	private ImageView imageview3;
	private TextView textview6;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private CardView cardview4;
	private ImageView imageview4;
	private TextView textview16;
	private LinearLayout linear91;
	private LinearLayout linear92;
	private CardView cardview5;
	private ImageView imageview5;
	private TextView textview22;
	private LinearLayout linear100;
	private LinearLayout linear101;
	private CardView cardview6;
	private ImageView imageview6;
	private TextView textview26;
	private LinearLayout linear105;
	private LinearLayout linear106;
	private CardView cardview7;
	private ImageView imageview7;
	private TextView textview28;
	private LinearLayout linear110;
	private LinearLayout linear111;
	private CardView cardview8;
	private ImageView imageview8;
	private TextView textview30;
	private LinearLayout linear115;
	private LinearLayout linear116;
	private CardView cardview9;
	private ImageView imageview9;
	private TextView textview32;
	private LinearLayout linear120;
	private LinearLayout linear121;
	private CardView cardview10;
	private ImageView imageview10;
	private TextView textview34;
	
	private Intent intent = new Intent();
	private AlertDialog.Builder dialog;
	private TimerTask t;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tema);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linearbaslik = findViewById(R.id.linearbaslik);
		linear3 = findViewById(R.id.linear3);
		vscroll1 = findViewById(R.id.vscroll1);
		textview1 = findViewById(R.id.textview1);
		imageview11 = findViewById(R.id.imageview11);
		linearbg = findViewById(R.id.linearbg);
		linearhackergreen = findViewById(R.id.linearhackergreen);
		linear11 = findViewById(R.id.linear11);
		linearredhacker = findViewById(R.id.linearredhacker);
		linear55 = findViewById(R.id.linear55);
		linearcyberblue = findViewById(R.id.linearcyberblue);
		linear60 = findViewById(R.id.linear60);
		linearpurpledoom = findViewById(R.id.linearpurpledoom);
		linear81 = findViewById(R.id.linear81);
		linearyellowstandart = findViewById(R.id.linearyellowstandart);
		linear94 = findViewById(R.id.linear94);
		linearbigblue = findViewById(R.id.linearbigblue);
		linear103 = findViewById(R.id.linear103);
		linearwhitebanner = findViewById(R.id.linearwhitebanner);
		linear108 = findViewById(R.id.linear108);
		linearneonbold = findViewById(R.id.linearneonbold);
		linear113 = findViewById(R.id.linear113);
		linearwhitered = findViewById(R.id.linearwhitered);
		linear118 = findViewById(R.id.linear118);
		linearkalinmatrix = findViewById(R.id.linearkalinmatrix);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		cardview1 = findViewById(R.id.cardview1);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		cardview2 = findViewById(R.id.cardview2);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		linear57 = findViewById(R.id.linear57);
		linear58 = findViewById(R.id.linear58);
		cardview3 = findViewById(R.id.cardview3);
		imageview3 = findViewById(R.id.imageview3);
		textview6 = findViewById(R.id.textview6);
		linear78 = findViewById(R.id.linear78);
		linear79 = findViewById(R.id.linear79);
		cardview4 = findViewById(R.id.cardview4);
		imageview4 = findViewById(R.id.imageview4);
		textview16 = findViewById(R.id.textview16);
		linear91 = findViewById(R.id.linear91);
		linear92 = findViewById(R.id.linear92);
		cardview5 = findViewById(R.id.cardview5);
		imageview5 = findViewById(R.id.imageview5);
		textview22 = findViewById(R.id.textview22);
		linear100 = findViewById(R.id.linear100);
		linear101 = findViewById(R.id.linear101);
		cardview6 = findViewById(R.id.cardview6);
		imageview6 = findViewById(R.id.imageview6);
		textview26 = findViewById(R.id.textview26);
		linear105 = findViewById(R.id.linear105);
		linear106 = findViewById(R.id.linear106);
		cardview7 = findViewById(R.id.cardview7);
		imageview7 = findViewById(R.id.imageview7);
		textview28 = findViewById(R.id.textview28);
		linear110 = findViewById(R.id.linear110);
		linear111 = findViewById(R.id.linear111);
		cardview8 = findViewById(R.id.cardview8);
		imageview8 = findViewById(R.id.imageview8);
		textview30 = findViewById(R.id.textview30);
		linear115 = findViewById(R.id.linear115);
		linear116 = findViewById(R.id.linear116);
		cardview9 = findViewById(R.id.cardview9);
		imageview9 = findViewById(R.id.imageview9);
		textview32 = findViewById(R.id.textview32);
		linear120 = findViewById(R.id.linear120);
		linear121 = findViewById(R.id.linear121);
		cardview10 = findViewById(R.id.cardview10);
		imageview10 = findViewById(R.id.imageview10);
		textview34 = findViewById(R.id.textview34);
		dialog = new AlertDialog.Builder(this);
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dialog.setTitle("Temalar");
				dialog.setMessage("Temalar ratın güvenilirliğini arttırmak için kullanılır");
				dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
			}
		});
		
		linearhackergreen.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "hackergreen";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearredhacker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "redhacker";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearcyberblue.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "cyberblue";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearpurpledoom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "purpledoom";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearyellowstandart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "standartsarı";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearbigblue.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "buyukmavi";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearwhitebanner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "whitebanner";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearneonbold.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "kalinneon";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearwhitered.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "kirmizibeyaz";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
		
		linearkalinmatrix.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								sablon = "kalinmatrix";
								intent.setClass(getApplicationContext(), SablonActivity.class);
								intent.putExtra("tema", sablon);
								startActivity(intent);
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
			}
		});
	}
	
	private void initializeLogic() {
		linearhackergreen.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearredhacker.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearcyberblue.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearpurpledoom.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearyellowstandart.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearbigblue.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearwhitebanner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearbigblue.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearneonbold.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearkalinmatrix.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearwhitered.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
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