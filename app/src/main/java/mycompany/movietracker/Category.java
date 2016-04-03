package mycompany.movietracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Category extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivity3.class);
                startActivity(intent);
                finish();
            }
        });


        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivity4.class);
                startActivity(intent);
                finish();
            }
        });


        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivity5.class);
                startActivity(intent);
                finish();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}









