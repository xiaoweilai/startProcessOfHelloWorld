package com.example.starthelloworld;

import java.util.Timer;
import java.util.TimerTask;

import android.support.v7.app.ActionBarActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private Button mButton;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton = (Button) findViewById(R.id.myButton1);
		mButton.setOnClickListener(new Button.OnClickListener()
		{
		    @Override
		    public void onClick(View v)
		    {
		    	//����SDL����
		    	Intent mIntent = new Intent( ); 
		    	ComponentName comp = new ComponentName("org.libsdl.app", "org.libsdl.app.SDLActivity");     
		    	mIntent.setComponent(comp); 
		    	mIntent.setAction("android.intent.action.VIEW"); 
		    	startActivity(mIntent);
		    	
		        String str;
		        str = "����" + "hello world" + "�ɹ�����";
		        /* ʹ��ϵͳ��׼��makeText()��ʽ������ToastѶϢ */
		        Toast.makeText(MainActivity.this, "���Ը���� " + str, Toast.LENGTH_LONG).show();
//		        
//		        //��ת���������ϣ���android����������
//				TimerTask task = new TimerTask(){     
//				  	 public void run(){     
//				  	 //execute the task     
//				  		 Intent home = new Intent(Intent.ACTION_MAIN);  
//				  		 home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
//				  		 home.addCategory(Intent.CATEGORY_HOME);  
//				  		 startActivity(home);  
//				 }     
//				};     
//				Timer timer = new Timer();   
//				timer.schedule(task, 5000); //��ʱ5s

		        
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
