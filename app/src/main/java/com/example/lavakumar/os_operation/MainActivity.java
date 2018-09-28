package com.example.lavakumar.os_operation;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstview = (ListView)findViewById(R.id.listView);
        final String[] arrayString =
                {"Dailer","Google Browser","E-mail","Message","Call Log","Contacts","Google maps","camera","settings","calender"};

        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrayString);
        lstview.setAdapter(arrayAdapter);
        lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position)
                {
                    case 0 :
                        Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent dial = new Intent(Intent.ACTION_DIAL);
                        dial.setData(Uri.parse("tel:"));
                        startActivity(dial);
                        break;

                    case 1 : Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent browser = new Intent(Intent.ACTION_VIEW);
                        browser.setData(Uri.parse("https://www.google.com"));
                        startActivity(browser);
                        break;
                    case 2 : Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent email = new Intent(Intent.ACTION_SEND);
                        email.setData(Uri.parse("mailto:lavakumarfire999@gmail.com"));
                        email.putExtra(Intent.EXTRA_SUBJECT, "Hello");
                        email.putExtra(Intent.EXTRA_TEXT,"Here you write Text");
                        if	(email.resolveActivity(getPackageManager()) != null) {
                            startActivity(email);
                        }
                        break;
                    case 3 : Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent sms=new Intent(MainActivity.this,sms.class);
                        startActivity(sms);
                        break;
                    case 4 : Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent calllog = new Intent(Intent.ACTION_VIEW);
                        calllog.setData(ContactsContract.Contacts.CONTENT_URI);
                        startActivity(calllog);
                        break;
                    case 5 : Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent cont = new Intent(Intent.ACTION_VIEW);
                        cont.setData(ContactsContract.Contacts.CONTENT_URI);
                        startActivity(cont);
                        break;
                    case 6:Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent maps=new Intent(Intent.ACTION_VIEW);
                        maps.setData(Uri.parse("http://maps.google.com/maps?sadd=42.12,10.2&daddr=42.12,10.11"));
                        break;
                    case 7:Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent camera=new Intent(MainActivity.this,camera.class);
                        startActivity(camera);
                        break;
                    case 8:Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        Intent settingsIntent=new Intent(MainActivity.this,settings.class);
                        startActivity(settingsIntent);
                        break;
                    case 9:Toast.makeText(MainActivity.this,arrayString[position]+" is Clicked", Toast.LENGTH_SHORT).show();
                        long startMillis = System.currentTimeMillis();
                        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
                        builder.appendPath("time");
                        ContentUris.appendId(builder, startMillis);
                       Intent calender = new Intent(Intent.ACTION_VIEW).setData(builder.build());
                        startActivity(calender);
                        break;
                }

            }
        });


    }
}
