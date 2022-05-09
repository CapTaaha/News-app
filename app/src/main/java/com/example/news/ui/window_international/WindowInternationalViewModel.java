package com.example.news.ui.window_international;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WindowInternationalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WindowInternationalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is window fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
