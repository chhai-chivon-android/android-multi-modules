package com.tuyenmonkey.androidmultimodules.di.module;

import android.app.Application;
import android.content.Context;
import com.tuyenmonkey.amm.common.base.AppConfig;
import com.tuyenmonkey.androidmultimodules.AppConfigImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

@Module
public class AppModule {
  private Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  @Provides
  @Singleton
  Application provideApplication() {
    return application;
  }

  @Provides
  @Singleton
  Context provideApplicationContext() {
    return application;
  }

  @Provides
  @Singleton
  AppConfig provideAppConfig() {
    return new AppConfigImpl();
  }
}
