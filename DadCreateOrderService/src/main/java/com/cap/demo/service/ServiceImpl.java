package com.cap.demo.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.Entities.RawMAterialOrderEntity;
import com.cap.demo.Entities.RawMaterialSpecs;
import com.cap.demo.dao.RawMAterialOrderDAO;

@Service
public class ServiceImpl implements DadServiceI{
	@Autowired
RawMAterialOrderDAO dao;
	
    @Override
	public List<RawMAterialOrderEntity> getAllOrders(int uid)
	{
		return dao.getAllOrders(uid);
	}
    @Override
	public RawMAterialOrderEntity orderCreation(RawMAterialOrderEntity raw,RawMaterialSpecs spec) {
		// TODO Auto-generated method stub
		//calculating total price
		int quan=raw.getQuanvalue();
	    
		int unitprice=spec.getPrice_p_u();
		raw.setTotalprice(unitprice*quan);
		
		Date dateofOrder=new Date();
		java.sql.Date dateOfOrder1=new java.sql.Date(dateofOrder.getTime());
		raw.setDateoford(dateOfOrder1);
		//aa
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofOrder);
		cal.add(Calendar.DATE, 4);
		Date modifiedDate = cal.getTime();
		
		//Date dateofdel=obean.getDateofdel();
		java.sql.Date dateOfdel=new java.sql.Date(modifiedDate.getTime());
		raw.setDateofdel(dateOfdel);
		raw.setName(spec.getRmname());
		raw.setDeliveryStus("Not dis");
		return dao.save(raw);
	}
	
	@Override
	public Object trackOrder(int orderid)
	{
		return dao.trackOrder(orderid);
	}
	
}
