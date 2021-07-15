package com.example.myactivitydatabase1;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myactivitydatabase1.databinding.ActivityRecycleviewBinding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SinhVienActivity extends AppCompatActivity  implements EventSV{
    private ActivityRecycleviewBinding binding;
    public AdapterSV adapterActivity;
    public MyDataBase dataBase;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecycleviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dataBase =  MyDataBase.instanceDatabase(getApplicationContext());
        LinearLayoutManager linear = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        binding.recyclerview.setLayoutManager(linear);
        dataBase.userDao().insertAll (createDataForList());
        List<Useritem> data = dataBase.userDao().getAll();
        adapterActivity = new AdapterSV(data);
        binding.recyclerview.setAdapter(adapterActivity);
        adapterActivity.setListener(this);
        Log.e("","");
        dataBase.clearAllTables();
    }
    private User[] createDataForList(){
        List<User>  data = new ArrayList<>();
        data.add(new User("nguyen van phu","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu1","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu2","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu3","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu4","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu4","24","nam o","1A","nguyen van A","20/01/2021"));
        data.add(new User("nguyen van phu4","24","nam o","1A","nguyen van A","20/01/2021"));
        User[] arr = new User[data.size()];
        data.toArray(arr);
        return (arr);
    }


    @Override
    public void EditStudent(Useritem data, int position) {
        Intent intent = new Intent(SinhVienActivity.this, InsertActivity.class);
        intent.putExtra("data2",data);
        intent.putExtra("position",position);
        someActivityResultLauncher.launch(intent);

    }

    @Override
    public void AddStudent(User data, int position) {

    }

    @Override
    public void DeleteStudent(int position) {
        adapterActivity.deleteStudent(position);
    }

    @Override
    public void Detail(Useritem data, int position) {
        Intent intent = new Intent(SinhVienActivity.this, DetailSV.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }
    private ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data2 = result.getData();
                        dataBase.userDao().insertAll((User) data2.getSerializableExtra("data2"));
                        adapterActivity.EditStudent((Useritem) data2.getSerializableExtra("data2"),(int) data2.getSerializableExtra("position"));
                    }

                }

            });


}

