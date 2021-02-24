package com.hfad.certification;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class SecondCustom extends View {
    private int shapes;
    private float dimen;
    private int color;
    private static final int SQUARE_SHAPE = 1;
    private static final int CIRCLE_SHAPE = 0;
    private Paint paint;
    public SecondCustom(Context context) {
        super(context);

    }

    public SecondCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(
                attrs, R.styleable.EditTextView);
        try {
            shapes = a.getInteger(R.styleable.EditTextView_custom_shape,0);
            dimen = a.getDimension(R.styleable.EditTextView_dimensionVal,12f);
            paint = new Paint();
            color = a.getColor(R.styleable.EditTextView_shape_color,0);
            paint.setColor(color);

        }catch (Exception e){

        }finally {
            a.recycle();
        }

    }

    public SecondCustom(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (shapes){
            case CIRCLE_SHAPE:
                canvas.drawCircle(dimen,dimen,dimen,paint);
                break;
            case SQUARE_SHAPE:
                canvas.drawRect(0,0,dimen,dimen,paint);
                break;
        }

    }

}