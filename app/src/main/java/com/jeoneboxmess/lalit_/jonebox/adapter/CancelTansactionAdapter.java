package com.jeoneboxmess.lalit_.jonebox.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jeoneboxmess.lalit_.jonebox.R;
import com.jeoneboxmess.lalit_.jonebox.module.BillModule;
import com.jeoneboxmess.lalit_.jonebox.module.CancelModule;

import java.util.ArrayList;
import java.util.List;

public class CancelTansactionAdapter extends RecyclerView.Adapter<CancelTansactionAdapter.MyViewHolder> {

    Context context;
    List<CancelModule> billModule;

    public CancelTansactionAdapter(Context context, ArrayList<CancelModule> billModule) {
        this.context = context;
        this.billModule = billModule;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_custom_cancel_singal_row, viewGroup, false);
// set the view's size, margins, paddings and layout parameters
        CancelTansactionAdapter.MyViewHolder vh = new CancelTansactionAdapter.MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int pos) {
        CancelModule module = billModule.get(pos);
        holder.rv_date_tv.setText(module.getDate());
        holder.rv_cancel_both_cb.setText(module.getBoth());
        holder.rv_day_tv.setText(module.getDay());
        holder.rv_mor_tv.setText(module.getMorning());
        holder.rv_ev_tv.setText(module.getEving());
    }

    @Override
    public int getItemCount() {
        return billModule.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView rv_date_tv, rv_cancel_both_cb, rv_day_tv, rv_mor_tv, rv_ev_tv;
        View view;

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
