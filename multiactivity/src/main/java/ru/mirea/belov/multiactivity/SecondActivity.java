package ru.mirea.belov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String)getIntent().getSerializableExtra("hello");
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(text);
    }
}
