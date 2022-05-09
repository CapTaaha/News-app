package com.example.news.ui.gallery_bengali;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.news.R;
import com.example.news.WebViewController;

public class GalleryBengaliFragment extends Fragment {

    private GalleryBengaliViewModel galleryBengaliViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryBengaliViewModel = new ViewModelProvider(this).get(GalleryBengaliViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery_bengali, container, false);
        WebView webView = root.findViewById(R.id.web_view_news18);
        webView.loadUrl("https://bengali.news18.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
