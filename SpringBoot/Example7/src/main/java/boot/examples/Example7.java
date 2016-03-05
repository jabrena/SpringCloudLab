package boot.examples;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import boot.examples.services.WeatherClient;
import hello.wsdl.GetCityForecastByZIPResponse;

@SpringBootApplication
public class Example7 {

    public static void main(String args[]) {
        SpringApplication.run(Example7.class);
    }

    /*
	@Bean
	CommandLineRunner lookup(WeatherClient weatherClient) {
		return args -> {
			String zipCode = "94304";

			if (args.length > 0) {
				zipCode = args[0];
			}
			GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
		};
	}
	*/
    
    /*
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }
 
    @Bean 
    public ReloadableResourceBundleMessageSource messageSource() { 
    	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource(); 
    	messageSource.setBasename("classpath:locale/messages"); 
    	messageSource.setCacheSeconds(3600); //refresh cache once per hour return messageSource;
    	return messageSource;
    }
    */
}

