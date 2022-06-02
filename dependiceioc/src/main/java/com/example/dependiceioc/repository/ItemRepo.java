package com.example.dependiceioc.repository;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<AbstractReadWriteAccess.Item, Integer> {

}
