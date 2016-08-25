//单例模式：懒汉模式(线程不安全)
public class SingletonIdle{
	private SingletonIdle(){}
	private static SingletonIdle instance = null;
	public static SingletonIdle getInstance(){
		if(instance == null){
			instance = new SingletonIdle();
		}
		return instance;
	}
}