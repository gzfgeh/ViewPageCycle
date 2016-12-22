package com.gzfgeh.viewpagerdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.gzfgeh.viewpagecycle.BannerInfo;
import com.gzfgeh.viewpagecycle.ImageCycleView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageCycleView imageCycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageCycleView = (ImageCycleView) findViewById(R.id.image_cycle_view);
        List<BannerInfo> data = new ArrayList<>();
        BannerInfo info = new BannerInfo();
        info.setImg("http://img.my.csdn.net/uploads/201508/05/1438760758_3497.jpg");
        info.setLink("http://img.my.csdn.net/uploads/201508/05/1438760758_3497.jpg");
        info.setOt(0);
        data.add(info);

        BannerInfo info2 = new BannerInfo();
        info2.setImg("http://img.my.csdn.net/uploads/201508/05/1438760758_6667.jpg");
        info2.setLink("http://img.my.csdn.net/uploads/201508/05/1438760758_6667.jpg");
        info2.setOt(0);
        data.add(info2);

        BannerInfo info3 = new BannerInfo();
        info3.setImg("http://img.my.csdn.net/uploads/201508/05/1438760757_3588.jpg");
        info3.setLink("http://img.my.csdn.net/uploads/201508/05/1438760757_3588.jpg");
        info3.setOt(0);
        data.add(info3);

        BannerInfo info4 = new BannerInfo();
        info4.setImg("http://img.my.csdn.net/uploads/201508/05/1438760758_6667.jpg");
        info4.setLink("http://img.my.csdn.net/uploads/201508/05/1438760758_6667.jpg");
        info4.setOt(0);
        data.add(info4);

        BannerInfo info5 = new BannerInfo();
        info5.setImg("http://img.my.csdn.net/uploads/201508/05/1438760757_3588.jpg");
        info5.setLink("http://img.my.csdn.net/uploads/201508/05/1438760757_3588.jpg");
        info5.setOt(0);
        data.add(info5);


        imageCycleView.setImageResources(data, new ImageCycleView.ImageCycleViewListener() {
            @Override
            public void onImageClick(BannerInfo info, int position, View imageView) {
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });

        imageCycleView.startImageCycle();
    }


    @Override
    protected void onStop() {
        super.onStop();
        imageCycleView.pushImageCycle();
    }
}
