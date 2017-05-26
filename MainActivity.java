package com.example.sapasapp;

import com.example.sapasapp.Main2Activity;
import com.example.sapasapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.os.*;
import android.app.*;
import android.widget.*;
import android.content.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View boton=findViewById(R.id.button1);
        boton.setOnClickListener((OnClickListener)this);
    }
public void onClick (View v){

	Intent intencion=new Intent (this,Main2Activity.class);
	
	startActivity(intencion);
	
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

