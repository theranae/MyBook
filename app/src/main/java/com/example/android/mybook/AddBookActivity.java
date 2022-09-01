package com.example.android.mybook;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddBookActivity extends AppCompatActivity {
    private EditText title, author, pages;
    private Button add;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        title = findViewById(R.id.title_input);
        author = findViewById(R.id.author_input);
        pages = findViewById(R.id.pages_input);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("BookInfo");

        add = findViewById(R.id.add_button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addDatatoFirebase();

                Intent intent = new Intent(AddBookActivity.this, Admin_Book_View1.class);
                startActivity(intent);
            }


            private void addDatatoFirebase() {
                String title1 = title.getText().toString();
                String author1 = author.getText().toString();
                String pages1 = pages.getText().toString();

                BookInfo bookInfo = new BookInfo(title1, author1, pages1);

                databaseReference.push().setValue(bookInfo);

                Toast.makeText(AddBookActivity.this, "Data added successfully", Toast.LENGTH_SHORT).show();
            }


        });
    }
}




