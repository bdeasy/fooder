package com.vuforia.samples.VuforiaSamples.ui.ActivityList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by joseportocarrero on 5/8/16.
 */
public class CameraViewOverlay extends View {
    private Paint paint = new Paint();
    CameraViewOverlay(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) { // Override the onDraw() Method
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#CC00BCD4"));
    }
}