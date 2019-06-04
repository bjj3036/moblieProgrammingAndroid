package kr.hs.dgsw.libraryproject.bindingAdapters;

import android.databinding.BindingAdapter;
import android.widget.TextView;

import kr.hs.dgsw.libraryproject.utils.DateUtil;

public class TextViewBindingAdapter {

    @BindingAdapter("timeToString")
    public static void timeToString(TextView view, long time){
        view.setText(DateUtil.longToString(time));
    }
}
