package com.example.store.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.store.R;
import com.example.store.models.Product;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>  {

    List<Product> productList;
    Context context;
    //var mainCategoryAdapter = MainCategoryAdapter()
    public PostAdapter(Context context, List<Product> products){
        this.context=context;
        productList=products;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Product product=productList.get(position);
//        holder.title.setText(product.getTitle());
//        holder.price.setText((int) product.getPrice());
//        holder.description.setText(product.getTitle());
//        holder.category.setText(product.getCategory().toValue());
//        holder.image.setText(product.getImage());
//        holder.rating.setText((CharSequence) product.getRating());
        holder.id.setText(( product.getId()));
        holder.userId.setText(( product.getUserId()));
       holder.title.setText((product.getTitle()));
        holder.body.setText((product.getBody()));


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class PostViewHolder  extends RecyclerView.ViewHolder{
//       TextView id,title,price,description,category,image,rating;

        TextView id,userId,title, body;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
//            id=itemView.findViewById(R.id.text_view1);
//            title=itemView.findViewById(R.id.text_view2);
//            price=itemView.findViewById(R.id.text_view3);
//           description=itemView.findViewById(R.id.text_view4);
//            category=itemView.findViewById(R.id.text_view5);
//            image=itemView.findViewById(R.id.text_view6);
//            rating=itemView.findViewById(R.id.text_view7);

            id=itemView.findViewById(R.id.text_view1);
            userId=itemView.findViewById(R.id.text_view2);
            title=itemView.findViewById(R.id.text_view3);
            body=itemView.findViewById(R.id.text_view4);
        }
    }
}
