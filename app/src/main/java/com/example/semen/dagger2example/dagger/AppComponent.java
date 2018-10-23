package com.example.semen.dagger2example.dagger;

import android.content.Context;


import com.example.semen.dagger2example.base.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);

        AppComponent build();
    }

    //делаем инъекцию в App
    void inject(App app);
}
