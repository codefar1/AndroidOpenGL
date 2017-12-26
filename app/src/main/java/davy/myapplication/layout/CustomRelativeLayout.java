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
        Log.d("TAG", TAG + ":onMeasure");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Log.d("TAG", TAG + ":onLayout");
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("TAG", TAG + ":onDraw");
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Log.d("TAG", TAG + ":dispatchDraw");
        super.dispatchDraw(canvas);
    }
}
