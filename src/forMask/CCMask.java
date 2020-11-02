package forMask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author William Chen
 */
public class CCMask {

    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";

        StringBuilder sb = new StringBuilder(creditCard);
        return x + creditCard.substring(15, 19);

    }

    public static void main(String[] args) {

        System.out.println(maskCC("1234-5678-9101-1121"));

    }

}


/*

Method 1:

StringBuilder sb = new StringBuilder(creditCard);
return x + creditCard.substring(15,19);


Method 2:

StringBuilder sb = new StringBuilder(x);
sb.append(creditCard , 15, 19);
return sb.toString();



StringBuilder內建方法可以對字串作增刪修的處理！ 如下：
xxx.subString(A,B);                // 選取顯示範圍(A->B)的"位置"(含A不含B)
xxx.append(String, A, B);          // 在xxx後面加上String的顯示範圍(A->B)的"位置"(含A不含B)
xxx.insert(A,B);                   // 在指定位置A加入B的單位

*/
