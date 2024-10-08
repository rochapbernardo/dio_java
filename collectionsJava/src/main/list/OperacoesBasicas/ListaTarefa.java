package main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemover);
    }

    public int totalTarefas(){
        return tarefaList.size();
    }

    public void descricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + listaTarefa.totalTarefas());
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de tarefas é: " + listaTarefa.totalTarefas());

        listaTarefa.descricaoTarefas();
    }
}
