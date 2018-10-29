/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public Main() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma garis bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis();
        
        grs.setx1(10);//x awal
        grs.sety1(10);//y awal
        grs.setx2(170);//x akhir
        grs.sety2(160);//y akhir
        grs.setBackground(Color.WHITE);
        
        frame.add(grs);
        frame.setSize(400,400);
        frame.setVisible(true);
        
    }

}
