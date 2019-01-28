package tomo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import tomo.config.factory.ServiceFactory;

@Component
@Configuration
public class ContextLoader {
	private static ApplicationContext context;
	
	static{
		try {
			if( context == null ) {
				context = new AnnotationConfigApplicationContext(ServiceFactory.class);
			}
			
			printContextLoadBean();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ApplicationContext getContext() {
		if(context == null ) {
			System.out.println("AnnotationConfigApplicationContext is null!!!!!");
			System.out.println("AnnotationConfigApplicationContext is null!!!!!");
		}
		
		return context;
	}
	
	private static void printContextLoadBean() {
		
		if(context != null ) {
			//로드된 Bean 객체 이름 찍어보기
			
			System.out.println("Print loaded bean object list--------------");
			
			String[] names = context.getBeanDefinitionNames();
			if( names != null ) {
				for( String name : names ){
					System.out.println("bean name = "+name);
				}
			}
			System.out.println("--------------------------------------------");
		}
	}
	
	public static Object getBean(String beanName) {
		ApplicationContext context = getContext();
		return (context == null) ? null : context.getBean(beanName);
	}
}
