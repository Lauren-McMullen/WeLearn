package com.example.welearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TeachSetupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.teach_setup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.teacher_setup), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button codingbasics =  (Button) findViewById(R.id.codingbasics);
        Button logic =  (Button) findViewById(R.id.logic);
        Button systems =  (Button) findViewById(R.id.systems);
        Button datastructures =  (Button) findViewById(R.id.datastructures);
        Button ml =  (Button) findViewById(R.id.machinelearning);
        Button database =  (Button) findViewById(R.id.databases);
        Button security =  (Button) findViewById(R.id.security);
        Button software =  (Button) findViewById(R.id.software);

        codingbasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        systems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        datastructures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeachSetupActivity.this, TeacherLevelActivity.class);
                startActivity(intent);
            }
        });

    }











}
