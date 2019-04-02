package com.example.calculator;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.math.BigDecimal;

public class CalculateViewModel extends ViewModel {
    private MutableLiveData<String> resoult;
    private String last_resoult;

    public CalculateViewModel() {
        this.resoult = new MutableLiveData<String>();
        this.resoult.setValue("0.0");
        this.last_resoult = this.resoult.getValue();
    }

    public MutableLiveData<String> getCurrentResoult() {
        if (resoult == null) {
            resoult = new MutableLiveData<String>();
            resoult.setValue("0.0");
        }
        return resoult;
    }



}
