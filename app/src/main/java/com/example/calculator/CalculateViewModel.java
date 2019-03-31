package com.example.calculator;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CalculateViewModel extends ViewModel {
    private MutableLiveData<Double> resoult;
    private Double last_resoult;

    public MutableLiveData<Double> getCurrentResoult() {
        if (resoult == null) {
            resoult = new MutableLiveData<Double>();
            resoult.setValue(0.0);
        }
        return resoult;
    }

    public void add(double number){
        if(resoult!=null) {
            double temp = resoult.getValue() + number;
            resoult.setValue(temp);
        }
        else
            resoult.setValue(number);
    }

    public void sub(double number){
        if(resoult!=null) {
            double temp = resoult.getValue() - number;
            resoult.setValue(temp);
        }
        else
            resoult.setValue(-number);
    }

    public void multiplication(double number){
        if(resoult!=null) {
            double temp = resoult.getValue() * number;
            resoult.setValue(temp);
        }
    }

    public void division(double number){
        if(resoult!=null) {
            double temp = resoult.getValue() / number;
            resoult.setValue(temp);
        }
    }

    public void inverse(){
        if(resoult!=null) { ;
            resoult.setValue(-(resoult.getValue()));
        }
    }

    public void sinus(){
        if(resoult!=null) { ;
            resoult.setValue(Math.sin(resoult.getValue()));
        }
    }

    public void cosinus(){
        if(resoult!=null) { ;
            resoult.setValue(Math.cos(resoult.getValue()));
        }
    }

    public void tangens(){
        if(resoult!=null) { ;
            resoult.setValue(Math.tan(resoult.getValue()));
        }
    }

    public void lognt(){
        if(resoult!=null) { ;
            resoult.setValue(Math.log(resoult.getValue()));
        }
    }

    public void logTen(){
        if(resoult!=null) { ;
            resoult.setValue(Math.log10(resoult.getValue()));
        }
    }

    public void percent(){
        if(resoult!=null) { ;
            resoult.setValue(Math.log10(resoult.getValue()));
        }
    }

}
