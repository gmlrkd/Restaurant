package com.hee.restaurant.dao;

import java.util.List;

import com.hee.restaurant.vo.RestaurantVO;

public interface RestaurantDAO {
	
	public List<RestaurantVO> getAllList();

	public int pageCount();
	
	public RestaurantVO getRVO(String no);
}
