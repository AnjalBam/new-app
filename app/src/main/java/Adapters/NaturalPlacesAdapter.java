package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meronepal2.R;

import java.util.Date;
import java.util.List;

import Datas.Data;

public class NaturalPlacesAdapter extends RecyclerView.Adapter<NaturalPlacesAdapter.NaturalPlacesViewHolder> {
    View view;
    List<Data> dataList;
    Context context;


    public NaturalPlacesAdapter(Context context, List<Data> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public NaturalPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NaturalPlacesViewHolder naturalPlacesViewHolder = new NaturalPlacesViewHolder(LayoutInflater.from(context).inflate(R.layout.content_natural_places, parent,false));
        return naturalPlacesViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull NaturalPlacesViewHolder holder, int position) {

        View view = holder.view;

        ImageView imageView = view.findViewById(R.id.naturalPlacesImage);
        TextView textView = view.findViewById(R.id.naturalPlacesTitle);
        TextView textView1 = view.findViewById(R.id.naturalPlacesDescription);

        Data data = dataList.get(position);
        imageView.setImageResource(data.mainImage);
        textView.setText(data.title);
        textView1.setText(data.description);

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class NaturalPlacesViewHolder extends RecyclerView.ViewHolder{

        private View view;
        public NaturalPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
        }
    }
}
