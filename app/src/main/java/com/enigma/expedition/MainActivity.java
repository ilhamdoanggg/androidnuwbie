package com.enigma.expedition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editName;
    TextView text2, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.pencetAku);
        editName = findViewById(R.id.text3);
        text2=findViewById(R.id.text2);
        text4= findViewById(R.id.text4);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String content1 = editName.getText().toString();
//                TextView textView = (TextView)findViewById(R.id.text2);
//                textView.setText(content1);
//            }
//        });
    }

    public void kepencet(View view){
        String nama = editName.getText().toString();
        text2.setText(nama);
        text4.setText(nama+"aaaaaaa");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart() called");
    }
}
