/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Josh Siqueiros
 * This is scott Coad
 * This is Dustin Judd
 * And Jarom Rial
 * and Zach Cammack
 * and Sarah Oesterle
 * and Michael Stratford
 */
public class Connect4 {

    /**
     * @param args the command line arguments
     */
    
    String name;
    String instructions = 
             "You will play against another player. Player 1 is red, and player 2 is black. \n\n"
            + "Start by placing a piece in any collumns"
            + "The first player to connect 4 of their colors together wins! \n\n"
            + "Good luck, and have fun! \n\n" ;
   
    public static void main(String[] args) 
                     throws IOException {
        Connect4 ourGame = new Connect4();
        GameMenu m = new GameMenu();
        
        
        
        ourGame.getName();
        ourGame.displayHelp();
        m.showmenu();
        int pick = (char) System.in.read();
        m.choice(pick);
    }
    public void getName() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void  displayHelp() {
        System.out.println("\nWelcome to Connect 4 " + this.name + "\n");
        System.out.println(instructions);
    }
    
    }
