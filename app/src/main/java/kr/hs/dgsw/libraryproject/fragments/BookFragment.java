package kr.hs.dgsw.libraryproject.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import kr.hs.dgsw.libraryproject.R;
import kr.hs.dgsw.libraryproject.databinding.FragmentBookBinding;


public class BookFragment extends Fragment {

    private FragmentBookBinding binding;

    public BookFragment() {
        // Required empty public constructor
    }

    public static BookFragment newInstance() {
        BookFragment fragment = new BookFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentBookBinding.inflate(inflater, container, false);
        return this.binding.getRoot();
    }
}
