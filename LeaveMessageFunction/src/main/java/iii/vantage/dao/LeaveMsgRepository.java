package iii.vantage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import iii.vantage.po.LeaveMsgEntity;

public interface LeaveMsgRepository extends JpaRepository<LeaveMsgEntity, Long> {
	
}
