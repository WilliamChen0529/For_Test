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
public class testForSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        StringBuilder msg = new StringBuilder("hello Jim!");
        int loc = 0;
      //  System.out.println(msg.charAt(9)); 
        try{           
            for(loc =0; loc<12;loc++){
                switch(msg.charAt(loc)){  //字串index
                    case 'i':
                    case 'e':
                    case 'o':
                        String ucs = Character.toString(msg.charAt(loc)).toUpperCase();
                        msg.replace(loc, loc+1, ucs);  //.replace(取代位置,取代範圍(終點),欲取代的字串)
                        Boolean abc = Character.toString(msg.charAt(loc)).isEmpty();
                        System.out.println(abc);
                }               
            }                       
        }catch(Exception e){
            System.out.print("Out of Limits ");
        }
        System.out.println(msg);
        
    }
    
}
