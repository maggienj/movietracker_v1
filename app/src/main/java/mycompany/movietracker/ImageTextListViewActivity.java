package mycompany.movietracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ImageTextListViewActivity extends Activity implements
        OnItemClickListener {


    public static final Integer[] images = {R.drawable.prada,
            R.drawable.bat, R.drawable.alvin, R.drawable.myb, R.drawable.myb};

    ListView listView;
    List<RowItem> rowItems;
    String[] movieName;
    String[] movieWhen;
    String[] movieWhere;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movielist_v2);

        movieName = getResources().getStringArray(R.array.movieName);
        movieWhen = getResources().getStringArray(R.array.movieWhen);
        movieWhere = getResources().getStringArray(R.array.movieWhere);

        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < movieName.length; i++) {
            RowItem item = new RowItem(images[i], movieName[i], movieWhen[i], movieWhere[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }


}