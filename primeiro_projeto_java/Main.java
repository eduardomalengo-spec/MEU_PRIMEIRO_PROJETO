import java.util.Scanner;
import java.util.*;

class RelatorioFinanceiro {
    String funcionario;
    int id;
    int senha;
    String endereco;
    int numero_da_casa;
    int cpf;
   
    public void RelatorioFuncionario(String funcionario, int id, int senha, String endereco, int numero_da_casa, int cpf) {
        this.funcionario = funcionario;
        this.id = id;
        this.senha = senha;
        this.endereco = endereco;
        this.numero_da_casa = numero_da_casa;
        this.cpf = cpf;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Funcionario: ");
        String funcionario = sc.nextLine();
       
        System.out.print("Qual o seu ID " + funcionario + " ? ");
        int id = sc.nextInt();
       
        System.out.print("Senha: ");
        int senha = sc.nextInt();
       
        System.out.print("Qual seu Endereço? ");
        String endereco = sc.nextLine();
        sc.nextLine();
       
        System.out.print("Qual o complemento? ");
        int numero_da_casa = sc.nextInt();
       
        System.out.print("CPF: ");
        int cpf = sc.nextInt(); 
       
        if(senha == 1234 && cpf == 123456789) {
            System.out.println("[OK] ACESSO APROVADO ! ");
        }
        else {
            System.out.println("[ERROR] ACESSO REPROVADO ! ");
        }
    }
}