package RPG_Textual_Menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.println("                                                                           \n"
                + "@@@  @@@  @@@  @@@@@@@@   @@@@@@   @@@@@@@    @@@@@@   @@@  @@@   @@@@@@   \n"
                + "@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@   \n"
                + "@@!  @@!  @@!  @@!       @@!  @@@  @@!  @@@  @@!  @@@  @@!@!@@@  !@@       \n"
                + "!@!  !@!  !@!  !@!       !@!  @!@  !@!  @!@  !@!  @!@  !@!!@!@!  !@!       \n"
                + "@!!  !!@  @!@  @!!!:!    @!@!@!@!  @!@@!@!   @!@  !@!  @!@ !!@!  !!@@!!    \n"
                + "!@!  !!!  !@!  !!!!!:    !!!@!!!!  !!@!!!    !@!  !!!  !@!  !!!   !!@!!!   \n"
                + "!!:  !!:  !!:  !!:       !!:  !!!  !!:       !!:  !!!  !!:  !!!       !:!  \n"
                + ":!:  :!:  :!:  :!:       :!:  !:!  :!:       :!:  !:!  :!:  !:!      !:!   \n"
                + " :::: :: :::    :: ::::  ::   :::   ::       ::::: ::   ::   ::  :::: ::   \n"
                + "  :: :  : :    : :: ::    :   : :   :         : :  :   ::    :   :: : :    \n"
                + "                                                                           \n"
                + "                                                                           \n"
                + "@@@       @@@@@@@@   @@@@@@@@  @@@@@@@@  @@@  @@@  @@@@@@@    @@@@@@       \n"
                + "@@@       @@@@@@@@  @@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@@@@@       \n"
                + "@@!       @@!       !@@        @@!       @@!@!@@@  @@!  @@@  !@@           \n"
                + "!@!       !@!       !@!        !@!       !@!!@!@!  !@!  @!@  !@!           \n"
                + "@!!       @!!!:!    !@! @!@!@  @!!!:!    @!@ !!@!  @!@  !@!  !!@@!!        \n"
                + "!!!       !!!!!:    !!! !!@!!  !!!!!:    !@!  !!!  !@!  !!!   !!@!!!       \n"
                + "!!:       !!:       :!!   !!:  !!:       !!:  !!!  !!:  !!!       !:!      \n"
                + " :!:      :!:       :!:   !::  :!:       :!:  !:!  :!:  !:!      !:!       \n"
                + " :: ::::   :: ::::   ::: ::::   :: ::::   ::   ::   :::: ::  :::: ::       \n"
                + ": :: : :  : :: ::    :: :: :   : :: ::   ::    :   :: :  :   :: : :        \n"
                + "                                                                           \n\n");
        int opcao;

        do {

            System.out.print("=============================\n");
            System.out.print("          [1] JOGAR          \n");
            System.out.print("          [2] CREDITOS       \n");
            System.out.print("          [3] COMANDOS       \n");
            System.out.print("=============================\n\n\n");
            System.out.println("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Sejam bem-vindos! A cidade de Lavenham, uma das cidades mais rica de Nochma, nela você irá"
                            + " descobrir que todos nós temos um mistério a ser revelado! ");
                    System.out.println("[1] Anna");
                    System.out.println("[2] Floki");
                    System.out.println("[3] Halroc Christoper");
                    System.out.println("[4] Yruan");
                    System.out.println("[5] Yvenna Kallamara");
                    System.out.println("Escolha o seu personagem");
                    int perso = menu.nextInt();
                    
                        switch(perso){
                            case 1:
                                
                                System.out.println("Anna .....");
                                break;
                            case 2:
                                System.out.println("Floki .....");
                                break;
                            case 3:
                                System.out.println("Halroc .....");
                                break;
                            case 4:
                                System.out.println("Yruan ....");
                                break;
                            case 5:
                                System.out.println("Yvenna.....");
                        }
                    
                    
                    
/*  "Você está no centro da cidade, onde se tem um vasto comércio de objetos artesanais, uma praça pública em frente a igreja e a 3km de distância tem se o castelo"
+ "do rei Gerald IV, em que se tem uma imensa muralha, torres vigiadas o dia inteiro para a proteção do rei, familiares e de seu tesouro e no fundo do castelo te"
+ "m o calabouço. Do lado leste à 5km tem a cidade dos anões, chamada de Yggdrasil, à norte tem a floresta de Dean, lá vive criaturas mágicas, do lado noroeste d"
+ "e Lavenham, há 20km tem a tribo mística Salpphire. No Sul, são reinos mais pobres, portanto mais perigosos!
*/
                    System.out.println("- Veja! O mensageiro do rei na praça pública, ele tem um comunicado a se fazer, vamos ouvir o que ele tem a dizer?");
                    System.out.println("Ele disse que o rei está precisando de guerreiros dispostos a encarar desafios propostos pelo rei. Você aceita participar?");
                    break;

                case 2:
                    System.out.println("Directed by : Amaury S. Alves");
                    System.out.println("Executive Producer: Leonardo S. Santos");
                    System.out.println("Production Director: Amaurilio S. Alves");
                    System.out.println("Visual Producer: Erik S. Sena");
                    System.out.println("History by: Catiane S. ");
                    System.out.println("Plot by: Cintia L. Gentil ");
                    break;

                case 3:
                   // HA FAZER
                    break;

            }
        } while (opcao<1 || opcao>4);
    }
}
