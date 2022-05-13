
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author leonardo.ssantos60
 */
public class DesafioBar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Anna";
        int avatar = 0;
        int donoDoBar = 0;

        System.out.println("*--Você entrou no Bar!--*");
        System.out.println("[Dono do Taverna] - Olá aventureiro(a)!");
        System.out.println("[Dono do Taverna] - Fiquei sabendo que você matou o javali flamejante que estava atormentando as os campos de plantação da cidade, "
                + "falo por todos da cidade que a partir de agora você será bem-vindo em Lavenham, como agradecimento venha tomar uma bebida ruim e barata com a gente!");
        System.out.println(".\n.\n.\n");
        System.out.println("*--Algum tempo se passou dentro da taverna--*");
        System.out.println("[Dono do Taverna] - Te proponho um desafio para ver se você é melhor que eu na cachaça, o desafio será da seguinte forma:");
        System.out.println("[Dono do Taverna] - Eu irei fazer uma pergunta, se você responder de forma correta, eu tomo um gole de rum, se você errar, você que irá beber");
        System.out.println("(" + name + "): Sim, eu aceito!, mas fique sabendo que você vai tomar na jabiroca");
        System.out.println("(" + name + "): Sou campeã(o) em tomar cachaça");
        System.out.println("[Dono do Taverna] - Seu pai, aquele cacacheiro, HAHAHA!");
        System.out.println("[Dono do Taverna] - Então vamos começar!");
        System.out.println("[Dono da Taverna] - Primeira pergunta, valendo um gole da minha cachaça");
        System.out.println("[Dono da Taverna] - O que a palavra legend significa em português?");
        System.out.println("a) Legenda\n"
                + "b) Conto\n"
                + "c) História\n"
                + "d) Lenda\n"
                + "e) Legendário");
        String p1 = input.next();

        switch (p1) {
            case "A":
            case "a":
                System.out.println("[Dono da Taverna] - Resposta errada!, beba um gole!");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Nossa, que bebida ruim!");
                }
                break;
            case "B":
            case "b":
                System.out.println("[Dono da Taverna] - Resposta errada!, beba um gole!");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Odiei!");
                }
                break;
            case "C":
            case "c":
                System.out.println("[Dono da Taverna] - Resposta errada!, beba um gole!");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que treco horrível!");
                }
                break;
            case "D":
            case "d":
                System.out.println("[Dono da Taverna] - Resposta certa!");
                System.out.println("[Dono da Taverna] - Você parece ser profissional mesmo");
                donoDoBar = donoDoBar + 1;
                if (donoDoBar == 1) {
                    System.out.println("(" + name + "): Tu vai cair de tanto beber hoje!");
                }
                break;
            case "E":
            case "e":
                System.out.println("[Dono da Taverna] - Resposta errada!, beba um gole!");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que poiquera é essa!");
                }
                break;
        }
        System.out.println("[Dono da Taverna] - Segunda Pergunta: ");
        System.out.println("[Dono da Taverna] - Quem pintou Guernica?");
        System.out.println("a) Paulo Cesariano\n"
                + "b) Flávio Picaxu\n"
                + "c) Diogo Vergueira\n"
                + "d) Pastilha do Coral\n"
                + "e) Recife Delá");
        System.out.println("(" + name + "): Mas peraí, quem é Guernica?");
        String pf = input.next();
        switch(pf){
            case "A":
            case "a":
            case "B":
            case "b":    
            case "C":
            case "c":    
            case "D":
            case "d":    
            case "E":
            case "e":    
                System.out.println("[Dono da Taverna] - Errou mentecapto, não tem resposta certa!");
                System.out.println("[Dono da Taverna] - Esse era só pra ver se era bom mesmo");
                break;
                
        }
        System.out.println("[Dono da Taverna] - Terceira Pergunta:");
        System.out.println("[Dono da Taverna] - Qual era o nome de Aleijadinho?");
        System.out.println("a) Peninha"
                + "b) Gotinha"
                + "c) Tijolinho");
        String p3 = input.next();
            switch (p3) {
            case "A":
            case "a":
                System.out.println("[Dono da Taverna] - Resposta errada!, sabe por quê?");
                System.out.println("Peninha chegou na mãe dele, e perguntou:");
                System.out.println("[Peninha] - Mamãe, porque eu me chamo peninha?");
                System.out.println("[Mamãe] - Porque quando você nasceu, na hora que você nasceu, caiu uma pena na sua cabeça");
                break;
            case "B":
            case "b":
                System.out.println("[Dono da Taverna] - Resposta errada!, sabe por quê?");
                System.out.println("Gotinha chegou na mãe dele, e perguntou:");
                System.out.println("[Gotinha] - Mamãe, porque eu me chamo gotinha?");
                System.out.println("[Mamãe] - Porque quando você nasceu, na hora que você nasceu, caiu uma gota de água na sua cabeça");
                break;
            case "C":
            case "c":
                System.out.println("[Dono da Taverna] - Resposta certa!, sabe por quê?");
                System.out.println("O Peninha chegou na mãe dele, e perguntou:");
                System.out.println("[Peninha] - Mamãe, porque eu me chamo peninha?");
                System.out.println("[Mamãe] - Porque quando você nasceu, na hora que você nasceu, caiu uma pena na sua cabeça");
                
                System.out.println("O Gotinha chegou na mãe dele, e perguntou:");
                System.out.println("[Gotinha] - Mamãe, porque eu me chamo gotinha?");
                System.out.println("[Mamãe] - Porque quando você nasceu, na hora que você nasceu, caiu uma gota de água na sua cabeça");
                
                System.out.println("O Tijolinho chegou na mãe dele, e perguntou:");
                System.out.println("[Tijolinho] - âânnhhhhhuuuuuudgfgh Nhuuuujnjmjhjmnh");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que treco horrível!");
                }
                break;
            }
    }

}
