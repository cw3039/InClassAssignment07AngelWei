package com.example.inclassassignment07_angelwei;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void back(View view) {

        Intent mrIntent = new Intent(this, FruitList.class);

//            int age = Integer.parseInt(((EditText) findViewById(R.id.age)).getText().toString());
//            String a = ((EditText) findViewById(R.id.name)).getText().toString();
//            boolean eat = Boolean.parseBoolean(((CheckBox) findViewById(R.id.eat)).getText().toString());

        startActivityForResult(mrIntent, Keys.FRUIT);


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.FRUIT && resultCode == RESULT_OK) {
            Fruit fruit = (Fruit) data.getSerializableExtra(Keys.FRUITS);
            ((TextView)findViewById(R.id.info)).setText(fruit.toString());
//            ((TextView)findViewById(R.id.info)).append(animal.toString());

        }
    }



}
