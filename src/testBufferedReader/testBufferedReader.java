/*
 构造方法：BufferedReader br = new BufferReader(Reader in);

主要方法：int read();//读取单个字符。

                  int read(char[] cbuf,int off,int len);//将字符读入到数组的某一部分。返回读取的字符数。达到尾部 ，返回-1。

                  String readLine();                        //读取一个文本行。

                  void close();                                //关闭该流。并释放与该流相关的所有资源。
 */
package testBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author William Chen
 */
public class testBufferedReader {

    public static void main(String[] args) throws IOException {
         
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入文字：");
        String str = buf.readLine();
        System.out.println("你剛輸入了 ：" + str);
       
        
    }


    
}
