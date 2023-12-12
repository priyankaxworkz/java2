package com.xworkz.account.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AccountDto {
	
	private String bankName;
	private String emailId;
	private long contactNumber;
	private long accountNumber;
	private String address;
	private String branchCode;

}
