package com.example.news.ui.home_telugu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeTeluguViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeTeluguViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}