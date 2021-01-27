package iii.vantage.service;

import iii.vantage.vo.MsgAddReq;
import iii.vantage.vo.MsgAddResp;

public interface LeaveMsgService {
	/**
	 * 新增留言
	 * 
	 * @param req
	 * @return
	 * */
	public MsgAddResp magAdd(MsgAddReq req);
	
}
