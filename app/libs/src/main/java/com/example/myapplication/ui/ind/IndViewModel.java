package com.example.myapplication.ui.ind;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public IndViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ind fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}