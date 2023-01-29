package BUcs673.HW1;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table:");
        for(int i=1;i<=12;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
