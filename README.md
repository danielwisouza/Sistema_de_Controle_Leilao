# Sistema de Controle de Leilão em JAVA

## Trabalho Final de Programação Orientada a Objetos

### Devido aos constantes produtos e imóveis apreendidos pela Receita Federal do Brasil, o governo Brasileiro identificou a necessidade de desenvolver um Sistema de Leilões Eletrônicos mais robusto e simples que o atual Sistema de Leilões Eletrônicos (SLE) já existente e usado através do portal eCAC.

### Visando direcionar melhor o escopo inicial deste sistema, a Receita Federal pretende direcioná-lo somente para leilões de imóveis (apartamentos, terrenos, casas e edifícios comerciais) e veículos (carros e motocicletas de passeio) apreendidos. Para tal, o sistema que está sendo solicitado deve conter: 

# Funcionalidades Básicas

### 1. Registro, consulta, atualização e remoção de imóveis a serem leiloados (dentre os tipos acima destacados) – os detalhes dos dados a serem trabalhados para representar o imóveis fazem parte da pesquisa a ser realizada sobre o domínio do sistema;
### 2. Registro, consulta, atualização e remoção de veículos a serem leiloados (dentre os tipos acima destacados) – os detalhes dos dados a serem trabalhados para representar o imóveis fazem parte da pesquisa a ser realizada sobre o domínio do sistema;
### 3. Registro, consulta, atualização e remoção dos leilões, constando a data de sua ocorrência (futura), local em que o leilão ocorrerá e demais detalhes pertinentes ao domínio de um leilão eletrônico, mas que também terá entrada física no local (endereço, cidade e estado) de sua ocorrência;
### 4. Associação dos produtos registrados (imóveis e/ou veículos) ao seu respectivo leilão; a. Não deve haver produtos a serem leiloados registrados no sistema, sem sua respectiva associação a um leilão previamente registrado;
### 5. Registro, consulta, atualização e remoção dos dados de cada Cliente autorizado a interagir com o sistema, fornecendo lances e consultando os detalhes dos produtos anunciados no leilão, bem como os leilões a serem realizados; e
### 6. Registro, consulta, atualização e remoção das instituições financeiras responsáveis pela quitação das transações fechadas durante os leilões. Cada leilão terá uma entidade financeira associada ao mesmo (CNPJ) e seus dados deverão estar disponíveis aos clientes nas operações de consulta e detalhe do leilão. 

# Funcionalidades da Operação do Sistema de Leilão Eletrônico

### 1. Listagem dos leilões registrados no sistema, ordenados por data de ocorrência;
### 2. Detalhamento de um leilão específico, apresentando seu detalhes (lista de produtos ordenado por nome, entidade financeira associada, dados do leilão, quantidade total de produtos e demais dados pertinentes ao domínio);
### 3. Detalhamento de um produto associado ao leilão detalhado, apresentando todos os dados pertinentes ao detalhe do produto registrado;
#### 4. Filtro de busca de produtos em um leilão por:
#### a. Faixa de valores (min < R$ < max), sendo os valores mínimos e máximos informados pelo usuário;
#### b. Palavra chave contida no nome do produto ou na descrição do produto; e
#### c. Tipo de produto.

### 5. Possibilitar a um cliente previamente cadastrado no sistema dar um lance de valor (R$) para um produto específico – As devidas validações deverão ser mapeadas e implementadas pelos membros do grupo em relação à regras de consistência dos lances registrados;
### 6. Apresentação do histórico de lances realizado para um produto específico, destacando o produto, cliente e valor do lance – Ordenação pelo ID do lance correspondente;
### 7. Sistema deverá automaticamente analisar a faixa de horário do leilão, caso o mesmo esteja ocorrendo no momento correspondente. Uma vez ultrapassado o horário de finalização, ao consultar o detalhamento do leilão, o sistema deverá apresentar a relação de produtos acompanhado de seus respectivos clientes (ganhadores do leilão,
caso haja, senão deverá apresentar N/A), valor do lance vencedor (R$) e o status de FINALIZADO para o leilão;
### 8. Todo leilão deverá ter atrelado ao mesmo três status chaves:
#### a. EM ABERTO - Para leilões registrados, porém ainda não iniciados;
#### b. EM ANDAMENTO 0 Para leilões registrados, cuja data e faixa de horário do leilão estiverem ocorrendo no exato momento de operação do sistema; e
#### c. FINALIZADO – Para leilões cujo horário atual ultrapassou os limites da faixa de horário registrada para ocorrência do leilão.
#### d. Observação: A gestão e tratamento dos status do leilão deverá ser executada automaticamente pelo sistema, ou seja, não haverá funcionalidade para indicar que o leilão foi registrado, iniciou-se ou foi finalizado.
### 9. O sistema deverá prover também uma funcionalidade de exportação dos detalhes do leilão para um arquivo com extensão .DET contendo todas as informações do leilão, seus produtos, clientes participantes do leilão, entidade financeira associada e histórico de lances de cada produto; e
### 10. Toda e qualquer persistência de dados da aplicação deverá ser implementada em memória, simulando os registros de Objetos que seriam persistidos na base de dados, porém mantendo-os na memória. Consultas, registros, atualização e remoções deverão ser realizadas na estrutura usada para armazenar tais registros;
### 11. Todas as funcionalidades deverão ser implementadas minimamente através de menus e interfaces simples via console, que possibilitem informar as diversas entradas de dados, e efetivar todas as operações necessárias; e
### 12. O código fonte do projeto do trabalho implementado deverá ter minimamente 70% de cobertura de código validados por Teste de Unidade (30% da nota total do trabalho).
### Diferenciais relevantes com Pontuação Extra:

#### 1. Implementação das funcionalidades utilizando API gráfica Swing do próprio Java, para todas as funcionalidades do trabalho (1,5 de acréscimo na media final) –Referência: Java como Programar – 6ª, 7ª ou 8ª edição – Paul J. Deitel (Há referências a biblioteca).

