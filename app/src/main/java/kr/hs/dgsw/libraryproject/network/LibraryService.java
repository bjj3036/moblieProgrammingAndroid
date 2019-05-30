package kr.hs.dgsw.libraryproject.network;

import java.util.ArrayList;
import java.util.List;

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

    String BASE_URL = "http://hatomu.kro.kr:3000/";
	
	@GET('board/getList')
	Call<List<Board>> getBoardList();
}
