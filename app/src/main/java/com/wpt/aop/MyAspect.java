package com.wpt.aop;

import android.util.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wpt on 17/7/7.
 */

@Aspect
public class MyAspect {

    @Before("execution (* com.wpt.aop.MainActivity.onCreate(..))")
    public void oncreateBefore(){
        Log.d("aopDemo","oncreateBefore");
    }

    //在该方法结束后执行(不论该方法是否出现异常)
    @After("execution (* com.wpt.aop.MainActivity.onCreate(..))")
    public void oncreateAfter(){
        Log.d("aopDemo","oncreateAfter");
    }

    //在该方法结束后执行(如果出现异常则不返回)
    @AfterReturning("execution (* com.wpt.aop.MainActivity.onCreate(..))")
    public void oncreateAfterReturning(){
        Log.d("aopDemo","oncreateAfterReturning");
    }

}
