package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeoneboxmess.lalit_.jonebox.R;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);


        Thread t = new Thread() {

            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                } catch (Exception e) {

                } finally {
                    startActivity(new Intent(FlashActivity.this, MainDashBoard.class));
                    finish();
                    ;
                }
            }
        };
        t.start();
    }
}
