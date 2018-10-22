package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jeoneboxmess.lalit_.jonebox.R;
import com.jeoneboxmess.lalit_.jonebox.adapter.BillAdapter;
import com.jeoneboxmess.lalit_.jonebox.adapter.CancelTansactionAdapter;
import com.jeoneboxmess.lalit_.jonebox.module.BillModule;
import com.jeoneboxmess.lalit_.jonebox.module.CancelModule;

import java.util.ArrayList;

public class Transaction extends AppCompatActivity {
    RecyclerView bill_rv;
    Context context;
    ArrayList<CancelModule> billModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        context=this;
        init();
        initValue();
        getData();
    }

    private void init() {
        billModule=new ArrayList<>();
        bill_rv = findViewById(R.id.transaction_rv);
        bill_rv.setLayoutManager(new LinearLayoutManager(context));
        bill_rv.setAdapter(new CancelTansactionAdapter(context,billModule));
    }
    private void initValue() {

    }
    private void getData() {


    }
}
