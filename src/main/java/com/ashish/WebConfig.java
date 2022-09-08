package com.ashish;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//This is for Web.xml...................

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
	}
	
}
