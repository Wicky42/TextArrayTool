public class Main {

    static void main(String[] args){

    }


    public static boolean containsEmptyStrings(String[] strings) {
        for(String s : strings){
            if(s == null || s.isEmpty()){
                return true;
            }
        }
        return false;
    }
    
    public static int countCharsTotal(String[] data) {
        if(containsEmptyStrings(data)){
            throw new IllegalArgumentException("Der Datensatz enthält leere Zeilen oder ist beshädigt.");
        }
        int count =0;
        for(String s : data){
            count += s.length();
        }
        return count;
    }
}
