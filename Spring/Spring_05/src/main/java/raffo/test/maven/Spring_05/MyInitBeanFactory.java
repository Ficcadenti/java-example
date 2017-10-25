package raffo.test.maven.Spring_05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import raffo.test.maven.Spring_05.bean.Punto;
import raffo.test.maven.Spring_05.bean.Triangolo;

public class MyInitBeanFactory implements BeanFactoryPostProcessor {

	public MyInitBeanFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		Class<? extends Object> c=beanFactory.getClass();
		System.out.println("Metodo postProcessBeanFactory : " + c);
		
		Triangolo tr4_modificato=(Triangolo) beanFactory.getBean("triangolo4",Triangolo.class);
		tr4_modificato.setTipo(tr4_modificato.getTipo()+" - Modificato in PostProcessor");
		Punto p=tr4_modificato.getP1();
		p.setX(1);
		p.setY(2);
		tr4_modificato.setP1(p);
	}

}
