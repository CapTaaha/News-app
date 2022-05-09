package com.example.news.ui.gallery_international;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryInternationalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryInternationalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}