package com.md.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.md.cfv.CustomFontView;

import java.util.Date;
import java.util.GregorianCalendar;

import si.virag.fuzzydateformatter.FuzzyDateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    CustomFontView customFontView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customFontView = (CustomFontView) findViewById(R.id.cfv);
        Date date = new Date(2021,16,22,15,22);
        String text = FuzzyDateTimeFormatter.getTimeAgo(this, date);
        customFontView.setText(text);
    }
}
