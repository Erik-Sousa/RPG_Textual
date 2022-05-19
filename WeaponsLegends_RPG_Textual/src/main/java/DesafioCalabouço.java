/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RPG;

import java.util.Scanner;

/**
 *
 * @author csnas
 */
public class DesafioCalabouço {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha1, escolha2;
        String charada;
        
        System.out.println("Você foi preso no calabouço :( ");
        System.out.println("Por sorte você conseguiu roubar dos guardas o mapa do calabouço sem que eles "
                + "percebessem!!!!");

        do {
            System.out.println("Quer dar uma olhadinha no mapa?");
            System.out.println("[1] SIM");
            System.out.println("[2] NÃO");
            escolha1 = input.nextInt();

            switch (escolha1) {
                case 1:
                    System.out.println("#==============================|| ||\n"
                            + "#         E N T R A D A        || ||\n"
                            + "||E||#=========================|| ||\n"
                            + "||S||#                         || ||\n"
                            + "||C||#=========================|| ||\n"
                            + "||A||#     T U N Ú E L              \n"
                            + "||D||#=========================|| ||\n"
                            + "||A||#      P O R T A L             \n"
                            + "||R||#     S E C R E T O            \n"
                            + "||I||#=========================|| ||\n"
                            + "||A||#=========================|| ||\n"
                            + "######=========================|| ||");
                    break;
                case 2:
                    System.out.println("Vai ficar aqui até quando ... ");
                    System.out.println(".\n" 
                                     + ".\n"
                                     + ".\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (escolha1 == 2);

        do {
            System.out.println("Olhando para o mapa, aparentemente você precisa chegar"
                    + "até o portal secreto, qual caminho irá seguir????");
            System.out.println("[1] ESCADARIA");
            System.out.println("[2] TÚNEL");
            escolha2 = input.nextInt();

            switch (escolha2) {
                case 1:
                    System.out.println("Boa sorte com essa enorme escada");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("você chegou ao fim, veja o que tem a frente ...");
                    System.out.println("Uma enorme parede, parece que não vai ser por aqui que "
                            + "você vai sair.");
                    break;
                case 2:
                    System.out.println("Será que há luz no fim do túnel?????");
                    System.out.println("Ande mais um pouquinho ... ");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("AAAAA, parece que você encontrou uma porta ... pena que"
                            + " está trancada, te desejo sorte para abrir hahahaha");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            
        } while (escolha2 != 2);
        
        System.out.println("Veja, na porta há um pergaminho, talvez tenha alguma dica de como "
                + "abrir a porta\n");
        System.out.println("@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n"
                         +"|Vc está há um passo de conseguir atravessar |\n"
                         +"|o portal secreto, para isto é necessário que|\n" 
                         +"|vc diga a senha em voz alta. Há uma dica no |\n"            
                         +"|final do pergaminho.                        |\n"
                         +"|                                            |\n"
                         +"|                                            |\n"
                         +"|                                            |\n"
                         +"|                Boa sorte!!!                |\n"
                         +"|                                            |\n"
                         +"|                                            |\n" 
                         +"|                                            |\n"
                         +"|                                            |\n"
                         +"|                                            |\n"
                         +"|Dica:Eu nunca fui, mas sempre serei. Ninguém|\n"
                         +"|  nunca me viu, e nunca verão. Ainda assim, |\n"
                         +"|  sou a esperança de todos. Quem sou eu?    |\n"
                         +"@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n");
        
        System.out.println("E agora qual a senha?");
        charada = input.next();
        
        while(!charada.equalsIgnoreCase("futuro")) {
        
            System.out.println("Não é isso. Tente denovo");
            System.out.println("Diga-me novamente o que a senha:");
            charada = input.next();
        }
        System.out.println("Finalmente você acertou. Parabéns");
        System.out.println("o portal está se abrindo ...");
        System.out.println(".\n"
                         + ".\n"
                         + ".\n");
        System.out.println("O portal se abriu, logo a frente há uma saída. Vá em "
                + "frente e recupere seu artefato roubado."
                + ".\n"
                + ".\n"
                + ".\n");
        
        
    }
}

