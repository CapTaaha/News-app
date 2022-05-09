package com.example.news.ui.gallery_hindi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryHindiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryHindiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}