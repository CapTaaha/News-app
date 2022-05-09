package com.example.news.ui.window;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WindowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WindowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is window fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}