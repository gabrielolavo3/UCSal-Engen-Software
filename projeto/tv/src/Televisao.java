import java.util.Scanner;

public class Televisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char opcao = ' ';
        short volume = 0,
              canal = 1;
        boolean status = false;

        while(opcao != '0') {
            System.out.println("\nTELEVISÃO - Menu de Seleção");
            System.out.println("1 - Power(Ligar/Desligar a TV)");
            System.out.println("2 - Mudar o canal");
            System.out.println("3 - Alterar o volume");
            System.out.println("0 - Sair e encerrar");
            System.out.print("Selecione a opção desejada: ");
            opcao = scan.next().charAt(0);

            switch (opcao) {
                case '1':
                    status = powerBtn(status);
                    exibirStatus(status, canal, volume);

                    break;
                case '2':
                    if (!status) {
                        System.out.println("Por favor, ligue a TV para usar a funcionalidade");
                    }
                    else {
                        canal = mudarCanal(scan, canal);
                        exibirStatus(status, canal, volume);
                    }
                    break;
                case '3':
                    if (!status) {
                        System.out.println("Por favor, ligue a TV para usar a funcionalidade");
                    }
                    else {
                        volume = alternarVolume(scan, volume);
                        exibirStatus(status, canal, volume);
                    }
                    break;
                case '0':
                    System.out.println("Desligando a TV");
                    System.out.println("Programa encerrado...");
                    break;
                default:
                    System.out.println("\nEscolha uma opção válida ou encerre o programa!");
                    break;
            }
        }
    }

    public static short mudarCanal(Scanner scan, short canal) {
        short novoCanal;
        char validadorCanal = '1';

        while (validadorCanal == '1') {
            System.out.print("Informe para qual canal deseja ir: ");
            novoCanal = scan.nextShort();

            if (novoCanal != 1 &&
                novoCanal != 3 &&
                novoCanal != 5 &&
                novoCanal != 7 &&
                novoCanal != 11) {
                System.out.println("Canal inválido! Tente os canais 1, 3, 5, 7 ou 11");
            }
            else {
                canal = novoCanal;
                validadorCanal = ' ';
            }
        }

        return canal;
    }

    public static short alternarVolume (Scanner scan, short volumeAtual) {
        char opcaoVolume;
        short novoVolume = -1;

        System.out.println("\nVocê entrou no menu de volume!");
        System.out.println("1 - Aumentar o volume");
        System.out.println("2 - Diminuir o volume");
        System.out.print("Selecione a opção desejada: ");
        opcaoVolume = scan.next().charAt(0);
        System.out.println("\nVolume atual: " + volumeAtual);

        while (novoVolume <= 0) {
            switch (opcaoVolume) {
                case '1':
                    System.out.print("Informe o quanto deseja aumentar: ");
                    novoVolume = scan.nextShort();

                    if (novoVolume > 0) {
                        volumeAtual += novoVolume;
                    }
                    else {
                        System.out.println("Insira um valor maior do que 0");
                    }

                    if (volumeAtual > 100) {
                        volumeAtual = 100;
                    }
                    break;
                case '2':
                    System.out.print("Informe o quanto deseja diminuir: ");
                    novoVolume = scan.nextShort();

                    if (novoVolume > 0) {
                        volumeAtual -= novoVolume;
                    }
                    else {
                        System.out.println("Insira um valor maior do que 0");
                    }

                    if (volumeAtual < 0) {
                        volumeAtual = 0;
                    }
                    break;
            }
        }

        return volumeAtual;
    }

    public static void exibirStatus(boolean statusTv, short canalTv, short volumeTv) {
        String estado;
        estado = statusTv == true ? "Ligada" : "Desligada";

        System.out.println("\nDados atualizados");
        System.out.printf("Canal: %d | Volume: %d | Status: %s\n", canalTv, volumeTv, estado);
    }

    public static boolean powerBtn(boolean statusTv) {
        if (statusTv) {
            System.out.print("Tv desligada");
            return false;
        }
        else {
            System.out.print("Tv ligada");
            return true;
        }
    }
}