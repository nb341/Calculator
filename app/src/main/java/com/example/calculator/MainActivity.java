package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonMult, buttonDiv, buttonAdd, buttonSub, buttonSin, buttonCos, buttonSqrt, buttonPow,
            buttonEqn, buttonCE, buttonDot;
    private EditText ed;
    private TextView tv;
      private final String add="+", sub="-", mult="*", div="/", cos="C", sin="S", pow="P", sqrt="S", equal="=";
       private  final double rad = Math.PI/180;

    //private boolean add, sub, mult, div, cos, sin, pow, sqrt;
    String s = "";
    private double result=Double.NaN, val2=Double.NaN;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        operandViews();
        numPad();


    }

    public void setViews() {
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);


        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonMult = (Button) findViewById(R.id.btnMult);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonCos = (Button) findViewById(R.id.btnCos);
        buttonEqn = (Button) findViewById(R.id.btnEqn);
        buttonCE = (Button) findViewById(R.id.btnCE);
        buttonSqrt = (Button) findViewById(R.id.btnSQRT);
        buttonPow = (Button) findViewById(R.id.btnPOW);
        buttonSin = (Button) findViewById(R.id.btnSin);
        buttonDot = (Button) findViewById(R.id.btnDot);

        tv = (TextView) findViewById(R.id.textView);
        ed = (EditText) findViewById(R.id.editText);
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                ed.setText("");
                s="";
                result = val2 = Double.NaN;
            }
        });


    }

    public void operandViews() {
        buttonEqn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed==null){
                    ed.setText("");
                }
                else{
                    Arithmetic();
                    s+="=";
                    op = equal;
                    tv.setText(s);
                    ed.setText(String.valueOf(result));
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed == null) {
                    ed.setText("") ;
                        //val1=0;
                    }
               else{
                        Arithmetic();
                        s += "-";
                        op = sub;

                        tv.setText(s);
                        ed.setText(null);
                    }
                }

        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed==null){
                    ed.setText("");
                   // val1=0;
                }
                else{
                    Arithmetic();
                    s+="+";
                    op=add;

                    tv.setText(s);
                    ed.setText(null);
                }
            }
        });

        //Mult
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed==null){
                    ed.setText("0");
                   // val1=0;
                }
                else{
                    Arithmetic();
                    s+="*";
                    op = mult;
                    tv.setText(s);

                    ed.setText(null);
                }
            }
        });

        //Div
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed == null) {
                    ed.setText("");
                   // val1=0;
                } else {
                    Arithmetic();
                    op = div;
                    s += "/";

                    tv.setText(s);
                    ed.setText(null);

                }
            }
        });

      buttonSin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (ed == null) {
                  ed.setText("");
                  // val1=0;
              } else {
                  Arithmetic();
                  op = sin;
                  s += "Sin";

                  tv.setText(s);
                  ed.setText(null);

              }
          }
      });

    }
        public void numPad () {
            //button 0
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "0");
                     s+="0";
                }
            });

            //button 1
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "1");
                    s+="1";
                }
            });

            //button 2

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "2");
                    s+="2";
                    tv.setText(s);
                }
            });

            //button 3

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "3");
                    s+="3";
                    tv.setText(s);
                }
            });

            //button 4

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "4");

                    s+="4";
                    tv.setText(s);
                }
            });

            //button 5

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "5");
                    s+="5";
                    tv.setText(s);
                }
            });

            //button 6
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "6");
                    s+="6";
                    tv.setText(s);
                }
            });
            //button 7
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "7");
                    s+="7";
                    tv.setText(s);
                }
            });
            //button 8
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "8");
                    s+="8";
                    tv.setText(s);
                }
            });
            //button 9
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + "9");
                    s+="9";
                    tv.setText(s);
                }
            });
            //button dot
            buttonDot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText() + ".");
                    s+=".";
                    tv.setText(s);
                }
            });
        }

        public void Arithmetic(){
                  if(!Double.isNaN(result)){
                       val2 = Double.parseDouble(ed.getText().toString());
                      switch (op){
                          case add : result+=val2;
                                      break;
                          case sub: result-=val2;
                                      break;
                          case mult : result *= val2;
                            break;
                          case div : result/=val2;
                             break;
                          case sin :
                                   result += Math.sin(Math.toRadians(val2));
                                    break;

                          case equal: break;
                      }
                  }
                  else{
                      result=Double.parseDouble(ed.getText().toString());
                  }
        }


}

