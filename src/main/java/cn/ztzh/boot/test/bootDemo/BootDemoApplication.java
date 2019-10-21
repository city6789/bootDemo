package cn.ztzh.boot.test.bootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication//(scanBasePackages = "cn")
//@EnableAutoConfiguration
@ComponentScan("cn.ztzh.boot.test.bootDemo.controller")
public class BootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

}
