package com.aamir.onesignal;

import android.app.Application;

import com.onesignal.OneSignal;

public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
