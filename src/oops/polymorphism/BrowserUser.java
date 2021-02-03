package oops.polymorphism;

public class BrowserUser {

	public static void main(String args[]) {
		SuperBrowser dr= null;
		String browser="Chrome";
		
		if(browser.equals("Chrome"))
			dr=new ChromeDriver();		
		else if(browser.equals("Firefox"))
			dr=new FirefoxDriver();
		else if(browser.equals("Edge"))
			dr=new EdgeDriver();
	dr.get();
	dr.findElement();
	dr.close();
}
}
