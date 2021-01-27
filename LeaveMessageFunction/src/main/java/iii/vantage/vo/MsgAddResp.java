package iii.vantage.vo;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MsgAddResp {
	
	@JsonProperty(value ="USER_NAMES")
	private String userName;
	
	@JsonProperty(value ="MSG_CONTENT")
	private String msgContent;
	
	@JsonProperty(value ="LEAVE_TIME")
	private Timestamp leaveTime;
}
