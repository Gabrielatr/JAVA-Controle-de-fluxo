import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int n1 = sc.nextInt();
        clearBuffer(sc);
        System.out.println("Digite o segundo parâmetro");
        int n2 = sc.nextInt();
        
        try {
            contar(n1, n2);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O 1º número deve ser maior do que o 2º");
        }
        
    }
    
    static void contar(int n1, int n2 ) throws ParametrosInvalidosException {
        if(n2<n1)
            throw new ParametrosInvalidosException();
        
        for(int i=n1; i<=n2; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
