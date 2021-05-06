package showMeFlowers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Random;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicPlayer implements Runnable {
	FileInputStream fis;
	BufferedInputStream stream;
	Player player;
	MusicPlayer() {
		FilenameFilter filter=new LogFilter(".*"+"mp3");
		File path=new File("source/mp3/");
		File[] music=path.listFiles(filter);
	//	File file=new File(
	//			"C:\\Users\\www11\\Desktop\\ShowMeTheFlower\\music\\001.mp3");
	//	FileInputStream fis;
	//	BufferedInputStream stream;
	//	Player player;
		try {
			fis = new FileInputStream(music[new Random().nextInt(music.length)]);
		 stream=new BufferedInputStream(fis);
				player = new Player(stream);
			//player.play();
		} catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(JavaLayerException e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

/*	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
		File file=new File("D:\\��װ��\\001.mp3");
		FileInputStream fis=new FileInputStream(file);
		BufferedInputStream stream=new BufferedInputStream(fis);
		Player player=new Player(stream);
		player.play();
	}*/
}
