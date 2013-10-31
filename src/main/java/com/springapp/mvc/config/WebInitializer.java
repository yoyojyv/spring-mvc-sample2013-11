package com.springapp.mvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * http://static.springsource.org/spring-framework/docs/3.2.0.RELEASE/spring-framework-reference/html/mvc.html#mvc-container-config 참조
 * <p/>
 * servlet 3.0 부터 지원되는 놈. web.xml 파일이 없이도 자바로 설정이 가능함.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  /**
   * root config
   * @return
   */
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{ ModuleConfig.class };
    // return null;
  }

  /**
   * servlet config
   * @return
   */
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  /**
   * servlet mapping
   * @return
   */
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

  /**
   * servlet filter
   * @return
   */
  @Override
  protected Filter[] getServletFilters() {

    // character encoding filter
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding("UTF-8");

    return new Filter[] { characterEncodingFilter };
  }
}


// WebApplicationInitializer

