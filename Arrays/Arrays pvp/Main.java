public class Main{
    static public void main(String args[]){
    Casa nova_casa = new Casa();
    
    nova_casa.addPorta();
    nova_casa.addPorta();
    nova_casa.addPorta();

    System.out.println("Quantidade de portas:" +nova_casa.totalDePortas());

        nova_casa.portas.get(1).pintar("Azul");
        nova_casa.portas.get(0).abrir();
        nova_casa.portas.get(2).abrir();
        System.out.println("Quantidade de portas Abertas:"+novaCasa.quantasPortasEstaoAbertas());
    }
}