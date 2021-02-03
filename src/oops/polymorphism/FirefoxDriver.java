package oops.polymorphism;

public class FirefoxDriver extends SuperBrowser {
	public void get() {
		System.out.println("Firefox get method");
	}
	public void findElement() {
		System.out.println("Firefox fuind element");
	}
public void close() {
	System.out.println("Firefox close method");
}
}
