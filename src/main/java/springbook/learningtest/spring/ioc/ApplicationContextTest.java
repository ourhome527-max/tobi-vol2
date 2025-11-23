package springbook.learningtest.spring.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.context.support.StaticApplicationContext;

import springbook.learningtest.spring.ioc.bean.Hello;

public class ApplicationContextTest {

	@Test
	public void regsiterBean() {
		StaticApplicationContext ac = new StaticApplicationContext(); // IOC 컨테이너 생성
		ac.registerSingleton("hello1", Hello.class); // Hello 클래스를 hello1 이라는 이름의 싱클톤 빈으로 컨테이너에 등록

		Hello hello1 = ac.getBean("hello1", Hello.class);
		assertThat(hello1, is(notNullValue()));
	}
}
