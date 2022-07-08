package app.preswapres_ri;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import app.preswapres_ri.bantuan.Act_set_get;
import app.preswapres_ri.bantuan.ConnectionDetector;

public class Act_list_presiden extends Activity implements View.OnClickListener {
    LinearLayout l_soekarno, l_soeharto, l_habibi, l_gusdur, l_mega, l_sby, l_jkw;
    ConnectionDetector cd;
    Boolean isInternetPresent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_list_presiden);
        l_soekarno = (LinearLayout) findViewById(R.id.ln_soekarno);
        l_soekarno.setOnClickListener(this);
        l_soeharto = (LinearLayout) findViewById(R.id.ln_soeharto);
        l_soeharto.setOnClickListener(this);
        l_habibi = (LinearLayout) findViewById(R.id.ln_habibi);
        l_habibi.setOnClickListener(this);
        l_gusdur = (LinearLayout) findViewById(R.id.ln_gusdur);
        l_gusdur.setOnClickListener(this);
        l_mega = (LinearLayout) findViewById(R.id.ln_mega);
        l_mega.setOnClickListener(this);
        l_sby = (LinearLayout) findViewById(R.id.ln_sby);
        l_sby.setOnClickListener(this);
        l_jkw = (LinearLayout) findViewById(R.id.ln_jkw);
        l_jkw.setOnClickListener(this);
        ConnectionDetector cd;
        Boolean isInternetPresent = false;

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView bannerAdview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdview.loadAd(adRequest);
    }

    @SuppressLint("ResourceType")

    @Override
    public void onClick(View view) {
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
        if (isInternetPresent) {
            if (view == l_soekarno) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Ir. Soekarno");
                ambil.set_detail(getResources().getString(R.string.soekarno));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_soeharto) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("H. M. Soeharto");
                ambil.set_detail(getResources().getString(R.string.soeharto));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_habibi) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("BJ Habibie");
                ambil.set_detail(getResources().getString(R.string.habibi));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_gusdur) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("K. H. Abdurrahman Wahid");
                ambil.set_detail(getResources().getString(R.string.gusdur));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_mega) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Megawati Soekarnoputri");
                ambil.set_detail(getResources().getString(R.string.mega));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_sby) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Susilo Bambang Yudhoyono");
                ambil.set_detail(getResources().getString(R.string.sby));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            } else if (view == l_jkw) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Ir. H. Joko Widodo");
                ambil.set_detail(getResources().getString(R.string.jkw));
                Intent buka = new Intent(Act_list_presiden.this, Act_detail_presiden.class);
                startActivity(buka);
            }
        }
        else {

            inet_mati();
        }


    }
    public void inet_mati () {
        AlertDialog damz_dialog = new AlertDialog.Builder(Act_list_presiden.this).create();
        damz_dialog.setTitle("Warning");
        //damz_dialog.setIcon(R.drawable.warning);
        damz_dialog.setMessage("Please Activate Your Connection Internet...");
        damz_dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        damz_dialog.show();
    }
}