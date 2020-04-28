package com.cap.demo.service;

import java.util.List;

import com.cap.demo.Entities.RawMAterialOrderEntity;
import com.cap.demo.Entities.RawMaterialSpecs;

public interface DadServiceI {

	RawMAterialOrderEntity orderCreation(RawMAterialOrderEntity raw, RawMaterialSpecs spec);

	List<RawMAterialOrderEntity> getAllOrders(int uid);

	Object trackOrder(int orderid);

}
