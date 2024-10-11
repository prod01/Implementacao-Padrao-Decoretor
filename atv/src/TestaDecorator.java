public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiSimples = new Acai(Tamanho.MEDIO);
        System.out.println(acaiSimples.getDescricao() + " custa R$ " + acaiSimples.custo());

        Adicional acaiComMorango = new Morango(acaiSimples, Tamanho.MEDIO);
        System.out.println(acaiComMorango.getDescricao() + " custa R$ " + acaiComMorango.custo());

        Adicional acaiComMorangoBananaLeite = new LeiteCondensado(new Banana(acaiComMorango, Tamanho.MEDIO), Tamanho.MEDIO);
        System.out.println(acaiComMorangoBananaLeite.getDescricao() + " custa R$ " + acaiComMorangoBananaLeite.custo());
    }
}
