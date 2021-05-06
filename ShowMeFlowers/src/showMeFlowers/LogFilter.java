package showMeFlowers;
import java.io.*;
import java.util.regex.*;
/**
 * @author  ��Ԩ
 *LogFilter��ʵ��
 */
public class LogFilter implements FilenameFilter {

	private Pattern pattern;
	public LogFilter(String regex)
	{
		pattern=Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(new File(name).getName()).matches();
	}

}
