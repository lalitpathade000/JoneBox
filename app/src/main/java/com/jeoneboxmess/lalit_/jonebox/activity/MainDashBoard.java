package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jeoneboxmess.lalit_.jonebox.CancelTransaction;
import com.jeoneboxmess.lalit_.jonebox.R;

public class MainDashBoard extends AppCompatActivity implements View.OnClickListener {

    Context context;
    Button dashbord_account_details_bv, dashborsd_cancel_tiffin_bv, dashbord_cancel_tiffin_history_bv, dashbord_contact_bv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dash_board);
        context = this;

        dashbord_account_details_bv = findViewById(R.id.dashbord_account_details_bv);
        dashborsd_cancel_tiffin_bv = findViewById(R.id.dashbord_cancel_tiffin_bv);
        dashbord_cancel_tiffin_history_bv = findViewById(R.id.dashbord_cancel_tiffin_history_bv);
        dashbord_contact_bv = findViewById(R.id.dashbord_contact_bv);
        initValue();


    }

    private void initValue() {
        dashbord_account_details_bv.setOnClickListener(this);
        dashborsd_cancel_tiffin_bv.setOnClickListener(this);
        dashbord_cancel_tiffin_history_bv.setOnClickListener(this);
        dashbord_contact_bv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent=null;
        switch (id) {
            case R.id.dashbord_account_details_bv:
                intent=new Intent(context,ViewAccountDetails.class);
                startActivity(intent);
                return;
            case R.id.dashbord_cancel_tiffin_bv:
                intent=new Intent(context,CancelTransaction.class);
                startActivity(intent);
                return;
            case R.id.dashbord_contact_bv:
                intent=new Intent(context,LoginActivity.class);
                startActivity(intent);
                return;
            default:
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

        }

    }
}
