package com.example.comeng2024hafta12001;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
private MutableLiveData<String> TheData;

    public MutableLiveData<String> getTheData() {
        return TheData;
    }

    public void setTheData(String data) {
        TheData.setValue(data);
    }

    public MyViewModel(){this.TheData= new MutableLiveData<>();}

}
