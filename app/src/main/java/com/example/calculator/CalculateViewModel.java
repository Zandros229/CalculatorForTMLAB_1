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
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            double temp = resoult.getValue() + number;
            resoult.setValue(temp);
        }
        else
            resoult.setValue(number);
    }

    public void sub(double number){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            double temp = resoult.getValue() - number;
            resoult.setValue(temp);
        }
        else
            resoult.setValue(-number);
    }

    public void multiplication(double number){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            double temp = resoult.getValue() * number;
            resoult.setValue(temp);
        }
    }

    public void division(double number){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            double temp = resoult.getValue() / number;
            resoult.setValue(temp);
        }
    }

    public void inverse(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(-(resoult.getValue()));
        }
    }

    public void sinus(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.sin(resoult.getValue()));
        }
    }

    public void cosinus(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.cos(resoult.getValue()));
        }
    }

    public void tangens(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.tan(resoult.getValue()));
        }
    }

    public void lognt(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.log(resoult.getValue()));
        }
    }

    public void logTen(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.log10(resoult.getValue()));
        }
    }

    public void percent(double number){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(resoult.getValue()*(number*0.01));
        }
    }

    public void sqrt(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.sqrt(resoult.getValue()));
        }
    }

    public void pow(double number){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.pow(resoult.getValue(),number));
        }
    }

    public void powsq(){
        last_resoult=resoult.getValue();
        if(resoult!=null) {
            resoult.setValue(Math.pow(resoult.getValue(),2));
        }
    }

    public void back(){
        if(last_resoult!=null) {
            resoult.setValue(last_resoult);
        }
        else
            resoult.setValue(0.0);
    }

    public void newResoult(double number){
        last_resoult=resoult.getValue();
        resoult.setValue(number);
    }



}
