## Introdução
O padrão `Chain of Responsibility` (Cadeia de Responsabilidade) é um padrão de design comportamental que permite passar a solicitação ao longo de uma cadeia de manipuladores. Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador na cadeia.

## Componentes principais do padrão Chain of Responsibility:
**Handler (Manipulador):** Interface ou classe abstrata que define o método para lidar com as solicitações e o link para o próximo manipulador na cadeia.<br>
**ConcreteHandler (Manipulador Concreto):** Classes que implementam o manipulador e definem o processamento das solicitações. Se um manipulador concreto pode lidar com a solicitação, ele o faz; caso contrário, ele passa a solicitação para o próximo manipulador na cadeia.<br>
**Client (Cliente):** O cliente que inicia a solicitação para ser processada por uma cadeia de manipuladores.

## Funcionamento do padrão:
**Início da Cadeia:** A solicitação é enviada ao primeiro manipulador na cadeia.<br>
**Processamento** ou **Delegação:** Cada manipulador decide se pode processar a solicitação. Se puder, ele a processa; se não, ele passa a solicitação para o próximo manipulador na cadeia.<br>
**Fim da Cadeia:** A cadeia de processamento continua até que a solicitação seja processada por um manipulador ou até que alcance o final da cadeia sem ser processada.

## Vantagens:
**Desacoplamento:** Os emissores e receptores de solicitações são desacoplados. O emissor não precisa saber qual objeto na cadeia processará a solicitação.<br>
**Flexibilidade:** É fácil adicionar ou remover manipuladores na cadeia.<br>
**Distribuição de Responsabilidades:** Permite que vários objetos tratem a solicitação sem acoplar o remetente aos receptores específicos.

### Exemplo no código fornecido:
**EtapaProcesso:** Classe abstrata que representa o manipulador. Define a estrutura para as etapas do processo e contém a referência para o próximo manipulador.<br>
**EtapaConexao, EtapaValidacao, etc.:** Classes concretas que implementam as etapas específicas do processo, atuando como manipuladores concretos.<br>
**Cliente:** Inicia o processo, criando a cadeia de etapas (manipuladores) e iniciando a solicitação de processamento.
#