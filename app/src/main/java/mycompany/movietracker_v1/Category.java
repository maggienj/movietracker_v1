package mycompany.movietracker_v1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Category extends AppCompatActivity {

    Display display;
    Point size;
    int width, height;
    float txtsize;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        txtsize=height*0.024f;
        TextView title1 = (TextView) findViewById(R.id.textView1);
        TextView title11 = (TextView) findViewById(R.id.textView11);
        title1.setTextSize(txtsize);
        title11.setTextSize(txtsize);

        Bitmap bitmapImage_title1 = BitmapFactory.decodeResource(getResources(), R.drawable.pop1);
        int nh_title1 = (int) ( bitmapImage_title1.getHeight() * (512.0 / bitmapImage_title1.getWidth()) );
        Bitmap scaled_title1 = Bitmap.createScaledBitmap(bitmapImage_title1, 512, nh_title1, true);
        ImageView ImgView1 = (ImageView) findViewById(R.id.ImgView1);
        ImgView1.setImageBitmap(scaled_title1);

        Bitmap bitmapImage_title2 = BitmapFactory.decodeResource(getResources(), R.drawable.popcorn);
        int nh_title2 = (int) ( bitmapImage_title2.getHeight() * (512.0 / bitmapImage_title2.getWidth()) );
        Bitmap scaled_title2 = Bitmap.createScaledBitmap(bitmapImage_title2, 512, nh_title2, true);
        ImageView ImgView11 = (ImageView) findViewById(R.id.ImgView11);
        ImgView11.setImageBitmap(scaled_title2);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, ImageTextListViewActivityPct.class);
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









