package com.wanghao.coolweatherbest.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.wanghao.coolweatherbest.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/1/8.
 */
public class AutoUpdataReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
