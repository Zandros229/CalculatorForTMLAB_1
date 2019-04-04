
package com.example.calculator;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AdvancedActivity extends AppCompatActivity {

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
    private Button point;
    private Button acc;
    private Button bkcs;
    private Button add;
    private Button plusMinus;
    private Button subb;
    private Button multi;
    private Button div;
    private Button equals;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button ln;
    private Button sqrt;
    private Button pow_x_2;
    private Button pow_x_y;
    private Button log;
    private Button percent;


    private Calculator calculator = new Calculator();
    private Calculator second = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_activity);

        display = (TextView) findViewById(R.id.display);

        setUpButtons();

        model = ViewModelProviders.of(this).get(CalculateViewModel.class);
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(final String number) {
                display.clearComposingText();
                display.setText(number);
                calculator.save();
                if (!(number.endsWith("."))) {
                    calculator.newResoult(Double.valueOf(number));
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
        System.out.println(calculator.getResoult() + "   " + a.getResoult() + "XDDDD");
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

            case "%":
                a.percent(calculator.getResoult());
                model.getCurrentResoult().setValue(a.getResoult().toString());
                a.ac();
                a.clear();
                break;

            case "^":
                a.pow(calculator.getResoult());
                model.getCurrentResoult().setValue(a.getResoult().toString());
                a.ac();
                a.clear();
                break;


            case "/":
                if (calculator.getResoult() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Nie można dzielić przez zero ", Toast.LENGTH_SHORT);
                    toast.show();
                    model.getCurrentResoult().setValue(a.getResoult().toString());
                    a.ac();
                    a.clear();
                } else {
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
                calculator.back();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.plus_minus:
                calculator.inverse();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.pow_x_2:
                calculator.powsq();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.log:
                calculator.logTen();
                if(calculator.getResoult().isNaN()) {
                    calculator.back();
                    Toast toast = Toast.makeText(getApplicationContext(), "Ujemna Liczba", Toast.LENGTH_SHORT);
                    toast.show();
                }else
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.ln:
                calculator.lognt();
                if(calculator.getResoult().isNaN()) {
                    calculator.back();
                    Toast toast = Toast.makeText(getApplicationContext(), "Ujemna Liczba", Toast.LENGTH_SHORT);
                    toast.show();
                }else
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.sin:
                calculator.sinus();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.cos:
                calculator.cosinus();
                model.getCurrentResoult().setValue(calculator.getResoult().toString());
                break;

            case R.id.sqrt:
                if(calculator.getResoult()>=0) {
                    calculator.sqrt();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Liczba Ujemna", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;

            case R.id.tan:
                calculator.tangens();
                if(calculator.getResoult().isNaN()) {
                    calculator.back();
                    Toast toast = Toast.makeText(getApplicationContext(), "Nie miesci się w dziedzinie funkcji Tangens", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.plus:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("+");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("+");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.minus:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("-");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("-");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.multiply:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("*");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("*");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.divide:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("/");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("/");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.percent:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("%");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("%");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;

            case R.id.pow_x_y:
                if (second.usedOperation == false) {
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("^");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                } else {
                    equalsUse(second);
                    second.clear();
                    second.resoult = calculator.getResoult();
                    second.setUpOpertion("^");
                    calculator.clear();
                    model.getCurrentResoult().setValue(calculator.getResoult().toString());
                }
                break;


            case R.id.equal:
                equalsUse(second);
                second.clear();
                break;
            default:
                break;
        }
        System.out.println("secend=" + second.getResoult());
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
        point = (Button) findViewById(R.id.dot);
        acc = (Button) findViewById(R.id.ac);
        bkcs = (Button) findViewById(R.id.backspace);
        add = (Button) findViewById(R.id.plus);
        subb = (Button) findViewById(R.id.minus);
        plusMinus = (Button) findViewById(R.id.plus_minus);
        multi = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.divide);
        equals = (Button) findViewById(R.id.equal);
        sin=(Button) findViewById(R.id.sin);
        cos=(Button) findViewById(R.id.cos);
        tan=(Button) findViewById(R.id.tan);
        ln=(Button) findViewById(R.id.ln);
        sqrt=(Button) findViewById(R.id.sqrt);
        pow_x_2=(Button) findViewById(R.id.pow_x_2);
        pow_x_y=(Button) findViewById(R.id.pow_x_y);
        log=(Button) findViewById(R.id.log);
        percent=(Button) findViewById(R.id.percent);



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
        point.setOnClickListener(listener);
        acc.setOnClickListener(listener);
        bkcs.setOnClickListener(listener);
        add.setOnClickListener(listener);
        subb.setOnClickListener(listener);
        plusMinus.setOnClickListener(listener);
        multi.setOnClickListener(listener);
        div.setOnClickListener(listener);
        equals.setOnClickListener(listener);
        sin.setOnClickListener(listener);
        cos.setOnClickListener(listener);
        tan.setOnClickListener(listener);
        ln.setOnClickListener(listener);
        sqrt.setOnClickListener(listener);
        pow_x_2.setOnClickListener(listener);
        pow_x_y.setOnClickListener(listener);
        log.setOnClickListener(listener);
        percent.setOnClickListener(listener);

    }
}



