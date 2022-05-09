package com.example.news.ui.gallery_hindi;

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

public class GalleryHindiFragment extends Fragment {

    private GalleryHindiViewModel galleryHindiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryHindiViewModel = new ViewModelProvider(this).get(GalleryHindiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery_hindi, container, false);
        WebView webView = root.findViewById(R.id.web_view_aajTak);
        webView.loadUrl("https://www.aajtak.in/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
