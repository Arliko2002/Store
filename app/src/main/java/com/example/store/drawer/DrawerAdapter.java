package com.example.store.drawer;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.ViewHolder> {
    static abstract class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private DrawerAdapter drawerAdapter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){

        }
    }
}
