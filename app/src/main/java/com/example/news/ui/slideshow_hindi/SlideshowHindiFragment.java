package com.example.news.ui.slideshow_hindi;

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

public class SlideshowHindiFragment extends Fragment {

    private SlideshowHindiViewModel slideshowHindiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        slideshowHindiViewModel = new ViewModelProvider(this).get(SlideshowHindiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow_hindi, container, false);
        WebView webView = root.findViewById(R.id.web_view_dainikBhaskar);
        webView.loadUrl("https://www.bhaskar.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
