package com.lisa.mynews;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          btn= (Button) findViewById(R.id.button1);
         //TODO 设置监听
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(MainActivity.this,NextActivity.class);
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,0);
                NotificationManager manager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                Notification notification=new NotificationCompat.Builder(MainActivity.this)
                            .setContentTitle("this is nitification")
                            .setContentText("nihao")
                            .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                         .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                         .setContentIntent(pendingIntent)
                        .setLights(Color.RED,1000,1000)
                         .setAutoCancel(true)
                        .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.photo4)))
                       .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .build();
                manager.notify(1,notification);



    }
});


    }
}
