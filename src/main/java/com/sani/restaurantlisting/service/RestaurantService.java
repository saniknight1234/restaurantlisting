package com.sani.restaurantlisting.service;

import com.sani.restaurantlisting.dto.RestaurantDTO;
import com.sani.restaurantlisting.entity.Restaurant;
import com.sani.restaurantlisting.entity.mapper.RestaurantMapper;
import com.sani.restaurantlisting.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {

        //find all list from database to store it in restaurants
        List<Restaurant> restaurants = restaurantRepo.findAll();
        //map entity to list of dto
       List<RestaurantDTO> restaurantDTOList = restaurants.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
       return null;
    }
}
