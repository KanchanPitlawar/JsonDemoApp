package com.bynry.jsondemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String json_String = "{\"employee\":{\"name\":\"Sachin\",\"salary\":56000}}";
    //public static final String json_String = "http://www.mocky.io/v2/5c91cf473300000170649dc4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName = findViewById(R.id.txt_name);
        try {
            JSONObject emp = (new JSONObject(json_String)).getJSONObject("employee");
            String empname = emp.getString("name");
            String empsal = emp.getString("salary");
            String str = "Employee Name : " + empname + "\n" + "Employee Salary : " + empsal;
            txtName.setText(str);



        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
