package config;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.util.UrlPathHelper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="controller,model,dao,service")
public class JavaBasedConfiguration extends WebMvcConfigurerAdapter {
	

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {

		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;

    }
	//MatrixVariable Icin
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
	       UrlPathHelper urlPathHelper = new UrlPathHelper();
	       urlPathHelper.setRemoveSemicolonContent(false);

	       configurer.setUrlPathHelper(urlPathHelper);
	    }
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
		source.setBasename("/WEB-INF/messages/springMessages");
		source.setUseCodeAsDefaultMessage(true);
		source.setDefaultEncoding("UTF-8");
		return source;
			
		
	}
	
	//Url @ModelAttributen dolayi bilgiler goruntulenir. URL Gormemek icin
	
	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	
	
	@PostConstruct
	public void init() {
		requestMappingHandlerAdapter.setIgnoreDefaultModelOnRedirect(true);
	}
	//Static Resources 
	//xml karsiligi 
	//<mvc:resources mapping="/resources/**" location="resources/"/>
	
	   @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("resources/images/");
	  }
	   
	  
}
