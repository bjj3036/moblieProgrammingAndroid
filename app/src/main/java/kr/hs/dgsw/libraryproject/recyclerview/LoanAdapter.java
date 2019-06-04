package kr.hs.dgsw.libraryproject.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.List;

import kr.hs.dgsw.libraryproject.beans.BookBean;
import kr.hs.dgsw.libraryproject.beans.LoanBean;
import kr.hs.dgsw.libraryproject.databinding.ItemBookBinding;
import kr.hs.dgsw.libraryproject.databinding.ItemLoanBinding;

public class LoanAdapter extends RecyclerView.Adapter<LoanAdapter.LoanViewHolder> {

    private List<LoanBean> books;

    @NonNull
    @Override
    public LoanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        ItemLoanBinding binding = ItemLoanBinding.inflate(inflater, viewGroup, false);
        return new LoanViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LoanViewHolder bookViewHolder, int i) {
        if (this.books == null)
            return;
        bookViewHolder.binding.setLoan(books.get(i));
    }

    @Override
    public int getItemCount() {
        if (this.books == null)
            return 0;
        return this.books.size();
    }

    public void addBook(LoanBean book){
        this.books.add(book);
        notifyDataSetChanged();
    }

    public void addBook(Collection<LoanBean> book){
        this.books.addAll(book);
        notifyDataSetChanged();
    }

    public void setBooks(List<LoanBean> books){
        this.books = books;
        notifyDataSetChanged();
    }

    class LoanViewHolder extends RecyclerView.ViewHolder {

        ItemLoanBinding binding;

        public LoanViewHolder(@NonNull ItemLoanBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
