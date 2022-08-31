
package org.qtproject.example.androidnotifier;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.Manifest.permission;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import java.io.*;
import java.net.*;
import java.util.*;
import android.util.Log;
import android.os.Build;

import org.qtproject.qt.android.bindings.QtActivity;


public class MainActivity extends QtActivity
{
	
	static
	{
		try
		{
			Log.d("test: ", "loading lib");
			System.loadLibrary("notify_test_lib_" + Build.CPU_ABI);
			Log.d("test: ", "loaded lib");
		}
		catch (Exception e)
		{
			Log.d("test:", e.getMessage());
		}
	}

	@Override
	// Interface
	public void onCreate(Bundle savedInstanceState)
	{
		//Log.d("MainActivity", " onCreate");
		test();
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}
	
	public native int test();
}
