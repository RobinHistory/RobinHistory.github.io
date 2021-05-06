package showMeFlowers;



import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Picture {
	JFrame frame;
	Picture(){
		 frame=new JFrame("SHOW ME THE FLOWER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(550, 50);
		//frame.setSize(800,900);
		frame.setUndecorated(true);
		frame.setOpacity(1f);
		
	}
	public  void showmetheflower(String file) throws InterruptedException	{
		
		ImageIcon icon=new ImageIcon(file);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		int iconwidth=icon.getIconWidth();
		int iconheight=icon.getIconHeight();
		if(iconheight>screenSize.getHeight())
		{
			iconwidth=(int) (iconwidth*(screenSize.getHeight()/iconheight));
			iconheight=(int) screenSize.getHeight();
		}
		if(iconwidth>screenSize.getWidth())
		{
			iconheight=(int) (iconheight*(screenSize.getWidth()/iconwidth));
			iconwidth=(int) screenSize.getWidth();
		}
		
		
		icon.setImage(icon.getImage().getScaledInstance(iconwidth,
		iconheight, Image.SCALE_DEFAULT));
		JLabel label = new JLabel();
		
		label.setIcon(icon);
		
		JPanel sp=new JPanel();
		sp.add(label);
        

		int dirx=(int) ((screenSize.getWidth()-icon.getIconWidth())/2);
		int diry=(int) ((screenSize.getHeight()-icon.getIconHeight())/2);
		//frame.setLocation(dirx,diry);
		frame.setLocation(200,0);
		//frame.setLocation(400,300);
		int x;
		int y;
		x=new Integer(icon.getIconWidth());
		y=new Integer(icon.getIconHeight());
		frame.setSize(x,y);
		
	
		
		//frame.add(sp);
		frame.setVisible(true);
		//double valuecount= Math.pow(1.5, 5);
		
		//²ßÂÔ1
		int startx=(int) (x/2);
		int starty=(int)(y/2);
		for(;startx<(x+20)||starty<(y+20);startx*=1.2,starty*=1.2) {
		    icon=new ImageIcon(file);
			icon.setImage(icon.getImage().getScaledInstance(startx,
					starty, Image.SCALE_DEFAULT));
			
		
			frame.add(sp);
		
			frame.setSize(startx,starty);
			if((x/startx)<1||(y/starty)<1) {
				Thread.sleep(1000);
			}
			//else if(x<80||y<80)
				//Thread.sleep(10);
			else Thread.sleep(50);
			
		}
		
		//²ßÂÔ2
		//int signwidth=(int) (screenSize.getWidth()-400);
	
		/*
		int currentx=x;
		int currenty=y;
		for(;currentx<screenSize.getWidth()&&currenty<(screenSize.getWidth()-400);
				currentx*=1.1,currenty*=1.1) {
			icon.setImage(icon.getImage().getScaledInstance(currentx,
					currenty, Image.SCALE_DEFAULT));
			
		
			frame.add(sp);
		
			frame.setSize(currentx,currenty);
			if((screenSize.getWidth()-currentx)<20||(screenSize.getWidth()-400-currenty)<20) {
				Thread.sleep(100);
			}
			else if(x<80||y<80)
				Thread.sleep(10);
			else Thread.sleep(50);
			
		}
		
		*/
		Thread.sleep(2);
		frame.remove(sp);
	}


}
