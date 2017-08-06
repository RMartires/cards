/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R0#!T
 */
public class cards1 {
   private String face;
   private String suit;
   public String phrases;
   public String phrasef;
    public cards1(String cardface, String cardsuit){
    face = cardface;
    suit=cardsuit;
    phrases= cardsuit;
    phrasef=cardface;    
    }
   public String toString(){
   return face+"of"+suit;
   
   }



}
    
    
    

