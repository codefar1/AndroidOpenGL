package davy.myapplication.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2017/12/7
 * time: 15:04
 */

public class CustomRelativeLayout extends RelativeLayout {

    public static final String TAG = "CustomRelativeLayout";

    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("TAG", TAG + ":onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.d("TAG", TAG + ":onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("TAG", TAG + ":onDraw");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.d("TAG", TAG + ":dispatchDraw");
    }
}