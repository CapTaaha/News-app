package com.example.news.ui.home_bengali;

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

public class HomeBengaliFragment extends Fragment {

    private HomeBengaliViewModel homeBengaliFragment;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeBengaliFragment = new ViewModelProvider(this).get(HomeBengaliViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_bengali, container, false);

        // Created a WebView and used the loader method
        // to give url to WebView Controller class
        WebView webView = root.findViewById(R.id.web_view_kolkataTV);

        // Url of website is passed here
        webView.loadUrl("https://kolkatatv.org/");

        // WebViewController is used
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
