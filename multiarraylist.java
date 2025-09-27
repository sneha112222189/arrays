import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> l = new ArrayList<>();

            //initialization of multidimensional arraylist
             for(int i =0;i<3;i++){
                l.add(new ArrayList<>());
             }

             //adding elements to list
             for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    l.get(i).add(sc.nextInt());
                }
             }

             System.out.println(l);
        }
    }
}
