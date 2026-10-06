import java.util.Random;
import java.util.Scanner;

public class JogoBatalhaRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("       BATALHA EM TURNOS       ");
        System.out.println("Escolha sua classe:");
        System.out.println("1-Guerreiro (Vida: 100, Atq: 25, Def: 10)");
        System.out.println("2-Mago (Vida: 80,  Atq: 30, Def: 5");
        System.out.print("Opção: ");

        int escolha = scanner.nextInt();

        Personagem jogador;
        Personagem inimigo;

        if (escolha == 1) {
            jogador = new Guerreiro("Arthos Jogador", 100, 25, 10);
            inimigo = new Mago("Merlin CPU", 80, 28, 6);
        } else {
            jogador = new Mago("Merlin Jogador", 80, 30, 5);
            inimigo = new Guerreiro("Arthos CPU", 100, 24, 10);
        }

        System.out.println("\nComeco da batalha: " + jogador.getNome() + " x " + inimigo.getNome() + "\n");
        int rodada = 1;

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("Rodada " + rodada);
            System.out.println(jogador.getNome() + " vida: " + jogador.getVida());
            System.out.println(inimigo.getNome() + " vida: " + inimigo.getVida());

            System.out.println("Sua vez:");
            System.out.println("1-Ataque");
            System.out.println("2-Habilidade Especial");
            System.out.print("Escolha: ");
            int acao = scanner.nextInt();
            System.out.println();

            if (acao == 2 && jogador instanceof HabilidadeEspecial) {
                ((HabilidadeEspecial) jogador).usarHabilidadeEspecial(inimigo);
            } else {
                jogador.atacar(inimigo);
            }

            if (!inimigo.estaVivo()) {
                System.out.println("\ninimigo derrotado");
                System.out.println("vitoria");
                break;
            }

            System.out.println("\nVez do adversario");
            boolean cpuUsaEspecial = random.nextInt(100) < 35;

            if (cpuUsaEspecial && inimigo instanceof HabilidadeEspecial) {
                ((HabilidadeEspecial) inimigo).usarHabilidadeEspecial(jogador);
            } else {
                inimigo.atacar(jogador);
            }

            if (!jogador.estaVivo()) {
                System.out.println("derrota");
                break;
            }

            rodada++;
            System.out.println();
        }

        scanner.close();
    }
}