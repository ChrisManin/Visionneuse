package m2iformation.fr.visionneuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView diapo;
    private ImageButton retour, suivant;
    private int[] images = {R.mipmap.ibanez_rg370ahmz_bmt_standard_mn_large_6_121727,
                            R.mipmap.images_guit_yel,
                            R.mipmap.ltd_guitare_electrique_serie_m50_gaucher_noir_satine,
                            R.mipmap.rgdix6mpb_sbb_guitare_electrique_surreal_blue_burst,
                            R.mipmap.s512};
    private int indexImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diapo = findViewById(R.id.ivDiapo);
        retour = findViewById(R.id.btRet);
        suivant = findViewById(R.id.btNext);
    }


    public void clickReturn(View view) {
        if (indexImages > 0) {
            diapo.setImageResource(images[indexImages--]);
        } else {
            Toast.makeText(this, "Début déjà affiché !", Toast.LENGTH_LONG).show();
        }
    }

    public void clickNext(View view) {
        if (indexImages < images.length -1){
            diapo.setImageResource(images[indexImages++]);
        }else{
            Toast.makeText(this, "Fin du diaporama !", Toast.LENGTH_SHORT).show();
        }
    }
}
