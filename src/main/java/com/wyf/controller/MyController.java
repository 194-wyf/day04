package com.wyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyf.service.Myservice;
/**
 * 
    * @ClassName: MyController
    * @Description: TODO(控制层，连接页面)
    * @author :王一帆
    * @date 2020年4月22日
    *
 */
@Controller
public class MyController {

	@Autowired
	private Myservice ms;
	
	@RequestMapping("show")
	public String show() {
		return "index";
	}
	
	
}
