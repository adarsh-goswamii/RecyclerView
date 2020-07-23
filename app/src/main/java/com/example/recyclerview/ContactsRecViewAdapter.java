package com.example.recyclerview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder>
{
    private ArrayList<Contact> contacts=new ArrayList<Contact>();
    private Context context;
    public ContactsRecViewAdapter(Context context){
        this.context= context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private CardView parent;
        private TextView txtName;
        private TextView txtEmail;
        private ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            parent= itemView.findViewById(R.id.parent);
            txtEmail= itemView.findViewById(R.id.txtEmail);
            image= itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item, parent, false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtName.setText(contacts.get(position).getName());
        holder.txtEmail.setText(contacts.get(position).getEmail());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, contacts.get(position).getName()+" Selected", Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(context).asBitmap()
                .load(contacts.get(position).getImgUrl())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }
}
