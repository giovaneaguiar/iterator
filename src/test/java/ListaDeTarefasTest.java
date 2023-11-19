import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ListaDeTarefasTest {

    @Test
    void testObterDescricoesTarefas() {

        Tarefa tarefa1 = new Tarefa("Estudar para a prova");
        Tarefa tarefa2 = new Tarefa("Fazer exercícios");
        Tarefa tarefa3 = new Tarefa("Preparar apresentação");

        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.adicionarTarefa(tarefa1);
        listaDeTarefas.adicionarTarefa(tarefa2);
        listaDeTarefas.adicionarTarefa(tarefa3);

        List<String> descricoes = listaDeTarefas.obterDescricoesTarefas();

        List<String> descricoesEsperadas = Arrays.asList(
                "Estudar para a prova",
                "Fazer exercícios",
                "Preparar apresentação"
        );
        Assertions.assertEquals(descricoesEsperadas, descricoes);
    }
}