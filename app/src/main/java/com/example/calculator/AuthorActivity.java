package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AuthorActivity extends AppCompatActivity {


    private TextView name;
    private TextView author;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.author_activity);

        name=(TextView) findViewById(R.id.Name);
        author=(TextView) findViewById(R.id.Author);

        name.setText("Ernest Figura");
        author.setText("Author");
    }
}
