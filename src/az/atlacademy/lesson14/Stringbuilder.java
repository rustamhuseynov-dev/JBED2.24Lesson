package az.atlacademy.lesson14;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Salam");  // append metodu sbye string elave edir
        sb.append("Necesen"); // hemcinin burdada elave edir cunki StringBuilder mutabledir
        sb.delete(5,13); //burda 5 baslangic index-di 13 end indexsidi bunlar arasinda olani silir
        sb.insert(5," Java"); // bu metod 5-ci indexden baslayaraq yeni soz elave edir
        //sb.reverse(); //bu metod deyeri tersine cevirir meselen : avaJ malaS
        sb.replace(5,9,"Corea"); // verdiyin start ve end deyeri ile string-i o araya yerlesdirir
        System.out.println(sb);
    }
}
