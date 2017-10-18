package raffo.test.maven.Spring_05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import raffo.test.maven.Spring_05.bean.Punto;
import raffo.test.maven.Spring_05.bean.Triangolo;

public class MyInitBean implements BeanPostProcessor {

	public MyInitBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		Class<? extends Object> c=bean.getClass();
		if(c==Triangolo.class)
		{
			System.out.println("AfterInitialization ("+beanName+") : " + bean.getClass());
		}
		else if(c==Punto.class)
		{
			System.out.println("AfterInitialization ("+beanName+") : " + bean.getClass());
		}
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		Class<? extends Object> c=bean.getClass();
		if(c==Triangolo.class)
		{
			System.out.println("BeforeInitialization ("+beanName+"): " + bean.getClass());
		}
		else if(c==Punto.class)
		{
			System.out.println("AfterInitialization  ("+beanName+"): " + bean.getClass());
		}
		return bean;
	}

}
