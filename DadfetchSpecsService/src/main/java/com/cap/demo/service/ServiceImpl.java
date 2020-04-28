package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.Entities.RawMaterialSpecs;
import com.cap.demo.dao.RawMaterialSpecsDao;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	RawMaterialSpecsDao dao2;

	@Override
	public List<RawMaterialSpecs> getallSpecs()
	{
		return dao2.getAllSpecs();
	}
	
	@Override
	public RawMaterialSpecs getSpec(int rmsid)
	{
		return dao2.getByid(rmsid);
	}
	
}
