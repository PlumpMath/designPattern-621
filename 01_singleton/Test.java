public class Test{
	public static void main(String[] args){
		SingletonStarve s1 = SingletonStarve.getInstance();
		SingletonStarve s2 = SingletonStarve.getInstance();
		if(s1 == s2)
		System.out.println("s1 == s2");

		SingletonIdle s3 = SingletonIdle.getInstance();
		SingletonIdle s4 = SingletonIdle.getInstance();
		if(s3 == s4)
		System.out.println("s3 == s4");
	}
}
