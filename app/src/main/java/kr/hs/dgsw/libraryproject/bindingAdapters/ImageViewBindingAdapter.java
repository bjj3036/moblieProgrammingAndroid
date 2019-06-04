package kr.hs.dgsw.libraryproject.bindingAdapters;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class ImageViewBindingAdapter {

    @BindingAdapter("imageUrl")
    public static void ImageUrl(ImageView imageView, String imageUrl){
        Glide.with(imageView.getContext())
                .load(imageUrl)
                .skipMemoryCache(true)
                .override(Target.SIZE_ORIGINAL)
                .into(imageView);
    }

}
