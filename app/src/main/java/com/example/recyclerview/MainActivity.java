package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView= findViewById(R.id.contactsRecView);
        ArrayList<Contact> contacts=new ArrayList<Contact>();
        contacts.add(new Contact("Tom hardy", "https://i.pinimg.com/474x/79/34/0d/79340d7668d35424fd55140a3d967d15.jpg", "tom@gmail.com"));
        contacts.add(new Contact("Christian bale", "https://i.pinimg.com/474x/f6/23/b7/f623b7a3c73e8987bb616ee2c99fb6e8.jpg", "christian@gmail.com"));
        contacts.add(new Contact("Chris Hemsworth", "https://i.pinimg.com/474x/b4/4f/93/b44f933f76f8c7c0979f762131d18545.jpg", "chris@yahoo.com"));
        contacts.add(new Contact("Hugh jackman","https://i.pinimg.com/474x/8c/f5/f1/8cf5f12a3bd0f3a2ec2a84d370e29144.jpg","jackman@gmail.com"));
        contacts.add(new Contact("Hrithik roshan","https://i.pinimg.com/474x/67/f0/94/67f0948267deaa7e138840e2e63680b4.jpg","hrithik@gmail.com"));
        contacts.add(new Contact("Akshay Kumar","https://i.pinimg.com/474x/5f/46/07/5f460743059da47fc10a21b888a0ca33.jpg","akshay@gmail.com"));

        ContactsRecViewAdapter adaptor=new ContactsRecViewAdapter(this);
        adaptor.setContacts(contacts);

        contactsRecView.setAdapter(adaptor);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}