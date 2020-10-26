import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static int invalidas;

    public static void main(String[] args){

        int tentValida = 0;


        Scanner scanner = new Scanner(System.in);
        Media media = new Media();
        while(tentValida == 0){
            System.out.printf("Digite o nome do arquivo: ");
            float result = media.calcularMedias(scanner.nextLine());
            if (result == -2f){
                System.out.println("Arquivo não encontrado, digite um nome válido");
            }
            else if(result == -1f){
                System.out.println(invalidas + " linhas inválidas");
                tentValida++;
            }
            else{
                System.out.println(result);
                tentValida++;
            }
        }

        }
    }

