package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private final String showData = String.valueOf(R.string.save);
    private SharedPreferences sharedPreferences;
    private TextView nameView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sharedPreferences = getSharedPreferences(showData, MODE_PRIVATE);
        button = findViewById(R.id.button2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nameView = findViewById(R.id.inputData);
            String name = extras.getString("name");
            int number = extras.getInt("number");
            nameView.setText(name);
            // Do something with the name and number

            keepInfo();
            finish();
        }
    }

    private void keepInfo() {
        EditText userInputEditText = findViewById(R.id.inputData);
        String userInputData = userInputEditText.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(showData, userInputData);
        String key = "sharedPreferences";

        editor.apply();
    }
}

