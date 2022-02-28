package com.example.store.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.store.R;
import com.example.store.models.Product;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>  {

    private static final String TAG = "MYLOGS";
    List<Product> productList;
    Context context;

    public CategoryAdapter(Context context, List<Product> products){
        this.context=context;
        productList=products;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.activity_items,parent,false);
        Log.v(TAG, "inflating");
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Product product=productList.get(position);

        Log.v(TAG, product.getTitle());

        Log.v(TAG, String.valueOf(product.getId()));

        holder.id.setText((String.valueOf(product.getId())));
        holder.title.setText(( product.getTitle()));
       holder.price.setText(String.valueOf(product.getPrice()));
        holder.description.setText((product.getDescription()));
        holder.image.setText((product.getImage()));
       // holder.rate.setText((CharSequence) product.getRating());
        Log.v(TAG, product.getTitle());
      //  holder.rate.setText((int) product.getRating());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView id,title,price,description,image,rate;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.v(TAG,"CategoryViewHolder");

            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title);
            price=itemView.findViewById(R.id.price);
            description=itemView.findViewById(R.id.description);
            image=itemView.findViewById(R.id.image);
           // rate=itemView.findViewById(R.id.rate);
           // rate=itemView.findViewById(R.id.rate);
        }
        ///
    }
}
