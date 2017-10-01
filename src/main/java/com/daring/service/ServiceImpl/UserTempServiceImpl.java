package com.daring.service.ServiceImpl;

import com.daring.mapper.UserTempMapper;
import com.daring.model.user.UserTemp;
import com.daring.service.UserTempService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shenzucai
 * @time 2017.09.26 23:06
 */
@Service
public class UserTempServiceImpl implements UserTempService{

	@Autowired
	private UserTempMapper userTempMapper;


	@Override
	public int deleteByPrimaryKey(Object o) {
		return 0;
	}

	@Override
	public int delete(UserTemp userTemp) {
		return 0;
	}

	@Override
	public int insert(UserTemp userTemp) {
		return 0;
	}

	@Override
	public int insertSelective(UserTemp userTemp) {
		return 0;
	}

	@Override
	public boolean existsWithPrimaryKey(Object o) {
		return false;
	}

	@Override
	public List<UserTemp> selectAll() {
		return userTempMapper.selectAll();
	}

	@Override
	public UserTemp selectByPrimaryKey(Object o) {
		return null;
	}

	@Override
	public int selectCount(UserTemp userTemp) {
		return 0;
	}

	@Override
	public List<UserTemp> select(UserTemp userTemp) {
		return userTempMapper.select(userTemp);
	}

	@Override
	public UserTemp selectOne(UserTemp userTemp) {
		return null;
	}

	@Override
	public int updateByPrimaryKey(UserTemp userTemp) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(UserTemp userTemp) {
		return 0;
	}

	@Override
	public int deleteByExample(Object o) {
		return 0;
	}

	@Override
	public List<UserTemp> selectByExample(Object o) {
		return null;
	}

	@Override
	public int selectCountByExample(Object o) {
		return 0;
	}

	@Override
	public int updateByExample(UserTemp userTemp, Object o) {
		return 0;
	}

	@Override
	public int updateByExampleSelective(UserTemp userTemp, Object o) {
		return 0;
	}

	@Override
	public List<UserTemp> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
		return null;
	}

	@Override
	public List<UserTemp> selectByRowBounds(UserTemp userTemp, RowBounds rowBounds) {
		return null;
	}
}
