package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

     @Override
     protected Class<?>[] getRootConfigClasses() {
    	 return new Class[] { };
    }

     @Override
     protected Class<?>[] getServletConfigClasses() {
          return new Class[] { JavaBasedConfiguration.class };
     }

     @Override
     protected String[] getServletMappings() {
    	   return new String[] { "/"};
     }
}
