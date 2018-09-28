package com.example.lavakumar.os_operation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sms extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
       final EditText editphone = (EditText) findViewById(R.id.editphone);
       final  EditText  editmessage=(EditText)findViewById(R.id.editmessage);
        Button btnphone = (Button) findViewById(R.id.btnSend);
        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sms_intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+editphone));
                sms_intent.putExtra("sms_body",""+editmessage);
                startActivity(sms_intent);
            }
        });
    }
}
