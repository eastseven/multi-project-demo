package cn.eastseven.dao;

/**
 * CRUD
 * @author eastseven
 *
 */
public interface FooDao {

	public void create(Object object);
	
	public Object read(Object id);
	
	public void update(Object object);
	
	public boolean delete(Object id);
}
