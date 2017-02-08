package com.android.matthew.switchingscreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetNameClick(View view) {

        /*Intent getNameScreenIntent = new Intent(this,
                SecondScreen.class);
                */

        final int result = 1;

        //getNameScreenIntent.putExtra("callingActivity","MainActivity");

        Human bob = new Human(6.25,185,"Bob");

        Intent sendBob = new Intent(this,SecondScreen.class);

        sendBob.putExtra("humanBob",bob);

        startActivityForResult(sendBob,result);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView usersNameMessage = (TextView) findViewById(R.id.users_name_message);

        String nameSentBack = data.getStringExtra("UsersName");

        usersNameMessage.append(" "+nameSentBack);

    }
}
