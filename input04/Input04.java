import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine(); //Ignora a primeira linha
        System.out.println(sc.nextLine()); // exibe a segunda linha
        sc.nextLine(); // Avança o scanner para a próxima linha

        String line = sc.nextLine(); // Lê a linha que contém "BlueBumper"
        if (line.contains("BlueBumper")) {
            System.out.println("A linha contém BlueBumper (" + line + ")");
           
            Scanner lineScanner = new Scanner(line);
            
            lineScanner.next();
            lineScanner.nextInt();
            lineScanner.next();
            int xPosition= lineScanner.nextInt(); 
            int yPosition= lineScanner.nextInt();
            System.out.println("X: " + xPosition + ", Y: " + yPosition);
            lineScanner.close();
        }else{
            System.out.println("A linha não contém BlueBumper (" + line + ")");
        }
        sc.close();
    }    
}
