package com.example.calculator;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class TwiceViewModel extends ViewModel {
    private MutableLiveData<String> resoult;
    private String last_resoult;

    public TwiceViewModel() {
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
