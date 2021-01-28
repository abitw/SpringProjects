package iii.vantage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import iii.vantage.po.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
