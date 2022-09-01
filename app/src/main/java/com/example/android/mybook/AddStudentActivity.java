package com.example.android.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddStudentActivity extends AppCompatActivity {
    private EditText name, email, ID, password;
    private Button add_stud;

    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        name = findViewById(R.id.studentName);
        email = findViewById(R.id.studentEmail);
        ID = findViewById(R.id.studentID);
        password = findViewById(R.id.studentPassword);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Student_Info");

        add_stud = findViewById(R.id.add_student);

        add_stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addDatatoFirebase();

            }

            private void addDatatoFirebase() {
                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String ID1 = ID.getText().toString();
                String password1 = password.getText().toString();

                Student_Info student_info = new Student_Info(name1, email1, ID1, password1);

                databaseReference.push().setValue(student_info);

                Toast.makeText(AddStudentActivity.this, "Data added successfully", Toast.LENGTH_SHORT).show();
            }

        });
    }
}