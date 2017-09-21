package com.example.popie.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void goToHome(View view){
        Intent intent = new Intent();
        editText = (EditText) findViewById(R.id.textData);
        String message = editText.getText().toString();
        intent.putExtra("key" , message);
        setResult(RESULT_OK , intent);
        finish();
    }

}
