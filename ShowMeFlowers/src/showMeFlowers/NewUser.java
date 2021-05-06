package showMeFlowers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
/**
 * @author  李渊
 */
public class NewUser {
	public UserInterface myui=new UserInterface();
	//Scanner sc= new Scanner(System.in);
	 ShowPicture shpi;  //图像展示
	 String post="JPG";//文件名后缀
	
	 FilenameFilter filter = new LogFilter(".*"+post);  //检索文件
	
	 String searchplace  //文件地址
	="C:\\Users\\www11\\Desktop\\ShowMeTheFlower\\pictures\\";
	 public NewUser(){
		 try {
			testfile();
			addEvent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	 }
	public void testfile() throws InterruptedException 
	{
		 System.out.println("Are you sure? 1 == Accelerate,2==Stable,3==TestOnly;Others==Cancel.");
		
	}
	private void addEvent() {
		// TODO Auto-generated method stub
		 myui.choice[0].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e1) {
					// TODO Auto-generated method stub
					myui.userframe.setVisible(false);
					System.out.println("jb1!!!");
					 Thread music=new Thread(new MusicPlayer());
					 music.start();
					 //music.join();
					 
					 //图片播放
				   shpi=new ShowPicture(
							 new File(searchplace),filter,"1");
					 Thread pic=new Thread(shpi);
					 pic.start();
					 try {
						pic.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					 
					 music.interrupt();
				 
				}
				 
			 });
			 
			 
			 myui.choice[1].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//myui.userframe.setVisible(false);
						 Thread music=new Thread(new MusicPlayer());
						 music.start();
						 //music.join();
						 
						 //图片播放
					   shpi=new ShowPicture(
								 new File(searchplace),filter,"2");
						 Thread pic=new Thread(shpi);
						 pic.start();
						 try {
							pic.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 
						 //播放结束 关闭音乐线程
						
						 music.interrupt();
				
					}
					 
				 });
			 
			 myui.choice[2].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						myui.userframe.setVisible(false);
						 Thread music=new Thread(new MusicPlayer());
						 music.start();
						 //music.join();
						 
						 //图片播放
					   shpi=new ShowPicture(
								 new File(searchplace),filter,"3");
						 Thread pic=new Thread(shpi);
						 pic.start();
						 try {
							pic.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 
						 //播放结束 关闭音乐线程
					
						 music.interrupt();
					 
					}
					 
				 });
			 
	}
	public static void main(String[] args) throws InterruptedException 
	{
		NewUser me=new NewUser();
		
	}
}
