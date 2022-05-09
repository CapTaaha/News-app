package com.example.news.ui.slideshow_bengali;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowBengaliViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowBengaliViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}