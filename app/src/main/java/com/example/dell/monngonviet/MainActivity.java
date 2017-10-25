package com.example.dell.monngonviet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends Activity implements OnItemClickListener,OnItemLongClickListener {
    private ListView Lv;
    private ArrayList<String> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lv= (ListView) findViewById(R.id.LvDanhSach);
        List =new ArrayList<String>();
        List.add("Món Nướng");
        List.add("Món Khai Vị");
        List.add("Món Kho");
        List.add("Món Hấp");
        List.add("Sinh Tố & Giải Khát");
        List.add("Món Gỏi");
        List.add("Món Xào");
        List.add("Món Hầm");
        List.add("Món Chiên");
        List.add("Món Canh");
        List.add("Món Chay");
        List.add("Món Cơm");
        List.add("Món Cuốn");
        List.add("Món Cháo");
        List.add("Món Bánh");
        List.add("Món Cẩm");
        List.add("Món Chè");
        List.add("Khác");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, List);
        Lv.setAdapter(adapter);
        Lv.setOnItemClickListener(this);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        switch (id) {
            case R.id.action_search:
                // Gọi màn hình AditionSportActivity
                break;
            case R.id.mnInfor:
                Intent intent= new Intent(MainActivity.this, menuActivity.class);
                startActivity(intent);
                break;}
        return super.onOptionsItemSelected(item);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mymenu, menu);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, List.get(i), Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("CountryName",Lv.getItemAtPosition(i).toString());
        startActivity(intent);
    }
    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return false;
    }
}
