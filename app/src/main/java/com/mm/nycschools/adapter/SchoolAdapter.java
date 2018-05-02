package com.mm.nycschools.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mm.nycschools.R;
import com.mm.nycschools.interfaces.OnItemClickListener;
import com.mm.nycschools.pojo.Schoolnfo;

import java.util.List;



/**
 * Created by Demo on 01/05/18.
 */

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.VH> {
    Context context;
    List<Schoolnfo> schoolnfoList;
    private final OnItemClickListener listener;

    public SchoolAdapter(Context context, List<Schoolnfo> schoolnfoList, OnItemClickListener listener) {
        this.context = context;
        this.schoolnfoList = schoolnfoList;
        this.listener = listener;
    }


    @Override
    public SchoolAdapter.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.schoolslist, parent, false);

        return new SchoolAdapter.VH(view);
    }

    @Override
    public void onBindViewHolder(SchoolAdapter.VH holder, int position) {

        holder.textViewSchoolName.setText(schoolnfoList.get(position).getSchoolName());
        holder.bind(schoolnfoList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return schoolnfoList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView textViewSchoolName;

        public VH(View itemView) {
            super(itemView);
            textViewSchoolName = (TextView) itemView.findViewById(R.id.textView_rvname);




        }


        public void bind(final Schoolnfo item, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }


    }
}





