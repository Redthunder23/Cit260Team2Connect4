/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author dustinjudd
 */
public class GameBoard {
    int w = 7, h = 6, bs = 100;
    void setup() {
        size(700, 600); ellipseMode(CORNER);
    }
    void draw() {
        for(int j=0;j<h;j++) for(int i=0;i<w;i++){
            fill(255);
            rect(i*bs,j*bs,bs,bs);
        }
    }
    
}
