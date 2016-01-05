package com.wanghao.coolweatherbest.util;

/**
 * Created by Administrator on 2016/1/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
