package com.wpt.aoplib;

import android.util.Log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wpt on 17/7/7.
 */

@Aspect
public class MyAspect {

    @AfterReturning("execution (* com.wpt.aop.MainActivity.test())")
    public void oncreateBefore(){
        Log.d("aopDemo","oncreateBefore");
    }

}
