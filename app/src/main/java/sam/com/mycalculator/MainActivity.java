package sam.com.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{
    TextView tv_answer;
    Button btn;
    String result = "";
    int number = 0, number_two = 0;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_answer = (TextView) findViewById(R.id.tv_answer);

        int[] id = {
                R.id.btn_one, R.id.btn_two, R.id.btn_three, R.id.btn_four,
                R.id.btn_five, R.id.btn_six, R.id.btn_seven, R.id.btn_eight,
                R.id.btn_nine, R.id.btn_zero, R.id.btn_plus, R.id.btn_minus,
                R.id.btn_times, R.id.btn_into, R.id.btn_equal, R.id.btn_cancel
        };

        for (int i : id)
        {
            btn = (Button) findViewById(i);
            btn.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.btn_one)
        {
            result += "1";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_two)
        {
            result += "2";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_three)
        {
            result += "3";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_four)
        {
            result += "4";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_five)
        {
            result += "5";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_six)
        {
            result += "6";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_seven)
        {
            result += "7";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_eight)
        {
            result += "8";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_nine)
        {
            result += "9";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_zero)
        {
            result += "0";
            tv_answer.setText(result);
        }
        else if (view.getId() == R.id.btn_plus)
        {
            number = Integer.parseInt(tv_answer.getText().toString());
            result = "";
            tv_answer.setText(result);
            counter = 1;
        }
        else if (view.getId() == R.id.btn_minus)
        {
            number = Integer.parseInt(tv_answer.getText().toString());
            result = "";
            tv_answer.setText(result);
            counter = 2;
        }
        else if (view.getId() == R.id.btn_times)
        {
            number = Integer.parseInt(tv_answer.getText().toString());
            result = "";
            tv_answer.setText(result);
            counter = 3;
        }
        else if (view.getId() == R.id.btn_into)
        {
            number = Integer.parseInt(tv_answer.getText().toString());
            result = "";
            tv_answer.setText(result);
            counter = 4;
        }
        else if (view.getId() == R.id.btn_equal)
        {
            number_two = Integer.parseInt(tv_answer.getText().toString());

            if (counter == 1)
            {
                tv_answer.setText(number + number_two + "");
            }
            else if (counter == 2)
            {
                tv_answer.setText(number - number_two + "");
            }
            else if (counter == 3)
            {
                tv_answer.setText(number * number_two + "");
            }
            else if (counter == 4)
            {
                tv_answer.setText(number / number_two + "");
            }
        }
        else if (view.getId() == R.id.btn_cancel)
        {
            number = 0;
            number_two = 0;
            result = "";
            tv_answer.setText("0");
        }
    }
}
