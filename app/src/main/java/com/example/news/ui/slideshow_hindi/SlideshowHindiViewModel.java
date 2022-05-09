package com.example.news.ui.slideshow_hindi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowHindiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowHindiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}