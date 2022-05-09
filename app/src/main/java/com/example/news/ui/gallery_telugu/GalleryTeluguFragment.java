package com.example.news.ui.gallery_telugu;

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

public class GalleryTeluguFragment extends Fragment {

    private GalleryTeluguViewModel galleryTeluguViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryTeluguViewModel = new ViewModelProvider(this).get(GalleryTeluguViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery_telugu, container, false);
        WebView webView = root.findViewById(R.id.web_view_TV9);
        webView.loadUrl("https://tv9telugu.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
