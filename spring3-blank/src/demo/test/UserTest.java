/**
 * 2014年6月4日下午2:15:19
 * xingjia
 */
package demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.user.UserService;

/**
 * @author xingjia
 *
 */
public class UserTest {
	
	String path = "spring.xml";
	@Test
	public void test_01(){
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		UserService service = (UserService) context.getBean("userService");
		service.execute();
	}
}
