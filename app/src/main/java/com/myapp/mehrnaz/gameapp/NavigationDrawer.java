package com.myapp.mehrnaz.gameapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   // Button btn;
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //etSupportActionBar(toolbar);

       // btn= (Button) findViewById(R.id.btn);

//    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        //UI
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
        TextView playgamebg= (TextView) findViewById( R.id.txtIconPlaybg);
       playgamebg.setTypeface(font);
        TextView txticonmenu= (TextView) findViewById( R.id.txtIconMenu);
        txticonmenu.setTypeface(font);
        TextView txticonmenubg= (TextView) findViewById( R.id.txtIconMenubg);
        txticonmenubg.setTypeface(font);
        TextView txticonsquare= (TextView) findViewById( R.id.txtsquare);
        txticonsquare.setTypeface(font);
        TextView txticonplus= (TextView) findViewById( R.id.txtplus);
        txticonplus.setTypeface(font);
        TextView txtstar= (TextView) findViewById( R.id.txtstar);
        txtstar.setTypeface(font);
        TextView txtstarbg= (TextView) findViewById( R.id.txtstarbg);
        txtstarbg.setTypeface(font);
        TextView txtuserplus= (TextView) findViewById( R.id.txtUserPlus);
        txtuserplus.setTypeface(font);
        TextView txtplusbg= (TextView) findViewById( R.id.txtplusbg);
        txtplusbg.setTypeface(font);
        TextView txtsq2= (TextView) findViewById( R.id.txtsquare2);
        txtsq2.setTypeface(font);
        TextView txtsq3= (TextView) findViewById( R.id.txtsquare3);
        txtsq3.setTypeface(font);
        TextView userplusbg= (TextView) findViewById( R.id.txtUserPlusbg);
        userplusbg.setTypeface(font);
        TextView txtsq2bg= (TextView) findViewById( R.id.txtsquare2bg);
        txtsq2bg.setTypeface(font);
        TextView txtsq3bg= (TextView) findViewById( R.id.txtsquare3bg);
        txtsq3bg.setTypeface(font);
        //TextView txtgame= (TextView) findViewById( R.id.txtgame);
//        txtgame.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


        txticonsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NavigationDrawer.this, com.myapp.mehrnaz.gameapp.Menu.class);
                startActivity(intent);
            }
        });
        txticonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NavigationDrawer.this, com.myapp.mehrnaz.gameapp.Menu.class);
                startActivity(intent);
            }
        });



        RotateAnimation rotate= (RotateAnimation) AnimationUtils.loadAnimation(this,R.anim.rotateanimation);
        txt.setAnimation(rotate);
        RotateAnimation rotate2= (RotateAnimation) AnimationUtils.loadAnimation(this,R.anim.animate2);
        //

      drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        txticonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);

            }
        });

        // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
               // this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
       // drawer.setDrawerListener(toggle);
       // toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
