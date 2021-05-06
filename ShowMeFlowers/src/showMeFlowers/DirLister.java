package showMeFlowers;
import java.io.*;

/**
 * @author  ภ๎ิจ
 */
public interface DirLister {
 public void listDirectory(File path,FilenameFilter f,String method) throws InterruptedException;

}
