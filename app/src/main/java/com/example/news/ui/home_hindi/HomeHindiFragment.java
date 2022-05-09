package com.example.news.ui.home_hindi;

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

public class HomeHindiFragment extends Fragment {

    private HomeHindiViewModel homeHindiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeHindiViewModel = new ViewModelProvider(this).get(HomeHindiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_hindi, container, false);

        // Created a WebView and used the loader method
        // to give url to WebView Controller class
        WebView webView = root.findViewById(R.id.web_view_khasKhabar);

        // Url of website is passed here
        webView.loadUrl("https://www.khaskhabar.com/");

        // WebViewController is used
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
