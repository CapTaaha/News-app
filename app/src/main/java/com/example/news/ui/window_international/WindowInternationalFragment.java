package com.example.news.ui.window_international;

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

public class WindowInternationalFragment extends Fragment {

    private WindowInternationalViewModel windowInternationalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        windowInternationalViewModel = new ViewModelProvider(this).get(WindowInternationalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_window_international, container, false);
        WebView webView = root.findViewById(R.id.web_view_msnbc);
        webView.loadUrl("https://www.msnbc.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
