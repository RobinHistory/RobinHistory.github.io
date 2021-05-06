package showMeFlowers;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author  李渊
 */
public class DirListerImpl implements DirLister{
	 public Picture pic= new Picture();
	 public void listDirectory(File path,FilenameFilter f ,String method) 
	throws InterruptedException  {
		
		 if(!path.exists())
		 {
			 System.out.println("NOT  Existed!");
		 }
		 else if(path.isFile())
		 {
			 System.out.println("Not a Path!");
		 }
		 else 
		 {
			 File[] files = path.listFiles(f);
			 //播放方式1
			 if(method.equals("1")) {
			int time=920;
			 for(int i=0;i<files.length;i++)
			 {
				
				 if(files[i].isFile())
				 {
					/* time=500-i*100;
					while(time<0)time+=500;
					if(i>85) time=93-i;*/
					 time=920-i*10;
					 if(time<0)time=0;
					 pic.showmetheflower(files[i].toString());
					 Thread.sleep(time);
					 System.out.println(files[i]);
				 }
			 }
			 }
			 
			 //播放方式2
			 else if(method.equals("2")){
				 for(int i=0;i<files.length;i++)
				 {
					
					 if(files[i].isFile())
					 {
						 pic.showmetheflower(files[i].toString());
						 if(i%10==1) {
							 Thread.sleep(1000);
						 }
						 else Thread.sleep(50);
						 System.out.println(files[i]);
					 }
				 } 
			 }
			 
			 //播放方式3
			 else if(method.equals("3")){
				 for(int i=0;i<files.length;i++)
				 {
					
					 if(files[i].isFile())
					 {
						 pic.showmetheflower(files[i].toString());
							 Thread.sleep(10);
						 System.out.println(files[i]);
					 }
				 } 
			 }
			 else;
		 }
		 
	 }


}
