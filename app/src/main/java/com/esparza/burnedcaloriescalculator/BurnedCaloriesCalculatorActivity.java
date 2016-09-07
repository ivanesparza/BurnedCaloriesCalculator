package com.esparza.burnedcaloriescalculator;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.*;

public class BurnedCaloriesCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burned_calories_calculator);

        findViewById(R.id.weightText);
        findViewById(R.id.milesText);
        findViewById(R.id.caloriesText);
        findViewById(R.id.heightText);
        findViewById(R.id.bmiText);
        findViewById(R.id.nameText);
        findViewById(R.id.weightLabel);
        findViewById(R.id.milesSeekBar);
        findViewById(R.id.heightFeet);
        findViewById(R.id.heightInches);
        findViewById(R.id.nameLabel);
        findViewById(R.id.ranText);
        findViewById(R.id.BMItotalText);
        findViewById(R.id.editText);
    }

    public class EditorAction implements ActionListener
    {

    }
}
