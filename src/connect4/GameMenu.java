/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Josh
 */
public class GameMenu {
//This will take the choice from the Menu and Determen what to run.
    void choice(int what){
        switch(what){
        case '1':
        System.out.println("Output of selection 1");
        break;
        
        case '2':
        System.out.println("Outut of selection 2");
        break;
            
            case '3':
        System.out.println("Outut of selection 3");
        break;
                
                case '4':
        System.out.println("Outut of selection ");
        break;
    }
        System.out.println();
    }
    // This displays the menu.
    void showmenu() {
        System.out.println("Menu Choice 1");
        System.out.println("Menu Choice 2");
        System.out.println("Menu Choice 3");
        System.out.println("Menu Choice 4");
        System.out.println("Please enter a selection:");
    }
    
}
