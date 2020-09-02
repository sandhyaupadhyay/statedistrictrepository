package com.pixels.searchpoAddress.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pixels.searchpoAddress.model.PostOfficeAddress;
import com.pixels.searchpoAddress.repository.SearchpoAddressRepo;

@RestController
public class SearchPOAddressController {
	@Autowired
	private SearchpoAddressRepo repo;

	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "Hello Everyone";
	}
	
	@GetMapping("/getOfficeDetail")
	public List<PostOfficeAddress> getAddress()
	{
		return repo.findAll();
	}
	@GetMapping("/getOffice/{officename}")
	public List<PostOfficeAddress> getOfficeadddress(@PathVariable String officename)
	{
		List<PostOfficeAddress> ls=repo.findByOfficeName(officename);
		return ls;
	}
}
