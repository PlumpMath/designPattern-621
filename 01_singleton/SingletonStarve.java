//单例模式：饿汉模式（线程安全）
public class SingletonStarve{
	//限制产生多个对象
	private SingletonStarve(){}
	//创建类的唯一实例，使用private static final修饰
	private static final SingletonStarve instance = new SingletonStarve();
	//通过该方法获得实例对象，使用public static修饰
	public static SingletonStarve getInstance(){
		return instance;
	}
	//类中的其他的方法，尽量是static
	public static void doSomething(){}
}