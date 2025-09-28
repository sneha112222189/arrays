class Main {
    public static void main(String[] args) {
        String str = "Sneha";
        char target = 's';
        if(searchInStrings(str, target) == true){
            System.out.println("character present");
        }
        else{
            System.out.println("character not present ");
        }
    }

    static boolean searchInStrings(String str, char target){
        if(str.length() == 0) return false;
        //using normal for loop 
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)) return true;
        }
        return false;
    }

    static boolean searchInStrings2(String str, char target){
        if(str.length() == 0) return false;
        //using for each loop
        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
}
