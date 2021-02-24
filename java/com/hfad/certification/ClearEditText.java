package com.hfad.certification;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;

public class ClearEditText extends AppCompatEditText {
    AttributeSet attrs;
    private int color;
    public ClearEditText(@NonNull Context context) {
        super(context);
        init();
    }

    public ClearEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ClearEditText);
        try {
            color = typedArray.getColor(R.styleable.ClearEditText_backgroundColor,0);
            setBackgroundColor(color);

        }catch (Exception e){

        }finally {
            typedArray.recycle();
        }
        init();
    }

    public ClearEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init(){


    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
    }
}
