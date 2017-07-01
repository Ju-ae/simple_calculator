package com.example.dsm_035.caculator;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int width, height;
    private int sum = 0, loc= 0, operator = 0, equal_flag = 0; // 연산자설정 : 1 +, 2 -, 3 *, 4 /
    private int[] tmp = new int[2];
    private TextView monitor;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    public void delay(int time){
        int i;
        for(i = 0; i<time; i++){}
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        View layoutMainView = (View)findViewById(R.id.activity_main);
        width = layoutMainView.getWidth();
        height = layoutMainView.getHeight();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.button0);
        btn_1 = (Button) findViewById(R.id.button1);
        btn_2 = (Button) findViewById(R.id.button2);
        btn_3 = (Button) findViewById(R.id.button3);
        btn_4 = (Button) findViewById(R.id.button4);
        btn_5 = (Button) findViewById(R.id.button5);
        btn_6 = (Button) findViewById(R.id.button6);
        btn_7 = (Button) findViewById(R.id.button7);
        btn_8 = (Button) findViewById(R.id.button8);
        btn_9 = (Button) findViewById(R.id.button9);

        Button btn_plus = (Button) findViewById(R.id.btn_plus);
        Button btn_minus = (Button) findViewById(R.id.btn_minus);
        Button btn_multiple = (Button) findViewById(R.id.btn_multiply);
        Button btn_division = (Button) findViewById(R.id.btn_division);
        Button btn_equal = (Button) findViewById(R.id.btn_equal);

        monitor = (TextView) findViewById(R.id.textView);

        btn_0.setOnClickListener(click_0);
        btn_1.setOnClickListener(click_1);
        btn_2.setOnClickListener(click_2);
        btn_3.setOnClickListener(click_3);
        btn_4.setOnClickListener(click_4);
        btn_5.setOnClickListener(click_5);
        btn_6.setOnClickListener(click_6);
        btn_7.setOnClickListener(click_7);
        btn_8.setOnClickListener(click_8);
        btn_9.setOnClickListener(click_9);
        btn_plus.setOnClickListener(click_plus);
        btn_minus.setOnClickListener(click_minus);
        btn_multiple.setOnClickListener(click_multiply);
        btn_division.setOnClickListener(click_division);
        btn_equal.setOnClickListener(click_equal);

        DisplayMetrics dm = getApplicationContext().getResources().getDisplayMetrics();
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        Log.i("width:", String.valueOf(width));
        Log.i("height", String.valueOf(height));

        btn_0.setX(0);
        //b.setLayoutParams();
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_anim);
        //btn_0.startAnimation(anim);

       // for(int i = 0; i<300; i += 10){
         //   Log.i("for", "looping");
          //  btn_0.setX(50+i);
           // btn_0.setY(50+i);
           /* try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        //   for(int j = 0; j<10000; j++){}
       // }*/
    }

    Button.OnClickListener click_0 = new View.OnClickListener() {
        public void onClick(View v) {
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            tmp[loc] += 0;
            monitor.append("0");
        }
    };

    Button.OnClickListener click_1 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 1;
            monitor.append("1");
        }
    };

    Button.OnClickListener click_2 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 2;
            monitor.append("2");
        }
    };

    Button.OnClickListener click_3 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 3;
            monitor.append("3");
        }
    };

    Button.OnClickListener click_4 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 4;
            monitor.append("4");
        }
    };

    Button.OnClickListener click_5 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 5;
            monitor.append("5");
        }
    };

    Button.OnClickListener click_6 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 6;
            monitor.append("6");
        }
    };

    Button.OnClickListener click_7 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 7;
            monitor.append("7");
        }
    };

    Button.OnClickListener click_8 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 8;
            monitor.append("8");
        }
    };

    Button.OnClickListener click_9 = new View.OnClickListener() {
        public void onClick(View v) {
            if (equal_flag == 1) {
                monitor.setText(null);
                equal_flag = 0;
                operator = 0;
            }
            if (tmp[loc] != 0)
                tmp[loc] *= 10;
            tmp[loc] += 9;
            monitor.append("9");
        }
    };

    Button.OnClickListener click_plus = new View.OnClickListener() {
        public void onClick(View v) {
            if (operator == 0) {
                operator = 1;
                loc = 1;
                monitor.append("+");
            }
        }
    };

    Button.OnClickListener click_minus = new View.OnClickListener() {
        public void onClick(View v) {
            if (operator == 0) {
                operator = 2;
                loc = 1;
                monitor.append("-");
            }
        }
    };

    Button.OnClickListener click_multiply = new View.OnClickListener() {
        public void onClick(View v) {
            if (operator == 0) {
                operator = 3;
                loc = 1;
                monitor.append("*");
            }
        }
    };

    Button.OnClickListener click_division = new View.OnClickListener() {
        public void onClick(View v) {
            if (operator == 0) {
                operator = 4;
                loc = 1;
                monitor.append("/");
            }
        }
    };

    Button.OnClickListener click_equal = new View.OnClickListener() {
        public void onClick(View v) {
            int sum = 0;
            switch (operator) {
                case 1:
                    sum = tmp[0] + tmp[1];
                    break;
                case 2:
                    sum = tmp[0] - tmp[1];
                    break;
                case 3:
                    if (tmp[0] != 0 && tmp[1] != 0)
                        sum = tmp[0] * tmp[1];
                    break;
                case 4:
                    if (tmp[0] != 0 && tmp[1] != 0)
                        sum = tmp[0] / tmp[1];
                    break;
            }
            monitor.setText(null);
            monitor.setText(String.valueOf(sum));
            equal_flag = 1;
            loc = 0;
            tmp[0] = 0;
            tmp[1] = 0;
        }
    };
}

