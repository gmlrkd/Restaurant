package com.hee.restaurant.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hee.restaurant.vo.RestaurantVO;

@Repository
public class RestaurantDAOImpl implements RestaurantDAO {

	@Autowired
	public SqlSession session;

	@Override
	public List<RestaurantVO> getAllList() {
		return session.selectList("getAllList");
	}

	@Override
	public int pageCount() {
		// TODO Auto-generated method stub
		return session.selectOne("pageCount");
	}

	@Override
	public RestaurantVO getRVO(String no) {
		// TODO Auto-generated method stub
		return session.selectOne("getRVO",no);
	}

}
