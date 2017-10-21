package com.example.mcdriversmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.routeButton).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String phone_Num = "0775213713";
                String send_msg = "The garbage truck just started the trip. It will come to your doorstep shortly. ";
                try {
                    SmsManager sms = SmsManager.getDefault();  // using android SmsManager
                    sms.sendTextMessage(phone_Num, null, send_msg, null, null);  // adding number and text
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Sms not Send", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
*/
                /*NotificationManager notificationManager = (NotificationManager)
                        getSystemService(NOTIFICATION_SERVICE);
                // prepare intent which is triggered if the
                // notification is selected

                Intent intent = new Intent(MainActivity.this, RouteActivity.class);
                // use System.currentTimeMillis() to have a unique ID for the pending intent
                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, (int) System.currentTimeMillis(), intent, 0);

                // build notification
                // the addAction re-use the same intent to keep the example short
                Notification n  = new Notification.Builder(MainActivity.this)
                        .setContentTitle("ecoGarb ")
                        .setContentText("your garbage truck will arrive at your doorstep within an hour.")
                        .setSmallIcon(R.drawable.lorry)
                        .setContentIntent(pIntent)
                        .setAutoCancel(true).build();
                notificationManager.notify(0, n);*/

                Intent intent1 = new Intent(MainActivity.this, MapsActivityCurrentPlace.class);
                startActivity(intent1);
            }
        });
    }
}
