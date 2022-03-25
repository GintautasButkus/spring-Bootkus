package lt.vtmc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		ServiceA serviceA = (ServiceA) context.getBean("serviceABean");
		ServiceB serviceB = (ServiceB) context.getBean("serviceBBean");
		ServiceC serviceC = (ServiceC) context.getBean("serviceCBean");

		serviceA.setMessage("Message");
		System.out.println(serviceB.getResult());
		System.out.println(serviceC.getResult());

		((ConfigurableApplicationContext) context).close();

	}
}
