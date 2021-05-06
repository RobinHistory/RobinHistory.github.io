package showMeFlowers;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
/**
 * @author  ��Ԩ
 */
public class User {
	//public UserInterface myui=new UserInterface();
	Scanner sc= new Scanner(System.in);
	 ShowPicture shpi;  //ͼ��չʾ
	 String post="JPG";//�ļ�����׺
	 
	 FilenameFilter filter = new LogFilter(".*"+post);  //�����ļ�
	// System.out.println("Enter the fileplace you wanna find in.");
	 String searchplace  //�ļ���ַ
		//="C:\\Users\\www11\\Desktop\\1\\";
	="source/pictures/";
	public void testfile() throws InterruptedException 
	{
		
		
		// String post="JPG";//�ļ�����׺
		 //String post=sc.next();
		 
		 //FilenameFilter filter = new LogFilter(".*"+post);  //�����ļ�
		// System.out.println("Enter the fileplace you wanna find in.");
		 //String searchplace  //�ļ���ַ
		//="C:\\Users\\www11\\Desktop\\ShowMeTheFlower\\pictures\\";
		// ="C:\\Users\\www11\\Desktop\\shE\\";
		 //=sc.next();
		 System.out.println("Are you sure? 1 == Accelerate,2==Stable,3==TestOnly;Others==Cancel.");
		 String sure=sc.next(); //��ʽ
		
		 
		 if(sure.equals("1")||sure.equals("2")||sure.equals("3")) {
			
			 //���ֲ���
			 Thread music=new Thread(new MusicPlayer());
			 music.start();
			 //music.join();
			 
			 //ͼƬ����
		   shpi=new ShowPicture(
					 new File(searchplace),filter,sure);
			 Thread pic=new Thread(shpi);
			 pic.start();
			 pic.join();
			 
			 //���Ž��� �ر������߳�
			// music.sleep(50);
			//music.yield();
			 music.interrupt();
		    // music.stop();
		 }
		 else  System.out.println("Cancel");
	}
public static void main(String[] args) throws InterruptedException 
	{
		User me=new User();
		while(true) {
		me.testfile();
		}
		
	}
}
