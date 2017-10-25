package com.example.dell.monngonviet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

/**
 * Created by Phan Vy on 10/11/2017.
 */

public class MainActivity3 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tabhost);
        TabHost host = (TabHost) findViewById(R.id.tab);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tóm Tắt");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tóm Tắt");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Nguyên Liệu");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Nguyên Liệu");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Cách Làm");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Cách Làm");
        host.addTab(spec);
    }
}
