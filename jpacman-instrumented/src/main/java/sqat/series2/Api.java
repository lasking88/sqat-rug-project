package sqat.series2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Api {
	private static PrintWriter methodCov;
	private static PrintWriter lineCov;
	
	public static void hit(String className, String methodName) {
		if (methodCov == null) {
			try {
				methodCov = new PrintWriter("method_coverage.csv");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		methodCov.printf("\"%s\",\"%s\"\n", className, methodName);
		methodCov.flush();
	}
	
	public static void hit(String className, String methodName, String line) {
		if (lineCov == null) {
			try {
				lineCov = new PrintWriter("line_coverage.csv");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		lineCov.printf("\"%s\",\"%s\",\"%s\"\n", className, methodName, line);
		lineCov.flush();
	}
}