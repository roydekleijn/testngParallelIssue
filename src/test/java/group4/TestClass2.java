package group4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = "group1")
public class TestClass2 {

	@BeforeClass(alwaysRun = true)
	public void setup() {
		System.out.println("Before group 4 | class 2 | thread: " + Thread.currentThread().getId());
	}

	public void test1() {
		System.out.println("Group 1 | Class 2 | test 1 | thread: " + Thread.currentThread().getId());
	}

	public void test2() {
		System.out.println("Group 1 | Class 2 | test 2 | thread: " + Thread.currentThread().getId());
	}

}
