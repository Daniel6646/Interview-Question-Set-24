package javatpoint_string_programs;

public class RemoveWhitespace {

    public static void main(String[] args) {    
        
        String str1="Remove white spaces";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }  

    public static void removeWhitSpace() {
	
    String str = "Remove white spaces";

    str = str.replace(" ", "");

    System.out.println(str);

}
    
}
