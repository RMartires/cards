/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R0#!T
 */
import java.util.Random;
public class deckofcards {
    public cards1[] deck;
    private int currentcard;
    private static final int numberofcards=52;
    private static final Random randomnumbers= new Random();
    public player[][] players;
    public String testf;
    public String tests;
    public int count=0;
    public int count1=0;
    public int i;
    
    
    
    public deckofcards(){
    String face[]={"ace","one","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
    String suit[]={"diamonds","clubs","heart","spade"};
    deck =new cards1[numberofcards];
    for(int i=0;i<deck.length;i++){
    deck[i]=new cards1(face[i%13],suit[i/13]);
    }
    }
    
    public void shuffle(){
    currentcard=0;
    
    for(int f=0;f<deck.length;f++)
    {  int s = randomnumbers.nextInt(numberofcards);
        cards1 temp = deck[f];
        deck[f]=deck[s];
        deck[s]=temp;
    }
    }
    
    public cards1 deal(){
    if(currentcard<deck.length){
        return deck[currentcard++];
    
    }
    else
        return null;
    
    
    
    }
    
public player ass(){
players =new player[52][52];
for(int row=0;row<5;row++){
for(int col=0;col<5;col++){
testf=deck[count].phrasef;
tests=deck[count++].phrases;
players[row][col]=new player(testf,tests);

}

}
return null;
}
    
 public player deal2(){
     for(int r=0;r<5;r++){
     for(int c=0;c<5;c++){
         System.out.printf("%19s",players[r][c]);
         
     }
     System.out.println();
 }
 return null;    
 }   
    
 public String line(int i){
 for(int n=0;n<i;n++){
 System.out.printf("-");
 }
 
return null;
 }   
    
 
 
 
 
 
 
 
 
 
    
}
