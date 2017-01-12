package com.myapp.mehrnaz.gameapp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mehrnaz on 12/22/2016.
 */

public class Menu extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        LinearLayout container = (LinearLayout) findViewById(R.id.activity_main);

        for (int i = 1; i <= 8; i++) {
            LinearLayout ll = new LinearLayout(Menu.this);
            LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            ll.setWeightSum(6);

            ll.setOrientation(LinearLayout.HORIZONTAL);
            ll.setLayoutParams(llParams);
            container.addView(ll);

            for (int j = 1; j <= 6; j++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.weight = 1;
                TextView tv = new TextView(Menu.this);
                Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );

                tv.setText(this.getString(R.string.icon_cloud));


                tv.setTypeface(font);
                tv.setGravity(Gravity.CENTER);
                tv.setLayoutParams(params);
                tv.setTextColor(Color.BLUE);
                ll.addView(tv);
            }
        }
    }
}