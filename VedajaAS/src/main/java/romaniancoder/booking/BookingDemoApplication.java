package romaniancoder.booking;

import org.apache.catalina.filters.CorsFilter;
import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
=======
>>>>>>> parent of 8e477e3... poolik google erroriga

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJSONDoc
public class BookingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingDemoApplication.class, args);
	}
	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("OPTIONS");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter();
    }
}
