package com.jobb.menume.activity.app.ImageTargets;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.jobb.menume.activity.R;

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
            return getBitmap(activity, R.drawable.fresh_clam_strips);
        } else if(name.equals("tuscan_lobster_roll")){
            return getBitmap(activity, R.drawable.tuscan_lobster_roll);
        } else if(name.equals("the_salty_dog")){
            return getBitmap(activity, R.drawable.the_salty_dog);
        } else if(name.equals("surf_n_turf_roll")){
            return getBitmap(activity, R.drawable.surf_n_turf_roll);
        } else if(name.equals("peel_and_eat_shrimp")){
            return getBitmap(activity, R.drawable.peel_and_eat_shrimp);
        } else if(name.equals("new_england_seafood_boil")){
            return getBitmap(activity, R.drawable.new_england_seafood_boil);
        } else if(name.equals("mojito")){
            return getBitmap(activity, R.drawable.mojito);
        } else if(name.equals("margarita")){
            return getBitmap(activity, R.drawable.margarita);
        } else if(name.equals("maine_lobster_roll")){
            return getBitmap(activity, R.drawable.maine_lobster_roll);
        } else if(name.equals("mai_tai")){
            return getBitmap(activity, R.drawable.mai_tai);
        } else if(name.equals("lobster_mac_and_cheese")){
            return getBitmap(activity, R.drawable.lobster_mac_and_cheese);
        } else if(name.equals("lobster_dinner")){
            return getBitmap(activity, R.drawable.lobster_dinner);
        } else if(name.equals("lobster_citrus_salad")){
            return getBitmap(activity, R.drawable.lobster_citrus_salad);
        } else if(name.equals("lobster_cheese_fries")){
            return getBitmap(activity, R.drawable.lobster_cheese_fries);
        } else if(name.equals("hot_crab_dip")){
            return getBitmap(activity, R.drawable.hot_crab_dip);
        } else if(name.equals("hook_burger")){
            return getBitmap(activity, R.drawable.hook_burger);
        } else if(name.equals("fried_pickles")){
            return getBitmap(activity, R.drawable.fried_pickles);
        } else if(name.equals("fried_oyster_roll")){
            return getBitmap(activity, R.drawable.fried_oyster_roll);
        } else if(name.equals("fried_oyster_rockafella")){
            return getBitmap(activity, R.drawable.fried_oyster_rockafella);
        } else if(name.equals("drunken_cherry_lemonade")){
            return getBitmap(activity, R.drawable.drunken_cherry_lemonade);
        } else if(name.equals("crab_cake_sandwich")){
            return getBitmap(activity, R.drawable.crab_cake_sandwich);
        } else if(name.equals("connecticut_lobster_roll")){
            return getBitmap(activity, R.drawable.connecticut_lobster_roll);
        } else if(name.equals("cobbster_salad")){
            return getBitmap(activity, R.drawable.cobbster_salad);
        } else if(name.equals("chicken_sandwich")){
            return getBitmap(activity, R.drawable.chicken_sandwich);
        }
        return getBitmap(activity, R.drawable.ic_launcher);
    }

    /**
     "hook_burger"
     "fried_pickles"
     "fried_oyster_roll"
     "fried_oyster_rockafella"
     "drunken_cherry_lemonade"
     "crab_cake_sandwich"
     "connecticut_lobster_roll"
     "cobbster_salad"
     "chicken_sandwich"
     */

    private static Bitmap getBitmap(Activity activity, int drawable){
        return BitmapFactory.decodeResource(activity.getResources(), drawable);
    }


}
