package com.example.baina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //切换到About界面
    public void clickAbout(View v)
    {
        Intent i=new Intent(MainActivity.this,AboutActivity.class);
        startActivity(i);
    }

    //切换到车次查询界面
    public void  clickTid(View v)
    {
        Intent i=new Intent(MainActivity.this,TidSelectActivity.class);
        startActivity(i);
    }

    //切换到车站查询界面
    public void clickStation(View v)
    {
        Intent i=new Intent(MainActivity.this,StationActivity.class);
        startActivity(i);
    }

    //Go to StationAndStationSelectActivity

    public  void  clickSAS(View v)
    {
    Intent i=new Intent(MainActivity.this,StationAndStationSelectActivity.class);
        startActivity(i);
    }
    //Go to MethodActivity
    public  void clickMethod(View v)
    {
        Intent i=new Intent(MainActivity.this,MethodActivity.class);
        startActivity(i);
        }

    //Go to ActivitySetting
    public  void clickSetting(View v)
    {
        Intent i=new Intent(MainActivity.this,ActivitySetting.class);
        startActivity(i);
    }


}
