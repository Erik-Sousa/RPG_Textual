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
        int escolha, opcao, i;
        String name = null;

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

                    //Escolha/Descrição de personagem.
                    do {
                        switch (perso) {
                            case 1:
                                System.out.println("Anna é uma Elfa - Arqueira\n"
                                        + "\n"
                                        + "Anna vive na floresta de Dean, localizado no País de Gales, é uma criatura de aspecto frágil e delicado, elfos são parecidos com os humanos, mas o que difere são as orelhas pontiagudas, há quem diga que eles são imortais, mas não são, eles só morrem se for assassinado, portanto de velhice e doenças não morrem.\n"
                                        + "Possui agilidade e destreza em seus movimentos, tem um toque de graça e delicadeza, permitindo mover-se sigilosamente para espiar ou realizar um ataque surpresa. Também consegue se camuflar entre a natureza, que é o lugar em que ela se sente mais confortável.\n"
                                        + "Anna possui infra visão, permitindo que em noites escuras e nos bosques mais densos que dificilmente entra luz, conseguir ver perfeitamente o que está a sua frente.\n"
                                        + "Desde pequena foi treinada pela sua família a manusear a espada curta e a larga, mas é com o seu arco e flecha que ela possui uma agilidade rápida e perspicaz para lançar a flecha e rapidamente preparar-se para um novo disparo.\n"
                                        + "Anna, foi presenteada por um druida (próximo á família dela) com um arco longo que o comprimento é de 1,83 que alcança surpreendentemente 400 metros com uma velocidade de 2 km.");
                                System.out.println("Gostaria de jogar com esse personagem? ");
                                System.out.println("[1] - SIM");
                                System.out.println("[2] - NAO");
                                escolha = menu.nextInt();
                                if (escolha == 1) {
                                    name = "Anna";
                                }
                                break;
                            case 2:
                                System.out.println(" Floki e um anão - Dois Machados de Uma Mão\n"
                                        + "\n"
                                        + "Nascido numa família de anões donos de uma grande taverna, Floki desde criança sempre ouviu que seu destino era herdar a Taverna de Yggdrasil, mas apesar de ter passado sua vida inteira caçando em prol da taverna e de seus pais, ele decidiu que esse não era o rumo que queria pra sua vida e sim aventuras gloriosas e sangrentas para que pudesse contar as seus filhos (quando tiver).\n"
                                        + "Personalidade, Ideais e Fraquezas:\n"
                                        + "Floki é um pouco soberbo, já que tem consciência de sua grande força e fortitude, e graças a isso ele também prefere ficar na linha de frente, um anão que se irrita facilmente e que gosta muito de beber com os amigos. Ele busca reconhecimento, para que sua família entenda o seu real desejo, virar um grande aventureiro.");
                                System.out.println("Gostaria de jogar com esse personagem? ");
                                System.out.println("[1] - SIM");
                                System.out.println("[2] - NAO");
                                escolha = menu.nextInt();
                                if (escolha == 1) {
                                    name = "Floki";

                                }

                                break;
                            case 3:
                                System.out.println("Halroc Christoper, é um ladrão humano, que está sempre à procura de um roubo mais desafiador, nascido em uma pequena vilarejo muito pobre, Halroc não conheceu seus pais e nada se sabe o que aconteceu com eles, e o próprio não tem interesse na sua origem, pois para ele, sua origem é ali, junto da sua gangue na qual é o próprio líder, chamada de “Bad Childrens”, em que ele considerava sua verdadeira família.\n"
                                        + "Ele e sua gangue eram os causadores de toda a bagunça no seu bairro, eles brincavam, arrumavam confusão, entre eles próprios ou com outras gangues e o principal, pequenos furtos, eles roubavam comida de mercadante, a pessoas ricas em áreas mais nobres, e o cérebro de tudo isso era Halroc, que além de bolar os planos, apresentava grandes habilidades furtivas e de fuga.\n"
                                        + "A gangue se desfez após alguns integrantes tentarem roubar um relógio de ouro de um grande senhor rico sem Halroc, foram encurralados por ele e alguns homens e foram espancados até a morte, causando medo no restante da gangue e abandonando Halroc.\n"
                                        + "Já adulto, Halroc seguiu sendo um ladrão, é um grande mentiroso, saindo de enrascadas sem precisar entrar em combate, brincalhão, audacioso, ardiloso e inteligente, montando planos de invasão e de fuga nos seus roubos");
                                System.out.println("Gostaria de jogar com esse personagem? ");
                                System.out.println("[1] - SIM");
                                System.out.println("[2] - NAO");
                                escolha = menu.nextInt();
                                if (escolha == 1) {
                                    name = "Halroc";

                                }
                                break;
                            case 4:
                                System.out.println("Yruan – Anulus\n"
                                        + "\n"
                                        + "Yruam é um humano meio doido que fala sozinho, cabelos escuro, tamanho médio, pele escura e sua profissão e arqueólogo que gostava muito de descobrir as coisas, numa dessa viagem ele encontrou uma dungeon onde ele encontrou os 3 anulus do rei Nero que davam para ele poderes.\n"
                                        + "Historia dos Anulos\nHá muito tempo, existiam três dragões espalhados pelo mundo, eles eram consideram como “Deuses” por parte dos aldeões.\n"
                                        + "O rei Nero considerado louco e excêntrico pelo seu povo, constatou que esses dragões seria uma boa arma de guerra, decidiu que iria domar esses dragões para experiencias com partes do corpo dos três.\n"
                                        + "O primeiro foi Thorys, logo percebeu que não seria fácil domá-los, foi uma batalha em que se perdeu muitos soldados e trouxe tristeza em todo o reino, mas como o povo mesmo disse, ele era louco, não desistiu de tentar domar os dragões. Mais dois anos se passaram e finalmente conseguiram capturar Thorys, apanharam uma escama para estudo e viram que essa escama tinha uma pequena porcentagem do poder de Thorys. O rei decidiu levar essa escama para a aldeia dos anões onde tinha os melhores forjadores. Entregou a escama para os irmãos Brokk e Eitri. Os irmãos criaram um anel com poderes de raio, sem afetar quem usasse  e denominaram Anulus, essa nova arma. \n"
                                        + "Nero, mais confiante do que nunca, enfrentou os outros dois dragões, Hydraco e Vulcano conseguiram retirar as escamas para a fabricação de mais dois anéis. ");
                                System.out.println("Gostaria de jogar com esse personagem? ");
                                System.out.println("[1] - SIM");
                                System.out.println("[2] - NAO");
                                escolha = menu.nextInt();
                                if (escolha == 1) {
                                    name = "Yruan";
                                }
                                break;
                            case 5:
                                System.out.println("Yvenna Kallamara – Lança magica \n"
                                        + "\n"
                                        + "Nascida em local desconhecido, Yvenna Kallamara, foi abandonada assim que veio ao mundo, foi encontrada e resgatada por uma anciã chamada Lith que a levou para sua tribo Salpphire e foi acolhida por todos.\n"
                                        + "Salpphire é uma tribo mística que chama a atenção por ter muitos poderes, o povo que habita lá precisa lutar se defender de aproveitadores que querem usufruir da magia do local. Não diferente dos outros habitantes Yvenna desde pequena foi treinada por Lith para se defender de qualquer inimigo que ameaçasse sua tribo.\n"
                                        + "Antes de Lith morrer, Yvenna passou por um ritual e recebeu todo poder e magia da anciã, e se tornou a sucessora e protetora da tribo, também foi presenteada com uma lança e mágica rara que pertenceu aos ancestrais da tribo, seu maior desafio foi aprender a lidar com todo o poder recebido. Atualmente continua em Salpphire protegendo sua tribo de quaisquer adversários que tente invadi-la.");
                                System.out.println("Gostaria de jogar co"
                                        + "m esse personagem? ");
                                System.out.println("[1] - SIM");
                                System.out.println("[2] - NAO");
                                escolha = menu.nextInt();
                                if (escolha == 1) {
                                    name = "Yvenna";
                                }

                        }
                    } while (perso < 1 || perso > 5);

                    System.out.println(name + " está no centro da cidade, onde se tem um vasto comércio de objetos artesanais, uma praça pública em frente a igreja e a 3km de distância tem se o castelo do rei Gerald IV, ");
                    System.out.println("em que se tem uma imensa muralha, torres vigiadas o dia inteiro para a proteção do rei, familiares e de seu tesouro e no fundo do castelo tem ");
                    System.out.println("o calabouço. Do lado leste à 5km tem a cidade dos anões, chamada de Yggdrasil, à norte tem a floresta de Dean, lá vive criaturas mágicas, do lado noroeste de ");
                    System.out.println("Lavenham, há 20km tem a tribo mística Salpphire. No Sul, são reinos mais pobres, portanto mais perigosos! ");

                    System.out.println("\n\n- Veja! O mensageiro do rei na praça pública, ele tem um comunicado a se fazer, vamos ouvir o que ele tem a dizer?");
                    System.out.println("\nEle disse que o rei está precisando de guerreiros dispostos a encarar desafios propostos pelo rei. Você aceita participar?");
                    System.out.println("[1] - Sim");
                    System.out.println("[2] - Nao");
                    escolha = menu.nextInt();

                    //contina da historia
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
        } while (opcao < 1 || opcao > 3);
    }
}
