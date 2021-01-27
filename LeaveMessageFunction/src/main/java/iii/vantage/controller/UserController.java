package iii.vantage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import iii.vantage.service.UserService;
import iii.vantage.vo.ApplyUserReq;
import iii.vantage.vo.ApplyUserResp;
import iii.vantage.vo.UserInfoModifyReq;
import iii.vantage.vo.UserInfoModifyResp;
import iii.vantage.vo.UserInfoResp;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/apply")
	public ApplyUserResp apply(@RequestBody ApplyUserReq req) {
		return userService.apply(req);
	}

	@PostMapping(path = "/infoModify")
	public UserInfoModifyResp infoModify(UserInfoModifyReq req) {
		return userService.infoModify(req);
	}

	@GetMapping(path = "/info")
	public UserInfoResp getUserInfo(@RequestParam String userUid) {
		return userService.getUserInfo(userUid);
	}

}
