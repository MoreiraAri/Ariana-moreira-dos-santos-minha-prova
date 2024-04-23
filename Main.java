import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public class Jogador {
            private String nome;
            public int votos;

            public Jogador(String nome) {
                this.nome = nome;
                this.votos = 0;
            }

            public String getNome() {
                return nome;
            }

            public int getVotos() {
                return votos;
            }

            public void adicionaVotos() {
                this.votos++;
            }
            public class contabilizaVotos{
                public static void main(String[] args) {
                    ArrayList<Jogador> jogadores = new ArrayList<>();
                    jogadores.add(new Jogador("Alane Dias"));
                    jogadores.add(new Jogador("Beatriz reis"));
                    jogadores.add(new Jogador("Davi Brito"));
                    jogadores.add(new Jogador("Deniziane Ferreira"));
                    jogadores.add(new Jogador("Fernanda Bande"));
                    jogadores.add(new Jogador("Giovanna Lima"));
                    jogadores.add(new Jogador("Giovanna Pitel"));
                    jogadores.add(new Jogador("Isabelle Nogueira"));
                    jogadores.add(new Jogador("Juninho"));
                    jogadores.add(new Jogador("Leidy Elin"));
                    jogadores.add(new Jogador("Lucas Henrique"));
                    jogadores.add(new Jogador("Lucas Luigi"));
                    jogadores.add(new Jogador("Lucas Pizane"));
                    jogadores.add(new Jogador("Marcus Vinicius"));
                    jogadores.add(new Jogador("Matteus Amaral"));
                    jogadores.add(new Jogador("Maycon Cosmer"));
                    jogadores.add(new Jogador("MC Bin Laden"));
                    jogadores.add(new Jogador("Michel Nogueira"));
                    jogadores.add(new Jogador("Nizam"));
                    jogadores.add(new Jogador("Raquele Cardozo"));
                    jogadores.add(new Jogador("Rodriguinho"));
                    jogadores.add(new Jogador("Thalyta Alves"));
                    jogadores.add(new Jogador("Vanessa Lopes"));
                    jogadores.add(new Jogador("Vinicius Rodrigues"));
                    jogadores.add(new Jogador("Wanessa Camargo"));
                    jogadores.add(new Jogador("Yasmin Brunet"));

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Votação iniciada. Digite 'sair' para encerrar a votação.");

                    while (true) {
                        System.out.println("Em quem você vota para sair da casa?");
                        String voto = scanner.nextLine();

                        if (voto.equalsIgnoreCase("sair")) {
                            break;
                        }
                        boolean votoEncontrado = false;
                        for (Jogador jogador : jogadores) {
                            if (jogador.getNome().equalsIgnoreCase(voto)) {
                                jogador.adicionaVotos();
                                votoEncontrado = true;
                                System.out.println("Voto computado para " + jogador.getNome());
                                break;
                            }
                        }
                        if (!votoEncontrado) {
                            System.out.println("Participante não encontrado. Por favor, digite novamente:");
                        }
                    }
                    Jogador maisVotado = jogadores.get(0);
                    for (Jogador jogador : jogadores) {
                        if (jogador.getVotos() > maisVotado.getVotos()) {
                            maisVotado = jogador;
                        }
                    }

                    System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, " +
                            "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão " +
                            "virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado " +
                            "o dia em que eu vou conseguir te eliminar com alegria. Com " + maisVotado.getVotos() +
                            " votos, é você quem sai " + maisVotado.getNome());
                }
            }
        }
        }
    }

