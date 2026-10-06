public class Mago extends Personagem implements HabilidadeEspecial {

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem adversario) {
        System.out.println(getNome() + " lanca um raio magico em " + adversario.getNome());
        int dano = getAtaque() - adversario.getDefesa();
        if (dano < 1) {
            dano = 1;
        }
        adversario.receberDano(dano);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem adversario) {
        System.out.println(getNome() + " conjura a habilidade especial");
        int dano = getAtaque() + 15;
        adversario.receberDano(dano);
    }
}