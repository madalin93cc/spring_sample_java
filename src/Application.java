import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerService service = new CustomerServiceImpl();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		
		System.out.println(service);
		
		CustomerService service2 = context.getBean("customerService", CustomerService.class);
		
		System.out.println(service2);
		System.out.println(service2.findAll().get(0).getFirstName());
		
	}

}
