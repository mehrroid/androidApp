package com.myapp.mehrnaz.gameapp;

/**
 * Created by Mehrnaz on 12/29/2016.
 */



        import android.app.Activity;
        import android.content.Context;
        import android.content.res.Configuration;
        import android.util.DisplayMetrics;

public class Convert {


    public enum ScreenSize {
        SMALL,
        NORMAL,
        LARGE,
        XLARGE
    }

    public static int getDensity(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay()
                .getMetrics(metrics);
        return metrics.densityDpi;
    }

    public static int convertDpToPixel(int dp, Context context) {
        DisplayMetrics displayMetrics = context.getResources()
                .getDisplayMetrics();
        return Math.round(dp
                * (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public static int convertPixelToDp(int pixel, Context context) {
        DisplayMetrics displayMetrics = context.getResources()
                .getDisplayMetrics();
        return Math.round(pixel
                / (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public static ScreenSize getSize(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
            return ScreenSize.SMALL;
        } else if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
            return ScreenSize.NORMAL;
        } else if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
            return ScreenSize.LARGE;
        } else {
            return ScreenSize.XLARGE;
        }
    }
}
