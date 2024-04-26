package HackerRank;

public class Can_You_Acess {

	
	public class Solution {

		public static void main(String[] args) throws Exception {
			DoNotTerminate.forbidExit();	

			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int num = Integer.parseInt(br.readLine().trim());
				Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

				//Write your code here
	System.out.println(num + " is " + ((Inner.Private) (o = new Inner().new Private())).powerof2(num));

			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
			
			}//end of try
			
			catch (DoNotTerminate.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			}
		}//end of main
		static class Inner{
			private class Private{
				private String powerof2(int num){
					return ((num&num-1)==0)?"power of 2":"not a power of 2";
				}
			}
		}//end of Inner
		
	}//end of Solution

	class DoNotTerminate { //This class prevents exit(0)
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
		

	

	/*
	 * (Inner.Private) here "Inner" is class present inside Soultion class after
	 * this Private is Another class inside Inner.
	 * 
	 * o = new Inner().new Private().powerof2(num)
	 * 
	 * new Inner() means creating new object of Inner class.
	 * 
	 * new Private() is creating new object of Private class.
	 * 
	 * powerof2 is method inside Private inner class.
	 * 
	 * Hope this will help you to
	 */
}
