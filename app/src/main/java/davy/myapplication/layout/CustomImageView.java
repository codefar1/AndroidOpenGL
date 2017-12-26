package davy.myapplication.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2017/12/7
 * time: 15:06
 */

public class CustomImageView extends AppCompatImageView {

    public static final String TAG = "CustomImageView";

    public CustomImageView(Context context) {
        super(context);
    }

    public CustomImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.d("TAG", TAG + "-" + ":onMeasure" + getMeasuredHeight() + " " + getMeasuredWidth());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("TAG", TAG + "-" + ":onDraw");
        super.onDraw(canvas);
    }

    @Override
    public void setImageResource(@DrawableRes int resId) {
        super.setImageResource(resId);
        Log.d("TAG", TAG + "-" + ":setImageResource" + Log.getStackTraceString(new Throwable()));
    }
}
