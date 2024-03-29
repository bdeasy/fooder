package com.jobb.menume.activity.ui.ActivityList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.jobb.menume.activity.app.ImageTargets.ImageTargets;

public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RelativeLayout relativeLayout = (RelativeLayout) getLayoutInflater().inflate(com.jobb.menume.activity.R.layout.activity_intro,null);

        CameraViewOverlay cameraViewOverlay = new CameraViewOverlay(this);

        relativeLayout.addView(cameraViewOverlay);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(com.jobb.menume.activity.R.drawable.fa_camera_white);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams(500, 500);
        imageView.setLayoutParams(layout);
        imageView.setTranslationY(-15f);
        layout.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        layout.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        layout.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);

        relativeLayout.addView(imageView);
        setContentView(relativeLayout);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, ImageTargets.class);
                startActivity(intent);
            }
        });
    }

}
