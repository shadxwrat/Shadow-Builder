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
import android.widget.EditText;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.*;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class SablonActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private String sablon = "";
	private String kod = "";
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear11;
	private ScrollView vscroll1;
	private TextView textview1;
	private ImageView imageview2;
	private CardView cardview1;
	private ImageView imageview1;
	private LinearLayout linear13;
	private LinearLayout linearbanneryazi;
	private LinearLayout linear6;
	private LinearLayout lineardipnot1;
	private LinearLayout linear9;
	private LinearLayout lineardipnot2;
	private LinearLayout linear14;
	private LinearLayout lineartoken;
	private LinearLayout linear16;
	private LinearLayout linearid;
	private LinearLayout linear18;
	private LinearLayout linearsonmesaj;
	private TextView textview2;
	private TextInputLayout textinputlayout1;
	private EditText edittext1;
	private TextView textview3;
	private TextInputLayout textinputlayout2;
	private EditText edittext2;
	private TextView textview4;
	private TextInputLayout textinputlayout3;
	private EditText edittext3;
	private TextView textview5;
	private TextInputLayout textinputlayout4;
	private EditText edittext4;
	private TextView textview6;
	private TextInputLayout textinputlayout5;
	private EditText edittext5;
	private TextView textview7;
	private TextInputLayout textinputlayout6;
	private EditText edittext6;
	
	private Intent intent = new Intent();
	private TimerTask timer;
	private com.google.android.material.bottomsheet.BottomSheetDialog bs;
	private ProgressDialog pd;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.sablon);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear11 = findViewById(R.id.linear11);
		vscroll1 = findViewById(R.id.vscroll1);
		textview1 = findViewById(R.id.textview1);
		imageview2 = findViewById(R.id.imageview2);
		cardview1 = findViewById(R.id.cardview1);
		imageview1 = findViewById(R.id.imageview1);
		linear13 = findViewById(R.id.linear13);
		linearbanneryazi = findViewById(R.id.linearbanneryazi);
		linear6 = findViewById(R.id.linear6);
		lineardipnot1 = findViewById(R.id.lineardipnot1);
		linear9 = findViewById(R.id.linear9);
		lineardipnot2 = findViewById(R.id.lineardipnot2);
		linear14 = findViewById(R.id.linear14);
		lineartoken = findViewById(R.id.lineartoken);
		linear16 = findViewById(R.id.linear16);
		linearid = findViewById(R.id.linearid);
		linear18 = findViewById(R.id.linear18);
		linearsonmesaj = findViewById(R.id.linearsonmesaj);
		textview2 = findViewById(R.id.textview2);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		edittext1 = findViewById(R.id.edittext1);
		textview3 = findViewById(R.id.textview3);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		edittext2 = findViewById(R.id.edittext2);
		textview4 = findViewById(R.id.textview4);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		edittext3 = findViewById(R.id.edittext3);
		textview5 = findViewById(R.id.textview5);
		textinputlayout4 = findViewById(R.id.textinputlayout4);
		edittext4 = findViewById(R.id.edittext4);
		textview6 = findViewById(R.id.textview6);
		textinputlayout5 = findViewById(R.id.textinputlayout5);
		edittext5 = findViewById(R.id.edittext5);
		textview7 = findViewById(R.id.textview7);
		textinputlayout6 = findViewById(R.id.textinputlayout6);
		edittext6 = findViewById(R.id.edittext6);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				bs = new com.google.android.material.bottomsheet.BottomSheetDialog(SablonActivity.this);
				View bsV;
				bsV = getLayoutInflater().inflate(R.layout.bottom,null );
				bs.setContentView(bsV);
				bs.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				bs.show();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					((EditText)edittext1).setError("Boş olamaz");
				} else {
					if (edittext4.getText().toString().equals("")) {
						((EditText)edittext4).setError("Boş olamaz");
					} else {
						if (edittext4.getText().toString().equals("")) {
							((EditText)edittext4).setError("Boş olamaz");
						} else {
							if (edittext5.getText().toString().equals("")) {
								((EditText)edittext5).setError("Boş olamaz");
							} else {
								if (edittext6.getText().toString().equals("")) {
									((EditText)edittext6).setError("Boş olamaz");
								} else {
									if (sablon.equals("hackergreen")) {
										kod = "init(autoreset=True)\n\nf = Figlet(font=\"colossal\")\n\nprint(Fore.GREEN + \"═\"*70)\nprint(Fore.GREEN + Style.BRIGHT + f.\n".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.GREEN + \"═\"*70)\n".concat("print(Fore.GREEN + Style.BRIGHT +\"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.GREEN + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("tk = input(Fore.GREEN + Style.BRIGHT +  \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.GREEN + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.GREEN + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n"))))))))))))))))))));
										intent.setClass(getApplicationContext(), OlusturActivity.class);
										intent.putExtra("sablon", kod);
										startActivity(intent);
										SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
									} else {
										if (sablon.equals("redhacker")) {
											kod = "init(autoreset=True)\n\nf = Figlet(font=\"banner3-D\")\n\nprint(Fore.RED + \"█\"*70)\nprint(Fore.RED + Style.BRIGHT + f.\n".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.RED + \"█\"*70)\n".concat("print(Fore.YELLOW + Style.BRIGHT + \" ".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.RED + Style.BRIGHT +  \"  ".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.RED + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.RED + Style.BRIGHT +\"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
											intent.setClass(getApplicationContext(), OlusturActivity.class);
											intent.putExtra("sablon", kod);
											startActivity(intent);
											SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
										} else {
											if (sablon.equals("cyberblue")) {
												kod = "init(autoreset=True)\n\nf = Figlet(font=\"big\")\n\nprint(Fore.CYAN + \"■\"*70)\nprint(Fore.CYAN + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.CYAN + \"■\"*70)\n".concat("print(Fore.BLUE + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.CYAN + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.CYAN + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.CYAN + Style.BRIGHT +\"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.CYAN + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
												intent.setClass(getApplicationContext(), OlusturActivity.class);
												intent.putExtra("sablon", kod);
												startActivity(intent);
												SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
											} else {
												if (sablon.equals("purpledoom")) {
													kod = "init(autoreset=True)\n\nf = Figlet(font=\"doom\")\n\nprint(Fore.MAGENTA + \"★\"*70)\nprint(Fore.MAGENTA + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.MAGENTA + \"★\"*70)\n".concat("print(Fore.CYAN + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.MAGENTA + Style.BRIGHT +  \" ".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.MAGENTA + Style.BRIGHT +  \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.MAGENTA + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.MAGENTA + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
													intent.setClass(getApplicationContext(), OlusturActivity.class);
													intent.putExtra("sablon", kod);
													startActivity(intent);
													SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
												} else {
													if (sablon.equals("standartsarı")) {
														kod = "init(autoreset=True)\n\nf = Figlet(font=\"standard\")\n\nprint(Fore.YELLOW + \"═\"*70)\nprint(Fore.YELLOW + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.YELLOW + \"═\"*70)\n".concat("print(Fore.WHITE + Style.BRIGHT + \" ".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
														intent.setClass(getApplicationContext(), OlusturActivity.class);
														intent.putExtra("sablon", kod);
														startActivity(intent);
														SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
													} else {
														if (sablon.equals("buyukmavi")) {
															kod = "init(autoreset=True)\n\nf = Figlet(font=\"big\")\n\nprint(Fore.BLUE + \"#\"*70)\nprint(Fore.BLUE + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.BLUE + \"#\"*70)\n".concat("print(Fore.BLUE + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.GREEN + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.BLUE + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.BLUE + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.BLUE + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
															intent.setClass(getApplicationContext(), OlusturActivity.class);
															intent.putExtra("sablon", kod);
															startActivity(intent);
															SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
														} else {
															if (sablon.equals("whitebanner")) {
																kod = "init(autoreset=True)\n\nf = Figlet(font=\"banner3-D\")\n\nprint(Fore.WHITE + Style.BRIGHT + \"=\"*70)\nprint(Fore.WHITE + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.WHITE + Style.BRIGHT + \"=\"*70)\n".concat("print(Fore.CYAN + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.WHITE + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.WHITE + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.WHITE + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.WHITE + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
																intent.setClass(getApplicationContext(), OlusturActivity.class);
																intent.putExtra("sablon", kod);
																startActivity(intent);
																SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
															} else {
																if (sablon.equals("kalinneon")) {
																	kod = "init(autoreset=True)\n\nf = Figlet(font=\"colossal\")\n\nprint(Fore.CYAN + Style.BRIGHT + \"▓\"*70)\nprint(Fore.CYAN + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.CYAN + Style.BRIGHT + \"▓\"*70)\n".concat("print(Fore.MAGENTA + Style.BRIGHT + \" ".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.YELLOW + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.CYAN + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.CYAN + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.CYAN + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
																	intent.setClass(getApplicationContext(), OlusturActivity.class);
																	intent.putExtra("sablon", kod);
																	startActivity(intent);
																	SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
																} else {
																	if (sablon.equals("kirmizibeyaz")) {
																		kod = "init(autoreset=True)\n\nf = Figlet(font=\"big\")\n\nprint(Fore.RED + Style.BRIGHT + \"█\"*70)\nprint(Fore.RED + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.RED + Style.BRIGHT + \"█\"*70)\n".concat("print(Fore.WHITE + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.RED + Style.BRIGHT + \" ".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.RED + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.RED + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.RED + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
																		intent.setClass(getApplicationContext(), OlusturActivity.class);
																		intent.putExtra("sablon", kod);
																		startActivity(intent);
																		SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
																	} else {
																		if (sablon.equals("kalinmatrix")) {
																			kod = "init(autoreset=True)\n\nf = Figlet(font=\"doom\")\n\nprint(Fore.GREEN + Style.BRIGHT + \"░\"*70)\nprint(Fore.GREEN + Style.BRIGHT + f.".concat("renderText(\"".concat(edittext1.getText().toString().concat("\"))\n".concat("print(Fore.GREEN + Style.BRIGHT + \"░\"*70)\n".concat("print(Fore.GREEN + Style.BRIGHT + \"".concat(edittext2.getText().toString().concat("\")\n".concat("print(Fore.WHITE + Style.BRIGHT + \"".concat(edittext3.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("tk = input(Fore.GREEN + Style.BRIGHT + \"".concat(edittext4.getText().toString().concat("\")\n".concat("chat_id = input(Fore.GREEN + Style.BRIGHT + \"".concat(edittext5.getText().toString().concat("\")\n".concat("print(\"\")\n".concat("print(Fore.GREEN + Style.BRIGHT + \"".concat(edittext6.getText().toString().concat("\")\n")))))))))))))))))))));
																			intent.setClass(getApplicationContext(), OlusturActivity.class);
																			intent.putExtra("sablon", kod);
																			startActivity(intent);
																			SketchwareUtil.showMessage(getApplicationContext(), "Başarıyla Oluşturuldu");
																		} else {
																			
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		linearbanneryazi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		lineardipnot1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		lineardipnot2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		lineartoken.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearid.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		linearsonmesaj.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)40, 0xFF212121));
		if (getIntent().getStringExtra("tema").equals("hackergreen")) {
			imageview1.setImageResource(R.drawable.hackergreen);
			sablon = getIntent().getStringExtra("tema");
		} else {
			if (getIntent().getStringExtra("tema").equals("redhacker")) {
				imageview1.setImageResource(R.drawable.redhacker);
				sablon = getIntent().getStringExtra("tema");
			} else {
				if (getIntent().getStringExtra("tema").equals("cyberblue")) {
					imageview1.setImageResource(R.drawable.cyberblue);
					sablon = getIntent().getStringExtra("tema");
				} else {
					if (getIntent().getStringExtra("tema").equals("purpledoom")) {
						imageview1.setImageResource(R.drawable.purpledoom);
						sablon = getIntent().getStringExtra("tema");
					} else {
						if (getIntent().getStringExtra("tema").equals("standartsarı")) {
							imageview1.setImageResource(R.drawable.yellowstandart);
							sablon = getIntent().getStringExtra("tema");
						} else {
							if (getIntent().getStringExtra("tema").equals("buyukmavi")) {
								imageview1.setImageResource(R.drawable.bigblue);
								sablon = getIntent().getStringExtra("tema");
							} else {
								if (getIntent().getStringExtra("tema").equals("whitebanner")) {
									imageview1.setImageResource(R.drawable.whitebanner);
									sablon = getIntent().getStringExtra("tema");
								} else {
									if (getIntent().getStringExtra("tema").equals("kalinneon")) {
										imageview1.setImageResource(R.drawable.neonbold);
										sablon = getIntent().getStringExtra("tema");
									} else {
										if (getIntent().getStringExtra("tema").equals("kirmizibeyaz")) {
											imageview1.setImageResource(R.drawable.whitered);
											sablon = getIntent().getStringExtra("tema");
										} else {
											if (getIntent().getStringExtra("tema").equals("kalinmatrix")) {
												imageview1.setImageResource(R.drawable.matrixbold);
												sablon = getIntent().getStringExtra("tema");
											} else {
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
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