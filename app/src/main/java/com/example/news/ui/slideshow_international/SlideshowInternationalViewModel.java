package com.example.news.ui.slideshow_international;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowInternationalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowInternationalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}