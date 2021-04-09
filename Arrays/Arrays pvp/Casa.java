import java.util.ArrayList;

public class Casa{
    String cor;
    ArrayList<Porta> portas = new ArrayList<Porta>();


public String pintar(String cor_i){
    cor = cor_i;
}

public void addPorta(Porta p){
    portas.add(new Porta());
}

public int TotalDePortas(){
    return portas.size();

}
public int quantasPortasEstaoAbertas(){
    int contador = 0;
    for(int i = 0; i < portas.size(); i++){
        if(portas.get(i).getAberta()) contador++;
    }
    return contador;
}

   


