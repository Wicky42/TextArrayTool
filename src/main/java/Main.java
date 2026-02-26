public class Main {

    public static void main(String[] args){

    }


    public static boolean containsEmptyStrings(String[] strings) {
        for(String s : strings){
            if(s == null || s.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
