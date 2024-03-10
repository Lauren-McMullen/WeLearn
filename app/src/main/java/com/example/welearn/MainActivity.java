package com.example.welearn;

import android.app.Dialog;
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

    private AppUsers appUsers = new AppUsers();
    private User currentUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //init_test_user();
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
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
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

    private void CreateDialogwindow() {

        //Dialog dialog = new Dialog(this);
        //dialog.setContentView(R.layout.login_dialog);
        //dialog.setCancelable(false);


        Button nextbtn = (Button) findViewById(R.id.nextbutton);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseRoleActivity.class);
                startActivity(intent);
            }
        });

        //dialog.show();

    }


}