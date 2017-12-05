package tkachuk.course.pllug.com.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String LOG_TAG = "LOG_TAG";
    private TextView output_tv;
    private EditText io_line_et;
    private Button one_btn;
    private Button two_btn;
    private Button three_btn;
    private Button four_btn;
    private Button five_btn;
    private Button six_btn;
    private Button seven_btn;
    private Button eight_btn;
    private Button nine_btn;
    private Button null_btn;
    private Button twoNulls_btn;
    private Button dot_btn;

    private Button divide_btn;
    private Button multiply_btn;
    private Button minus_btn;
    private Button plus_btn;

    private Button clear_btn;
    private Button answer_btn;

    private double valueOne;
    private double valueTwo;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char currentOper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListeners();
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("valueOne", valueOne);
        outState.putDouble("valueTwo", valueTwo);
        outState.putChar("currentOper", currentOper);
        outState.putString("output_tv", String.valueOf(output_tv.getText()));
        outState.putString("io_line_et", String.valueOf(io_line_et.getText()));
        Log.d(LOG_TAG, "onSaveInstanceState");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        valueOne = savedInstanceState.getDouble("valueOne");
        valueTwo = savedInstanceState.getDouble("valueTwo");
        currentOper = savedInstanceState.getChar("currentOper");
        output_tv.setText(savedInstanceState.getString("output_tv"));
        io_line_et.setText(savedInstanceState.getString("io_line_et"));
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }

    private void initView() {
        output_tv = (TextView) findViewById(R.id.output_tv);
        io_line_et = (EditText) findViewById(R.id.IO_line_te);

        one_btn = (Button) findViewById(R.id.one_btn);
        two_btn = (Button) findViewById(R.id.two_btn);
        three_btn = (Button) findViewById(R.id.three_btn);
        four_btn = (Button) findViewById(R.id.four_btn);
        five_btn = (Button) findViewById(R.id.five_btn);
        six_btn = (Button) findViewById(R.id.six_btn);
        seven_btn = (Button) findViewById(R.id.seven_btn);
        eight_btn = (Button) findViewById(R.id.eight_btn);
        nine_btn =  (Button) findViewById(R.id.nine_btn);
        null_btn = (Button) findViewById(R.id.null_btn);
        null_btn = (Button) findViewById(R.id.null_btn);
        twoNulls_btn = (Button) findViewById(R.id.twoNulls_btn);
        dot_btn = (Button) findViewById(R.id.dot_btn);

        divide_btn = (Button) findViewById(R.id.divide_btn);
        multiply_btn = (Button) findViewById(R.id.multiply_btn);
        minus_btn = (Button) findViewById(R.id.minus_btn);
        plus_btn = (Button) findViewById(R.id.plus_btn);

        clear_btn = (Button) findViewById(R.id.clear_btn);
        answer_btn = (Button) findViewById(R.id.answer_btn);
    }

    private void initListeners() {
        one_btn.setOnClickListener(this);
        two_btn.setOnClickListener(this);
        three_btn.setOnClickListener(this);
        four_btn.setOnClickListener(this);
        five_btn.setOnClickListener(this);
        six_btn.setOnClickListener(this);
        seven_btn.setOnClickListener(this);
        eight_btn.setOnClickListener(this);
        nine_btn.setOnClickListener(this);
        null_btn.setOnClickListener(this);
        twoNulls_btn.setOnClickListener(this);
        dot_btn.setOnClickListener(this);

        divide_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
        minus_btn.setOnClickListener(this);
        plus_btn.setOnClickListener(this);

        clear_btn.setOnClickListener(this);
        answer_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.one_btn:
                io_line_et.setText(io_line_et.getText()+"1");
                break;
            case R.id.two_btn:
                io_line_et.setText(io_line_et.getText()+"2");
                break;
            case R.id.three_btn:
                io_line_et.setText(io_line_et.getText()+"3");
                break;
            case R.id.four_btn:
                io_line_et.setText(io_line_et.getText()+"4");
                break;
            case R.id.five_btn:
                io_line_et.setText(io_line_et.getText()+"5");
                break;
            case R.id.six_btn:
                io_line_et.setText(io_line_et.getText()+"6");
                break;
            case R.id.seven_btn:
                io_line_et.setText(io_line_et.getText()+"7");
                break;
            case R.id.eight_btn:
                io_line_et.setText(io_line_et.getText()+"8");
                break;
            case R.id.nine_btn:
                io_line_et.setText(io_line_et.getText()+"9");
                break;

            case R.id.null_btn:
                io_line_et.setText(io_line_et.getText()+"0");
                break;
            case R.id.twoNulls_btn:
                io_line_et.setText(io_line_et.getText()+"00");
                break;

           case R.id.dot_btn:
               io_line_et.setText(io_line_et.getText()+".");
               break;

            case R.id.divide_btn:
                valueOne = Double.valueOf(String.valueOf(io_line_et.getText()));
                io_line_et.setText("");
                currentOper = DIVISION;
                output_tv.setText(output_tv.getText()+String.valueOf(valueOne)+currentOper);
                break;

            case R.id.multiply_btn:
                valueOne = Double.valueOf(String.valueOf(io_line_et.getText()));
                io_line_et.setText("");
                currentOper = MULTIPLICATION;
                output_tv.setText(output_tv.getText()+String.valueOf(valueOne)+currentOper);
                break;

            case R.id.plus_btn:
                valueOne = Double.valueOf(String.valueOf(io_line_et.getText()));
                io_line_et.setText("");
                currentOper = ADDITION;
                output_tv.setText(output_tv.getText()+String.valueOf(valueOne)+currentOper);
                break;

            case R.id.minus_btn:
                valueOne = Double.valueOf(String.valueOf(io_line_et.getText()));
                io_line_et.setText("");
                currentOper = SUBTRACTION;
                output_tv.setText(output_tv.getText()+String.valueOf(valueOne)+currentOper);
                break;

            case R.id.clear_btn:
                clear();
                break;

            case R.id.answer_btn:
                valueTwo = Double.valueOf(String.valueOf(io_line_et.getText()));
                io_line_et.setText(String.valueOf(calculate(valueOne, valueTwo, currentOper)));
                output_tv.setText(output_tv.getText()+String.valueOf(valueTwo)+" = "+io_line_et.getText());
                valueOne = 0;
                valueTwo = 0;
                break;
        }
    }

    private double calculate(double valueOne, double valueTwo, char currentOper) {
        switch (currentOper){
            case ADDITION:
                return valueOne+valueTwo;
            case SUBTRACTION:
                return valueOne-valueTwo;
            case DIVISION:
                return valueOne/valueTwo;
            case MULTIPLICATION:
                return valueOne*valueTwo;
        }
        return 0;
    }

    private void clear(){
        valueOne = 0;
        valueTwo = 0;

        currentOper = ' ';

        io_line_et.setText("");
        output_tv.setText("");

    }
}
