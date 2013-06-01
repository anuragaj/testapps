package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void add(View view)
    {
    	EditText n1=(EditText)findViewById(R.id.editText1);
    	EditText n2=(EditText)findViewById(R.id.editText2);
    	TextView n3=(TextView)findViewById(R.id.textView1);
    	
    	String sn1=n1.getText().toString();
    	String sn2=n2.getText().toString();
    	
    	float in1=Float.parseFloat(sn1);
    	float in2=Float.parseFloat(sn2);
    	float in3=in1 + in2;
    	//n3.setTextColor(2);
    	n3.setTextSize((float) 30);
    	n3.setText("Result="+in3);
    	
    }
    public void sub(View view)
    {
    	EditText n1=(EditText)findViewById(R.id.editText1);
    	EditText n2=(EditText)findViewById(R.id.editText2);
    	TextView n3=(TextView)findViewById(R.id.textView1);
    	
    	String sn1=n1.getText().toString();
    	String sn2=n2.getText().toString();
    	
    	float in1=Float.parseFloat(sn1);
    	float in2=Float.parseFloat(sn2);
    	float in3=in1 - in2;
    	//n3.setTextColor((int) );
    	n3.setTextSize((float) 30);
    	n3.setText("Result="+in3);
    	
    }
    public void mul(View view)
    {
    	EditText n1=(EditText)findViewById(R.id.editText1);
    	EditText n2=(EditText)findViewById(R.id.editText2);
    	TextView n3=(TextView)findViewById(R.id.textView1);
    	
    	String sn1=n1.getText().toString();
    	String sn2=n2.getText().toString();
    	
    	float in1=Float.parseFloat(sn1);
    	float in2=Float.parseFloat(sn2);
    	float in3=in1 * in2;
    	//n3.setTextColor(2);
    	n3.setTextSize((float) 30);
    	n3.setText("Result="+in3);
    	
    }
    public void div(View view)
    {
    	EditText n1=(EditText)findViewById(R.id.editText1);
    	EditText n2=(EditText)findViewById(R.id.editText2);
    	TextView n3=(TextView)findViewById(R.id.textView1);
    	
    	String sn1=n1.getText().toString();
    	String sn2=n2.getText().toString();
    	
    	float in1=Float.parseFloat(sn1);
    	float in2=Float.parseFloat(sn2);
    	
    	if(in2==0)
    	{
    		//n3.setTextColor(2);
    		n3.setTextSize((float) 20);
    		n3.setText("Second number cannot be zero");
    	}
    		else
    	{
    			float in3=in1 / in2;
    		//n3.setTextColor(2);
    		n3.setTextSize((float) 30);
    	n3.setText("Result="+in3);
    	}
    	
    }
    
}
