package kr.hs.dgsw.libraryproject.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.List;

import kr.hs.dgsw.libraryproject.R;
import kr.hs.dgsw.libraryproject.beans.BookBean;
import kr.hs.dgsw.libraryproject.beans.ResponseBean;
import kr.hs.dgsw.libraryproject.databinding.FragmentBookBinding;
import kr.hs.dgsw.libraryproject.network.LibraryService;
import kr.hs.dgsw.libraryproject.network.ServiceControl;
import kr.hs.dgsw.libraryproject.recyclerview.BookAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class BookFragment extends Fragment {

    private FragmentBookBinding binding;
    private LibraryService service;

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
        this.service = ServiceControl.getLibraryService();

        this.binding = FragmentBookBinding.inflate(inflater, container, false);
        BookAdapter adapter = new BookAdapter();
        this.binding.recyclerViewBook.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        this.binding.recyclerViewBook.setAdapter(adapter);

        service.loadAllBooks().enqueue(new Callback<ResponseBean<List<BookBean>>>() {
            @Override
            public void onResponse(Call<ResponseBean<List<BookBean>>> call, Response<ResponseBean<List<BookBean>>> response) {
                if (response.isSuccessful()) {
                    adapter.setBooks(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<ResponseBean<List<BookBean>>> call, Throwable t) {

            }
        });

        return this.binding.getRoot();
    }
}
