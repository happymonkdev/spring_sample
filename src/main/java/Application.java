import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.app.service.CustomerService;

public class Application {
	public static void main(String[] args) {
		/*
		 * CustomerService customerService = new CustomerServiceImpl();
		 * System.out.println(customerService.findAll().get(0).getFirstName());
		 */
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
		CustomerService service1 = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service1.findAll().get(0).getFirstName());
		System.out.println(service);
		System.out.println(service1);
		
	}
}
