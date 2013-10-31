package com.springapp.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 웹쪽 설정이 아닌 공통으로 쓰일수 있는 부분의 설정
 */
@Configuration
@ImportResource("classpath:config/business-config.xml")
public class ModuleConfig {
}
