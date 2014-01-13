package cn.eastseven.service;

import org.junit.Assert;
import org.junit.Test;

import cn.eastseven.service.impl.FooServiceImpl;

public class FooServiceTest {

	@Test
	public void testFoo() {
		FooService fooService = new FooServiceImpl();
		fooService.foo("EastSeven");
		Assert.assertTrue(true);
	}
}
