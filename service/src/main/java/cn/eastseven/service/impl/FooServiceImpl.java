package cn.eastseven.service.impl;

import org.apache.log4j.Logger;

import cn.eastseven.dao.FooDao;
import cn.eastseven.dao.impl.FooDaoImpl;
import cn.eastseven.service.FooService;

public class FooServiceImpl implements FooService {

	private final Logger log = Logger.getLogger(this.getClass());
	
	private FooDao fooDao = null;
	
	public FooServiceImpl() {
		this.fooDao = new FooDaoImpl();
	}
	
	public void foo(Object obj) {
		log.info("foo service: ");

		String object = "FooObject";
		fooDao.create(object);
		fooDao.read("foo");
		fooDao.update(object);
		fooDao.delete("foo");
		
	}

}
