import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Shapes extends JFrame{
	Container c;
	Shapes(){
		setSize(600,400);
		this.setLocationRelativeTo(null);
		c=this.getContentPane();
		JPanel p =new JPanel(){
			public void paint(Graphics g) {
				Graphics2D gg =(Graphics2D)g.create();
				gg.setColor(Color.RED);
				//gg.fillRect(20, 100, 200, 50);
				//gg.fillOval(123, 100, 350, 250);
				gg.drawPolygon(new int[] {12,34,56,123,145,234},new int[] {45,67,89,145,167,213}, 6);
				
			}
		};
		c.add(p,BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class TwoDShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Shapes();
	}

}
