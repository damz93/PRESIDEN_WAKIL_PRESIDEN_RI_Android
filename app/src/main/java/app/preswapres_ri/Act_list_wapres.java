package app.preswapres_ri;

import androidx.appcompat.app.AppCompatActivity;

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

public class Act_list_wapres extends Activity implements View.OnClickListener {
    LinearLayout l_hatta, l_sultan, l_adam,l_umar, l_sudars, l_tri,l_hbb, l_mega, l_hamzah, l_jk, l_budi, l_mahr;
    ConnectionDetector cd;
    Boolean isInternetPresent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_list_wapres);

        l_hatta = (LinearLayout) findViewById(R.id.ln_hatta);
        l_hatta.setOnClickListener(this);
        l_sultan = (LinearLayout) findViewById(R.id.ln_sultan);
        l_sultan.setOnClickListener(this);
        l_adam = (LinearLayout) findViewById(R.id.ln_adam);
        l_adam.setOnClickListener(this);
        l_umar = (LinearLayout) findViewById(R.id.ln_umur);
        l_umar.setOnClickListener(this);
        l_sudars = (LinearLayout) findViewById(R.id.ln_sudarmono);
        l_sudars.setOnClickListener(this);
        l_tri = (LinearLayout) findViewById(R.id.ln_tri);
        l_tri.setOnClickListener(this);
        l_hbb = (LinearLayout) findViewById(R.id.ln_habibii);
        l_hbb.setOnClickListener(this);
        l_mega = (LinearLayout) findViewById(R.id.ln_megaa);
        l_mega.setOnClickListener(this);
        l_hamzah = (LinearLayout) findViewById(R.id.ln_hamzah);
        l_hamzah.setOnClickListener(this);
        l_jk = (LinearLayout) findViewById(R.id.ln_jk);
        l_jk.setOnClickListener(this);
        l_budi = (LinearLayout) findViewById(R.id.ln_budi);
        l_budi.setOnClickListener(this);
        l_mahr = (LinearLayout) findViewById(R.id.ln_mgr);
        l_mahr.setOnClickListener(this);


        ConnectionDetector cd;
        Boolean isInternetPresent = false;

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView bannerAdview = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdview.loadAd(adRequest);
    }

    @Override
    public void onClick(View view) {
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
        if (isInternetPresent) {
            if (view == l_hatta) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Mohammad Hatta");
                ambil.set_detail(getResources().getString(R.string.hatta));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_sultan) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Hamengkubuwana IX");
                ambil.set_detail(getResources().getString(R.string.sultan));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_adam) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Adam Malik");
                ambil.set_detail(getResources().getString(R.string.adam));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_umar) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Umar Wirahadikusumah");
                ambil.set_detail(getResources().getString(R.string.umar));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_sudars) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Soedharmono");
                ambil.set_detail(getResources().getString(R.string.sudarmono));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_tri) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Try Sutrisno");
                ambil.set_detail(getResources().getString(R.string.trysu));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_hbb) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("B. J. Habibie");
                ambil.set_detail(getResources().getString(R.string.habibi));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_mega) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Megawati  Soekarnoputri");
                ambil.set_detail(getResources().getString(R.string.mega));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_hamzah) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Hamzah Haz");
                ambil.set_detail(getResources().getString(R.string.hamzah));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_jk) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Jusuf Kalla");
                ambil.set_detail(getResources().getString(R.string.jk));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_budi) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Boediono");
                ambil.set_detail(getResources().getString(R.string.budi));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }
            else if (view == l_mahr) {
                Act_set_get ambil = new Act_set_get();
                ambil.set_nama("Ma'ruf Amin");
                ambil.set_detail(getResources().getString(R.string.mgr));
                Intent buka = new Intent(Act_list_wapres.this, Act_detail_presiden.class);
                startActivity(buka);
            }

        }
        else {

            inet_mati();
        }
    }
    public void inet_mati () {
        AlertDialog damz_dialog = new AlertDialog.Builder(Act_list_wapres.this).create();
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