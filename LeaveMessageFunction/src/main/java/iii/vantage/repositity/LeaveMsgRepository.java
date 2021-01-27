package iii.vantage.repositity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LeaveMsgRepository extends JpaRepository<LeaveMsgEntity, Long> {

	@Query(value="select USER_NAMES, MSG_CONTENT from LEAVE_MSG where USER_NAMES = ?1")
	List<LeaveMsgEntity> findByUserName(String userName);
}
