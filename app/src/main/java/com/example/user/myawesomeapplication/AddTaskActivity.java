package com.example.user.myawesomeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class AddTaskActivity extends AppCompatActivity {

    EditText mEditTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        mEditTextName = (EditText) findViewById(R.id.editText);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        final DatabaseReference ref = database.getReference();

        findViewById(R.id.buttonAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Task task = new Task(
                        UUID.randomUUID().toString(),
                        mEditTextName.getText().toString(),
                        false);

                ref.child("tasks")
                        .push()
                        .setValue(task);

                finish();
            }
        });
    }
}
