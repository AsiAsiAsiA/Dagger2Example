package com.example.semen.dagger2example.dagger;


import com.example.semen.dagger2example.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {

    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();

}
