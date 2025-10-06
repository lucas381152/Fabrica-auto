/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaauto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas-Daniel
 */
public class Main {

    private static List<Carro> carrosCadastrados = new ArrayList<>();
    private static List<Moto> motosCadastradas = new ArrayList<>();

    //Aqui e onde o programa sera executado buscando os parametros das classes
    //automove,carro e moto
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("-----------------------------------");
        System.out.println("====SISTEMA FABRICA AUTOMOVEIS=====");
        System.out.println("-----------------------------------");

        do {
            System.out.println("-----------------------------------");
            System.out.println("=========MENU PRINCIPAL============");
            System.out.println("-----------------------------------");
            System.out.println("1-CADASTRAR CARRO");
            System.out.println("2-CADASTRAR MOTO");
            System.out.println("3-CARROS CADASTRADOS");
            System.out.println("4-MOTOS CADASTRADAS ");
            System.out.println("5-TESTAR FUNCIONALIDADES");
            System.out.println("6-SAIR");
            System.out.print("ESCOLHA UMA OPÇAO: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um valor valido");
                opcao = 0;
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarCarro(scanner);
                    break;
                case 2:
                    cadastrarMoto(scanner);
                    break;
                case 3:
                    visualizarCarrosCadastrados();
                    break;
                case 4:
                    visualizarMotosCadastradas();
                    break;

                case 5:
                    testarFuncionalidades(scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema.....");
                    break;
                default:
                    System.out.println("opçao invalida");
            }

        } while (opcao != 6);

        scanner.close();

    }

    private static void cadastrarCarro(Scanner scanner) {
        System.out.println("=======CADASTRO DE CARRO=====");
        Carro carro = new Carro();

        System.out.println("Digite o medelo do carro");
        carro.setModelo(scanner.nextLine());

        System.out.println("Digite a cor do modelo");
        carro.setCor(scanner.nextLine());

        System.out.println("Digite a placa do carro");
        carro.setPlaca(scanner.nextLine());

        System.out.println("possui teto solar? (0-SIM, 1-NAO");
        try {
            int tetoSolar = Integer.parseInt(scanner.nextLine());
            carro.setTetoSolar(tetoSolar);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite 0 ou 1");
        }
        carrosCadastrados.add(carro);
        System.out.println("\ncarro cadastrado com sucesso!");
        carro.exibirInformacoes();

    }

    private static void cadastrarMoto(Scanner scanner) {

        System.out.println("\n====== CADASTRAR MOTO =======");
        Moto moto = new Moto();

        System.out.println("Digite o modelo da moto: ");
        moto.setModelo(scanner.nextLine());

        System.out.println("Digite a cor da moto");
        moto.setCor(scanner.nextLine());

        System.out.println("Digite a placa da moto");
        moto.setPlaca(scanner.nextLine());

        System.out.println("Tem freio Abs? (0-SIM, 1-NAO");
        try {
            int freioAbs = Integer.parseInt(scanner.nextLine());
            moto.setFreioAbs(freioAbs);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite 0 ou 1!");
        }
        System.out.println("Tem bau?(0=SIM, 1-NAO");
        try {

            int bau = Integer.parseInt(scanner.nextLine());
            moto.setBau(bau);
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite 0 ou 1");
        }

        motosCadastradas.add(moto);
        System.out.println("\nMoto cadastrada com sucesso!");
        moto.exibirInformacoes();
    }

    private static void visualizarCarrosCadastrados() {
        System.out.println("\n=====CARROS CADASTRADOS");

        if (carrosCadastrados.isEmpty()) {

            System.out.println("Nenhum carro cadastrado ainda.");
            return;
        }
        System.out.println("Total de carros: " + carrosCadastrados.size());
        System.out.println("==============================");

        for (int i = 0; i < carrosCadastrados.size(); i++) {
            Carro carro = carrosCadastrados.get(i);
            System.out.println("Carro #" + (i + 1));
            carro.exibirInformacoes();
        }

    }

    private static void visualizarMotosCadastradas() {
        System.out.println("\n===== Motos Cadastradas ======");

        if (motosCadastradas.isEmpty()) {
            System.out.println("Nenhuma moto cadastrada ainda.");
            return;
        }
        System.out.println("Total de Motos: " + motosCadastradas.size());
        System.out.println("================================");
        for (int i = 0; i < motosCadastradas.size(); i++) {
            Moto moto = motosCadastradas.get(i);
            System.out.println("Moto #" + (i + 1));
            moto.exibirInformacoes();
        }
    }

    private static void testarFuncionalidades(Scanner scanner) {
        System.out.println("\n=== TESTE DE FUNCIONALIDADES ===");
        System.out.println("1- TESTAR CARRO");
        System.out.println("2- TESTAR MOTO");
        System.out.println("ESCOLHA UMA OPÇAO");
        try {
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                testarCarro(scanner);
            } else if (opcao == 2) {
                testarMoto(scanner);
            } else {
                System.out.println("Opçao invalida!");

            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um numero valido");
        }
    }

    private static void testarCarro(Scanner scanner) {
        Carro carro = new Carro();
        carro.setModelo("carro teste");
        carro.setCor("vermelho");
        carro.setPlaca("LUC123;");
        carro.setTetoSolar(1);

        int opcao;
        do {
            System.out.println("\n===== TESTE DO CARRO =====");
            carro.exibirInformacoes();
            System.out.println("\n1- LIGAR");
            System.out.println("2- MOVER");
            System.out.println("3- PARAR");
            System.out.println("4- ABRIR/FECHAR");
            System.out.println("5- VOLTAR AO MENU PRINCIPAL");
            System.out.println("ESCOLHA UMA OPÇAO");
            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:
                        carro.ligar();
                        break;
                    case 2:
                        carro.mover();
                        break;
                    case 3:
                        carro.parar();
                        break;
                    case 4:
                        carro.abrirFechar();
                        break;
                    case 5:
                        System.out.println("Voltando ao menu principal");
                        break;
                    default:
                        System.out.println("Opçao invalida");

                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um numero valido");
                opcao = 0;
            }
        } while (opcao != 5);
    }

    private static void testarMoto(Scanner scanner) {
        Moto moto = new Moto();
        moto.setModelo("Moto Teste");
        moto.setCor("Preta");
        moto.setPlaca("DAN7865");
        moto.setFreioAbs(1);
        moto.setBau(1);
        int opcao;
        do {
            System.out.println("\n====== TESTE DA MOTO ==========");
            moto.exibirInformacoes();
            System.out.println("\n1- LIGAR");
            System.out.println("2- MOVER");
            System.out.println("3- PARAR");
            System.out.println("4- ATIVAR ALARME");
            System.out.println("5- VOLTAR AO MENU PRINCIPAL");
            System.out.println("ESCOLHA UMA OPÇAO");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        moto.ligar();
                        break;

                    case 2:
                        moto.mover();
                        break;
                    case 3:
                        moto.parar();
                        break;
                    case 4:
                        moto.alarme();
                        break;
                    case 5:
                        System.out.println("Voltando ao menu principal.....");
                    default:
                        System.out.println("opaçao invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero valido");
                opcao = 0;
            }
        } while (opcao != 5);
    }
}
