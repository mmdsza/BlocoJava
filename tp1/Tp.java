import java.util.Scanner;



public class Tp {
    float notaA1;
    float notaA2;
    String nome;

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int seletor = sc.nextInt();
        switch(seletor){
            case 1:
                System.out.println("Okay!");
                break;
            case 2:
                System.out.println("Not okay!");
                break;
            }
        sc.close();
        }
        

public static void main(String[] args) {
        menu();
    }

}