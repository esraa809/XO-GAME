
package com.mycompany.xo.game;

import java.util.Scanner;


public class Game  {
        private Board myBoard = new Board();
    private Players p1 = new Players();
    private Players p2 = new Players();
    private int count = 0;

    public void readPlayerData(){
        Scanner cin = new Scanner(System.in);        
        System.out.println("Enter Player 1 Name : ");
        String s = cin.next();
        p1.setName(s);
        System.out.println("Select Player 1 Operator 'x' or 'o' : ");
        String op = cin.next();
        p1.setOp(op.charAt(0));
        
        System.out.println("Enter Player 2 Name : ");
        s = cin.next();
        p2.setName(s);
        
        if(p1.getOp()=='x'||p1.getOp()=='X')
            p2.setOp('o');
        else
            p2.setOp('x');
    }
    
    public void play(){
        Scanner cin = new Scanner(System.in);
        readPlayerData();
        myBoard.draw();
        
        while(!myBoard.isFull()){
            Players currentPlayer = p1;
            if(count%2==1) currentPlayer = p2;

            while(true){
                int pos;
                System.out.println("Select Empty Posittion from 1 to 9 :");
                pos=cin.nextInt();
                if(myBoard.replaceChar(pos,currentPlayer)){
                    break;
                }
            }
            
            myBoard.draw();
            if(myBoard.isWin(currentPlayer)){
                System.out.println("The winner is : " + currentPlayer.getName());
                break;
            }
            count++;   
        }
        
        if(myBoard.isFull()){
            System.out.println("Game is Draw ..");            
        }
    }  
}