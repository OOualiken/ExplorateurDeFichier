package com.example.explorateurdefichier;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        path = Environment.getRootDirectory().getAbsolutePath();
        File test = new File(path);
        String[] toz = test.list();
        File newFile = new File(path + "/" + toz[1]);
        String[] toztoz = newFile.list();
    }

    @Override
    public void onBackPressed() {

    }

    private void displayData(String path){
        
    }
}