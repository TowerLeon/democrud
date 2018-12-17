package com.example.democrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class DemocrudApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemocrudApplication.class, args);
//	}
//}

/**
 *
 * Title: Application
 * Description:
 * springBoot 主程序
 * Version:1.0.0
 * @author pancm
 * @date 2018年1月5日
 */

@SpringBootApplication
@MapperScan("com.example.democrud.dao")
public class DemocrudApplication {
	public static void main(String[] args) {
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(DemocrudApplication.class, args);
		System.out.println("程序正在运行...");
	}
}