package com.jeoneboxmess.lalit_.jonebox.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.jeoneboxmess.lalit_.jonebox.R;
import com.jeoneboxmess.lalit_.jonebox.module.CancelTifinModel;

import java.util.ArrayList;

public class CancelTifinAdapter extends RecyclerView.Adapter<CancelTifinAdapter.MyViewHolder> {


    ArrayList<CancelTifinModel> list;
    Context context;

    public CancelTifinAdapter(Context context, ArrayList<CancelTifinModel> list) {

        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_custom_cancel_singal_row, viewGroup, false);
// set the view's size, margins, paddings and layout parameters
        CancelTifinAdapter.MyViewHolder vh = new CancelTifinAdapter.MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.rv_date_tv.setText(list.get(i).getDay()+"-"+list.get(i).getMonth()+"-"+list.get(i).getYear());
        myViewHolder.rv_day_tv.setText(list.get(i).getDays());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView rv_date_tv, rv_day_tv;
        CheckBox rv_cancel_both_cb, rv_mor_tv, rv_ev_tv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rv_date_tv = itemView.findViewById(R.id.rv_date_tv);
            rv_cancel_both_cb = itemView.findViewById(R.id.rv_cancel_both_cb);
            rv_day_tv = itemView.findViewById(R.id.rv_day_tv);
            rv_mor_tv = itemView.findViewById(R.id.rv_mor_tv);
            rv_ev_tv = itemView.findViewById(R.id.rv_ev_tv);

        }
    }
}
