package Maven.TestNgF;

import org.testng.annotations.Test;


public class DataProvidersss {
@org.testng.annotations.DataProvider(name="data")
public Object[][] name(){
	return new Object[][] {{"User1","pass1"}};
}

@Test(dataProvider="data")
public void test9(String x,String s) {
System.out.println(x+"value"+s);
}



}
