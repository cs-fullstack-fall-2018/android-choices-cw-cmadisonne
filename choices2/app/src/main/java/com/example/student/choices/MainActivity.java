package com.example.student.choices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView checkedResults;
    private CheckBox checkButton;
    private String dessert = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkedResults = findViewById(R.id.textView);
    }

    public void checkBoxSelect(View view){


        dessert = (String)checkButton.getText();

        checkedResults.setText();
    }
}
