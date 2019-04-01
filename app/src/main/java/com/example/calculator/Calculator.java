package com.example.calculator;

public class Calculator {

    public Double resoult=new Double(0.0);
    public double last_resoult=resoult;
    public boolean dot=false;


    public void add(double number){
        last_resoult=resoult;
        if(resoult!=null) {
            double temp = resoult + number;
            resoult=temp;
        }
        else
            resoult=(number);
    }

    public void sub(double number){
        last_resoult=resoult;
        if(resoult!=null) {
            double temp = resoult - number;
            resoult=(temp);
        }
        else
            resoult=(-number);
    }

    public void multiplication(double number){
        last_resoult=resoult;
        if(resoult!=null) {
            double temp = resoult * number;
            resoult=(temp);
        }
    }

    public void division(double number){
        last_resoult=resoult;
        if(resoult!=null) {
            double temp = resoult / number;
            resoult=(temp);
        }
    }

    public void inverse(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(-resoult);
        }
    }

    public void sinus(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.sin(resoult));
        }
    }

    public void cosinus(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.cos(resoult));
        }
    }

    public void tangens(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.tan(resoult));
        }
    }

    public void lognt(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.log(resoult));
        }
    }

    public void logTen(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.log10(resoult));
        }
    }

    public void percent(double number){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(resoult*(number*0.01));
        }
    }

    public void sqrt(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.sqrt(resoult));
        }
    }

    public void pow(double number){

        if(resoult!=null) {
            last_resoult=resoult;
            resoult=(Math.pow(resoult,number));
        }
    }

    public void powsq(){
        last_resoult=resoult;
        if(resoult!=null) {
            resoult=(Math.pow(resoult,2));
        }
    }

    public void back(){
        resoult=(last_resoult);
    }

    public void newResoult(double number){
        if(resoult!=null)
            last_resoult=resoult;
        resoult=(number);
    }

    public void addNumberDot(String number){
        if (dot){
            last_resoult = resoult;
            resoult=(Double.valueOf(String.valueOf(resoult.intValue())+"."+number));
        }
         else if (resoult!=0.0) {
            last_resoult = resoult;
            resoult=(Double.valueOf((resoult).toString() + number));
        }
        else
            resoult=Double.valueOf(number);

    }

    public void addNumber(String number){
        if(resoult!=0.0) {
            last_resoult = resoult;
            resoult=(Double.valueOf(String.valueOf(resoult.intValue())+number));
        }else
            resoult=Double.valueOf(number);

    }
    public boolean checkDot(){
        if((resoult.intValue()-resoult)==0)
            return true;
        else
            return false;
    }
    public Double getResoult() {
        return resoult;
    }

    public double getLast_resoult() {
        return last_resoult;
    }
}
