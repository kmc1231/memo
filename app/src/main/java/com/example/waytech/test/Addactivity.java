package com.example.waytech.test;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Addactivity extends AppCompatActivity {
    /*private FrameLayout container;*/
    EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_main);


        mEdit=(EditText)findViewById(R.id.edit1);

        Button btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*container=(FrameLayout)findViewById(R.id.aa);*/
                /*FrameLayout layout=(FrameLayout)findViewById(R.id.aa);*/
                Intent intent=new Intent();
                intent.putExtra("TextOut",mEdit.getText().toString());
                /*TextView view1 = new TextView(this);
                view1.setText("나는 텍스트뷰");
                view1.setTextSize(10);
                layout.addView(view1);*/
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}