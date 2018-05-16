package com.rohit.android.fragmentfactorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextMessage = findViewById(R.id.editText);


    }

    public void clickHandler(View view) {

        // getting the message from edittext
        String message = mEditTextMessage.getText().toString();

        //Fragment object with newInstance
        SimpleFragment fragment = SimpleFragment.newInstance(message);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }
}
