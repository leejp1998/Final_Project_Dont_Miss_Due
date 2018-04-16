package com.example.user.final_project_dont_miss_due;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendar;
    ImageButton addButton;
    String date;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        calendar=(CalendarView) findViewById(R.id.calendar);
        addButton = (ImageButton) findViewById(R.id.addButton);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
                //Need to make to open a second screen
                date = Integer.toString(month) + "/" + Integer.toString(dayOfMonth);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(mContext, SelectedDayChangeActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }


}
