package com.juli.controller;

import com.juli.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/1.
 */
@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
