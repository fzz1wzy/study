package com;

import org.junit.Test;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class Demo01 {

    @Test
    public void f1(){



    }

    @Test
    public void f2(){

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("thread:start");
                try {
                    this.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                for (double i = 0;i<30000000000d;i++){
//                    String a="123";
//                }
                System.out.println("thread:end");
            }
        };
        System.out.println("start:"+new Date());
        thread.start();
        for (double i = 0;i<30000000000d;i++){
            String a="123";
        }
        System.out.println("start:"+new Date());

    }

    @Test
    public void f3(){
        ((De)null).ff();
    }



}
class De{
    public static void ff(){
        System.out.println("静态的方法");
    }
}
