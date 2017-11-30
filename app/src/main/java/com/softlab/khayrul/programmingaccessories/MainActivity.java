package com.softlab.khayrul.programmingaccessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    TextView txt;
    public void showBtn1(View v)
    {

    }

    public void showBtn2(View v)
    {
        setContentView(R.layout.programming);
    }

    public void showBtn3(View v)
    {
        txt = (TextView)findViewById(R.id.text);
        txt.setText("About");
    }

    public void first(View v)
    {
        setContentView(R.layout.first);
    }

    public  void back(View v)
    {
        setContentView(R.layout.programming);
    }

    public void showContent(View v)
    {
        setContentView(R.layout.show);
        TextView txt = (TextView)findViewById(R.id.showtext);
        Button button = (Button)v;
        String ss = button.getText().toString();
        txt.setText(ss);
    }

    public void search()
    {
        EditText edit = (EditText)findViewById(R.id.editText);
        StringBuilder string = new StringBuilder(edit.getText().toString());

    }

    public void exitApp(View v)
    {
        System.exit(1);
    }
}
