package com.example.explorateurdefichier;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DirectoryViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.directory_view_holder_tv)
    TextView textView;

    public DirectoryViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
