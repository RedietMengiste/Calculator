package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.AccessControlContext;

import static java.security.AccessController.getContext;

public class Programmer extends AppCompatActivity {
    private EditText etvDec, etvBin , etvOct , etvHex;
    private Button Convert , btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_a,btn_b,btn_c,btn_d,btn_e,btn_f
            ,btn_clear,btn_binary;
    private String process ,value;
    private View.OnFocusChangeListener onFocusChangeListener;
    private TextWatcher textWatcher;
    private int focusedViewId;
    private EditText focusedView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmer);

        etvDec= (EditText) findViewById(R.id.et_dec);
        etvBin = (EditText)findViewById(R.id.et_binary);
        etvOct = (EditText)findViewById(R.id.et_oct);
        etvHex = (EditText)findViewById(R.id.et_hexa);



        btn_clear = findViewById(R.id.ac);
        btn0 = findViewById(R.id.zero);
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn_a = findViewById(R.id.letter_a);
        btn_b = findViewById(R.id.letter_b);
        btn_c = findViewById(R.id.letter_c);
        btn_d = findViewById(R.id.letter_d);
        btn_e = findViewById(R.id.letter_e);
        btn_f = findViewById(R.id.letter_f);


        btn_binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                btn3.setEnabled(false);

            }
        });


        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etvDec.setText("");
                etvBin.setText("");
                etvOct.setText("");
                etvHex.setText("");

            }
        });


        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                value = ((EditText) findViewById(focusedViewId)).getText().toString().trim();
                if (value.length() > 0){
                    converted();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        onFocusChangeListener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    focusedViewId = v.getId();
                 focusedView =( EditText) getCurrentFocus();
                    ((EditText)findViewById(focusedViewId)).addTextChangedListener(textWatcher);
                }
                else{
                    ((EditText)findViewById(focusedViewId)).removeTextChangedListener(textWatcher);
                }


            }
        };

        etvDec.setOnFocusChangeListener(onFocusChangeListener);
        etvBin.setOnFocusChangeListener(onFocusChangeListener);
        etvOct.setOnFocusChangeListener(onFocusChangeListener);
        etvHex.setOnFocusChangeListener(onFocusChangeListener);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process = focusedView.getText().toString();
               focusedView.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "9");
            }
        });

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "A");
            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "B");
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "C");
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "D");
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "E");
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = focusedView.getText().toString();
                focusedView.setText(process + "F");
            }
        });



//        Convert.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View v) {
//
//                converted();
//            }
//        });

      hideKeyboard(etvDec);
      hideKeyboard(etvBin);
      hideKeyboard(etvOct);
      hideKeyboard(etvHex);
    }

    public void converted(){
        try {
            long num = 0;

            switch (focusedViewId){
                case R.id.et_dec:
                    num = Long.parseLong(value);
                    etvBin.setText(String.valueOf(Long.toBinaryString(num)));
                    etvOct.setText(String.valueOf(Long.toOctalString(num)));
                    etvHex.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.et_binary:
                    num = Long.parseLong(value,2);
                    etvDec.setText(String.valueOf(num));
                    etvOct.setText(String.valueOf(Long.toOctalString(num)));
                    etvHex.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.et_oct:
                    num = Long.parseLong(value,8);
                    etvDec.setText(String.valueOf(num));
                    etvBin.setText(String.valueOf(Long.toBinaryString(num)));
                    etvHex.setText(String.valueOf(Long.toHexString(num)));
                    break;

                case R.id.et_hexa:
                    num = Long.parseLong(value,16);
                    etvDec.setText(String.valueOf(num));
                    etvBin.setText(String.valueOf(Long.toBinaryString(num)));
                    etvOct.setText(String.valueOf(Long.toOctalString(num)));
                    break;

            }

        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void hideKeyboard(EditText editText){
        editText.setShowSoftInputOnFocus(false);
    }
}