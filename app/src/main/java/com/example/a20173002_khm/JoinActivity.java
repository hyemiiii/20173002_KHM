package com.example.a20173002_khm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    private Button button;

    EditText idInput;
    EditText passwordInput;
    EditText usernameInput;
    EditText usermailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);


        idInput = (EditText) findViewById(R.id.join_id);
        passwordInput = (EditText) findViewById(R.id.join_password);
        usernameInput = (EditText) findViewById(R.id.join_name);
        usermailInput = (EditText) findViewById(R.id.join_email);

        Button button = findViewById(R.id.joinBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
