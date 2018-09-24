package com.github.sioncheng.tia.wap1;

import java.util.concurrent.atomic.AtomicInteger;

public class MyClass {
    private static AtomicInteger loadCounter = new AtomicInteger(0);

    static {
        loadCounter.incrementAndGet();
    }

    public static ClassLoader getMyClassLoader() {
        //put the package war to tomcat(8.5)
        //in different name
        //you will get different classLoader info
        //like
        //ParallelWebappClassLoader
        //  context: webapp1-1.0-SNAPSHOT
        //  delegate: false
        //----------> Parent Classloader:
        //java.net.URLClassLoader@53d8d10a
        ////
        //// and
        ////
        //ParallelWebappClassLoader
        //  context: webapp1-1.0
        //  delegate: false
        //----------> Parent Classloader:
        //java.net.URLClassLoader@53d8d10a
        return MyClass.class.getClassLoader();
    }

    public static int getLoadCounter() {
        return loadCounter.get();
    }
}
