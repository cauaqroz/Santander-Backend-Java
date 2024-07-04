## Introdução: 
Este projeto simula um sistema de gerenciamento de um bootcamp online, onde desenvolvedores podem se inscrever em bootcamps, progredir através dos conteúdos inscritos, completá-los e calcular a experiência total adquirida. O sistema é composto por várias classes Java, cada uma com responsabilidades específicas:

### Dev.java
Representa um desenvolvedor participante do bootcamp. Possui métodos para:
- Inscrever-se em um bootcamp.
- Progredir nos conteúdos inscritos, movendo-os para conteúdos concluídos.
- Calcular a experiência total (XP) adquirida com base nos conteúdos concluídos.
- Getter e setter para nome, conteúdos inscritos e conteúdos concluídos.

### Bootcamp.java
Representa um bootcamp. Contém informações como **nome**, **descrição**, **datas de início** e **término**, uma lista de desenvolvedores inscritos e uma lista de conteúdos oferecidos. Possui métodos para manipulação desses dados.

### Conteudo.java
Classe abstrata que serve como base para diferentes tipos de conteúdos (como cursos e mentorias) que podem ser oferecidos no bootcamp. Define um método abstrato `calcularXp()` para calcular a experiência adquirida ao concluir o conteúdo.

### Curso.java
Subclasse de Conteudo. Representa um curso dentro do bootcamp, com uma carga horária específica. O método `calcularXp()` é implementado para calcular a experiência com base na carga horária.

### Mentoria.java
Subclasse de Conteudo. Representa uma mentoria, com uma data específica. O método `calcularXp()` é implementado para calcular a experiência, adicionando um valor fixo à experiência padrão.

### Main.java
Contém o método main, onde a execução do programa começa. Neste arquivo, são criados cursos, mentorias e um bootcamp. Desenvolvedores são criados, inscritos no bootcamp, e então progridem através dos conteúdos. Finalmente, o programa imprime informações sobre os conteúdos inscritos e concluídos pelos desenvolvedores, além da experiência total adquirida.

## Resumo do Funcionamento do Projeto:

Cursos e mentorias são criados e adicionados a um bootcamp.
Desenvolvedores se inscrevem no bootcamp, o que os associa a todos os conteúdos oferecidos.
Desenvolvedores podem "progredir" nos conteúdos, o que simula a conclusão desses conteúdos, movendo-os da lista de inscritos para a lista de concluídos.
A experiência total (XP) de cada desenvolvedor é calculada com base nos conteúdos que concluíram.
O sistema permite visualizar o progresso dos desenvolvedores no bootcamp, incluindo os conteúdos que ainda estão inscritos, os que já concluíram e a experiência total adquirida.
