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
        mImageFetcher.loadImage("http://i879.photobucket.com/albums/ab352/night_king/sign/01438667.png", img);
    }
}//end class
