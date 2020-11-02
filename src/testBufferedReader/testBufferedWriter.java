/*
 构造方法：bufferedWriter bf = new bufferedWriter(Writer out );

主要方法：void write(char ch);//写入单个字符。

                  void write(char []cbuf,int off,int len)//写入字符数据的某一部分。

                  void write(String s,int off,int len)//写入字符串的某一部分。

                  void newLine()//写入一个行分隔符。

                  void flush();//刷新该流中的缓冲。将缓冲数据写到目的文件中去。

                  void close();//关闭此流，再关闭前会先刷新他。
 */
package testBufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author William Chen
 */
public class testBufferedWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("Buffered.txt");
//		fw.write("ok168");
//		fw.close();
		/**
		 * 为了提高写入的效率，使用了字符流的缓冲区。
		 * 创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联。
		 */
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//使用缓冲区中的方法将数据写入到缓冲区中。
		bufw.write("hello world !");
		bufw.newLine();
		bufw.newLine();
		bufw.write("!hello world !");
		bufw.write("!hello world !");
		//使用缓冲区中的方法，将数据刷新到目的地文件中去。
		bufw.flush();
		//关闭缓冲区,同时关闭了fw流对象
		bufw.close();	

        
    }
    
}
