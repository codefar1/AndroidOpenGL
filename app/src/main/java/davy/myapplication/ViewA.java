package davy.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2017/12/8
 * time: 10:33
 */

public class ViewA extends View {

    public static final String TAG = "ViewA";
    private Paint paint;

    public ViewA(Context context) {
        super(context);
    }

    public ViewA(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    public ViewA(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("TAG", TAG + "-" + this.getTag() + ":onMeasure" + getMeasuredHeight() + " " + getMeasuredWidth());
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.d("TAG", TAG + "-"  + this.getTag() + ":onLayout");
    }

    Rect rect = new Rect();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.GREEN);

        String str = "附近的搜开发；单身快乐";

        paint.getTextBounds(str, 0, str.length(), rect);
        int w = rect.width();
        int h = rect.height();

        canvas.drawText(str, 10 , h, paint);
        Log.d("TAG", TAG + "-"  + this.getTag() + ":onDraw" + rect + " " + w + " " + h);
    }
}
