package com.example.semen.dagger2example.presenter;

import com.example.semen.dagger2example.MyView;

import javax.inject.Inject;
import javax.inject.Named;

public class MyPresenter {
    private MyView view;
    private String someString;

    @Inject
    public MyPresenter(MyView view, @Named("someString") String someString) {
        this.view = view;
        this.someString = someString;
    }

    public void doSomething() {
        view.onResult(someString +" "+ someString);
    }
}
