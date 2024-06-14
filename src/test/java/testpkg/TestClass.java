package testpkg;

import org.testng.annotations.Test;

import basepkg.InitialClass;
import pagepkg.Login;
import utilpkg.ExcelClass;

public class TestClass extends InitialClass{

	
	@Test
	public void loginverify() throws Exception
	
	{
		pagepkg.Login l1 = new Login(driver);
		String y = "D:\\SOFTWARE TESTING\\Docs Tasks\\LoginBook.xlsx";
		String Sheet = "Sheet1";
		int rowcount = ExcelClass.GetRowCount(y, Sheet);
		
		for (int i=1;i<=rowcount;i++)
		{
			String email = ExcelClass.GetCellValues(y, Sheet, i, 0);
			System.out.println("The mailid is " +email);
			String password = ExcelClass.GetCellValues(y, Sheet, i, 1);
			System.out.println("The password is " +password);
			l1.initiallogin();
			l1.setvalues(email, password);
			l1.finallogin();
			
		}
		
		
	}
	
}
