package com.example.semen.dagger2example.dagger;



import com.example.semen.dagger2example.MyFragment;
import com.example.semen.dagger2example.MyView;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyFragmentModule {

    @Binds
    public abstract MyView myView(MyFragment myFragment);

    @Provides
    @Named("someString")
    public static String provideSomeString(MyFragment myFragment) {
        return myFragment.getResult();
    }
}
