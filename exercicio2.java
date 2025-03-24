import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        
        do{
            System.out.print("Digite sua senha : ");
            senha = scanner.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Sua senha está correta.");
            break;
        }else{

            System.out.println("sua senha está incorreta");
        }
    }while(true);   

        scanner.close();
    }
}
