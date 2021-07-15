package com.example.myactivitydatabase1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myactivitydatabase1.databinding.ActivityItemBinding;

import java.util.ArrayList;
import java.util.List;



    public class AdapterSV extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
        private ActivityItemBinding binding;
        private final int View_TYPE_ITEM =0;
        private final int VIEW_TYPE_LOADING = 1;
        public List<Useritem> data = new ArrayList<Useritem>();
        private EventSV listener;
        public AdapterSV(List<Useritem> data) {
            this.data=data;
        }
        public void setListener(EventSV listener) {
            this.listener = listener;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            binding = ActivityItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

            //  View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
            return  new ViewHolder(binding.getRoot());
        }

        @Override
        public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
            ((ViewHolder) holder).setData(data.get(position),position);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public void addAll(List<Useritem> dataForList) {
            data.addAll(dataForList);
            notifyDataSetChanged();
        }
        public  class ViewHolder extends RecyclerView.ViewHolder {

            public ViewHolder( View v ){
                super(v);
            }
            public void setData(Useritem data, int position){
                binding.tvName.setText(data.name);
                binding.tvClass.setText(data.lop);
                binding.tvDate.setText(data.ngaythem);
                binding.btnDelete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listener.DeleteStudent(getAdapterPosition());
                    }
                });

                binding.btnSee.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listener.Detail(data,getAdapterPosition());
                    }
                });
                binding.btnEdit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listener.EditStudent(data,getAdapterPosition());
                    }
                });
            }


        }
        public void deleteStudent(int position){
            data.remove(position);
            notifyItemRemoved(position);

        }
        public void EditStudent(Useritem data1, int position){
            Useritem a = data.get(position);
            a.name =data1.name;
            a.adress=data1.adress;
            a.age=data1.age;
            a.giaovien=data1.giaovien;
            a.lop=data1.lop;
            a.ngaythem=data1.ngaythem;
            notifyItemChanged(position);
        }

    }


