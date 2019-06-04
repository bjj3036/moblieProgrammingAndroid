package kr.hs.dgsw.libraryproject.activitys;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.hs.dgsw.libraryproject.R;
import kr.hs.dgsw.libraryproject.beans.LibraryBean;
import kr.hs.dgsw.libraryproject.databinding.ActivityLibraryInfoBinding;

public class LibraryInfoActivity extends AppCompatActivity {

    private ActivityLibraryInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_library_info);

        LibraryBean libraryBean = new LibraryBean();
        libraryBean.setLibraryName("도원도서관");
        libraryBean.setLocation("대구광역시 달서구 한실로 113 (도원동)");
        libraryBean.setClosedDay("매주 월요일 및 관공서의 공휴일 (토, 일 제외)");
        libraryBean.setLibraryImage("http://mblogthumb2.phinf.naver.net/MjAxNzEyMTlfODgg/MDAxNTEzNjU3NjMyOTI4.-9CS9GEDieXLay1rva3_RnCcde918-TK9gfsTS8zkWgg.c5O1kpiUtDui_kh9M4djTSJxqV9MD1-73wir_pHDDg8g.JPEG.dalseoblog/1.jpg?type=w800");
        //TODO you should set library
        binding.setLibrary(libraryBean);
    }
}
