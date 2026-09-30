package com.abdulrahman.holyquran;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
            startFragment(new IndexFragment());
    }

    private void startFragment(Fragment f) {
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, f).commit();
    }
}