import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListaDeTarefas implements Iterable<Tarefa> {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public Iterator<Tarefa> iterator() {
        return tarefas.iterator();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }
}