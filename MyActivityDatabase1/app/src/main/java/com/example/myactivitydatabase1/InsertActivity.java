package com.example.myactivitydatabase1;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import com.example.myactivitydatabase1.databinding.ActivityInsertBinding;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InsertActivity extends AppCompatActivity {
    private ActivityInsertBinding binding1;
    private String formatted;
    private String [] lop={"lop 1","lop 2","lop 3","lop 4","lop 5","lop 6"};
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding1 = ActivityInsertBinding.inflate(getLayoutInflater());
        setContentView(binding1.getRoot());
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        Useritem a = (Useritem) getIntent().getSerializableExtra("data2");
        //  int c= (int) getIntent().getSerializableExtra("position");

        ArrayAdapter adapterCountries  = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lop);
        binding1.etEditlop.setAdapter(adapterCountries);
        binding1.etEditlop.setThreshold(1);

        binding1.etEditlop.setText(a.lop);
        binding1.etEditTeacher.setText(a.giaovien);
        binding1.etEditAge.setText(a.age);
        binding1.etEditName.setText(a.name);
        binding1.etEditAdress.setText(a.adress);

        binding1.btnetEditBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        binding1.btnetEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formatted = current.format(formatter);
                Useritem b = new Useritem(binding1.etEditName.getText().toString(),binding1.etEditAge.getText().toString(),
                        binding1.etEditAdress.getText().toString(),binding1.etEditlop.getText().toString(),binding1.etEditTeacher.getText().toString(),formatted);
                Intent intent = getIntent();
                intent.putExtra("data4",b);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}
