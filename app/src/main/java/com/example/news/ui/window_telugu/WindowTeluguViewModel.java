package com.example.news.ui.window_telugu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WindowTeluguViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WindowTeluguViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is window fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
