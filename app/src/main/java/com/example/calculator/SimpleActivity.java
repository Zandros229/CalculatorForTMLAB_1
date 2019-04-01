package com.example.calculator;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private Button acc;
    private Calculator calculator=new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);

        display = (TextView) findViewById(R.id.display);

        //Buttons
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dZero = (Button) findViewById(R.id.double_zero);
        point = (Button) findViewById(R.id.dot);
        acc=(Button) findViewById(R.id.ac);

        one.setOnClickListener(listener);
        two.setOnClickListener(listener);
        three.setOnClickListener(listener);
        four.setOnClickListener(listener);
        five.setOnClickListener(listener);
        six.setOnClickListener(listener);
        seven.setOnClickListener(listener);
        eight.setOnClickListener(listener);
        nine.setOnClickListener(listener);
        zero.setOnClickListener(listener);
        dZero.setOnClickListener(listener);
        point.setOnClickListener(listener);
        acc.setOnClickListener(listener);




        model = ViewModelProviders.of(this).get(CalculateViewModel.class);
        final Observer<Double> nameObserver = new Observer<Double>() {
            @Override
            public void onChanged(final Double number) {
                display.clearComposingText();
                display.setText(String.valueOf(number));
            }
        };

        model.getCurrentResoult().observe(this, nameObserver);

        calculator.newResoult(model.getCurrentResoult().getValue());
    }

    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String temp;
            boolean dot=calculator.dot;
            switch (v.getId()) {

                case R.id.one:
                    if(dot) {
                        calculator.addNumberDot("1");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("1");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.two:
                    if(dot) {
                        calculator.addNumberDot("2");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("2");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.three:
                    if(dot) {
                        calculator.addNumberDot("3");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("3");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;


                case R.id.four:
                    if(dot) {
                        calculator.addNumberDot("4");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("4");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.five:
                    if(dot) {
                        calculator.addNumberDot("5");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("5");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.six:
                    if(dot) {
                        calculator.addNumberDot("6");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("6");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.seven:
                    if(dot) {
                        calculator.addNumberDot("7");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("7");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.eight:
                    if(dot) {
                        calculator.addNumberDot("8");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("8");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.nine:
                    if(dot) {
                        calculator.addNumberDot("9");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("9");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.zero:
                    if(dot) {
                        calculator.addNumberDot("0");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("0");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.double_zero:
                    if(dot) {
                        calculator.addNumberDot("00");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }else {
                        calculator.addNumber("00");
                        model.getCurrentResoult().setValue(calculator.getResoult());
                    }
                    break;

                case R.id.dot:

                    if(!dot){
                        calculator.dot=true;
                        display.setText(display.getText());
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Nie można dodać drugiej kropki", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;

                case R.id.ac:
                    calculator.newResoult(0.0);
                    model.getCurrentResoult().setValue(calculator.getResoult());
                    break;

                default:
                    break;
            }
        }
    };
}
