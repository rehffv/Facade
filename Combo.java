class Combo //Classe FACADE
{
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void CriarCombo(int tipo) 
    {
        switch (tipo) 
        {
            case 1:
                burguer = new Burguer("Burguer Master", 10.0);
                sobremesa = new Sobremesa("Sobremesa Master", 5.0);
                bebida = new Bebida("Bebida Master", 3.0);
                break;
            case 2:
                burguer = new Burguer("Super Burguer", 12.0);
                sobremesa = new Sobremesa("Super Sobremesa", 6.0);
                bebida = new Bebida("Super Bebida", 4.0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public String toString() 
    {
        if (burguer != null && sobremesa != null && bebida != null) 
        {
            return "\nCombo: " 
            + burguer.getNome() + " - R$ " + burguer.getPreco()
            + " + " + sobremesa.getNome() + " - R$ " + sobremesa.getPreco()
            + " + " + bebida.getNome() + " - R$ " + bebida.getPreco()
            + "\nValor total do Combo: >> R$ " + (burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco()) + " <<\n\n";
        } else 
        {
            return "Nenhum combo foi selecionado.";
        }
    }
}
