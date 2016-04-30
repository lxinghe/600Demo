package com.lu_xinghe.project600final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.TextView;
import android.view.View.OnTouchListener;

import com.lu_xinghe.project600final.newsPage.NewsPageActivity;

public class activity_changeTheme extends AppCompatActivity
implements OnClickListener{
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Util_changeTheme.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_change_theme);
        final TextView status = (TextView)findViewById(R.id.status2);
        FancyRotaryKnobView rotaryKnobView =
                (FancyRotaryKnobView) findViewById(R.id.fancyRotaryKnobView);

        rotaryKnobView.setKnobListener(new FancyRotaryKnobView.RotaryKnobListener() {
            @Override
            public void onKnobChanged(int arg) {
                status.setText("Value: " + Integer.toString(arg));
//                position = arg;
                if(0<arg && arg<100){
//                    Util_changeTheme.changeToTheme(activity_changeTheme.this, Util_changeTheme.THEME_DEFAULT);
                    position = 0;
                }else if(100<arg && arg<200){
//                    Util_changeTheme.changeToTheme(activity_changeTheme.this, Util_changeTheme.THEME_ONE);
                    position = 1;
                }else if(200<arg && arg<300){
//                    Util_changeTheme.changeToTheme(activity_changeTheme.this, Util_changeTheme.THEME_TWO);
                    position = 2;
                }
            }
        });


        findViewById(R.id.ThemeButton0).setOnClickListener(this);
        findViewById(R.id.ThemeButton1).setOnClickListener(this);
        findViewById(R.id.ThemeButton2).setOnClickListener(this);
        findViewById(R.id.ThemeButton3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.ThemeButton0:
                Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_DEFAULT);
//                Util_changeTheme.changeToTheme(FavoritesActivity.this, Util_changeTheme.THEME_DEFAULT);
                break;
            case R.id.ThemeButton1:
                Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_ONE);
                break;
            case R.id.ThemeButton2:
                Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_TWO);
                break;
            case R.id.ThemeButton3:
                switch(position){
                    case 0:
                        Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_DEFAULT);
                        break;
                    case 1:
                        Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_ONE);
                        break;
                    case 2:
                        Util_changeTheme.changeToTheme(this, Util_changeTheme.THEME_TWO);
                        break;
                }
                Intent intent1 = new Intent(this, NewsPageActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
