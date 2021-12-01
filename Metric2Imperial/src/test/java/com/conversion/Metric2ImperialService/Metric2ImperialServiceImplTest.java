package com.conversion.Metric2ImperialService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.conversion.Metric2Imperial.Service.Metric2ImperialService;
import com.conversion.Metric2Imperial.Service.Impl.Metric2ImperialServiceImpl;

@ExtendWith(MockitoExtension.class)
public class Metric2ImperialServiceImplTest {
	
	@InjectMocks
	private Metric2ImperialServiceImpl metric2ImperialServie;
	
	@BeforeAll
	static void setup()
	{
		MockitoAnnotations.openMocks(Metric2ImperialService.class);
	}
	
	@Test
	public void lengthServiceCheck()
	{
		Assertions.assertEquals(160.9344,metric2ImperialServie.getLengthConverter("kilometer", "mile", 100));
	}
	@Test
	public void volumeServiceCheck()
	{
		Assertions.assertEquals(45.4609,metric2ImperialServie.getVolumeConverter("litre", "gallon", 10));
	}

}
