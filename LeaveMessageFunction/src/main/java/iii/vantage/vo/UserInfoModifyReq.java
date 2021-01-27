package iii.vantage.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserInfoModifyReq {

	@JsonProperty(value = "NAME")
	private String name;

	@JsonProperty(value = "MOBILE_PHONE")
	private String mobilePhone;

	@JsonProperty(value = "EMAIL")
	private String email;

	@JsonProperty(value = "PASSWORD")
	private String password;
	
}
