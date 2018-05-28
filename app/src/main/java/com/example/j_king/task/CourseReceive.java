package com.example.j_king.task;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * @name Course
 * @class name：com.example.j_king.task
 * @class describe
 * @anthor J-King QQ:1032006226
 * @time 2017/11/1 18:14
 * @change
 * @chang time
 * @class describe
 */

public class CourseReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent taskServiceIntent = new Intent(context, TaskServices.class);
        taskServiceIntent.putExtra("speakStatus", intent.getStringExtra("speakStatus"));
        context.startService(taskServiceIntent);
    }

}