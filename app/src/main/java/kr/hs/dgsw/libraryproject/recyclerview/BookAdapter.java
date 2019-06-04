package kr.hs.dgsw.libraryproject.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.List;

import kr.hs.dgsw.libraryproject.beans.BookBean;
import kr.hs.dgsw.libraryproject.databinding.ItemBookBinding;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<BookBean> books;

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        ItemBookBinding binding = ItemBookBinding.inflate(inflater, viewGroup, false);
        return new BookViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder bookViewHolder, int i) {
        if (this.books == null)
            return;
        bookViewHolder.binding.setBook(books.get(i));
    }

    @Override
    public int getItemCount() {
        if (this.books == null)
            return 0;
        return this.books.size();
    }

    public void addBook(BookBean book){
        this.books.add(book);
        notifyDataSetChanged();
    }

    public void addBook(Collection<BookBean> book){
        this.books.addAll(book);
        notifyDataSetChanged();
    }

    public void setBooks(List<BookBean> books){
        this.books = books;
        notifyDataSetChanged();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {

        ItemBookBinding binding;

        public BookViewHolder(@NonNull ItemBookBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
