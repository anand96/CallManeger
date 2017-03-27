package com.example.user.callmaneger;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String dis="";
    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText= (TextView) findViewById(R.id.et);
        Button button1= (Button) findViewById(R.id.b1);
        Button button2= (Button) findViewById(R.id.b2);
        Button button3= (Button) findViewById(R.id.b3);
        Button button4= (Button) findViewById(R.id.b4);
        Button button5= (Button) findViewById(R.id.b5);
        Button button6= (Button) findViewById(R.id.b6);
        Button button7= (Button) findViewById(R.id.b7);
        Button button8= (Button) findViewById(R.id.b8);
        Button button9= (Button) findViewById(R.id.b9);
        Button button10= (Button) findViewById(R.id.b10);
        Button button11= (Button) findViewById(R.id.b11);
        Button button12= (Button) findViewById(R.id.b12);
        Button button13= (Button) findViewById(R.id.b13);
        Button button14= (Button) findViewById(R.id.b14);
        Button button15= (Button) findViewById(R.id.b15);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
         switch(v.getId()){
             case R.id.b1:
                 dis+="1";
                 editText.setText(dis);
                 break;
             case R.id.b2:
                 dis+="2";
                 editText.setText(dis);
                 break;
             case R.id.b3:
                 dis+="3";
                 editText.setText(dis);
                 break;
             case R.id.b4:
                 dis+="4";
                 editText.setText(dis);
                 break;
             case R.id.b5:
                 dis+="5";
                 editText.setText(dis);
                 break;
             case R.id.b6:
                 dis+="6";
                 editText.setText(dis);
                 break;
             case R.id.b7:
                 dis+="7";
                 editText.setText(dis);
                 break;
             case R.id.b8:
                 dis+="8";
                 editText.setText(dis);
                 break;
             case R.id.b9:
                 dis+="9";
                 editText.setText(dis);
                 break;
             case R.id.b10:
                 dis+="*";
                 editText.setText(dis);
                 break;
             case R.id.b11:
                 dis+="0";
                 editText.setText(dis);
                 break;
             case R.id.b12:
                 dis+="#";
                 editText.setText(dis);
                 break;
             case R.id.b13:
                 Intent intent=new Intent(getApplicationContext(),Messsages.class);
                 startActivity(intent);
                 break;
             case R.id.b14:
                 Intent intent1=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+dis));
                 startActivity(intent1);
                 break;
             case R.id.b15:
                 int l=dis.length();
                 --l;
                 if(l<=0)
                     dis="";
                 else
                    dis=dis.substring(0,l);
                 editText.setText(dis);
                 break;
         }




    }
}
