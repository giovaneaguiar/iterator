<h1 align="center">Iterator</h1>

<p>O Iterator é um padrão de projeto comportamental que permite a você percorrer 
  elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc.).
</p>

##

#### Exemplo 1

<p>
O meu exemplo implementa uma Tarefa e uma classe ListaDeTarefas que implementa o padrão Iterator para percorrer as tarefas.

## Tarefa
- Propósito: Representa uma tarefa com uma descrição.
- Atributo:
descricao: Armazena a descrição da tarefa.
- Método:
getDescricao(): Retorna a descrição da tarefa.

## ListaDeTarefas
- Propósito: Implementa o padrão Iterator para uma lista de tarefas.
- Atributo:
tarefas: Lista de objetos da classe Tarefa.
- Métodos:
adicionarTarefa(Tarefa tarefa): Adiciona uma tarefa à lista.
iterator(): Retorna um Iterator para a lista de tarefas.
obterDescricoesTarefas(): Retorna uma lista de descrições das tarefas na lista.
</p>


