package com.enhui.debug;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class DebugApplication {
	public static void main(String[] args) {
		log.info("heh-debug: hello spring");
		var context = new ClassPathXmlApplicationContext("debug-xml.xml");
		Object person = context.getBean("person");

		log.info("heh-debug: obj: {}", person);
	}
}
