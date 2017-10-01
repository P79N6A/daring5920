package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 项目启动入口
 * @author shenzucai
 * @time 2017.09.23 13:50
 */
//@EnableGemfireRepositories
@ImportResource({"classpath:spring/*.xml"})
@SpringBootApplication
public class Application {

	public static void main(String args[]){
		SpringApplication.run(Application.class,args);
	}
}
