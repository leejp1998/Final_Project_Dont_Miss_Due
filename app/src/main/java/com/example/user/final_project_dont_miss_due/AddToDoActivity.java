package com.example.user.final_project_dont_miss_due;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 2018-04-14.
 */

public class AddToDoActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_todo);

        mContext = this;
        setTitle("Adding To Do");
    }
}
