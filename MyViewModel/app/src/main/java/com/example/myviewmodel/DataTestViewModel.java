package com.example.myviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataTestViewModel extends ViewModel {
    public MutableLiveData<String> textString = new MutableLiveData<>();
}
