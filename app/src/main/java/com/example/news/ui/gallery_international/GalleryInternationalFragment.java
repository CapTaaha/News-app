package com.example.news.ui.gallery_international;

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

public class GalleryInternationalFragment extends Fragment {

    private GalleryInternationalViewModel galleryInternationalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryInternationalViewModel = new ViewModelProvider(this).get(GalleryInternationalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery_international, container, false);
        WebView webView = root.findViewById(R.id.web_view_foxnews);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
