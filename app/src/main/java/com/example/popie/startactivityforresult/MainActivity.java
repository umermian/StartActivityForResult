package com.example.popie.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToB(View view) {
        Intent intent = new Intent(getApplicationContext(), ActivityB.class);
        startActivityForResult(intent , 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK){
            String recievedMessage = data.getStringExtra("key");
            textView = (TextView) findViewById(R.id.textViewHome);
            textView.setText(recievedMessage);
        }
    }
}