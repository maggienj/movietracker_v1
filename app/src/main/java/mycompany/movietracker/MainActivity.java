package mycompany.movietracker;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// package mycompany.movietracker;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.app.ListActivity;

import java.sql.Array;

import mycompany.movietracker.R;
import mycompany.movietracker.CustomList;


public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] web;
//--    Integer[] imageId;
//--    private TypedArray images;

/*     String[] web = {
            "Google Plus",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes"


    } ;

*/

    Integer[] imageId = {
            R.drawable.logobulletbig,
            R.drawable.logobulletbig,
            R.drawable.logobulletbig,
            R.drawable.logobulletbig,
            R.drawable.logobulletbig

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = getResources().getStringArray(R.array.dataelements);
        /* This block was commented and uncommented to try out accepting drawables from arrayitems.xml file
          different patterns were used to try out different methods*/

        // ArrayAdapter<String> adapter;
        // images = getResources().obtainTypedArray(R.array.listbullet).getResourceId(0, 0);
        //--        images = getResources().obtainTypedArray(R.array.listbullet);
                // imageId=getResources().getStringArray(R.array.listbullet)
        //--                for (int i=0; i< images.length(); i++){
        //--                    imageId[i] = images.getResourceId(i,0);
        //--                };
        //imageId = Array[] images;
        //int imageId=images.getResourceId(id,-1);

        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
