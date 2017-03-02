package com.lisa.mynews;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;

public class NextActivity extends AppCompatActivity {
    Button btn;
    ImageView mImageView;
    Uri ImageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        btn= (Button) findViewById(R.id.button_bb);
        mImageView= (ImageView) findViewById(R.id.imageView_bb);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               File  file=new File(getExternalCacheDir(),"output_image.jpg");
                 if(file.exists()){
                     file.delete();
                 }else{
                     try {
                         file.createNewFile();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 }

               if(Build.VERSION.SDK_INT>=24){
                   ImageUri= FileProvider.getUriForFile(NextActivity.this,"",file);
               }
           }
       });
    }

}
