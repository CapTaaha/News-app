package com.example.news.ui.gallery_bengali;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryBengaliViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryBengaliViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}