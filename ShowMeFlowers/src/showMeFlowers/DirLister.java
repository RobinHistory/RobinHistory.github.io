package showMeFlowers;
import java.io.*;

/**
 * @author  ��Ԩ
 */
public interface DirLister {
 public void listDirectory(File path,FilenameFilter f,String method) throws InterruptedException;

}
