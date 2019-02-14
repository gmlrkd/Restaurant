package com.hee.restaurant.service;

import java.util.List;

import com.hee.restaurant.vo.RestaurantVO;

public interface RestaurantService {
	
	public List<RestaurantVO> getAllList();
	
	public int pageCount();
	
	public RestaurantVO getRVO(String no);
}
