public class Guerreiro extends Personagem implements HabilidadeEspecial {

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem adversario) {
        System.out.println(getNome() + " golpe de espada contra " + adversario.getNome() + "!");
        int dano = getAtaque() - adversario.getDefesa();
        if (dano < 1) {
            dano = 1;
        }
        adversario.receberDano(dano);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem adversario) {
        System.out.println(getNome() + " usa a habilidade especial");
        int dano = (getAtaque() * 2) - adversario.getDefesa();
        if (dano < 1) {
            dano = 1;
        }
        adversario.receberDano(dano);
    }
}