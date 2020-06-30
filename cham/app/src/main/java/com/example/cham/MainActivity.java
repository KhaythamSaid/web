package com.example.cham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ans;
    Button zer,cc,one,two,thr,fr,fv,sx,sev,eght,nin,eq,pls,min,tim,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = (EditText) findViewById(R.id.output);
        div = (Button) findViewById(R.id.buttonD);
        tim = (Button) findViewById(R.id.buttontm);
        min = (Button) findViewById(R.id.buttonM);
        pls = (Button) findViewById(R.id.buttonp);
        eq = (Button) findViewById(R.id.buttonq);
        nin = (Button) findViewById(R.id.num9);
        eght = (Button) findViewById(R.id.num8);
        sev = (Button) findViewById(R.id.num7);
        sx = (Button) findViewById(R.id.num6);
        fv = (Button) findViewById(R.id.num5);
        fr = (Button) findViewById(R.id.num4);
        thr = (Button) findViewById(R.id.num3);
        two = (Button) findViewById(R.id.num2);
        one = (Button) findViewById(R.id.num1);
        cc = (Button) findViewById(R.id.buttonC);
        zer = (Button) findViewById(R.id.num0);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "2");
            }
        });
        thr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "3");
            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "4");
            }
        });
        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "5");
            }
        });
        sx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "6");
            }
        });
        sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "7");
            }
        });
        eght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "8");
            }
        });
        nin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "9");
            }
        });
        zer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "0");
            }
        });
        int answer = 0;

        pls.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int answer = val1 + val2;
                                       ans.setText(Integer.toString(answer));
                                   }
                               }
        );
        min.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int answer = val1 - val2;
                                       ans.setText(Integer.toString(answer));
                                   }
                               }
        );
        tim.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int answer = val1 * val2;
                                       ans.setText(Integer.toString(answer));
                                   }
                               }
        );
        div.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int answer = val1 / val2;
                                       ans.setText(Integer.toString(answer));
                                   }
                               }
        );
        cc.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View view){
                                      int val1 = Integer.parseInt(ans.getText().toString());
                                      int val2 = Integer.parseInt(ans.getText().toString());
                                      ans.setText(Integer.toString( 0 ));
                                  }
                              }
        );
    }
}

