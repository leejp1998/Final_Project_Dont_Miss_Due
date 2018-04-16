package com.example.user.final_project_dont_miss_due;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by User on 2018-04-14.
 */

public class SelectedDayChangeActivity extends AppCompatActivity {

    private Context mContext;
    private TextView toDoText;
    private ImageButton addToDoButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_day_edit);

        mContext = this;
        toDoText = findViewById(R.id.toDoText);
        addToDoButton = findViewById(R.id.addToDoButton);

        // Get the Intent of the selected date
        Intent intent = getIntent();
        String title = intent.getExtras().getString("date");
        setTitle(title);

        addToDoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(mContext, AddToDoActivity.class);
                startActivity(intent);
            }
        });
    }
}
