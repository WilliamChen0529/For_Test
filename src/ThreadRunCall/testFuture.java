/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadRunCall;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testFuture {

    public static class task1 implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(" Calling . . .");

            return "I am Calling !";
        }
    }

    public static class task2 implements Runnable {

        @Override
        public void run() {
            System.out.println(" Running . . .");
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService es = Executors.newCachedThreadPool();

        Future f1 = es.submit(new task1());    // 有"new"都是類別?  
        Future f2 = es.submit(new task2());
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();
          

        es.shutdown();
        
        System.out.println( str1 +" + " + str2); 

        System.out.println(f1.isDone());
        System.out.println(f2.isDone());

        System.out.println(es.isTerminated());

    }

}



/*

編寫多執行緒程式是為了實作多工的同步執行，從而能夠更好地提高執行速度。一般有三種方法，
Thread,Runnable,Callable.

Runnable和Callable的區別是，
(1)Callable規定的方法是call(),Runnable規定的方法是run().
(2)Callable在執行後可返回值，而Runnable在執行後不能返回值
(3)call方法可以拋出異常，run方法不可以
(4)執行Callable會返回Future物件，表示非同步計算的結果。它提供了檢查計算是否完成的方法，
以等待計算的完成，並檢索計算的結果。通過Future物件可以瞭解執行情況，可取消執行，還可獲取執行結果。

參考網址: https://dotblogs.com.tw/grayyin/2016/07/04/113501

Future 是一個容器可以承接 Callable !!

*/