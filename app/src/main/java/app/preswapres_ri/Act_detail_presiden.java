package app.preswapres_ri;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import app.preswapres_ri.bantuan.Act_set_get;
public class Act_detail_presiden extends Activity implements View.OnClickListener {
String s_nama, s_detail,s_foto;
TextView tx_nama, tx_detail;
WebView wb_detail;
ImageView img_foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_detail_presiden);
        tx_nama = (TextView)findViewById(R.id.txt_nama_presiden);
        //tx_detail = (TextView)findViewById(R.id.txt_detail_presiden);
        wb_detail = (WebView) findViewById(R.id.txt_detail_presiden);
        img_foto = (ImageView)findViewById(R.id.img_foto_presiden);
        Act_set_get ambil = new Act_set_get();
        tx_nama.setText(ambil.get_nama());
        s_nama = tx_nama.getText().toString();
        //tx_detail.setText(ambil.get_detail());
        wb_detail.loadData("<p style=\"text-align: justify\">"+ambil.get_detail()+"</p>","text/html", "UTF-8");
        if (s_nama.equals("Ir. Soekarno")){
            img_foto.setImageResource(R.drawable.pres_soekarno);
        }
        else if (s_nama.equals("H. M. Soeharto")){
            img_foto.setImageResource(R.drawable.pres_soeharto);
        }
        else if (s_nama.equals("BJ Habibie")){
            img_foto.setImageResource(R.drawable.pres_habibi);
        }
        else if (s_nama.equals("K. H. Abdurrahman Wahid")){
            img_foto.setImageResource(R.drawable.pres_gusdur);
        }
        else if (s_nama.equals("Megawati Soekarnoputri")){
            img_foto.setImageResource(R.drawable.pres_megawati);
        }
        else if (s_nama.equals("Susilo Bambang Yudhoyono")){
            img_foto.setImageResource(R.drawable.pres_sby);
        }
        else if (s_nama.equals("Ir. H. Joko Widodo")){
            img_foto.setImageResource(R.drawable.pres_jkw);
        }
        else if (s_nama.equals("Mohammad Hatta")){
            img_foto.setImageResource(R.drawable.wapres_hatta);
        }
        else if (s_nama.equals("Hamengkubuwana IX")){
            img_foto.setImageResource(R.drawable.wapres_sultan);
        }
        else if (s_nama.equals("Adam Malik")){
            img_foto.setImageResource(R.drawable.wapres_adam);
        }
        else if (s_nama.equals("Umar Wirahadikusumah")){
            img_foto.setImageResource(R.drawable.wapres_umar);
        }
        else if (s_nama.equals("Soedharmono")){
            img_foto.setImageResource(R.drawable.wapres_sudarmono);
        }
        else if (s_nama.equals("Try Sutrisno")){
            img_foto.setImageResource(R.drawable.wapres_tri_sut);
        }
        else if (s_nama.equals("B. J. Habibie")){
            img_foto.setImageResource(R.drawable.wapres_hbb);
        }
        else if (s_nama.equals("Megawati  Soekarnoputri")){
            img_foto.setImageResource(R.drawable.wapres_mgwty);
        }
        else if (s_nama.equals("Hamzah Haz")){
            img_foto.setImageResource(R.drawable.wapres_hmz);
        }
        else if (s_nama.equals("Jusuf Kalla")){
            img_foto.setImageResource(R.drawable.wapres_jk);
        }
        else if (s_nama.equals("Boediono")){
            img_foto.setImageResource(R.drawable.wapres_bdn);
        }
        else if (s_nama.equals("Ma'ruf Amin")){
            img_foto.setImageResource(R.drawable.wapres_magr_amin);
        }
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

    }
}