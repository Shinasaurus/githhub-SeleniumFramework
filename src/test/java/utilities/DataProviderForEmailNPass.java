package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderForEmailNPass {

	@DataProvider// (name="loginCreds")
	public static Object[][] testData(){
		
		return new Object[][]
				{
			{"yokoiscool@gmail.com", "Julia009"}				
		};
		
	}

}
