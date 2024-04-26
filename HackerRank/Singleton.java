package HackerRank;

public class Singleton {
	
	    public String str;
	    private Singleton(){ }
	    static Singleton getSingleInstance(){return new Singleton();}
	
}
