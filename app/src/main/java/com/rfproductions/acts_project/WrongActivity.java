package com.rfproductions.acts_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WrongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Wrong");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
    }
}