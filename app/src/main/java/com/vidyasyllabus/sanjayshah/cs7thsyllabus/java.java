package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class java extends AppCompatActivity {
    PDFView java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        java= (PDFView) findViewById(R.id.pdfjava);
      java.fromAsset("java.pdf").load();
    }
}
