package generic;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements ITestListener {
	private static final String SUMMARY_PATH = null;
	static int passCount=0,failCount=0;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passCount++;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failCount++;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	 	
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("pass"+passCount,true);
		Reporter.log("fail"+failCount,true);
		utility.writeResultToXL(SUMMARY_PATH,"sheet1", passCount, failCount);	
	}
}
