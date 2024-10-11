public class LeiteCondensado extends BaseDecorator {
    private Tamanho tamanho;

    public LeiteCondensado(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        switch (tamanho) {
            case PEQUENO:
                return wrappee.custo() + 1.00;
            case MEDIO:
                return wrappee.custo() + 1.50;
            case GRANDE:
                return wrappee.custo() + 2.00;
            default:
                return wrappee.custo();
        }
    }
}
