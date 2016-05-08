package com.vuforia.samples.VuforiaSamples.app.ImageTargets;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.vuforia.samples.VuforiaSamples.R;

/**
 * Created by joseportocarrero on 5/8/16.
 */
public class ImageRendererFactory {
    public static Bitmap getDisplayImage(Activity activity, String name){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        if(name.equals("fish_and_chips")){
            return  getBitmap(activity, R.drawable.fish_and_chips_pic);
        } else if(name.equals("fresh_clam_strips")){
            return getBitmap(activity, R.drawable.fried_clam_strips);
        }
        return getBitmap(activity, R.drawable.icon);
    }

    private static Bitmap getBitmap(Activity activity, int drawable){
        return BitmapFactory.decodeResource(activity.getResources(), drawable);
    }


}
