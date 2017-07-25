AOP运用在Android中的demo

1.创建一个Android工程

2.在最外层build.gradle 添加aspectjx配置  
  buildscript {  
  	repositories {  
        jcenter()  
    }  
    dependencies {  
        classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:1.0.10'  
    }
}

3.在module中的build.gradle添加aspectjx相关配置  
apply plugin: 'android-aspectjx'

aspectjx {  
    includeJarFilter 'aoplib'  
}  
3.创建一个Aspect类
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

