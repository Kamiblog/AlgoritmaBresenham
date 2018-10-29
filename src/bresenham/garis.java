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
public class garis extends JPanel{
    private int x1,y1,x2,y2;
    
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    
    public void paint(Graphics g) {
        int x,y,xend;
        int dx = Math.abs(x2-x1);//untuk mencari dx (x2 - x1)
        int dy = Math.abs(y2-y1);//untuk mencari dy (y2 - y1)
        int p = 2*dy-dx; //menentukan nilai p
        int duady = 2*dy; // p<0
        int duadydx = 2*(dy-dx);//menentukan nilai p=0 / p>0
        if (x1>x2) { //jika x1 (10) > x2 (10)
            x = x2; 
            y = y2; 
            xend = x1;// x akhir = x1
        } else { //jika tidak (berarti x2 > x1)
            x = x1;
            y = y1;
            xend = x2;// x akhir = x2
        }
        
       
        g.drawRect(x, y, 1, 1);
        while(x<xend) {//(berhenti ketika x kecil dari x akhir)
            x++;       //maka x tambah 1
            if(p<0) {  //jika p<0 (y tetap, x bertambah)
                p+=duady;//maka p=p+(2*dy)
            } else {//jika tidak (p=0 / p>0)
                
               //if (y1>y2) {//jika y awal < y akhir
               //   y--; } //maka y kurang 1
               // else
               
               y++;//y tambah 1 (x bertambah juga)
               p+=duadydx;//p=p+2(dy-dx)
            }
            g.drawRect(x, y, 1, 1);
        }
    }
    
    public garis() {
        
    }
}
