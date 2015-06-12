package com.example.android.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.calc.R;

public class MainActivity extends Activity {

    public String str = "";
    Character op = 'q';
    Double num, numtemp;
    EditText showResult;
    boolean deci = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText) findViewById(R.id.et);
    }

    public void btnDotClicked(View v) {
        if(deci == false){
            insert(".");
            deci = true;
        }
    }

    public void btn0Clicked(View v) {
        insert("0");
    }

    public void btn1Clicked(View v) {
        insert("1");
    }

    public void btn2Clicked(View v) {
        insert("2");
    }

    public void btn3Clicked(View v) {
        insert("3");
    }

    public void btn4Clicked(View v) {
        insert("4");
    }

    public void btn5Clicked(View v) {
        insert("5");
    }

    public void btn6Clicked(View v) {
        insert("6");
    }

    public void btn7Clicked(View v) {
        insert("7");

    }

    public void btn8Clicked(View v) {
        insert("8");
    }

    public void btn9Clicked(View v) {
        insert("9");
    }

    public void btnplusClicked(View v) {
        perform();
        op = '+';

    }

    public void btnminusClicked(View v) {
        perform();
        op = '-';

    }

    public void btndivideClicked(View v) {
        perform();
        op = '/';

    }

    public void btnmultiClicked(View v) {
        perform();
        op = '*';

    }

    public void btnequalClicked(View v) {
        calculate();

    }

    public void btnclearClicked(View v) {
        reset();
    }

    private void reset() {
        // TODO Auto-generated method stub
        str = "";
        op = 'q';
        num = 0.0;
        numtemp = 0.0;
        showResult.setText("");
        deci = false;
    }

    private void insert(String j) {
        // TODO Auto-generated method stub
        if(j == "."){
            if(str == ""){
                str = str + "0.";
            }
            else{
                str = str + ".";
            }
        }
        else{
            if(str == "0"){
                str = j;
            }
            else
            str = str + j;
        }
        num = Double.valueOf(str).doubleValue();
        showResult.setText(str);
    }

    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        numtemp = num;
    }

    private void calculate() {
        // TODO Auto-generated method stub
        if (op == '+')
            num = numtemp + num;
        else if (op == '-')
            num = numtemp - num;
        else if (op == '/')
            num = numtemp / num;
        else if (op == '*')
            num = numtemp * num;
        showResult.setText("" + num.floatValue());
    }
}