package com.zz.demo;
/**
 * @Author: zz
 * @Description:
 * @Date: 上午 11:43 2018/9/19 0019
 * @Modified By
 */
public class JNIDemo {
    //定义一个方法，该方法在C中实现
    public native void testHello();

    public static void main(String[] args){
        //加载C文件
        System.loadLibrary("TestJNI");
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.testHello();
    }
}
