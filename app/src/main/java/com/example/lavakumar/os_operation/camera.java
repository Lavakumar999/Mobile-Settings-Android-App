package com.example.lavakumar.os_operation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class camera extends AppCompatActivity {
    private File imagefile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Button btncam = (Button) findViewById(R.id.btncam);
        btncam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                imagefile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "test.jpg");
                Uri tempuri = Uri.fromFile(imagefile);

                intent.putExtra(MediaStore.EXTRA_OUTPUT, tempuri);
                intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
                startActivityForResult(intent, 0);

            }



            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                if (requestCode == 0) {
                    switch (requestCode) {

                        case Activity.RESULT_OK:
                            if (imagefile.exists()) {
                                Toast.makeText(camera.this, "the file was saved at " + imagefile.getAbsolutePath(), Toast.LENGTH_SHORT).show();

                            } else {
                                Toast.makeText(camera.this, "There was an error saving the file", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case Activity.RESULT_CANCELED:
                            break;
                        default:
                            break;
                    }
                }
            }
        });
    }
}

