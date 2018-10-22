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

import java.util.ArrayList;
import java.util.List;

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.MyViewHolder> {
   Context context;
    List<BillModule> billModule;

    public BillAdapter(Context context, List<BillModule> billModule) {
        this.context = context;
        this.billModule = billModule;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custum_bill_row_item, viewGroup, false);
// set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      BillModule module=billModule.get(position);
        holder.rv_date_tv.setText(module.getDate());
        holder.rv_time_tv.setText(module.getTime());
        holder.rv_amt_tv.setText(module.getAmmount());

    }

    @Override
    public int getItemCount() {
        return billModule.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView rv_date_tv,rv_time_tv,rv_amt_tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rv_date_tv=itemView.findViewById(R.id.rv_date_tv);
            rv_time_tv=itemView.findViewById(R.id.rv_time_tv);
            rv_amt_tv=itemView.findViewById(R.id.rv_amt_tv);
        }
    }
}
