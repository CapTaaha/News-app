package com.example.news.ui.home_international;

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

public class HomeInternationalFragment extends Fragment {

    private HomeInternationalViewModel homeInternationalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeInternationalViewModel = new ViewModelProvider(this).get(HomeInternationalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_international, container, false);

        // Created a WebView and used the loader method
        // to give url to WebView Controller class
        WebView webView = root.findViewById(R.id.web_view_bbc);

        // Url of website is passed here
        webView.loadUrl("https://www.bbc.com/");

        // WebViewController is used
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
