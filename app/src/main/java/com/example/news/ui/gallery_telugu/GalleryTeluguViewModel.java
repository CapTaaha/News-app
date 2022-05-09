package com.example.news.ui.gallery_telugu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryTeluguViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryTeluguViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}