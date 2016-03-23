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
        // Locate the button in activity_main.xml
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button btn = (Button) findViewById(R.id.button1);
        // Capture button clicks
        btn.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Start NewActivity.class
                Intent intent = new Intent(Category.this, MovieList.class);
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









