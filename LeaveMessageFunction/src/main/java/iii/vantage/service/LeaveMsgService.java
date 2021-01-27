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
	
	/**
	 * 搜尋單筆留言
	 * 
	 * @param req /w Long id
	 * @return
	 * */
	public MsgAddResp msgFindByUserName(MsgAddReq req);
}
