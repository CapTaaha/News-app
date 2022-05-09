package com.example.news.ui.slideshow_telugu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowTeluguViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowTeluguViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}