package com.example.news.ui.window_hindi;

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
import com.example.news.ui.slideshow.SlideshowViewModel;

public class WindowHindiFragment extends Fragment {

    private WindowHindiViewModel windowHindiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        windowHindiViewModel = new ViewModelProvider(this).get(WindowHindiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_window_hindi, container, false);
        WebView webView = root.findViewById(R.id.web_view_patrikaNews);
        webView.loadUrl("https://www.patrika.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
