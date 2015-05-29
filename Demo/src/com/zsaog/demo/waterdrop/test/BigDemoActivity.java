package com.zsaog.demo.waterdrop.test;

import android.app.Activity;
import android.os.Bundle;

import com.zsaog.demo.R;
import com.zsaog.demo.waterdrop.CoverManager;

public class BigDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big);

        getActionBar().hide();
        CoverManager.getInstance().init(this);

        CoverManager.getInstance().setMaxDragDistance(350);
        CoverManager.getInstance().setExplosionTime(150);
    }

}
