import java.util.Scanner;



public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha = 0, opcao, menu = 0, personagem;
        int carisma = 10;
        String name = null;

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

        do {

            System.out.print("=============================\n");
            System.out.print("          [1] JOGAR          \n");
            System.out.print("          [2] CREDITOS       \n");
            System.out.print("          [3] COMANDOS       \n");
            System.out.print("=============================\n\n\n");
            System.out.println("Digite uma op????o: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Gostaria de iniciar");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("Iniciando o Jogo\n \n");
                        break;
                    } else if (menu == 2) {
                        break;
                    }

                case 2:
                    System.out.println("Directed: Amaury S. Alves");
                    System.out.println("Executive Producer: Leonardo S. Santos");
                    System.out.println("Production Director: Amaurilio S. Alves");
                    System.out.println("Visual Producer: Erik S. Sena");
                    System.out.println("History: Catiane s. Nascimento ");
                    System.out.println("Plot: Cintia L. Gentil \n \n");

                    System.out.println("Quer voltar ao menu do jogo?");
                    
                    System.out.println("[1] - NAO, Voc?? ira para o jogo diretamente.");
                    System.out.println("[2] - SIM");   
                    
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("\n Iniciando");
                        break;
                    } else if (menu == 2) {
                        break;
                    }

                case 3:
                    // HA FAZER
                    break;

            }
        } while (menu != 1);
        System.out.println("Sejam bem-vindos! A cidade de Lavenham, uma das cidades mais rica de Nochma, nela voc?? ir??"
                + " descobrir que todos n??s temos um mist??rio a ser revelado! \n");

        do {
            System.out.println("**--Escolha o seu personagem--**");
            System.out.println("[1] Anna");
            System.out.println("[2] Floki");
            System.out.println("[3] Halroc Christoper");
            System.out.println("[4] Yruan");
            System.out.println("[5] Yvenna Kallamara");
            personagem = input.nextInt();

            switch (personagem) {
                case 1:
                    System.out.println("Anna ?? uma Elfa - Arqueira\n"
                            + "\n"
                            + "Anna vive na floresta de Dean, localizado no Pa??s de Gales, ?? uma criatura de aspecto fr??gil e delicado, elfos s??o parecidos com os humanos, mas o que difere s??o as orelhas pontiagudas, h?? quem diga que eles s??o imortais, mas n??o s??o, eles s?? morrem se for assassinado, portanto de velhice e doen??as n??o morrem.\n"
                            + "Possui agilidade e destreza em seus movimentos, tem um toque de gra??a e delicadeza, permitindo mover-se sigilosamente para espiar ou realizar um ataque surpresa. Tamb??m consegue se camuflar entre a natureza, que ?? o lugar em que ela se sente mais confort??vel.\n"
                            + "Anna possui infra vis??o, permitindo que em noites escuras e nos bosques mais densos que dificilmente entra luz, conseguir ver perfeitamente o que est?? a sua frente.\n"
                            + "Desde pequena foi treinada pela sua fam??lia a manusear a espada curta e a larga, mas ?? com o seu arco e flecha que ela possui uma agilidade r??pida e perspicaz para lan??ar a flecha e rapidamente preparar-se para um novo disparo.\n"
                            + "Anna, foi presenteada por um druida (pr??ximo ?? fam??lia dela) com um arco longo que o comprimento ?? de 1,83 que alcan??a surpreendentemente 400 metros com uma velocidade de 2 km.");
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Anna";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 2:
                    System.out.println(" Floki e um an??o - Dois Machados de Uma M??o\n"
                            + "\n"
                            + "Nascido numa fam??lia de an??es donos de uma grande taverna, Floki desde crian??a sempre ouviu que seu destino era herdar a Taverna de Yggdrasil, mas apesar de ter passado sua vida inteira ca??ando em prol da taverna e de seus pais, ele decidiu que esse n??o era o rumo que queria pra sua vida e sim aventuras gloriosas e sangrentas para que pudesse contar as seus filhos (quando tiver).\n"
                            + "Personalidade, Ideais e Fraquezas:\n"
                            + "Floki ?? um pouco soberbo, j?? que tem consci??ncia de sua grande for??a e fortitude, e gra??as a isso ele tamb??m prefere ficar na linha de frente, um an??o que se irrita facilmente e que gosta muito de beber com os amigos. Ele busca reconhecimento, para que sua fam??lia entenda o seu real desejo, virar um grande aventureiro.");
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Floki";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 3:
                    System.out.println("Halroc Christoper, ?? um ladr??o humano, que est?? sempre ?? procura de um roubo mais desafiador, nascido em uma pequena vilarejo muito pobre, Halroc n??o conheceu seus pais e nada se sabe o que aconteceu com eles, e o pr??prio n??o tem interesse na sua origem, pois para ele, sua origem ?? ali, junto da sua gangue na qual ?? o pr??prio l??der, chamada de ???Bad Childrens???, em que ele considerava sua verdadeira fam??lia.\n"
                            + "Ele e sua gangue eram os causadores de toda a bagun??a no seu bairro, eles brincavam, arrumavam confus??o, entre eles pr??prios ou com outras gangues e o principal, pequenos furtos, eles roubavam comida de mercadante, a pessoas ricas em ??reas mais nobres, e o c??rebro de tudo isso era Halroc, que al??m de bolar os planos, apresentava grandes habilidades furtivas e de fuga.\n"
                            + "A gangue se desfez ap??s alguns integrantes tentarem roubar um rel??gio de ouro de um grande senhor rico sem Halroc, foram encurralados por ele e alguns homens e foram espancados at?? a morte, causando medo no restante da gangue e abandonando Halroc.\n"
                            + "J?? adulto, Halroc seguiu sendo um ladr??o, ?? um grande mentiroso, saindo de enrascadas sem precisar entrar em combate, brincalh??o, audacioso, ardiloso e inteligente, montando planos de invas??o e de fuga nos seus roubos");
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Halroc Cristoper";
                        break;
                    }  else if (escolha == 2) {
                        break;
                    }

                case 4:
                    System.out.println("Yruan ??? Anulus\n"
                            + "\n"
                            + "Yruam ?? um humano meio doido que fala sozinho, cabelos escuro, tamanho m??dio, pele escura e sua profiss??o e arque??logo que gostava muito de descobrir as coisas, numa dessa viagem ele encontrou uma dungeon onde ele encontrou os 3 anulus do rei Nero que davam para ele poderes.\n"
                            + "Historia dos Anulos\nH?? muito tempo, existiam tr??s drag??es espalhados pelo mundo, eles eram consideram como ???Deuses??? por parte dos alde??es.\n"
                            + "O rei Nero considerado louco e exc??ntrico pelo seu povo, constatou que esses drag??es seria uma boa arma de guerra, decidiu que iria domar esses drag??es para experiencias com partes do corpo dos tr??s.\n"
                            + "O primeiro foi Thorys, logo percebeu que n??o seria f??cil dom??-los, foi uma batalha em que se perdeu muitos soldados e trouxe tristeza em todo o reino, mas como o povo mesmo disse, ele era louco, n??o desistiu de tentar domar os drag??es. Mais dois anos se passaram e finalmente conseguiram capturar Thorys, apanharam uma escama para estudo e viram que essa escama tinha uma pequena porcentagem do poder de Thorys. O rei decidiu levar essa escama para a aldeia dos an??es onde tinha os melhores forjadores. Entregou a escama para os irm??os Brokk e Eitri. Os irm??os criaram um anel com poderes de raio, sem afetar quem usasse  e denominaram Anulus, essa nova arma. \n"
                            + "Nero, mais confiante do que nunca, enfrentou os outros dois drag??es, Hydraco e Vulcano conseguiram retirar as escamas para a fabrica????o de mais dois an??is. ");
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yrun";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 5:
                    System.out.println("Yvenna Kallamara ??? Lan??a magica \n"
                            + "\n"
                            + "Nascida em local desconhecido, Yvenna Kallamara, foi abandonada assim que veio ao mundo, foi encontrada e resgatada por uma anci?? chamada Lith que a levou para sua tribo Salpphire e foi acolhida por todos.\n"
                            + "Salpphire ?? uma tribo m??stica que chama a aten????o por ter muitos poderes, o povo que habita l?? precisa lutar se defender de aproveitadores que querem usufruir da magia do local. N??o diferente dos outros habitantes Yvenna desde pequena foi treinada por Lith para se defender de qualquer inimigo que amea??asse sua tribo.\n"
                            + "Antes de Lith morrer, Yvenna passou por um ritual e recebeu todo poder e magia da anci??, e se tornou a sucessora e protetora da tribo, tamb??m foi presenteada com uma lan??a e m??gica rara que pertenceu aos ancestrais da tribo, seu maior desafio foi aprender a lidar com todo o poder recebido. Atualmente continua em Salpphire protegendo sua tribo de quaisquer advers??rios que tente invadi-la.");
                    System.out.println("Gostaria de jogar co"
                            + "m esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yvenna";
                        break;
                    } else if (escolha ==2){
                        break;
                    }
            }

        } while (escolha != 1);

        System.out.println(name + " est?? no centro da cidade, onde se tem um vasto com??rcio de objetos artesanais, uma pra??a p??blica em frente a igreja e a 3km de dist??ncia tem o castelo do rei Gerald IV, ");
        System.out.println("onde tem uma imensa muralha, torres vigiadas o dia inteiro para a prote????o do rei, familiares e de seu tesouro e no fundo do castelo tem ");
        System.out.println("o calabou??o. Do lado leste ?? 5km est?? localizado a cidade dos an??es, chamada de Yggdrasil, ?? norte a floresta de Dean, l?? vive criaturas m??gicas, do lado noroeste de ");
        System.out.println("Lavenham, h?? 20km est?? a tribo m??stica Salpphire. No Sul, s??o reinos mais pobres, portanto mais perigosos! ");

        System.out.println("\n\n- Veja! O mensageiro do rei na pra??a p??blica, ele tem um comunicado a se fazer, vamos ouvir o que ele tem a dizer?");
        System.out.println("\nEle disse que o rei est?? precisando de guerreiros dispostos a encarar desafios propostos por ele. Voc?? aceita participar?");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Nao");
        escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("\n(mensageiro) -- Vejam s??, h?? um(a) nobre guerreiro(a) disposto(a) a enfrentar a criatura que est?? aterrorizando as terras do rei "
                        + "Qual ?? seu nome ?\n"
                        + "Meu nome ?? " + name + "!\n"
                        + "(mensageiro) -- Vejo que voc?? ?? de longe, o Rei vai adorar te conhcer, vamos para o castelo, l?? voc?? ir?? conhcecer o rei pessoalmente!\n");
                carisma = carisma + 2;
                System.out.println("**-- PARAB??NS--**\n");
                System.out.println("Voc?? acabou de receber +2 Pontos de carisma com a cidade, com esses pontos de carismas voc?? consegue ter mais vantagens em algumas miss??es"
                        + " tente n??o recusar miss??es pois voc?? pode avabar perdendo esses pontos, isso aumentara a dificuldade em alguns desafios\n");
                System.out.println("Quer ver seu nivel de carisma?");
                System.out.println("[1] - Sim");
                System.out.println("[2] - Nao");
                escolha = input.nextInt();
                if (escolha == 1){
                        System.out.println("Seu atual nivel de Carisma com a cidade e??: " + carisma);
                        break;
                }else if (escolha == 2){
                        break;

                }
            case 2:
                System.out.println("(desconhecido1)-- Veja s??, aquela pessoa ?? nova na cidade,voc?? soube de um boato que mataram alguem ontem nos becos?\n");
                System.out.println("(Desconhecido2)-- Sim, provavelmente essa ?? a unica pessoa nova na cidade, n??o temos casos de assasinato h?? algum tempo, vamos chamar as autoridades!"
                        + "** Os desconhcidos chamam os guardas para levar voc?? a cadeia!");
                System.out.println("Voc?? perdeu -2 Pontos de carisma, se seu carisma chegar a 0, voc?? poder?? morrer por sofrer varias pedradas ao longo do caminho,"
                        + " Suba seu carismo para gnahar vantagens nas miss??es\n");
                carisma = carisma - 2;
                System.out.println("Seu atual nivel de carisma ??: " + carisma);
                break;

        }
    }
}