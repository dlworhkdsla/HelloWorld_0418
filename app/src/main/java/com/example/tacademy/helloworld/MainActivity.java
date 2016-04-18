package com.example.tacademy.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView messageView;
    EditText inputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageView = (TextView)findViewById(R.id.text_message);
        inputView = (EditText)findViewById(R.id.edit_input);

        Button btn_change = (Button)findViewById(R.id.btn_send);

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = inputView.getText().toString();
                messageView.setText(str);
            }
        });

    }
}
