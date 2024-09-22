package com.Rakesh.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Rakesh.model.SdfcBank;
@Repository
public interface SdfcBankRepo extends CrudRepository<SdfcBank, Integer> 
{

}
