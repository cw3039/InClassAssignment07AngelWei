package com.example.inclassassignment07_angelwei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class FruitList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_list);}



    public void submit(View view) {

        int age = Integer.parseInt(((EditText) findViewById(R.id.age)).getText().toString());
        String a = ((EditText) findViewById(R.id.name)).getText().toString();
        boolean eat = Boolean.parseBoolean(((CheckBox) findViewById(R.id.eat)).getText().toString());

        Fruit fruit = new Fruit(a,age,eat);

        Intent data = new Intent();
        data.putExtra(Keys.FRUITS, fruit);
        setResult(RESULT_OK, data);
        finish();
    }




}
