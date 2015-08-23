package com.example.starthelloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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
		    	Intent mIntent = new Intent( ); 
		    	ComponentName comp = new ComponentName("com.example.helloworld", "com.example.helloworld.MainActivity");     
		    	mIntent.setComponent(comp); 
		    	mIntent.setAction("android.intent.action.VIEW"); 
		    	startActivity(mIntent);
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
