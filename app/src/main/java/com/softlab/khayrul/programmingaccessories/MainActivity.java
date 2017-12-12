package com.softlab.khayrul.programmingaccessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    String string[] = new String[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        try
        {
            InputStream file = getAssets().open("programming.txt");
            Scanner in = new Scanner(file);
            int k = 0;
            while(in.hasNext())
            {
                string[k] = null;
                string[k++] = in.nextLine();
            }

        }catch(Exception e)
        {

        }
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
        String str = "nothing";
        try
        {
            InputStream file = getAssets().open("input.txt");
            Scanner in = new Scanner(file);
           str = in.nextLine();

        }catch(Exception e)
        {

        }
        Button button = (Button)v;
        String ss = button.getText().toString();
        txt.setText(str);
    }

    public void search(View v)
    {
        EditText edit = (EditText)findViewById(R.id.editText);
        StringBuilder str = new StringBuilder(edit.getText().toString());
        while(str.indexOf(" ")!=-1)
        {
            str.deleteCharAt(str.indexOf(" "));
        }
        String search = new String(str);
        int i, len = search.length();
        search = search.toLowerCase();
        boolean flag = false;
        for(i = 0; i <32; i++)
        {
            String s = string[i].substring(0,len);
            if(s.equals(search))
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            int resID = getResources().getIdentifier(string[i], "id", getPackageName());
            Button button = (Button)findViewById(resID);
            button.setX(5);
            button.setY(30);
        }
        else
        {
            setContentView(R.layout.show);
            TextView txt = (TextView)findViewById(R.id.showtext);
            txt.setText("Not found");
        }
    }

    public void exitApp(View v)
    {
        System.exit(1);
    }
}
