
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

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}
}
