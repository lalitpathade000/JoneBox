package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jeoneboxmess.lalit_.jonebox.R;
import com.jeoneboxmess.lalit_.jonebox.adapter.BillAdapter;
import com.jeoneboxmess.lalit_.jonebox.module.BillModule;

import java.util.ArrayList;

public class Bill extends AppCompatActivity {

    RecyclerView bill_rv;
    Context context;
    ArrayList<BillModule> billModule;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        context=this;
        init();
        initValue();
        getData();
    }



    private void init() {
        billModule=new ArrayList<>();
        bill_rv = findViewById(R.id.bill_rv);
        bill_rv.setLayoutManager(new LinearLayoutManager(context));
        bill_rv.setAdapter(new BillAdapter(context,billModule));
    }

    private void initValue() {
    }
    private void getData() {
    }
}
