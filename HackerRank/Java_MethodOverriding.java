package HackerRank;

public class Java_MethodOverriding {

	class Sports{

	    String getName(){
	        return "Generic Sports";
	    }
	  
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in " + getName() );
	    }
	}

	class Soccer extends Sports{
	    @Override
	    String getName(){
	        return "Soccer Class";
	    }
	 
	    // Write your overridden getNumberOfTeamMembers method here
	    void getNumberOfTeamMembers() {
	        System.out.println("Each team has 11 players in " +getName());
	    }

	}
}

/*
 * When a subclass inherits from a superclass, it also inherits its methods;
 * however, it can also override the superclass methods (as well as declare and
 * implement new ones). Consider the following Sports class:
 * 
 * class Sports{ String getName(){ return "Generic Sports"; } void
 * getNumberOfTeamMembers(){ System.out.println( "Each team has n players in " +
 * getName() ); } } Next, we create a Soccer class that inherits from the Sports
 * class. We can override the getName method and return a different,
 * subclass-specific string:
 * 
 * class Soccer extends Sports{
 * 
 * @Override String getName(){ return "Soccer Class"; } } Note: When overriding
 * a method, you should precede it with the @Override annotation. The
 * parameter(s) and return type of an overridden method must be exactly the same
 * as those of the method inherited from the supertype.
 *
 * 
 * 
 * 
 * 
 * When executed, your completed code should print the following:
 * 
 * Generic Sports Each team has n players in Generic Sports Soccer Class Each
 * team has 11 players in Soccer Class
 * 
 */
