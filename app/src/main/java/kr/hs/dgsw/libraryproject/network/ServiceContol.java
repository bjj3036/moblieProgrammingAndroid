package kr.hs.dgsw.libraryproject.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceContol {
    private static LibraryService libraryService;

    public static LibraryService getLibraryService() {
        if (libraryService != null)
            return libraryService;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LibraryService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        libraryService = retrofit.create(LibraryService.class);
        return libraryService;
    }
}
