package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meronepal2.HistoricalPlaces;
import com.example.meronepal2.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Datas.Data;

import static androidx.recyclerview.widget.RecyclerView.*;

public class HistoricalPlacesAdapter extends RecyclerView.Adapter<HistoricalPlacesAdapter.HistoricalPlacesViewHolder> {


    Context context;

    List<Data> dataList = new ArrayList<Data>();
    private ViewHolder holder;
    private int position;


    public HistoricalPlacesAdapter(Context context, List<Data> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public HistoricalPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HistoricalPlacesViewHolder historicalPlacesViewHolder = new HistoricalPlacesViewHolder(LayoutInflater.from(context).inflate(R.layout.content_historical_places, parent, false));

        return historicalPlacesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoricalPlacesViewHolder holder, int position) {
        View view = holder.view;

        ImageView imageView = view.findViewById(R.id.image_historical);
        TextView textView = view.findViewById(R.id.h_Title);
        TextView textView1 = view.findViewById(R.id.description_H);

        Data data = dataList.get(position);
        imageView.setImageResource(data.mainImage);
        textView.setText(data.title);
        textView1.setText(data.description) ;

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class HistoricalPlacesViewHolder extends ViewHolder {

        private View view;
        public HistoricalPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
        }
    }

}
