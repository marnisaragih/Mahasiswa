package com.example.proteintracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState);
    }
    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("abc","test");
        super.onSaveInstanceState(outState); }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);
        Button myBtn = (Button) findViewById(R.id.button);
        myBtn.setOnClickListener(new View.OnClickListener() {
        if(savedInstanceState !=null)

            {
                Log.d("ProteinTracker", savedInstanceState.getString("abc"));
            }

        public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }

            private View.OnClickListener myBtnClickListener = new View.OnClickListener() {
                @NonNull
                @Override
                public String toString() {
                    return super.toString();
                }

                @Override
                public void onClick(View view) {
                    EditText myEditText = (EditText) findViewById(R.id.editText1);
                    Log.d("Proteintracker", myEditText.getText().toString());

                }

                private View.OnClickListener helpButtonListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                        startActivity(intent);
                        myBtn.setOnClickListener(myBtnClickListener);

                    }
                    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
                        @Override     public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

                        Bundle b = new Bundle();

                        EditText myEditText = (EditText)findViewById(R.id.editText1);

                        b.putString("helpString",myEditText.getText().toString());
                        intent.putExtras(b);

                        startActivity(intent);     } };
                };
            };
    }

        );
}}



