package com.cap.demo.service;

import java.util.List;

import com.cap.demo.Entities.RawMaterialSpecs;

public interface ServiceI {

	List<RawMaterialSpecs> getallSpecs();

	RawMaterialSpecs getSpec(int rmsid);

	void putData(RawMaterialSpecs r);

}
