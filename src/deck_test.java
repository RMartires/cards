/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R0#!T
 */
public class deck_test {
 
    public static void main(String[] args){
  deckofcards mydeck=new deckofcards();  
  mydeck.shuffle();
    for(int i=0;i<52;i++){
    System.out.printf("%19s",mydeck.deal() );
    if(i%4==0)
        System.out.println();
    }
    mydeck.ass();
    mydeck.line(200);
    System.out.println();
    System.out.println();
    mydeck.deal2();
    
    
    
    
    }
    
    
}
