package com.hee.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hee.restaurant.dao.RestaurantDAO;
import com.hee.restaurant.vo.RestaurantVO;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	public RestaurantDAO dao;

	@Override
	public List<RestaurantVO> getAllList() {
		List<RestaurantVO> list ;
		list = dao.getAllList();
		
		return list;
	}

	@Override
	public int pageCount() {
		
		return dao.pageCount();
	}

	@Override
	public RestaurantVO getRVO(String no) {
		
		return dao.getRVO(no);
	}
	
}
