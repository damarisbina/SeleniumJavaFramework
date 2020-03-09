package prioritydemo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("I am inside test2");
	}
	
	@Test(priority = 0)
	public void test3() {
		System.out.println("I am inside test3");
	}
}
