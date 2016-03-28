package mycompany.movietracker;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


public class MovieList_v2 extends AppCompatActivity {

    ListView list;
    String[] web;
    Integer[] imageId = {
            R.drawable.lifeofpi,
            R.drawable.bat,
            R.drawable.prada,
            R.drawable.myb,
            R.drawable.alvin
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.movielist_v2);

    }
}
