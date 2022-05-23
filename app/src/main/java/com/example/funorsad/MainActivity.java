package com.example.funorsad;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textCalc = findViewById(R.id.textCalc);
        Button buttonNine = findViewById(R.id.nineButton);
        Button buttonEight = findViewById(R.id.eightButton);
        Button buttonSeven = findViewById(R.id.sevenButton);
        Button buttonSix = findViewById(R.id.sixButton);
        Button buttonFive = findViewById(R.id.fiveButton);
        Button buttonFour = findViewById(R.id.fourButton);
        Button buttonThree = findViewById(R.id.threeButton);
        Button buttonTwo = findViewById(R.id.twoButton);
        Button buttonOne = findViewById(R.id.oneButton);
        Button buttonZero = findViewById(R.id.zeroButton);
        Button buttonDot = findViewById(R.id.dotButton);
        Button buttonPlus = findViewById(R.id.plusButton);
        Button buttonMinus = findViewById(R.id.minusButton);
        Button buttonMul = findViewById(R.id.mulButton);
        Button buttonDiv = findViewById(R.id.divButton);
        Button buttonEquals = findViewById(R.id.equalsButton);
        ImageButton buttonDel = findViewById(R.id.delButton);
        AtomicBoolean deleteOldResult = new AtomicBoolean(false);

        buttonNine.setOnClickListener(v -> {
            if (!textCalc.getText().equals("0")) {
                textCalc.setText(textCalc.getText() + "9");
            } else {
                textCalc.setText("9");
                deleteOldResult.set(true);
            }
        });

        buttonEight.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "8");
            } else {
                textCalc.setText("8");
                deleteOldResult.set(true);
            }
        });

        buttonSeven.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "7");
            } else {
                textCalc.setText("7");
                deleteOldResult.set(true);
            }
        });

        buttonSix.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "6");
            } else {
                textCalc.setText("6");
                deleteOldResult.set(true);
            }
        });

        buttonFive.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "5");
            } else {
                textCalc.setText("5");
                deleteOldResult.set(true);
            }
        });

        buttonFour.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "4");
            } else {
                textCalc.setText("4");
                deleteOldResult.set(true);
            }
        });

        buttonThree.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "3");
            } else {
                textCalc.setText("3");
                deleteOldResult.set(true);
            }
        });

        buttonTwo.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "2");
            } else {
                textCalc.setText("2");
                deleteOldResult.set(true);
            }
        });

        buttonOne.setOnClickListener(v -> {
            if (deleteOldResult.get()) {
                textCalc.setText(textCalc.getText() + "1");
            } else {
                textCalc.setText("1");
                deleteOldResult.set(true);
            }
        });

        buttonZero.setOnClickListener(v -> {
            if (!(textCalc.getText().toString()).equals("0")) {
                textCalc.setText(textCalc.getText() + "0");
            }
        });

        buttonDot.setOnClickListener(v -> {
            textCalc.setText(textCalc.getText() + ".");
        });

        buttonPlus.setOnClickListener(v -> {
            textCalc.setText(textCalc.getText() + "+");
            deleteOldResult.set(true);
        });

        buttonMinus.setOnClickListener(v -> {
            textCalc.setText(textCalc.getText() + "-");
            deleteOldResult.set(true);
        });

        buttonMul.setOnClickListener(v -> {
            textCalc.setText(textCalc.getText() + "*");
            deleteOldResult.set(true);
        });

        buttonDiv.setOnClickListener(v -> {
            textCalc.setText(textCalc.getText() + "/");
            deleteOldResult.set(true);
        });

        buttonDel.setOnClickListener(v -> {
            if (textCalc.getText().length() > 0) {
                textCalc.setText((textCalc.getText() + "").substring(0, textCalc.getText().length() - 1));
            }
        });

        buttonDel.setOnLongClickListener(v -> {
            if (textCalc.getText().length() > 0) {
                textCalc.setText("");
            }
            return false;
        });

        buttonEquals.setOnClickListener(v -> {
            textCalc.setText(Calculation.calc(textCalc.getText().toString()));
            deleteOldResult.set(false);
        });
    }
}