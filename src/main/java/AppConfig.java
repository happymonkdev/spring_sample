import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.app.repository.CustomerRepository;
import org.app.repository.HibernateCustomerRepositoryImpl;
import org.app.service.CustomerService;
import org.app.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "org.app" })
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/*
	 * @Bean(name = "customerService") public CustomerService getCustomerService() {
	 * 
	 * //CustomerServiceImpl service = new
	 * CustomerServiceImpl(getCustomerRepository());
	 * 
	 * 
	 * CustomerServiceImpl service = new CustomerServiceImpl();
	 * 
	 * return service; }
	 */

	/*
	 * @Bean(name = "customerRepository") public CustomerRepository
	 * getCustomerRepository() { return new HibernateCustomerRepositoryImpl(); }
	 */
}
