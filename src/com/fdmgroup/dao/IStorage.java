package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.dao.IStorage;
import com.fdmgroup.model.IStorable;

public interface IStorage<T extends IStorable> {
	public T create(T t);
	public List<T> findAll();
}
