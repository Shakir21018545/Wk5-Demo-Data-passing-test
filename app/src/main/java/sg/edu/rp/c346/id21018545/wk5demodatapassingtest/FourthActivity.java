package sg.edu.rp.c346.id21018545.wk5demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        tvAnswer.setText("Double Value Received is: " + 99.99);
    }
}

