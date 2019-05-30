package kr.hs.dgsw.libraryproject.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.hs.dgsw.libraryproject.R;
import kr.hs.dgsw.libraryproject.databinding.FragmentMyPageBinding;

public class MyPageFragment extends Fragment {

    private FragmentMyPageBinding binding;

    public MyPageFragment() {
    }

    public static MyPageFragment newInstance() {
        MyPageFragment fragment = new MyPageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentMyPageBinding.inflate(inflater, container, false);
        return this.binding.getRoot();
    }
}
