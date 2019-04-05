package com.example.calculator;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleActivity extends AppCompatActivity {

    private LastViewModel last;
    private CalculateViewModel model;
    private TwiceViewModel twice;
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
    private Button bkcs;
    private Button add;
    private Button plusMinus;
    private Button subb;
    private Button multi;
    private Button div;
    private Button equals;

    private Calculator calculator = new Calculator();
    private Calculator second = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);

        display = (TextView) findViewById(R.id.display);

        setUpButtons();

        model = ViewModelProviders.of(this).get(CalculateViewModel.class);
        last = ViewModelProviders.of(this).get(LastViewModel.class);
        twice = ViewModelProviders.of(this).get(TwiceViewModel.class);
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(final String number) {
                display.clearComposingText();
                display.setText(number);
                calculator.save();

                if (!(number.endsWith("."))) {
                    if(calculator.getResoult().isInfinite()){
                        calculator.back();
                        Toast toast = Toast.makeText(getApplicationContext(), "Liczba poza zakresem ", Toast.LENGTH_SHORT);
                        toast.show();
                    }else {
                        last.getCurrentResoult().setValue(model.getCurrentResoult().getValue().substring(0, model.getCurrentResoult().getValue().length() - 3));
                        calculator.newResoult(Double.valueOf(number));
                    }
                }

            }
        };

        model.getCurrentResoult().observe(this, nameObserver);
        calculator.newResoult(Double.valueOf(model.getCurrentResoult().getValue()));
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            largeSwitch(calculator, v);
        }

    };


    private void equalsUse(Calculator a) {

        calculator.newResoult(Double.valueOf(model.getCurrentResoult().getValue()));
        a.newResoult(Double.valueOf(twice.getCurrentResoult().getValue().substring(0,twice.getCurrentResoult().getValue().length()-2)));
        a.setUpOpertion(twice.getCurrentResoult().getValue().substring(twice.getCurrentResoult().getValue().length()-1));
        System.out.println(calculator.getResoult()+"   "+a.getResoult()+"XDDDD"+a.operation);
        switch (a.getOperation()) {

            case "+":
                a.add(calculator.getResoult());
                model.getCurrentResoult().setValue(a.getResoult().toString());
                a.ac();
                a.clear();
                break;

            case "-":
                a.sub(calculator.getResoult());
                model.getCurrentResoult().setValue(a.getResoult().toString());
                a.ac();
                a.clear();
                break;

            case "*":
                a.multiplication(calculator.getResoult());
                model.getCurrentResoult().setValue(a.getResoult().toString());
                a.ac();
                a.clear();
                break;

            case "/":
                if(calculator.getResoult()==0){
                    Toast toast = Toast.makeText(getApplicationContext(), "Nie można dzielić przez zero ", Toast.LENGTH_SHORT);
                    toast.show();
                    model.getCurrentResoult().setValue(a.getResoult().toString());
                    a.ac();
                    a.clear();
                }
                else {
                    a.division(calculator.getResoult());
                    model.getCurrentResoult().setValue(a.getResoult().toString());
                    a.ac();
                    a.clear();
                }
                break;

            default:
                break;

        }
    }


    private void largeSwitch(Calculator calculator, View v) {
        String temp;
        boolean dot = calculator.dot;
        switch (v.getId()) {

            case R.id.one:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("1");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("1");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("1");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.two:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("2");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("2");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("2");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.three:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("3");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("3");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("3");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;


            case R.id.four:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("4");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("4");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("4");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.five:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("5");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("5");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("5");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.six:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("6");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("6");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("6");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.seven:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("7");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("7");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("7");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.eight:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("8");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("8");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("8");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.nine:
                if (dot) {
                    if ((model.getCurrentResoult().getValue().endsWith(".0")) && !calculator.clicked) {
                        calculator.addNumberDot("9");
                        model.getCurrentResoult().setValue(calculator.getResoult().toString());
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("9");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("9");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.zero:
                if (dot) {
                    if (!(model.getCurrentResoult().getValue().endsWith(".0"))) {
                        temp = model.getCurrentResoult().getValue().concat("0");
                        model.getCurrentResoult().setValue(temp);
                    } else
                        calculator.zeroClicked();
                } else {
                    calculator.addNumber("0");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.double_zero:
                if (dot) {
                    if (model.getCurrentResoult().getValue().endsWith(".0")) {
                        temp = model.getCurrentResoult().getValue().concat("0");
                        model.getCurrentResoult().setValue(temp);
                    } else {
                        temp = model.getCurrentResoult().getValue().concat("00");
                        model.getCurrentResoult().setValue(temp);
                    }
                } else {
                    calculator.addNumber("00");
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.dot:

                if (!dot) {
                    calculator.dotClicked();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Nie można dodać drugiej kropki", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;

            case R.id.ac:
                calculator.ac();
                calculator.newResoult(0.0);
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.backspace:
                if(last.getCurrentResoult().getValue().isEmpty())
                    calculator.newResoult(0.0);
                else
                    calculator.newResoult(Double.valueOf(last.getCurrentResoult().getValue()));
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.plus_minus:
                calculator.inverse();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.plus:
                if(second.usedOperation==false) {
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"+");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("+");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }else{
                    equalsUse(second);
                    second.clear();
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"+");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("+");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.minus:
                if(second.usedOperation==false) {
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"-");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("-");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }else{
                    equalsUse(second);
                    second.clear();
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"-");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("-");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.multiply:
                if(second.usedOperation==false) {
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"*");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("*");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }else{

                    equalsUse(second);
                    second.clear();
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"*");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("*");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.divide:
                if(second.usedOperation==false) {
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"/");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("/");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }else{
                    equalsUse(second);
                    second.clear();
                    twice.getCurrentResoult().setValue(calculator.getResoult().toString()+"/");
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("/");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.equal:
                second.resoult=Double.valueOf(model.getCurrentResoult().getValue());
                equalsUse(second);
                second.clear();
                break;
            default:
                break;
        }
        System.out.println("secend="+second.getResoult());
    }

    private void setUpButtons() {
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
        acc = (Button) findViewById(R.id.ac);
        bkcs = (Button) findViewById(R.id.backspace);
        add = (Button) findViewById(R.id.plus);
        subb = (Button) findViewById(R.id.minus);
        plusMinus = (Button) findViewById(R.id.plus_minus);
        multi = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.divide);
        equals = (Button) findViewById(R.id.equal);


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
        bkcs.setOnClickListener(listener);
        add.setOnClickListener(listener);
        subb.setOnClickListener(listener);
        plusMinus.setOnClickListener(listener);
        multi.setOnClickListener(listener);
        div.setOnClickListener(listener);
        equals.setOnClickListener(listener);
    }
}

