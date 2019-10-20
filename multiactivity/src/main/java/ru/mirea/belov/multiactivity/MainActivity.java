package ru.mirea.belov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("hello", editText.getText().toString());
        startActivity(intent);
    }
}
