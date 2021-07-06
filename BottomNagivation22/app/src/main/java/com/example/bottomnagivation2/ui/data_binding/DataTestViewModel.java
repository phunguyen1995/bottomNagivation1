package com.example.bottomnagivation2.ui.data_binding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class DataTestViewModel extends ViewModel {
    private MutableLiveData<List<DataTest>> users;
    public MutableLiveData<String> testString = new MutableLiveData<>();
    public LiveData<List<DataTest>> getUsers() {
        if (users == null) {
            users = new MutableLiveData<List<DataTest>>();
            loadUsers();
        }
        return users;
    }

    private MutableLiveData<String> testString1= new MutableLiveData<>("1231");
    public LiveData<String> teststring2()  {
        return testString1;
    }
    private void loadUsers() {
        // Do an asynchronous operation to fetch users.
    }


    public void changeText() {
       testString.setValue("aaaaaaaa1111");
    }

}
