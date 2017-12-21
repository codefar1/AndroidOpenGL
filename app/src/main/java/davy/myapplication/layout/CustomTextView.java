package davy.myapplication.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2017/12/7
 * time: 15:06
 */

public class CustomTextView extends TextView {

    public static final String TAG = "CustomTextView";
    private Paint paint;

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(getTextColors().getDefaultColor());
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.d("TAG", TAG + "-" + this.getTag() + ":onMeasure" + getMeasuredHeight() + " " + getMeasuredWidth());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Log.d("TAG", TAG + "-" + this.getTag() + ":onLayout");
        super.onLayout(changed, l, t, r, b);
    }

    Rect rect = new Rect();

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("TAG", TAG + "-" + this.getTag() + ":onDraw");
        super.onDraw(canvas);

        canvas.drawColor(Color.RED);

        String str = getText().toString();
        paint.getTextBounds(str, 0, str.length(), rect);
        int w = rect.width();
        int h = rect.height();
        canvas.drawText(str, 10, 10, paint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Log.d("TAG", TAG + "-" + this.getTag() + ":dispatchDraw");
        super.dispatchDraw(canvas);
    }
}
