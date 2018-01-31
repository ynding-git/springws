package com.ynding.service;

import org.springframework.stereotype.Service;

import com.ynding.entity.HolidayRequest;
import com.ynding.entity.HolidayResponse;

@Service
public class HumanResourceServiceImpl implements HumanResourceService {

	@Override
	public HolidayResponse bookHoliday(HolidayRequest request) {
		HolidayResponse response = new HolidayResponse();
		response.setName(request.getEmployee().getFirstName()+"_"+request.getEmployee().getLastName());
		response.setNumber((int)(100*Math.random()));
		return response;
	}

}
