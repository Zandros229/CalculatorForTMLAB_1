package com.example.calculator;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class SimpleActivity extends AppCompatActivity {

    private CalculateViewModel model;
    private TextView display;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dZero;
    private Button point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);

        display = (TextView) findViewById(R.id.display);
        one = (Button) findViewById(R.id.one);

        model = ViewModelProviders.of(this).get(CalculateViewModel.class);

        final Observer<Double> nameObserver = new Observer<Double>() {
            @Override
            public void onChanged(final Double number) {
                // Update the UI, in this case, a TextView.
                display.setText(String.valueOf(number));
            }
        };
    }
}
