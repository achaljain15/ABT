package oops.polymorphism;

public class ChromeDriver extends SuperBrowser{
	public void get() {
		System.out.println("Chrome get method");
	}
	public void findElement() {
		System.out.println("Chrome find element");
	}
public void close() {
	System.out.println("Chrome close method");
}
}
