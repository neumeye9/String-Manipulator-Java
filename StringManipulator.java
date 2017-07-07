public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String new1 = str1.trim();
        String new2 = str2.trim();
        String str3 = new1.concat(new2);
        return str3;
    }
}

// The Integer class (not the int primitive data type) provides methods for converting an int to a String and a String to an int

public class StringManipulator{
    public Integer getIndexOrNull(String str, char character){
       
        int check = str.indexOf(character);
        if(check == -1){
            return null;
        }

        return check; 
    }
}

public class StringManipulator{
    public Integer getIndexOrNull(String str1, String sub1){
        int check = str1.indexOf(sub1);
        
        if(check == -1){
            return null;
        }
        
        return check; 
    }
}

public class StringManipulator{
    public String concatSubstring(String str1, int num1, int num2, String str2){
       String sub1 = str1.substring(num1,num2);
       String str3 = sub1.concat(str2);
       return str3; 
    }
}