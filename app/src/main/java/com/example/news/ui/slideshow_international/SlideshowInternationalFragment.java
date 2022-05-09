package com.example.news.ui.slideshow_international;

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

public class SlideshowInternationalFragment extends Fragment {

    private SlideshowInternationalViewModel slideshowInternationalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        slideshowInternationalViewModel = new ViewModelProvider(this).get(SlideshowInternationalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow_international, container, false);
        WebView webView = root.findViewById(R.id.web_view_cnn);
        webView.loadUrl("https://edition.cnn.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
