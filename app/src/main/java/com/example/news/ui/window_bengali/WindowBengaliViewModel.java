package com.example.news.ui.window_bengali;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WindowBengaliViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WindowBengaliViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is window fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
