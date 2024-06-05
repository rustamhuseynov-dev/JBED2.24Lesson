public class Main {

    public static void main(String[] args) {
        int count = 0;
        int a = 10;
        int b = 20;
        for (int i = 0; i <a; i++) {
            count +=1;
            if (count==5){
                break;
            }
            System.out.println(count);
        }
//        if (a!=b){
//            System.out.println("beraber degil");
//        }
//        else {
//            System.out.println("beraberdi");
//        }
        String abc = " JJ  a     a   V  a     a";
        System.out.println(abc.length());
    }
}
