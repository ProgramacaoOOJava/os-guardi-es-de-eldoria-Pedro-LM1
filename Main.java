public class Main{
    public static void main(String[] args){
        Personagem heroi1 = new Personagem("Pedro", "Paladin", 8, 100, 11.5);
        Personagem heroi2 = new Personagem("Arthus", "Guerreiro", 10, 100, 10.5);

        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
