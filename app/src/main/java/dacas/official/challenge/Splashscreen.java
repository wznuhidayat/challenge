package dacas.official.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splashscreen extends AppCompatActivity {

    private static int LamaTampilSplash = 3000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        //MULAI KODING



        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // KODING



        setContentView(R.layout.activity_splashscreen);





        //KODING LAGI



        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                // to do auto generated stub

                Intent apasih = new Intent(Splashscreen.this,MainActivity.class);

                startActivity(apasih);



                // jeda setelah splashscren



                this.selesai();

            }



            private void selesai(){

                //auto

            }

        },LamaTampilSplash);



    };

}
