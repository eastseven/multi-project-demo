package cn.eastseven.dao.impl;

import org.apache.log4j.Logger;

import cn.eastseven.dao.FooDao;

public class FooDaoImpl implements FooDao {

	private final Logger log = Logger.getLogger(this.getClass());
	
	public void create(Object object) {
		log.info("create object: " + object);
		
	}

	public Object read(Object id) {
		log.info("read object by id: " + id);
		return null;
	}

	public void update(Object object) {
		log.info("update object: " + object);
	}

	public boolean delete(Object id) {
		log.info("delete object by id: " + id);
		return false;
	}

}
