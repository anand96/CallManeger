package com.example.user.callmaneger;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Messsages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messsages);
        Button button= (Button) findViewById(R.id.snd);
        final EditText editText= (EditText) findViewById(R.id.no);
        final EditText editText1= (EditText) findViewById(R.id.msg);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String no=editText.getText().toString();
                final String msg=editText1.getText().toString();

                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(no,null,msg,null,null);

                NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext());
                Notification notification= builder.setSmallIcon(R.drawable.mesg)
                        .setContentTitle("My Notification")
                        .setContentText("Text Messeage sent")
                        .build();
                NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(1,notification);

            }
        });


    }
}
