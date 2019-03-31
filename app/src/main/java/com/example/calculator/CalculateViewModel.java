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
            double temp = resoult.getValue() * number;
            resoult.setValue(temp);
        }
    }
}
