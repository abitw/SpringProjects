package iii.vantage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import iii.vantage.service.LeaveMsgService;
import iii.vantage.vo.MsgAddReq;
import iii.vantage.vo.MsgAddResp;

@RestController
@RequestMapping(value="/api/leaveMsg")
public class LeaveMsgController {

	@Autowired
	public LeaveMsgService leaveMsgService;
	
	@PostMapping(value="/msgAdd")
	public MsgAddResp msgAdd(@RequestBody MsgAddReq req) {
		return leaveMsgService.magAdd(req);
	} 
	
}
