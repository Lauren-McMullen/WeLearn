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

import com.example.welearn.userdata.AppUsers;
import com.example.welearn.userdata.Session;
import com.example.welearn.userdata.User;
import com.example.welearn.userdata.level;
import com.example.welearn.userdata.month;
import com.example.welearn.userdata.topic;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AppUsers appUsers = new AppUsers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        init_test_user();
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button login = (Button) findViewById(R.id.loginbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseRoleActivity.class);
                startActivity(intent);
            }
        });

        Button signup = (Button) findViewById(R.id.signupbutton);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseRoleActivity.class);
                startActivity(intent);
            }
        });



    }

    private void init_test_user() {

        User test_teacher = new User("SeanF", "secret",
                "Sean", "Ford");
        appUsers.addUser(test_teacher);
        User test_student = new User("QueenB", "superSecret",
                "Hedie", "Mahmoudian");
        appUsers.addUser(test_student);
        Session session1 = new Session(topic.CODING_BASICS, month.MARCH, 7, 2024, 5,
                test_teacher, new ArrayList<>(), level.ADVANCED);
        session1.addStudent(test_student);
        Session session2 = new Session(topic.DATA_STRUCTURES, month.MARCH, 7, 2024, 5,
                test_teacher, new ArrayList<>(), level.BEGINNER);
        session2.addStudent(test_student);
        Session session3 = new Session(topic.LOGIC, month.MARCH, 7, 2024, 5,
                test_teacher, new ArrayList<>(), level.INTERMEDIATE);
        session3.addStudent(test_student);
    }
}