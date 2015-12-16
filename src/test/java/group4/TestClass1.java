package group4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = "group4")
public class TestClass1 {

	@BeforeClass(alwaysRun = true)
	public void setup() {
		System.out.println("Before group 4 | class 1 | thread: " + Thread.currentThread().getId());
	}

	public void test1() {
		System.out.println("Group 4 | Class 1 | test 1 | thread: " + Thread.currentThread().getId());
	}

	public void test2() {
		System.out.println("Group 4 | Class 1 | test 2 | thread: " + Thread.currentThread().getId());
	}

}
