package ru.mirea.belov.lifecycleactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "=============================================onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "=============================================onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "=============================================onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "=============================================onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "=============================================onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "=============================================onDesttoy()");
    }
}
