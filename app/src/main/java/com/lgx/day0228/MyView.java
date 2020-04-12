package com.lgx.day0228;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    private Paint gongPaint;
    private Path xianPath;
    private Paint xianPaint;

    public MyView(Context context) {
        super(context);

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        gongPaint = new Paint();
        gongPaint.setColor(getResources().getColor(R.color.colorPrimary));
        gongPaint.setStrokeWidth(2);

        xianPaint = new Paint();



        xianPath = new Path();
        xianPath.quadTo(100,100,600,100);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawLine(100,100,600,100,gongPaint);
        canvas.drawPath(xianPath,xianPaint);

    }
}
