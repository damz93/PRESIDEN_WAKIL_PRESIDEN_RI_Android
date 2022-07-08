package app.preswapres_ri;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Act_utama extends Activity implements  View.OnClickListener {
    Button btn_pres,btn_wapres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_utama);
        btn_pres = (Button)findViewById(R.id.btn_presiden);
        btn_pres.setOnClickListener(this);
        btn_wapres = (Button)findViewById(R.id.btn_wakil_presiden);
        btn_wapres.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_pres){
            Intent a = new Intent(Act_utama.this, Act_list_presiden.class);
            startActivity(a);
        }
        else if (view == btn_wapres){
            Intent a = new Intent(Act_utama.this, Act_list_wapres.class);
            startActivity(a);
        }
    }

    public void onBackPressed(){
        DialogInterface.OnClickListener dd_dialog = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked

                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        dd_kembali();
                        break;
                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Ingin menutup aplikasi?").setPositiveButton("Batal", dd_dialog).setNegativeButton("Ya", dd_dialog).show();
    }
    public void dd_kembali(){
        finish();
        System.exit(0);
    }
}