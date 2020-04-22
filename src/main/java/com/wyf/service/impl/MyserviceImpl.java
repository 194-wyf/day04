package com.wyf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyf.mapper.MyMapper;
import com.wyf.service.Myservice;
@Service
public class MyserviceImpl implements Myservice {

	@Autowired
	private MyMapper dao;
	
}
