package Maven.TestNgF;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		
		int a=0;
		int count=3;
		if(a<count) {
			a++;
			return true;
		}
		return false;
	}

}
