package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.StackView;
import android.widget.TextView;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scientific extends AppCompatActivity {

    EditText tvResult;
    TextView tvAnswer;
    Button btnDec,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnOpen,btnClose,btnAdd,btnSub,btnMul,btnDiv,btnPower,btnSin,btnCos,btnTan,
            btnlog,btnln,btnPi,btnE,btnPer,btnFactor,btnRoot,btnRad,btnInv,btnEqual,btnBack,btnClear;
    String result;
    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);


        tvResult= findViewById(R.id.tvResult);
        tvAnswer= findViewById(R.id.tvAnswer);
        btnDec=findViewById(R.id.btnDec);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnOpen=findViewById(R.id.btnOpen);
        btnClose=findViewById(R.id.btnClose);
        btnAdd= findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnPower=findViewById(R.id.btnPower);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnlog=findViewById(R.id.btnlog);
        btnln=findViewById(R.id.btnln);
        btnPi=findViewById(R.id.btnPi);
        btnE=findViewById(R.id.btnE);
        btnPer=findViewById(R.id.btnPer);
        btnFactor=findViewById(R.id.btnFactor);
        btnRoot=findViewById(R.id.btnRoot);
        btnRad=findViewById(R.id.btnRad);
        btnInv=findViewById(R.id.btnInv);
        btnEqual= findViewById(R.id.btnEqual);
        btnBack=findViewById(R.id.btnBack);
        btnClear= findViewById(R.id.btnClear);
        result="";

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + ".");
                result= tvResult.getText().toString();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResult.setText(result + "1");
                result= tvResult.getText().toString();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "2");
                result= tvResult.getText().toString();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "3");
                result= tvResult.getText().toString();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "4");
                result= tvResult.getText().toString();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "5");
                result= tvResult.getText().toString();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "6");
                result= tvResult.getText().toString();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "7");
                result= tvResult.getText().toString();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "8");
                result= tvResult.getText().toString();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "9");
                result= tvResult.getText().toString();
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "0");
                result= tvResult.getText().toString();
            }
        });

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "(");
                result= tvResult.getText().toString();
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + ")");
                result= tvResult.getText().toString();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "+");
                result= tvResult.getText().toString();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "-");
                result= tvResult.getText().toString();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "*");
                result= tvResult.getText().toString();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "/");
                result= tvResult.getText().toString();
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "^");
                result= tvResult.getText().toString();
            }
        });


        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "sin");
                result= tvResult.getText().toString();
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "cos");
                result= tvResult.getText().toString();
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "tan");
                result= tvResult.getText().toString();
            }
        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "log");
                result= tvResult.getText().toString();
            }
        });

        btnln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "ln");
                result= tvResult.getText().toString();
            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "π");
                result= tvResult.getText().toString();
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "e");
                result= tvResult.getText().toString();
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "%");
                result= tvResult.getText().toString();
            }
        });

        btnFactor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "!");
                result= tvResult.getText().toString();
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(result + "√");
                result= tvResult.getText().toString();
            }
        });

        btnRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btnRad.getText().equals("DEG")){
                    btnRad.setText("RAD");
                }
                else{
                    btnRad.setText("DEG");
                }

            }
        });

        btnInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnSin.getText().equals("sin")){
                    btnSin.setText("sin-1");
                    btnCos.setText("cos-1");
                    btnTan.setText("tan-1");
                    btnln.setText("ex");
                    btnlog.setText("10x");
                    btnRoot.setText("x2");
                }

                else{
                    btnSin.setText("sin");
                    btnCos.setText("cos");
                    btnTan.setText("tan");
                    btnln.setText("ln");
                    btnlog.setText("log");
                    btnRoot.setText("√");
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.substring(result.length()-1).equals("s") || result.substring(result.length()-1).equals("g") ||
                        result.substring(result.length()-1).equals("n") ){
                            if( result.substring(result.length()-2).equals("l")){
                                String last= result.substring(0,(result.length())-2);
                                result=last;
                                tvResult.setText(result);
                            }
                            else{
                                String last= result.substring(0,(result.length())-3);
                                result=last;
                                tvResult.setText(result);
                            }



                }

                else if(result.length()==1){
                    String last="";
                    result=last;
                    tvResult.setText(result);
                }
                else{
                    String last= result.substring(0,(result.length())-1);
                    result=last;
                    tvResult.setText(result);
                }

            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
                tvAnswer.setText("");
                result="";
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              ans= Integer.parseInt(result);
//              result= Integer.toString(ans);
//                String sign=null;
//                Pattern regex = Pattern.compile("[+*/]|(?<=\\s)-");
//                Matcher matcher= regex.matcher(result);
//                while(matcher.find()){
//                    sign= matcher.group().trim();
//                }
//
//                String[] result2= result.split("[+*/]|(?<=\\s)-");
//                if(sign.equals("+")){
//                    int i= findIndex(result2,"+") ;
//                    ans= Integer.parseInt(result2[i-1]) + Integer.parseInt(result2[i+1]);
//                }
//
//                result= Integer.toString(ans);
//                tvAnswer.setText(result);
//                result= "1+2";
//                ans= Integer.parseInt(result);
//                result=String.valueOf(ans);
//                tvAnswer.setText(result);


                Stack<Double> values= new Stack<>();
                Stack<Character> op= new Stack<>();
                for(int i=0; i<result.length();i++){

                    if((result.charAt(i)>='0' && result.charAt(i)<='9')  ){

                        String con="";
                        while((i<result.length() && result.charAt(i)>='0' && result.charAt(i)<='9')   ){
                            con= con + result.charAt(i);
                            i++;
                        }
                        values.push(Double.parseDouble(con));
                        i--;
                    }

                    else if(result.charAt(i)=='('){
                        op.push(result.charAt(i));
                    }

                    else if(result.charAt(i)==')'){

                        while(op.peek()!='('){
                            values.push(calculate(op.pop(),values.pop(),values.pop()));
                        }

                        op.pop();

                    }


                    else if(result.charAt(i)=='+' || result.charAt(i)=='-' || result.charAt(i)=='*' || result.charAt(i)=='/' || result.charAt(i)=='^' ){

                        while(!op.isEmpty() && check(result.charAt(i),op.peek())){
                            if(checkPiOrE(op.peek())){
                                values.push(calculatePiOrE(op.pop()));
                            }

                            else if(checkPerFactorRoot(op.peek())){
                                values.push(calculatePerFactorRoot(op.pop(),values.pop()));
                            }

                            else if(checkAgain(op.peek())){
                                op.pop();
                                if(op.peek()=='l'){
                                    values.push(calculateLn(op.pop(),values.pop()));
                                }
                                else{
                                    op.pop();
                                    values.push(calculateTri(op.pop(),values.pop()));
                                }

                            }

                            else{
                                values.push(calculate(op.pop(),values.pop(),values.pop()));
                            }

                        }

                        op.push(result.charAt(i));
                    }

                    else if(result.charAt(i)=='s'|| result.charAt(i)=='i' || result.charAt(i)=='n' || result.charAt(i)=='c' || result.charAt(i)=='o'
                            || result.charAt(i)=='a'|| result.charAt(i)=='t' || result.charAt(i)=='l' || result.charAt(i)=='g' || result.charAt(i)=='e' ||
                            result.charAt(i)=='π' || result.charAt(i)=='%' || result.charAt(i)=='!' || result.charAt(i)=='√'){

                            op.push(result.charAt(i));


                    }

                }

                while(!op.isEmpty()){

                    if(checkPiOrE(op.peek())){
                        values.push(calculatePiOrE(op.pop()));
                    }

                    else if(checkPerFactorRoot(op.peek())){
                        values.push(calculatePerFactorRoot(op.pop(),values.pop()));
                    }

                    else if(checkAgain(op.peek())){
                        op.pop();
                        if(op.peek()=='l'){
                            values.push(calculateLn(op.pop(),values.pop()));
                        }
                        else{
                            op.pop();
                            values.push(calculateTri(op.pop(),values.pop()));
                        }

                    }
                    else{
                        values.push(calculate(op.pop(),values.pop(),values.pop()));
                    }

                }

                result= Double.toString(values.pop());
                tvAnswer.setText(result);
            }
        });


    }


    public double calculate(char op, double b, double a){

        switch (op){
            case '+':
                return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;

            case '/':
                if(b==0){
                    throw new UnsupportedOperationException("Can't divide by zero");
                }
                return a/b;

            case '^':
                return Math.pow(a,b);


        }

            return 0;

    }


    public boolean check(char op, char top){
        if(op=='^'&& (top=='+' || top=='-')  ){
            return false;
        }

        if(op=='^'&& (top=='*' || top=='/')  ){
            return false;
        }

        if((op=='*' || op=='/') && (top=='+' || top=='-') ){
            return false;
        }

        if(top=='(' || top==')'){
            return false;
        }

        if(op=='^' && top=='^'){
            return true;
        }


        else{
            return true;
        }


    }

    public boolean checkAgain( char top){
        if(top=='s' || top=='n' || top=='g'){
            return  true;
        }

        else if(top=='e'){
            return false;
        }

        else{
            return false;
        }
    }

    public double calculateTri(char op,double a){
        switch (op){
            case 's':
                if(btnSin.getText().equals("sin")){
                    if(btnRad.getText().equals("DEG")){
                        return Math.sin(Math.toRadians(a));
                    }
                    else{
                        return Math.sin(Math.toDegrees(a));
                    }
                }

                else{
                    if(btnRad.getText().equals("DEG")){
                        return Math.asin(Math.toRadians(a));
                    }
                    else{
                        return Math.asin(Math.toDegrees(a));
                    }
                }



            case 'c':
                if(btnCos.getText().equals("cos")){
                    if(btnRad.getText().equals("DEG")){
                        return Math.cos(Math.toRadians(a));
                    }
                    else{
                        return Math.cos(Math.toDegrees(a));
                    }
                }

                else{
                    if(btnRad.getText().equals("DEG")){
                        return Math.acos(Math.toRadians(a));
                    }
                    else{
                        return Math.acos(Math.toDegrees(a));
                    }
                }



            case 't':
                if(btnTan.getText().equals("tan")){
                    if(btnRad.getText().equals("DEG")){
                        return Math.tan(Math.toRadians(a));
                    }
                    else{
                        return Math.tan(Math.toDegrees(a));
                    }
                }

                else{
                    if(btnRad.getText().equals("DEG")){
                        return Math.atan(Math.toRadians(a));
                    }
                    else{
                        return Math.atan(Math.toDegrees(a));
                    }
                }


            case 'l':
                if(btnln.getText().equals("ln")){
                    return Math.log10(a);
                }
                else{
                    return Math.pow(10,a);
                }

        }
        return 0;
    }

    public double calculateLn(char op,double a){
        switch(op){
            case 'l':
                if(btnlog.getText().equals("log")){
                    return Math.log(a);
                }
                else{
                    return Math.pow(Math.E,a);
                }


        }
        return 0;
    }


    public boolean checkPiOrE(char op){
        if(op=='e' || op=='π'){
            return true;
        }

        else{
            return false;
        }
    }

    public double calculatePiOrE(char op){
        switch (op){
            case 'e':
                return Math.E;

            case 'π':
                return Math.PI;
        }

        return 0;

    }


    public boolean checkPerFactorRoot(char op){
        if(op=='%' || op=='!' || op=='√'){
            return true;
        }

        else{
            return false;
        }
    }


    public double calculatePerFactorRoot(char op,double a){
        switch(op){
            case '%':
                return a/100;

            case '!':
                int b=1;
                for(int i=(int) a;i>0;i--){
                    b=b*i;
                }
                return Double.valueOf(b);

            case '√':
                if(btnRoot.getText().equals("√")){
                    return Math.sqrt(a);
                }

                else{
                    return Math.pow(a,2);
                }

        }

        return 0;

    }


}