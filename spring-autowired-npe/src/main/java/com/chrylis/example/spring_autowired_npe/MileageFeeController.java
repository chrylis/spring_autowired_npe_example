package com.chrylis.example.spring_autowired_npe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MileageFeeController {	
	@RequestMapping("/mileage/{miles}")
	@ResponseBody
	public float mileageFee(@PathVariable int miles) {
		MileageFeeCalculator calc = new MileageFeeCalculator();
		return calc.mileageCharge(miles);
	}
}
