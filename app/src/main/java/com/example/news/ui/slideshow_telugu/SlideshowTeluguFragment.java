package com.example.news.ui.slideshow_telugu;

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

public class SlideshowTeluguFragment extends Fragment {

    private SlideshowTeluguViewModel slideshowTeluguViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        slideshowTeluguViewModel = new ViewModelProvider(this).get(SlideshowTeluguViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow_telugu, container, false);
        WebView webView = root.findViewById(R.id.web_view_andrajyothy);
        webView.loadUrl("https://m.andhrajyothy.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
