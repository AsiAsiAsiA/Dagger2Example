package com.example.semen.dagger2example.dagger;


import com.example.semen.dagger2example.MyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {

    @ContributesAndroidInjector(modules = {MyFragmentModule.class})
    MyFragment myFragment();
}
