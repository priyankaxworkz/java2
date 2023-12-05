package com.xworkz.passportrunner;

import java.util.Date;

import com.xworkz.passport.PassportAbstract;
import com.xworkz.passport.constant.Gender;
import com.xworkz.passport.constant.PaymentOption;
import com.xworkz.passportdto.PassportDto;
import com.xworkz.passportimpl.Passport;

public class PassportRunner {
	
	public static void main(String[] args) {
		
		PassportDto dto=new PassportDto();
		
		dto.setUserName("ccc");
		dto.setRegistrationDate(new Date());
		dto.setPermanentAddress("bytfytr");
		dto.setOfficeLocation("ban");
		dto.setEmail("ccc@gmail");
		dto.setDateOfBirth(new Date());
		dto.setCurrentAddress("bbbb");
		dto.setContactNumber(6785432121l);
		dto.setApplicationId(1);
		dto.setAge(21);
		dto.setGender("m");
		dto.setPaymentOption("online");
		
		PassportDto dto1=new PassportDto();
		dto1.setUserName("neha");
		dto1.setRegistrationDate(new Date());
		dto1.setPermanentAddress("bbb");
		dto1.setOfficeLocation("vid");
		dto1.setEmail("neha@gmail");
		dto1.setDateOfBirth(new Date());
		dto1.setCurrentAddress("bbbb");
		dto1.setContactNumber(6785432121l);
		dto1.setApplicationId(2);
		dto1.setAge(23);
		dto1.setGender("f");
		dto1.setPaymentOption("card");

		PassportDto dto2=new PassportDto();
		dto2.setUserName("vidya");
		dto2.setRegistrationDate(new Date());
		dto2.setPermanentAddress("bytfytr");
		dto2.setOfficeLocation("banglore");
		dto2.setEmail("vid@gmail");
		dto2.setDateOfBirth(new Date());
		dto2.setCurrentAddress("aaa");
		dto2.setContactNumber(8765432121l);
		dto2.setApplicationId(3);
		dto2.setAge(22);
		dto2.setGender(Gender.FEMALE.toString());
		dto2.setPaymentOption(PaymentOption.UPI.toString());
		
		System.out.println(dto2.toString());
		System.out.println(dto2.hashCode());
		System.out.println(dto.equals(dto2));
		
		
		 PassportAbstract  p=new Passport();
		 p.onSave(dto);
		p.onSave(dto1);
		 p.onSave(dto2);
		 
		p.read();
		p.searchByContactNumber(8765432121l);
		p.searchByCurrentAddress("aaa");
		
	System.out.println("update method...............");
	dto.setApplicationId(1);
	p.updateByApplicationId(4, dto);
	
	System.out.println("update by email.............");	
	dto2.setEmail("zzz@gmail");
	p.updateByEmail("vid@gmail", dto2);
		
	
	System.out.println("delete method..............");
	dto2.setApplicationId(3);
	p.deleteByApplicationId(3);
	//p.read();
	}

}
