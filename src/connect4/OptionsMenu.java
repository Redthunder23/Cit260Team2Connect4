
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Scanner;

/**
 *
 * @author Scott & Jeff
 */
public class OptionsMenu {
    
    String option1;
    String option2 = "select the color you want by first entering either 'player1' or 'player2'";
    String color1 = "type the color you want for player1";
    String color2 = "type the color you want for player2";

    public static void main(String[] args) {
           OptionsMenu options = new OptionsMenu();
           options.getPlayer();
           options.displayOptions();
           options.displayColors1();
           options.displayColors2();
            
}

    public void getPlayer() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 'options'");
        this.option1 = input.next();
                }

    private void displayOptions() {
            Scanner input = new Scanner (System.in);
            System.out.println("\nChoose: red, yellow, green, blue, or purple\n");
            System.out.println(this.option2);
    }

    private void displayColors1() {
            System.out.println("\nWelcome player1\n");
            System.out.println(this.color1);
    }

    private void displayColors2() {
            System.out.println("\nWelcome player2\n");
            System.out.println(this.color2);
    }

}