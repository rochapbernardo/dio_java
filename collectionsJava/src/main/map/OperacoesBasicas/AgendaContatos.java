package main.map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer tel){
        //comando put no map é utilizado para atualizar os dados de uma chave
        agendaContatoMap.put(nome, tel);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarNome(String nome){
        Integer numeroNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroNome = agendaContatoMap.get(nome);
        }
        return numeroNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContato = new AgendaContatos();

        agendaContato.adicionarContato("Camila", 1111);
        agendaContato.adicionarContato("Camila", 222222);
        agendaContato.adicionarContato("Camila Cavalcante", 12345);
        agendaContato.adicionarContato("Camila DIO", 78965);
        agendaContato.adicionarContato("Bernardo Rocha", 45623);

        agendaContato.exibirContato();

        agendaContato.removerContato("Bernardo Rocha");

        agendaContato.exibirContato();

        System.out.println("Número: " + agendaContato.pesquisarNome("Camila DIO"));
    }

}