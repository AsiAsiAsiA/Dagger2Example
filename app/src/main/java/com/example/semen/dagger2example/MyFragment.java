package com.example.semen.dagger2example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.semen.dagger2example.presenter.MyPresenter;

import javax.inject.Inject;


import dagger.android.support.AndroidSupportInjection;

public class MyFragment extends Fragment implements MyView {
    Button button;
    TextView textView;

    String result;

    @Inject
    MyPresenter presenter;

    public MyFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        button = view.findViewById(R.id.updateButton);
        textView = view.findViewById(R.id.textBox);

//        presenter = new MyPresenter(this,"Привет");
        presenter.doSomething();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Кнопка нажата", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


    @Override
    public void onResult(String result) {
        textView.setText(result);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static MyFragment create(String result) {
        MyFragment myFragment = new MyFragment();
        myFragment.setResult(result);
        return myFragment;
    }
}
