package kr.hs.dgsw.libraryproject.network;

import java.util.ArrayList;
import java.util.List;

import kr.hs.dgsw.libraryproject.beans.BookBean;
import kr.hs.dgsw.libraryproject.beans.ResponseBean;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LibraryService {

    String BASE_URL = "http://dalseolibrary.kro.kr:3000/";

    @GET("/book/loadAll")
    Call<ResponseBean<List<BookBean>>> loadAllBooks();
}
