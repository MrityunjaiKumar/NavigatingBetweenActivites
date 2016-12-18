package com.mrityunjai.activities.aswitch.activities.views.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mrityunjai.activities.aswitch.activities.R;

/**
 * Created by iota on 12/18/2016.
 */

public class SecondScreenActivities extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen2);

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);

        Button btnClose = (Button) findViewById(R.id.btnClose);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");

        Log.e("Second Screen", name + "." + email);

        txtEmail.setText(email);
        txtName.setText(name);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
