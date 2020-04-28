package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.Entities.WareHouse;
import com.cap.demo.dao.WareHouseDao;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	WareHouseDao dao3;
	@Override
		public List<WareHouse> getALldis()
	{
		return dao3.getAllDis();
	}


	
	
	
	
	
}
