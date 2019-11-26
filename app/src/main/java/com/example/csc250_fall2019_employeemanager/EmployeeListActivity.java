package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity
{
    private ListView employeeLV;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        //capable of showing a collection of things on the screen
        this.employeeLV = this.findViewById(R.id.employeeLV);

        //for(int i = 0; i < 10; i++)
        //{
            //Core.theimportantString.add("ArrayList String " + i);
        //}


        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Core.theimportantString);
        this.employeeLV.setAdapter(adapter);
    }

    @Override
    protected void onResume() //if the activity is run up again and inserts in new information
    {
       super.onResume();
       adapter.notifyDataSetChanged();
        //employeeLV.invalidate();
    }
}
