package com.chrylis.example.spring_autowired_npe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MileageFeeController {
	
	@Autowired
	private MileageFeeCalculator calc;
	
	@RequestMapping("/mileage/{miles}")
	@ResponseBody
	public float mileageFee(@PathVariable int miles) {
		return calc.mileageCharge(miles);
	}
}
