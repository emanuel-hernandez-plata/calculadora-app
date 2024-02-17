package com.example.myfirstapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText data1;
    EditText data2;
    Button btnPlus;
    TextView result;
    Button btnSubtrac;
    Button btnMultiply;
    Button btnSplit;
    Button btnCleam;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        initListeners();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_overflow, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_theme) {
            switchTheme();
        } else if (id == R.id.menu_history) {
            showHistory();
        }
        return super.onOptionsItemSelected(item);

    }



    private void showHistory() {

    }


    private void switchTheme() {

    }

    private void initUi() {
        data1 = findViewById(R.id.data1);
        data2 = findViewById(R.id.data2);
        btnPlus = findViewById(R.id.btnPlus);
        result = findViewById(R.id.Result);
        btnSubtrac = findViewById(R.id.btnSubtrac);
        btnSplit = findViewById(R.id.btnSplit);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnCleam = findViewById(R.id.btnCleam);
    }

    private void initListeners() {
        btnPlus.setOnClickListener(v -> onSumValues());
        btnSubtrac.setOnClickListener(v -> onResValues());
        btnMultiply.setOnClickListener(v -> onMultValues());
        btnSplit.setOnClickListener(v -> onDivValues());
        btnCleam.setOnClickListener(v -> onCleaValues());
    }

    private void onCleaValues() {
        result.setText("");
    }

    private void onSumValues() {
        String value1 = data1.getText().toString();
        String value2 = data2.getText().toString();
        int sum = sum(Integer.parseInt(value1), Integer.parseInt(value2));
        showResult(String.valueOf(sum));
    }

    private void onResValues() {
        String value1 = data1.getText().toString();
        String value2 = data2.getText().toString();
        int res = res(Integer.parseInt(value1), Integer.parseInt(value2));
        showResult(String.valueOf(res));

    }

    private void onMultValues() {
        String value1 = data1.getText().toString();
        String value2 = data2.getText().toString();
        int mul = mult(Integer.parseInt(value1), Integer.parseInt(value2));
        showResult(String.valueOf(mul));
    }

    private void onDivValues() {
        String value1 = data1.getText().toString();
        String value2 = data2.getText().toString();
        int div = div(Integer.parseInt(value1), Integer.parseInt(value2));
        showResult(String.valueOf(div));
    }


    private void showResult(String textResult) {
        result.setText(textResult);
    }

    private int sum(int value1, int value2) {
        return value1 + value2;
    }

    private int res(int value1, int value2) {
        return value1 - value2;
    }

    private int mult(int value1, int value2) {
        return value1 * value2;
    }

    private int div(int value1, int value2) {
        return value1 / value2;
    }
}



