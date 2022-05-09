package com.example.news.ui.window_telugu;

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

public class WindowTeluguFragment extends Fragment {

    private WindowTeluguViewModel windowTeluguViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        windowTeluguViewModel = new ViewModelProvider(this).get(WindowTeluguViewModel.class);
        View root = inflater.inflate(R.layout.fragment_window_telugu, container, false);
        WebView webView = root.findViewById(R.id.web_view_ntvTelugu);
        webView.loadUrl("https://ntvtelugu.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
