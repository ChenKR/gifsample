package com.gif.example.gifsample.sample;


import com.ant.liao.GifView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {

    private  GifView  gif3;
    private boolean f = true;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );
        setTitle("Gif 動畫");

        gif3 = (GifView) findViewById(R.id.gif2);
        // 設置Gif圖片源
        gif3.setGifImage(getResources().openRawResource(R.raw.test));
        // 添加監聽
        gif3.setOnClickListener(this);
        //設置顯示的大小，拉伸或者壓縮
        gif3.setShowDimension(300, 300);
        // 設置加载方式：先載入後顯示、邊仔入編顯示、只顯示第一偵再顯示
        gif3.setGifImageType(GifView.GifImageType.COVER);

    }

    @Override
    public void onClick(View v)
    {
        // 點擊一下, 再開始播放一次
        if(f){
            gif3.showCover();
            f = false;
        }else{
            gif3.showAnimation();
            f = true;
        }
        android.util.Log.v("Gifview===>", "press");
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display_gi, menu);
        return true;
    }




}
