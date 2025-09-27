import java.util.*;

class Main {
    public static void main(String []args){
       
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> l = new ArrayList<>(10);

            //Simple arraylist
            l.add(10);
            l.add(20);
            l.add(30);
            l.add(40);
            l.add(50);
            System.out.println(l);

            //taking arraylist input
            for(int i=0;i<5;i++){
                l.add(sc.nextInt());
            }

            //get item at any index
            System.out.println(l.get(0));

            for(int i=0;i<5;i++){
                System.out.print(l.get(i)+" ");  //pass index here, list[index] will not work here
            }
        }
    }    
}
