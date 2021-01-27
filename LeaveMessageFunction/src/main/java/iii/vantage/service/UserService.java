package iii.vantage.service;

import iii.vantage.vo.ApplyUserReq;
import iii.vantage.vo.ApplyUserResp;
import iii.vantage.vo.UserInfoModifyReq;
import iii.vantage.vo.UserInfoModifyResp;
import iii.vantage.vo.UserInfoResp;

public interface UserService {
	/**
	 * 申請會員
	 * 
	 * @param req
	 * @return
	 */
	public ApplyUserResp apply(ApplyUserReq req);
	
	/**
	 * 修改會員資料
	 * 
	 * @param req
	 * @return
	 */
	public UserInfoModifyResp infoModify(UserInfoModifyReq req);
	
	/**
	 * 用ID取得會員資料
	 * 
	 * @param memberUid
	 * @return
	 */
	public UserInfoResp getUserInfo(String userUid);
	
	
	
}
