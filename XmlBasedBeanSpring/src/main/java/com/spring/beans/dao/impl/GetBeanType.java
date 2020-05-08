package com.spring.beans.dao.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.core.ResolvableType;

public class GetBeanType implements BeanFactory {

	public boolean containsBean(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getAliases(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBean(String arg0) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(Class<T> arg0) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(String arg0, Class<T> arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBean(String arg0, Object... arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(Class<T> arg0, Object... arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(ResolvableType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> getType(String arg0) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> getType(String arg0, boolean arg1)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPrototype(String arg0)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSingleton(String arg0)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTypeMatch(String arg0, ResolvableType arg1)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTypeMatch(String arg0, Class<?> arg1)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

}
