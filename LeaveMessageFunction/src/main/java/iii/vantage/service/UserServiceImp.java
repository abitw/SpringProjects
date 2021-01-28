package iii.vantage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iii.vantage.dao.UserRepository;
import iii.vantage.po.UserEntity;
import iii.vantage.vo.ApplyUserReq;
import iii.vantage.vo.ApplyUserResp;
import iii.vantage.vo.UserInfoModifyReq;
import iii.vantage.vo.UserInfoModifyResp;
import iii.vantage.vo.UserInfoResp;


@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public ApplyUserResp apply(ApplyUserReq req) {
		userRepository.save(setUserEntity(req));
		ApplyUserResp applyUserResp = new ApplyUserResp();
		applyUserResp.setSuccess(true);
		return applyUserResp;
	}


	@Override
	public UserInfoModifyResp infoModify(UserInfoModifyReq req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoResp getUserInfo(String userUid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * ApplyUserReq轉UserEntity
	 * 
	 * @param req
	 * @return
	 * */
	private UserEntity setUserEntity(ApplyUserReq req) {
		UserEntity userEntity = new UserEntity();
		//必要
		userEntity.setName(req.getName());
		userEntity.setMobilePhone(req.getMobilePhone());
		userEntity.setEmail(req.getEmail());
		userEntity.setPassword(req.getPassword());
		
		return userEntity;
	}
	
	
	
	
	
	
	
}
