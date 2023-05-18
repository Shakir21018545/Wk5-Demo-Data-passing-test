package sg.edu.rp.c346.id21018545.wk5demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        answer = findViewById(R.id.answer);


        Intent intentReceived = getIntent();

        String answer = intentReceived.getStringExtra("answer");

        this.answer.setText(answer);



    }
}