package by.it.yanush.belh2017.lessons.les14.dao;

//универсальный 
public interface DaoInterface <T>{ 
	
	public abstract void insert(T ob);
	
	public abstract void delete(int id);
	
	public abstract void update(T ob);
	
	public abstract T get(int id);

}

