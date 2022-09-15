
package org.qtproject.example.androidnotifier;

import androidx.work.Worker;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.PeriodicWorkRequest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.BitmapFactory;
import android.app.NotificationChannel;
import android.os.Build;

import org.qtproject.example.androidnotifier.MainActivity;


public class UploadWorker extends Worker {

   private Context context;
   
   static
   {
	    System.loadLibrary("notify_test_lib_" + Build.CPU_ABI);
   }

   public UploadWorker(
       Context context,
       WorkerParameters params) {
       super(context, params);
       this.context = context;
   }

   @Override
   public Result doWork() {

     try {
            NotificationManager m_notificationManager = (NotificationManager)
                    context.getSystemService(Context.NOTIFICATION_SERVICE);

            Notification.Builder m_builder;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                int importance = NotificationManager.IMPORTANCE_DEFAULT;
                NotificationChannel notificationChannel;
                notificationChannel = new NotificationChannel("Qt", "Qt Notifier", importance);
                m_notificationManager.createNotificationChannel(notificationChannel);
                m_builder = new Notification.Builder(context, notificationChannel.getId());
            } else {
                m_builder = new Notification.Builder(context);
            }

            Intent notifyIntent = new Intent(context, MainActivity.class);
            PendingIntent notifyPendingIntent = PendingIntent.getActivity(context, 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
            m_builder.setContentIntent(notifyPendingIntent);

            Bitmap icon = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
            m_builder.setSmallIcon(R.drawable.icon)
                    .setLargeIcon(icon)
                    .setContentTitle("A message from Qt!")
                    .setContentText("Test123")
                    .setDefaults(Notification.DEFAULT_SOUND)
                    .setColor(Color.GREEN)
                    .setAutoCancel(true);

            m_notificationManager.notify(0, m_builder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }

     // Indicate whether the work finished successfully with the Result
     return Result.success();
   }
}
