package LAB_CIE2_Practice;

import java.awt.*;
import java.awt.event.*;
public class Mouse1 extends Frame implements MouseListener
{
    Mouse1()
    {
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) 
    {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) 
    {
        new Mouse1();
    }
}