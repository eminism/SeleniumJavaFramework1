package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnGroups = {"sanity1"})
	public void test1() {
		System.out.println("I'm test1");
	}

	@Test (groups = {"sanity1"})
	public void test2() {
		System.out.println("i'm test2");

	}
	@Test
	public void test3() {
		System.out.println("i'm test3");

	}
}
