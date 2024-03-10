package com.example.welearn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.student_level_overlay);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.student_level_overlay), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button beginner = (Button) findViewById(R.id.beginnerbuttonteach);
        Button inter = (Button) findViewById(R.id.intermediatebuttonteach);
        Button advanced = (Button) findViewById(R.id.advancedbuttonteach);

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.end_demo);
            }
        });

        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.end_demo);
            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.end_demo);
            }
        });

    }

}
