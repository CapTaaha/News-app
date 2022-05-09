package com.example.news.ui.slideshow_bengali;

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

public class SlideshowBengaliFragment extends Fragment {

    private SlideshowBengaliViewModel slideshowBengaliViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        slideshowBengaliViewModel = new ViewModelProvider(this).get(SlideshowBengaliViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow_bengali, container, false);
        WebView webView = root.findViewById(R.id.web_view_zee24Ghanta);
        webView.loadUrl("https://zeenews.india.com/bengali");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
