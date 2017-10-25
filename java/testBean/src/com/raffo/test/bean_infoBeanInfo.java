package com.raffo.test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class bean_infoBeanInfo extends SimpleBeanInfo
{
	private static final Class<bean_info> beanClass = bean_info.class;
	
	public PropertyDescriptor[] getPropertyDescriptors() {
		try {
			PropertyDescriptor email = new PropertyDescriptor("email", beanClass,	"getEmail", null);


			PropertyDescriptor properties[]	= {email};
			return properties;
		} 
		catch (IntrospectionException e) 
		{
			throw new Error(e.toString());
		}
	}
}
