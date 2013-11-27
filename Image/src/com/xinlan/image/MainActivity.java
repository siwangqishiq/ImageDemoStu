package com.xinlan.image;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity {
	private ImageView img;
	private ImageFetcher mImageFetcher;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageFetcher = ImageFetcher.genImageFetcher(this, R.drawable.ic_launcher);
        img = (ImageView)findViewById(R.id.img);
        mImageFetcher.loadImage("http://wenwen.soso.com/p/20090523/20090523121434-253152141.jpg", img);
    }
}//end class
