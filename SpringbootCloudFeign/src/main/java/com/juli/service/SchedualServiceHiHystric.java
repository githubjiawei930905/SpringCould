package com.juli.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/3/4.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
		return "sorry "+name;
	}
}
