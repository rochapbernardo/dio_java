package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    
    public  void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo){
        Convidado convidadoRemover = null;
        for(Convidado c: convidadosSet){
            if(c.getCodigoConvite() == codigo){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("bernardo", 1234);
        convidados.adicionarConvidado("eduardo", 1234);
        convidados.adicionarConvidado("ananias", 4563);
        convidados.adicionarConvidado("giovanna", 7895);
        convidados.adicionarConvidado("viviani", 8527);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();

        convidados.removerConvidado(1234);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
    }
}
