package com.example.news.ui.home_international;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeInternationalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeInternationalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}