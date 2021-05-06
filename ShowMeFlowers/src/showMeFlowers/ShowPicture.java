package showMeFlowers;

import java.io.File;
import java.io.FilenameFilter;

public class ShowPicture implements Runnable {
	DirLister dLister;
	File path;
	FilenameFilter filter ;
	String method;
	ShowPicture(File p,FilenameFilter f ,String m)
	{
		dLister=new DirListerImpl();
		path=p;
		filter=f;
		method=m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			dLister.listDirectory(path, filter, method);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
