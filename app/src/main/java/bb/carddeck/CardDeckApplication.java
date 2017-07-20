package bb.carddeck;


import android.app.Application;
import android.content.Context;

import bb.carddeck.Injection.Component.ApplicationComponent;
import bb.carddeck.Injection.Module.ApplicationModule;
//import bb.carddeck.Injection.Component.DaggerApplicationComponent;


public class CardDeckApplication extends Application{

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       // if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
     //   mApplicationComponent = DaggerApplicationComponent.builder()
      //          .applicationModule(new ApplicationModule(this))
      //          .build();
    }

    public static CardDeckApplication get(Context context) {
        return (CardDeckApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
