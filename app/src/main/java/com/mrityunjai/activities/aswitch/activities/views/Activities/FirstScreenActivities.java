package com.mrityunjai.activities.aswitch.activities.views.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mrityunjai.activities.aswitch.activities.R;

/**
 * Created by iota on 12/18/2016.
 */

public class FirstScreenActivities extends Activity{

    EditText inputName;
    EditText inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen1);

        inputEmail = (EditText) findViewById(R.id.email);
        inputName= (EditText) findViewById(R.id.name);

        Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);

        btnNextScreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), SecondScreenActivities.class);

                nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("email",inputEmail.getText().toString());
                Log.e("n", inputName.getText()+"."+ inputEmail.getText());

                startActivity(nextScreen);
            }
        });

    }
}
