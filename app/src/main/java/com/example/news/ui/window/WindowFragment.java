package com.example.news.ui.window;

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

public class WindowFragment extends Fragment {

    private WindowViewModel windowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        windowViewModel = new ViewModelProvider(this).get(WindowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_window, container, false);
        WebView webView = root.findViewById(R.id.web_view_ndtv);
        webView.loadUrl("https://www.ndtv.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}