package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jeoneboxmess.lalit_.jonebox.R;

public class ViewAccountDetails extends AppCompatActivity implements View.OnClickListener {
    Button viewaccount_transacion_bv, viewaccount_bill_bv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_account_details);
        init();
        initValue();
    }

    private void init() {
        context = this;
        viewaccount_transacion_bv = findViewById(R.id.viewaccount_transacion_bv);
        viewaccount_bill_bv = findViewById(R.id.viewaccount_bill_bv);

    }

    private void initValue() {
        viewaccount_transacion_bv.setOnClickListener(this);
        viewaccount_bill_bv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent intent = null;
        switch (id) {
            case R.id.viewaccount_transacion_bv:
                intent = new Intent(context, Transaction.class);
                startActivity(intent);
                return;
            case R.id.viewaccount_bill_bv:
                intent = new Intent(context, Bill.class);
                startActivity(intent);
                return;
        }
    }
}
