package com.spark.cong.demobundleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView hinhanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hinhanh=(ImageView)findViewById(R.id.imageView2);

        hinhanh.setTag(R.drawable.imagehinh);// lấy resource ID nè

        hinhanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int resid= (Integer)hinhanh.getTag(); //truyền resourceId vào int

                Intent intent=new Intent();

                intent.putExtra("selected",resid); // đưa vào gói cần gửi nè
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
