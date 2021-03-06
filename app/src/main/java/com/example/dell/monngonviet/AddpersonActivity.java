package com.example.dell.monngonviet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 22/10/2017.
 */

public class AddpersonActivity extends MainActivity2 {
    TextView edtAddName, edtAddAddress;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_player);
        getActionBar().hide();
        initview();
    }

    private void initview() {
        edtAddName = (EditText) findViewById(R.id.edtAddname);
        edtAddAddress = (TextView) findViewById(R.id.edtaddAddress);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player player = new player(0,R.drawable.muco, edtAddName.getText().toString(),
                        edtAddAddress.getText().toString());
                Intent intent = new Intent(AddpersonActivity.this, MainActivity2.class);
                intent.putExtra("ADD", player);
                setResult(100, intent);
                finish();
            }
        });
    }
}

