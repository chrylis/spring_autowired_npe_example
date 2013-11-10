package com.chrylis.example.spring_autowired_npe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MileageFeeCalculator {
	
	@Autowired
	private MileageRateService rateService;

	public float mileageCharge(final int miles) {
		return (miles * rateService.ratePerMile());
	}
}
