package com.jeoneboxmess.lalit_.jonebox.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.jeoneboxmess.lalit_.jonebox.R;
import com.jeoneboxmess.lalit_.jonebox.adapter.CancelTifinAdapter;
import com.jeoneboxmess.lalit_.jonebox.module.BillModule;
import com.jeoneboxmess.lalit_.jonebox.module.CancelTifinModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CancelTifin extends AppCompatActivity {

    RecyclerView canceltifin_rv;
    Context context;
    ArrayList<CancelTifinModel> list;
    CancelTifinAdapter cancelTifinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_tifin);
        context = this;
        init();
        initValue();
        getData();
    }

    private void init() {
        canceltifin_rv = findViewById(R.id.canceltifin_rv);
        list = new ArrayList<>();
    }


    private void initValue() {
        canceltifin_rv.setLayoutManager(new LinearLayoutManager(context));
        cancelTifinAdapter = new CancelTifinAdapter(context, list);
        canceltifin_rv.setAdapter(cancelTifinAdapter);

    }

    private void getData() {

        /*Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.MONTH);
*/

        int dd, mm, yy, day;
        String strday = "";
        String sDate1 = "1/1/2018";
        String eDate1 = "31/12/2018";
        try {
            Date stardate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            Date enddate = new SimpleDateFormat("dd/MM/yyyy").parse(eDate1);

            Calendar calendar = new GregorianCalendar();
            calendar.setTime(stardate);

            while (calendar.getTime().before(enddate)) {


                Date result = calendar.getTime();
                dd = calendar.get(Calendar.DATE);
                mm = calendar.get(Calendar.MONTH);
                yy = calendar.get(Calendar.YEAR);
                day = calendar.get(Calendar.DAY_OF_WEEK);
                if (day == 1) {
                    strday = "Sunday";
                } else if (day == 2) {
                    strday = "Monday";
                } else if (day == 3) {
                    strday = "Tuesday";
                } else if (day == 4) {
                    strday = "Wednesday";
                } else if (day == 5) {
                    strday = "Thursday";
                } else if (day == 6) {
                    strday = "Friday";
                } else if (day == 7) {
                    strday = "Saturday";
                }


                Log.e("date", "date=" + dd + "/" + mm + 1 + "/" + yy + "days=" + day);
                list.add(new CancelTifinModel(String.valueOf(dd), String.valueOf(mm + 1), String.valueOf(yy), strday));

                calendar.add(Calendar.DATE, 1);
            }

            cancelTifinAdapter.notifyDataSetChanged();


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
