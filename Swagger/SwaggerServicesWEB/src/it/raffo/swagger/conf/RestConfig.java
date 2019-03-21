package it.raffo.swagger.conf;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.SwaggerConfigLocator;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.BaseApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import it.raffo.swagger.rest.SwaggerServices;

@ApplicationPath("/rest")
public class RestConfig extends Application
{

	private static final String	SWAGGER_REST_SERVICE_VERSION		= "1.0.2";
	private static final String	SWAGGER_REST_SERVICE_TITLE			= "API REST AppDoganeServices";
	private static final String	SWAGGER_REST_SERVICE_HOST			= "localhost:8080";
	private static final String	SWAGGER_REST_SERVICE_BASE_PATH		= "/SwaggerServicesWEB/rest";
	private static final String	SWAGGER_REST_SERVICE_RESOURCE_PACK	= "it.raffo.swagger.rest";

	public RestConfig()
	{
		this.forceRescan();

		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion(RestConfig.SWAGGER_REST_SERVICE_VERSION);
		beanConfig.setTitle(RestConfig.SWAGGER_REST_SERVICE_TITLE);
		beanConfig.setHost(RestConfig.SWAGGER_REST_SERVICE_HOST);
		beanConfig.setBasePath(RestConfig.SWAGGER_REST_SERVICE_BASE_PATH);
		beanConfig.setResourcePackage(RestConfig.SWAGGER_REST_SERVICE_RESOURCE_PACK);
		beanConfig.setScan(true);
	}

	private void forceRescan()
	{
		// Per forzare il rebuild di Swagger
		SwaggerConfigLocator l = SwaggerConfigLocator.getInstance();
		Field f;
		try
		{
			f = l.getClass().getDeclaredField("swaggerMap");
			f.setAccessible(true);
			((Map<?, ?>) f.get(l)).clear();

			f = BaseApiListingResource.class.getDeclaredField("initialized");
			f.setAccessible(true);
			f.set(null, false);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public Set<Class<?>> getClasses()
	{

		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(SwaggerServices.class);
		classes.add(ApiListingResource.class);
		classes.add(SwaggerSerializers.class);
		return classes;
	}
}
