package it.raffo.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
@ComponentScan(basePackages="it.raffo.springmvc")
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter
{


	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean  
	public ViewResolver xmlViewResolver() {  
		XmlViewResolver resolver = new XmlViewResolver();

		Resource resource = new ClassPathResource("view.xml");  
		resolver.setLocation(resource);

		return resolver;  
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver res=new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		res.setExposeContextBeansAsAttributes(true);
		return res;
	}
	
	
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver createMultipartResolver()
	{
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		resolver.setMaxUploadSize(9341391);
		return resolver;
	}

}
