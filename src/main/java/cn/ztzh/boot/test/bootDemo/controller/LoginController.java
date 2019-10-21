package cn.ztzh.boot.test.bootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller入口
 * @author heshiyang
 *
 */
@RestController
public class LoginController {
	//Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/hello")
    //@ResponseBody
	public  String mylogin() {
		return "Hello World";
	}
	
	
	/*
	 * @RequestMapping("/hello")
	 * 
	 * @ResponseBody public List<String> mylogin() { //log.info("登录状态：{ }",true);
	 * //return "我是第一个登录接口";
	 * 
	 * @SuppressWarnings("rawtypes") List list = new ArrayList(); list.add("a,");
	 * list.add("b,"); list.add("c,"); System.out.println(list); return list; }
	 */
}












