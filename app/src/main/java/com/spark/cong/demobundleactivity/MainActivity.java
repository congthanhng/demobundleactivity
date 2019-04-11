package com.spark.cong.demobundleactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button selectImag;
    ImageView showImage;
    int REQUEST_CODE_EDIT=123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectImag=(Button)findViewById(R.id.buttonclick);
        showImage=(ImageView)findViewById(R.id.imageView);

        selectImag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent,REQUEST_CODE_EDIT);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode== REQUEST_CODE_EDIT && resultCode == RESULT_OK && data!=null){
            int dataa=data.getIntExtra("selected",0);
            showImage.setImageResource(dataa);
            Toast.makeText(this,dataa,Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
