package com.example.textrecognition;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onDeleteClick(int position);
        // для изменения
        void onChangeClick(int position);
        void onCheckClick(int position, String names);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
    private ArrayList<message_controller> mExampleList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView mtextView1;
        public TextView mtextView2;
        public ImageButton mDeleteImage;
        public ImageButton mChangeImage;
        public CheckBox userName1;
        public CheckBox userName2;
        public CheckBox userName3;
        public CheckBox userName4;
        public CheckBox userName5;
        public CheckBox userName6;
        public CheckBox userName7;
        public CheckBox userName8;
        public ExampleViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mtextView1=itemView.findViewById(R.id.textView);
            mtextView2=itemView.findViewById(R.id.textView2);
            mDeleteImage=itemView.findViewById(R.id.image_delete);
            mChangeImage=itemView.findViewById(R.id.Change);
            userName1=itemView.findViewById(R.id.userName1);
            userName2=itemView.findViewById(R.id.userName2);
            userName3=itemView.findViewById(R.id.userName3);
            userName4=itemView.findViewById(R.id.userName4);
            userName5=itemView.findViewById(R.id.userName5);
            userName6=itemView.findViewById(R.id.userName6);
            userName7=itemView.findViewById(R.id.userName7);
            userName8=itemView.findViewById(R.id.userName8);

            mDeleteImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onDeleteClick(position);
                        }
                    }
                }
            });
            // для изменения
            mChangeImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onChangeClick(position);

                        }
                    }
                }
            });
            // для сбора флажков
            userName1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
            userName8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            String ret="";
                            if(userName1.isChecked()) { ret += userName1.getText() + ","; }
                            if(userName2.isChecked()) { ret += userName2.getText() + ","; }
                            if(userName3.isChecked()) { ret += userName3.getText() + ","; }
                            if(userName4.isChecked()) { ret += userName4.getText() + ","; }
                            if(userName5.isChecked()) { ret += userName5.getText() + ","; }
                            if(userName6.isChecked()) { ret += userName6.getText() + ","; }
                            if(userName7.isChecked()) { ret += userName7.getText() + ","; }
                            if(userName8.isChecked()) { ret += userName8.getText() + ","; }
                            listener.onCheckClick(position, ret);
                        } } } });
        }
    }

    public ExampleAdapter(ArrayList<message_controller> exampleList){
        mExampleList=exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.outgoing_message,parent,false);
        ExampleViewHolder evh= new ExampleViewHolder(v,mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        message_controller currentItem=mExampleList.get(position);

        holder.mtextView1.setText(currentItem.getText1());
        holder.mtextView2.setText(currentItem.getText2());
        String[] subStr;
        String[] subStr2;
        String subStr3;
        int i=0;
        int limit = 3;
        int limit2 = 4;
        subStr = currentItem.getName().split(","); // Разделения строки str с помощью метода split()
        if (i<subStr.length){
            if(subStr[0].indexOf(" ")!= -1){
                subStr2 = subStr[0].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[0].length() > limit2 ? subStr[0].substring(0, limit2) : subStr[0];
            }
            holder.userName1.setText(subStr3);
            i++;
            holder.userName1.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[1].indexOf(" ")!= -1){
                subStr2 = subStr[1].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[1].length() > limit2 ? subStr[1].substring(0, limit2) : subStr[1];
            }
            holder.userName2.setText(subStr3);
            i++;
            holder.userName2.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[2].indexOf(" ")!= -1){
                subStr2 = subStr[2].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[2].length() > limit2 ? subStr[2].substring(0, limit2) : subStr[2];
            }
            holder.userName3.setText(subStr3);
            i++;
            holder.userName3.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[3].indexOf(" ")!= -1){
                subStr2 = subStr[3].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[3].length() > limit2 ? subStr[3].substring(0, limit2) : subStr[3];
            }
            holder.userName4.setText(subStr3);
            i++;
            holder.userName4.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[4].indexOf(" ")!= -1){
                subStr2 = subStr[4].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[4].length() > limit2 ? subStr[4].substring(0, limit2) : subStr[4];
            }
            holder.userName5.setText(subStr3);
            i++;
            holder.userName5.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[5].indexOf(" ")!= -1){
                subStr2 = subStr[5].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[5].length() > limit2 ? subStr[5].substring(0, limit2) : subStr[5];
            }
            holder.userName6.setText(subStr3);
            i++;
            holder.userName6.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[6].indexOf(" ")!= -1){
                subStr2 = subStr[6].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[6].length() > limit2 ? subStr[6].substring(0, limit2) : subStr[6];
            }
            holder.userName7.setText(subStr3);
            i++;
            holder.userName7.setVisibility(View.VISIBLE);
        }
        if (i<subStr.length){
            if(subStr[7].indexOf(" ")!= -1){
                subStr2 = subStr[7].split(" ");
                subStr3 = subStr2[0].length() > limit ? subStr2[0].substring(0, limit) : subStr2[0];
                subStr3+=" ";
                subStr3+= subStr2[1].length() > limit ? subStr2[1].substring(0, limit) : subStr2[1];
            }else{
                subStr3 = subStr[7].length() > limit2 ? subStr[7].substring(0, limit2) : subStr[7];
            }
            holder.userName8.setText(subStr3);
            i++;
            holder.userName8.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
