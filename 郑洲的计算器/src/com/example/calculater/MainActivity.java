package com.example.calculater;


import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends Activity{

	
	TextView textView;
	boolean isClear=false;
	
	
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,buttonDot;
	Button btnplus,btnminus,btndivide,btnmultiply,btnequal,btndelete;
	public Button[] buttons={btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Integer[] Id = { R.id.button0, R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9};
        ArrayList<Integer> ButtonId=new ArrayList<Integer>(Arrays.asList(Id));
        
        for (int i = 0; i < 10; i++) {
			buttons[i]=(Button)findViewById(ButtonId.get(i));
		}
        
        btnplus=(Button)findViewById(R.id.buttonplus);
        btnminus=(Button)findViewById(R.id.buttonminus);
        btnmultiply=(Button)findViewById(R.id.buttonmultiply);
        btndivide=(Button)findViewById(R.id.buttondivide);
        btnequal=(Button)findViewById(R.id.buttonequal);
        btndelete=(Button)findViewById(R.id.buttondelete);

        
        buttonDot=(Button)findViewById(R.id.buttondot);
        textView=(TextView)findViewById(R.id.textView);
        
        textView.setText("0.0");


        buttons[0].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"0");
			}
		});
        
        buttons[1].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"1");
			}
		});
        
        buttons[2].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"2");
			}
		});
        
        buttons[3].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"3");
			}
		});
        
        buttons[4].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"4");
			}
		});
        
        buttons[5].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"5");
			}
		});
        
        buttons[6].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"6");
			}
		});
        
        buttons[7].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"7");
			}
		});
        
        buttons[8].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"8");
			}
		});
        
        buttons[9].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+"9");
			}
		});
        
        buttonDot.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=textView.getText().toString();
				textView.setText(str+".");
			}
		});

        
     

        
        
        btnplus.setOnClickListener(new plusListener());
/*        btnminus.setOnClickListener(new minusListener());
        btnmultiply.setOnClickListener(new multiplyListener());
        btndivide.setOnClickListener(new devideListener());
        btnequal.setOnClickListener(new equalListener());
        btndelete.setOnClickListener(new deleteListener());*/
        
        
        
        
        
       }
    
    


    public String str1=textView.getText().toString();
    double onedouble=Double.parseDouble(str1);
    public String str2;
    
    public class plusListener implements OnClickListener {
    	
    	

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			textView.setText("");
			
			
		}
		
		str2=textView.getText().toString();
		double onedouble=Double.parseDouble(str2);

	}

    double str=str1+str2;
	
}
	
