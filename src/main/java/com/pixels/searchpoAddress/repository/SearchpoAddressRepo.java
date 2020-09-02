package com.pixels.searchpoAddress.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.pixels.searchpoAddress.model.PostOfficeAddress;

@Repository
public interface SearchpoAddressRepo extends MongoRepository<PostOfficeAddress, String> {

	@Query("{ 'officename':{$regex:?0,$options:'i'}}")
	public List<PostOfficeAddress> findByOfficeName(String officename);
	
}
