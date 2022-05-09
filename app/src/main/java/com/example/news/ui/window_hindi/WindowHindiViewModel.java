package com.example.news.ui.window_hindi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WindowHindiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WindowHindiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is window fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
