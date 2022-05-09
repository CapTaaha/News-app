package com.example.news.ui.home_bengali;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeBengaliViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeBengaliViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}