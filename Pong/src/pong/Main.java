package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class Main extends JComponent implements MouseListener
{
	JFrame defaultWindow;
	int DISPLAY_HEIGHT = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	int DISPLAY_WIDTH = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int ballXPosition = DISPLAY_WIDTH / 2;
	int ballYPosition = DISPLAY_HEIGHT / 2;
	int mouseY = 0;
	
	public static void main(String[] args)
	{
		new Main().getGoing();
	}
	
	private void getGoing()
	{
		defaultWindow = new JFrame("Pong");
		defaultWindow.setVisible(true);
		defaultWindow.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		defaultWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		defaultWindow.add(this);
	}
	
	public void mouseMoved(MouseEvent evt)
	{
	         mouseY = evt.getY();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(ballXPosition, ballYPosition, 100, 100);
		g.setColor(Color.GREEN);
		g.fillRect(DISPLAY_WIDTH / 32, mouseY, 50, 150);
	}
	
	public void repaint() {
		defaultWindow.getContentPane().repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
