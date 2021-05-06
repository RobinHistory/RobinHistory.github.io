package showMeFlowers;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserInterface {
	JFrame userframe;
	JPanel userpanel;
	JButton[] choice=new JButton[3];
    public UserInterface() {
    	userframe=new JFrame("Show Me Flowers");
    	userframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	userframe.setLocation(400,100);
    	userframe.setSize(100,300);
    	userpanel=new JPanel();
    	userpanel.setLayout(new FlowLayout());
    	userframe.setLayout(new GridLayout(3,1));
    	String[] name= {"Accelerate","Stable","TestOnly"};
    	for(int i=0;i<3;i++) {
    		choice[i]=new JButton(name[i]);
    		choice[i].setSize(userframe.getWidth(), userframe.getHeight()/3);
    		userframe.add(choice[i]);
    	}
    	//userframe.add(userpanel);
    	userframe.setVisible(true);
    }
}
