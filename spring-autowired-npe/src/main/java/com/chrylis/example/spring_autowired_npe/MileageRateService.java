package com.chrylis.example.spring_autowired_npe;

import org.springframework.stereotype.Service;

@Service
public class MileageRateService {
	public float ratePerMile() {
		return 0.565f;
	}
}
