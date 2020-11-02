/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testBufferedReader;

import java.nio.CharBuffer;

/**
 *
 * @author William Chen
 */
public class testCharBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String str = "看怎么用";
        CharBuffer cha = CharBuffer.allocate(16);
        //输出缓冲区的 position and limit
        //
        System.out.println("刚创建缓冲区 position is "+cha.position()+"  limit is "
                +cha.limit());
        cha.put(str);            //存入数据。
        //再看这两个参数。
        System.out.println("存入数组后   position is "+cha.position()+"  limit is "
                +cha.limit());
        cha.flip();            //“倒带”后再看
        System.out.println("flip() 以后  position is "+cha.position()+"  limit is "
                +cha.limit());       
        String str1 = cha.toString();
        System.out.println(str1);
    }
    
}
