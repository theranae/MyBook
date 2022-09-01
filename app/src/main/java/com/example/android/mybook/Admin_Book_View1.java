package com.example.android.mybook;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_Book_View1 extends AppCompatActivity {
    Button add_book, add_student, student_list, book_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_book_view1);

        add_book = findViewById(R.id.addBook);
        add_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Book_View1.this, AddBookActivity.class);
                startActivity(intent);
            }
        });

        add_student = findViewById(R.id.addStudent);
        add_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Book_View1.this, AddStudentActivity.class);
                startActivity(intent);
            }
        });
        student_list = findViewById(R.id.studentList);
        student_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Book_View1.this, StudentList.class);
                startActivity(intent);
            }
        });

        book_list = findViewById(R.id.bookList);
        book_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Book_View1.this, MainActivity2.class);
                startActivity(intent);
            }
        });



    }
}
