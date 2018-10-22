package com.jeoneboxmess.lalit_.jonebox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.jeoneboxmess.lalit_.jonebox.adapter.CancelTansactionAdapter;
import com.jeoneboxmess.lalit_.jonebox.module.CancelModule;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CancelTransaction extends AppCompatActivity implements View.OnClickListener {

    RecyclerView bill_rv;
    Button cancel_tran_submit_bv;
    Context context;
    ArrayList<CancelModule> cancelModules;
    CancelTansactionAdapter cancelTansactionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_transaction);
        init();

        initValue();
    }

    private void init() {
        cancelModules = new ArrayList<>();
        bill_rv = findViewById(R.id.cancel_tran_rv);
        cancel_tran_submit_bv = findViewById(R.id.cancel_tran_submit_bv);
    }

    private void initValue() {
        cancel_tran_submit_bv.setOnClickListener(this);

        bill_rv.setAdapter(new CancelTansactionAdapter(context, cancelModules));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.cancel_tran_submit_bv) {

            getData();

        }
    }

    private void getData() {


    }
}
