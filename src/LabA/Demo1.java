/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LabA;

import java.util.*;

/**
 *
 * @author sendres1
 */
public class Demo1 {
    public static void main(String[] args) {
                                          
        /// List shoppingList = new ArrayList() use cast
        List <String>shoppingList = new ArrayList<>();  /// dont use 10
        shoppingList.add("cookies");
         shoppingList.add("ice cream");
          shoppingList.add("cookies");
          
      //    String r = shoppingList.get(1); // not a string but an generi object
          String r = shoppingList.get(1); // need to cast
       // or 
        //    String r = (String)shoppingList.get(1).toString(); // not the best
          
          // legacy technique  pre jdk 5
          for (int i = 0; i<shoppingList.size(); i++){
              String item = shoppingList.get(i);
              System.out.println(item);
          }
          
          // new way  only jdk 5 and above
          // for each in this list
          // need this if not using <>
          for(Object obj : shoppingList){
              String item = (String)obj;
              System.out.println(item);
              
          }
           // new way  only jdk 5 and above
          // for each in this list
          // this will only work the the <> operator
          for(String item : shoppingList){
             System.out.println(item);
              
          }
        
        
    }
    
}
