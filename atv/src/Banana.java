public class Banana extends BaseDecorator {
    private Tamanho tamanho;

    public Banana(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
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