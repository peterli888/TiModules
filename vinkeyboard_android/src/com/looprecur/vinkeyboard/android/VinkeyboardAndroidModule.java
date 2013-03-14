/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.looprecur.vinkeyboard.android;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;


@Kroll.module(name="VinkeyboardAndroid", id="com.looprecur.vinkeyboard.android")
public class VinkeyboardAndroidModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "VinkeyboardAndroidModule";
	private static final boolean DBG = TiConfig.LOGD;
  private static Context appContext;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public VinkeyboardAndroidModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(LCAT, "inside onAppCreate");
    appContext = (Context) app;
	}

	// Methods
	@Kroll.method
	public String example()
	{
		Log.d(LCAT, "example called");
		return "hello world";
	}

  @Kroll.method
  public void show()
  {
    Log.d(LCAT, "..opening the vin keyboard");
    Activity appActivity = getActivity();
    appContext.startService(new Intent(appActivity, SoftKeyboard.class));
  }

}

