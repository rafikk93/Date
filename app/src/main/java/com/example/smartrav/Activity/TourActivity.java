package com.example.smartrav.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.smartrav.R;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TourActivity extends AppCompatActivity {

    private EditText locationET, summaryET;
    private Button startBtn, endBtn, saveBtn;
    private TextView selectedDateTV,endDateTV;
    private DatePickerDialog datePickerDialog;
    private int year;
    private int month;
    private int dayOfMonth;
    private Calendar calendar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        locationET = findViewById(R.id.locationET);
        summaryET = findViewById(R.id.summaryET);
        startBtn = findViewById(R.id.startBtn);
        endBtn = findViewById(R.id.endBtn);
        saveBtn = findViewById(R.id.saveBtn);
        selectedDateTV = findViewById(R.id.selectedDateTV);
        endDateTV = findViewById(R.id.endDateTV);



        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDate();
            }
        });

    }

    private void startDate() {

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(TourActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                startBtn.setText(day + "/" + month + "/" + year);

            }
        },year,month,dayOfMonth);
        datePickerDialog.show();

    }

    public void endData(View view) {
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(TourActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                endBtn.setText(day + "/" + month + "/" + year);

            }
        },year,month,dayOfMonth);
        datePickerDialog.show();
    }
}
