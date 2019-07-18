package com.laioffer.mynews;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class MyNewsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }

}
