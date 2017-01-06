package com.myapp.mehrnaz.gameapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Button btn;
        btn= (Button) findViewById(R.id.btn);
        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
      TextView txt = (TextView) findViewById( R.id.txt);
       txt.setTypeface(font);
        TextView txt2 = (TextView) findViewById( R.id.txt2 );
        txt2.setTypeface(font);
        //TextView txt3 = (TextView) findViewById( R.id.txt3 );
        //txt3.setTypeface(font);
        TextView txt4 = (TextView) findViewById( R.id.txt4 );
        txt4.setTypeface(font);
        TextView txticonsetting = (TextView) findViewById( R.id.txtIconSetting);
        txticonsetting.setTypeface(font);
        TextView txticonuser = (TextView) findViewById( R.id.txtIconUser);
        txticonuser.setTypeface(font);
        TextView txticonplay = (TextView) findViewById( R.id.txtIconPlay);
        txticonplay.setTypeface(font);
        TextView txticonmenu= (TextView) findViewById( R.id.txtIconMenu);
        txticonmenu.setTypeface(font);
        TextView txticonsquare= (TextView) findViewById( R.id.txtsquare);
        txticonsquare.setTypeface(font);
        TextView txticonplus= (TextView) findViewById( R.id.txtplus);
      txticonplus.setTypeface(font);
        TextView txtstar= (TextView) findViewById( R.id.txtstar);
        txtstar.setTypeface(font);
        TextView txtuserplus= (TextView) findViewById( R.id.txtUserPlus);
        txtuserplus.setTypeface(font);
        TextView txtuserplusbg= (TextView) findViewById( R.id.txtUserPlusbg);
        txtuserplusbg.setTypeface(font);
        TextView txtsq2= (TextView) findViewById( R.id.txtsquare2);
        txtsq2.setTypeface(font);
        TextView txtplusbg= (TextView) findViewById( R.id.txtplusbg);
        txtplusbg.setTypeface(font);

        TextView txtsq2bg= (TextView) findViewById( R.id.txtsquare2bg);
        txtsq2bg.setTypeface(font);
        txticonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(MainActivity.this,Menu.class);
                startActivity(intent);
            }
        });
        txticonsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Menu.class);
                startActivity(intent);
            }
        });
        txticonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Menu.class);
                startActivity(intent);
            }
        });


        RotateAnimation rotate= (RotateAnimation) AnimationUtils.loadAnimation(this,R.anim.rotateanimation);
        txt.setAnimation(rotate);
        RotateAnimation rotate2= (RotateAnimation) AnimationUtils.loadAnimation(this,R.anim.animate2);
        //txtwifi.setAnimation(rotate2);
    }
}
