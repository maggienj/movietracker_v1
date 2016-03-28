package mycompany.movietracker;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<RowItem> {

    Context context;

    public CustomListViewAdapter(Context context, int resourceId,
                                 List<RowItem> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.txtMovieName = (TextView) convertView.findViewById(R.id.movieName);
            holder.txtMovieWhen = (TextView) convertView.findViewById(R.id.movieWhen);
            holder.txtMovieWhere = (TextView) convertView.findViewById(R.id.movieWhere);

            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtMovieName.setText(rowItem.getMovieName());
        holder.txtMovieWhen.setText(rowItem.getMovieWhen());
        holder.txtMovieWhere.setText(rowItem.getMovieWhere());
        holder.imageView.setImageResource(rowItem.getImageId());

        return convertView;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtMovieName;
        TextView txtMovieWhen;
        TextView txtMovieWhere;
    }
}