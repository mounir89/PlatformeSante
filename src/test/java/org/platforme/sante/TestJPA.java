package org.platforme.sante;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {

	@Test
	public void test1() {
		try {
			ClassPathXmlApplicationContext app=
			new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}

}
