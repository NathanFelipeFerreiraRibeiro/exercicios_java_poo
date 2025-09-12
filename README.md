# 📘 Lista Completa de 100 Exercícios Práticos de Orientação a Objetos

---

## Parte 1 — Fundamentos (1–20)

1. Implemente a classe `Carro` com marca, modelo, ano e um método que retorne uma string formatada com os dados; crie duas instâncias e imprima.
2. Crie `Pessoa` com construtor obrigatório (nome, idade) e método `apresentar()` que imprime “Olá, sou X e tenho Y anos”; demonstre no main.
3. Modele `Produto` com `precoBruto` e `descontoPercentual`; implemente `precoFinal()` e valide que o desconto é entre 0 e 100.
4. Crie `Aluno` com três notas e método `media()`; trate arredondamento para uma casa decimal e imprima aprovado/reprovado (corte 6.0).
5. Implemente `Livro` com título, autor, ano e método `descricao()`; instancie e exiba a descrição.
6. Crie `Retangulo` com largura e altura; métodos `area()` e `perimetro()`; valide dimensões positivas no construtor.
7. Crie `Circulo` com raio; métodos `area()` e `circunferencia()`; invalide raio ≤ 0 lançando exceção.
8. Implemente `ContaBancaria` com `depositar`, `sacar` e `getSaldo`; bloquear saques que deixem saldo negativo.
9. Evolua `ContaBancaria` para registrar um pequeno extrato (últimas N operações) e imprimir quando solicitado.
10. Crie `Funcionario` com `salarioBase` e método `salarioComBonus(percentual)`; trate bônus negativo ou absurdo (>100%).
11. Implemente `Agenda` que armazena contatos (nome, telefone) em lista; adicione, remova e busque por nome parcial.
12. Modele `Venda` que agrega `Item` (produto, quantidade, precoUnit) e calcula `total()`; bloqueie quantidade ≤ 0.
13. Crie `Temperatura` com métodos estáticos `cToF` e `fToC`; escreva testes simples no main.
14. Implemente `Moeda` com conversão Real↔Dólar usando taxa configurável no construtor; exponha `converter(valor)`.
15. Crie `Data` simples com `dia`, `mes`, `ano` e `formatada()` (dd/mm/aaaa); valide faixa de dias por mês.
16. Modele `Endereco` (rua, número, cidade) e associe a `Pessoa`; `Pessoa.enderecoCompleto()` concatena os dados.
17. Crie `Pedido` que contenha vários `Produto` e retorne subtotal, frete fixo e total; permita adicionar/remover itens.
18. Implemente `Cofre` com senha definida no construtor e métodos `abrir(senha)` e `alterarSenha(atual, nova)`; bloqueie 3 tentativas erradas.
19. Crie `Telefone` que valide número com 11 dígitos (apenas números) no construtor; lance exceção se inválido.
20. Implemente `Relogio` que retorna hora atual formatada `HH:mm:ss` e um método `tick()` que simula avanço de 1 segundo.

---

## Parte 2 — Herança e Polimorfismo (21–40)

21. Modele `Animal` com nome e `emitirSom()` abstrato; crie `Cachorro` e `Gato` sobrescrevendo e demonstrando polimorfismo numa lista.
22. Acrescente em `Animal` um método concreto `dormir()`; prove que é herdado e funciona em `Cachorro`/`Gato`.
23. Crie `Veiculo` abstrato com `velocidadeAtual` e `acelerar()`; implemente `Carro` e `Moto` com lógicas distintas de aceleração.
24. Implemente `Funcionario` abstrato com `salario()`; `Gerente` tem fixo + bônus, `Desenvolvedor` tem fixo + hora extra; liste e some salários.
25. Ajuste `calcularSalario()` para aceitar políticas diferentes de bônus por tipo; demonstre polimorfismo em uma coleção.
26. Modele `FormaGeometrica` com `area()`; crie `Quadrado` e `Triangulo`; itere lista e some áreas.
27. Acrescente `perimetro()` e mostre relatório de `area` e `perimetro` para cada forma.
28. Crie interface `Autenticavel` com `autenticar(credenciais)` e implemente em `Usuario` e `Administrador`; teste ambos.
29. Modele `InstrumentoMusical` com `tocar()`; crie `Violao` e `Bateria`; percorra lista chamando `tocar()` sem conhecer o tipo.
30. Crie `Pagamento` abstrato com `pagar(valor)`; implemente `Pix`, `Cartao`, `Dinheiro`; demonstre troca de implementação em runtime.
31. Modele `Documento` com subclasses `Contrato` e `Relatorio` que implementam `gerarConteudo()`; salve o conteúdo simulado.
32. Crie `Imposto` abstrato com `calcular(valor)`; `ISS` (5%) e `ICMS` (18%); receba `List<Imposto>` e aplique cumulativamente.
33. Modele `Jogo` com `iniciar()`; `Futebol` e `Basquete` imprimem regras específicas; use polimorfismo.
34. Crie `AnimalMarinho` (`respirarDeBaixoDAgua()` true/false); `Peixe` true, `Golfinho` false; demonstre diferenças.
35. Em `Funcionario`, adicione `calcularBonus()` com fórmulas diferentes por cargo e gere relatório de bônus total.
36. Faça um método utilitário que recebe `Animal` e chama `emitirSom()`; prove que funciona para qualquer subclasse.
37. Modele `Transporte` com `capacidade` e `custoPorKm()`; `Onibus`, `Metro`, `Aviao` têm custos diferentes; calcule custo de rota.
38. Crie `Arquivo` abstrato com `abrir()`; `Texto` e `Imagem` implementam com mensagens distintas; demonstre.
39. Modele `Conta` com `depositar/sacar`; `ContaCorrente` cobra taxa de saque; `ContaPoupanca` rende juros; simule operações.
40. Crie `Pessoa`, `Aluno` (matrícula) e `Professor` (salário); gere lista mista e imprima atributo específico via `instanceof` ou polimorfismo.

---

## Parte 3 — Encapsulamento e Estruturas (41–60)

41. Refatore `ContaBancaria` tornando `saldo` privado e expondo apenas getters/setters controlados; escreva testes de fronteira.
42. Adicione `SaldoInsuficienteException` em `sacar()` e trate no main com mensagem amigável.
43. Modele `CarrinhoDeCompras` que só adiciona produto se `estoque > 0`; atualize estoque após adicionar; proíba duplicados somando quantidades.
44. Crie `Biblioteca` que armazene `Livro` e permita buscar por título parcial e por autor; não duplique ISBN.
45. Em `Agenda`, impeça contatos de mesmo telefone; lance exceção ao duplicar.
46. Evolua `Cofre` para expor apenas métodos seguros e esconder estado interno; cubra com testes de tentativas.
47. Modele `Banco` que contém múltiplas contas e transfira valores entre elas atomicamente (ou tudo ou nada).
48. Crie `Empresa` com lista de `Funcionario` e métodos para folha mensal e repositório simples em memória.
49. Modele `Turma` que guarda `Aluno` e calcula média geral; ignore alunos sem notas.
50. Crie `Estoque` com adicionar/remover/consultar por SKU; implemente `valorTotalEmEstoque()`.
51. Modele `Restaurante` que contém `Pedido`; `Pedido` calcula total e status (ABERTO, FECHADO); mude estado após pagamento.
52. Implemente `Loja` que registra vendas e calcula faturamento do dia; gere relatório.
53. Modele `Clinica` com lista de `Paciente`; busque por CPF; proíba duplicatas; atualize cadastro.
54. Crie `Hospital` com `Medico` e `Enfermeiro`; escale plantão por dia e liste equipe do dia.
55. Modele `Cinema` com `Sessao` e `Ingresso`; impeça vender mais ingressos que lugares; calcule taxa de ocupação.
56. Crie `Time` com `Jogador` e estatísticas; compute artilheiro e média de gols.
57. Modele `Escola` com `Professor` e `Turma`; gere boletim por turma.
58. Crie `BibliotecaDigital` com busca por título e ranking por relevância (contém, começa com, igual).
59. Modele `SistemaDeNotas` que normaliza valores entre 0 e 10 e lança exceção caso extrapolem.
60. Implemente `LojaVirtual` que registra pedidos com vários produtos, calcula frete por faixa de CEP e aplica cupom percentual.

---

## Parte 4 — Avançado e Padrões (61–100) — Exercícios Detalhados

61. Implemente o padrão **Singleton** criando uma classe `ConfigSistema`. Essa classe deve ser responsável por centralizar todas as configurações da aplicação. O construtor deve ser privado, e o acesso deve ser feito apenas através de um método estático `getInstance()` que devolve sempre a mesma instância. Essa instância deve carregar chaves e valores de configuração a partir de um arquivo ou simulação em memória. Teste garantindo que, mesmo chamando `getInstance()` várias vezes, a referência seja a mesma. Evite problemas como criação via reflexão ou clonagem.
62. Crie uma **fábrica de veículos (Factory Method)** chamada `VeiculoFactory`. Essa fábrica deve centralizar a lógica de criação de diferentes tipos de veículos, como `Carro`, `Moto` e `Caminhao`. A ideia é que o cliente apenas peça `VeiculoFactory.criar("carro")` e receba a instância correta sem precisar conhecer os construtores. O código cliente não deve usar `new` diretamente. Adicione a possibilidade de incluir novos tipos sem alterar a lógica existente, apenas registrando novos criadores.
63. Modele o padrão **Observer** em um cenário de estoque. Crie uma classe `Estoque` que gerencia produtos e quantidades. Quando a quantidade de um produto sair de zero e for reposta, todos os clientes que se inscreveram para aquele produto devem ser notificados. Para isso, implemente métodos `subscribe`, `unsubscribe` e `notifyObservers`. Cada cliente observador deve receber uma mensagem informando que o produto voltou ao estoque.
64. Aplique o padrão **Strategy** para formas de pagamento. Defina uma interface `PagamentoStrategy` com um método `pagar(valor)`. Crie implementações como `Pix`, `CartaoCredito` e `Boleto`. Em um serviço `Checkout`, permita configurar qual estratégia será usada para finalizar a compra. Mostre que o sistema pode trocar a forma de pagamento em tempo de execução sem alterar a lógica principal.
65. Construa um **Adapter** para compatibilizar tomadas de diferentes voltagens. Imagine que existe uma classe `Tomada220V`, mas você precisa ligar um aparelho que só aceita `Tomada110V`. Crie o adaptador `Adaptador110V` que implemente a interface esperada por aparelhos de 110V, mas internamente use uma instância de `Tomada220V`. Simule a conversão de voltagem e demonstre que o cliente usa normalmente sem saber da adaptação.
66. Implemente o padrão **Decorator** no contexto de bebidas. Crie uma interface `Bebida` com os métodos `custo()` e `descricao()`. Faça `Cafe` como a bebida base. Em seguida, crie decoradores como `Leite`, `Chocolate` e `Canela` que adicionam custo e estendem a descrição. Mostre que é possível compor livremente os decoradores para criar combinações como “Café com leite e chocolate”.
67. Modele o padrão **Composite** para representar um sistema de arquivos. Crie uma interface `Nodo` com os métodos `tamanho()` e `listar()`. `Arquivo` retorna seu tamanho fixo, enquanto `Pasta` pode conter múltiplos `Nodo` (arquivos ou outras pastas) e calcula o tamanho total somando recursivamente os filhos. Adicione também um método `listar(indentacao)` que imprima a estrutura hierárquica em formato de árvore.
68. Crie o padrão **Proxy** para simular acesso a banco de dados. Defina uma interface `Repositorio` com o método `buscarPorId(id)`. Implemente `RepositorioReal` que simula uma consulta lenta. Crie `RepositorioProxy` que mantém um cache simples: se o dado já foi buscado, devolve do cache, caso contrário consulta o real e armazena. Demonstre o ganho de tempo ao repetir a mesma consulta várias vezes.
69. Aplique o padrão **Command** em um sistema de controle de luz. Crie a interface `Comando` com métodos `executar()` e `desfazer()`. Implemente comandos `LigarLuz` e `DesligarLuz`, que atuam sobre uma classe `Luz`. Crie também `ControleRemoto` que recebe comandos, executa e mantém histórico para permitir desfazer a última ação. Demonstre acionando a luz, desligando e usando o desfazer.
70. Modele o padrão **Template Method** em relatórios. Crie uma classe abstrata `RelatorioTemplate` que define o fluxo `gerar()`: coletar dados, formatar e exportar. As subclasses `RelatorioPDF` e `RelatorioExcel` implementam as variações de formatação e exportação. O objetivo é evitar repetição de lógica de fluxo, mantendo apenas a variação no formato final.
71. Implemente o padrão **Builder** para construção de pedidos. Crie `PedidoBuilder` com métodos encadeados como `addItem(produto, qtd)`, `aplicarCupom(cupom)`, `definirFrete(valor)`, finalizando com `build()`, que retorna um objeto `Pedido` imutável. O objetivo é facilitar a criação de pedidos complexos sem construtores gigantes. Demonstre legibilidade no uso e valide entradas inválidas (ex.: quantidade ≤ 0).
72. Modele o padrão **Prototype** para duplicação de documentos. Crie uma classe `Documento` com um método `clone()`. Implemente a clonagem profunda, de modo que listas internas sejam copiadas e não compartilhadas. Demonstre clonando contratos com placeholders como `{{nomeCliente}}` e mostrando que editar o clone não altera o original.
73. Aplique o padrão **State** em uma `ContaBancaria`. A conta deve ter dois estados: `Positiva` e `Negativa`. Cada estado define comportamento diferente para `sacar`, `depositar` e `aplicarTaxaMensal`. A conta deve trocar de estado automaticamente ao cruzar o saldo zero. Demonstre bloqueio de saques no estado negativo e aplicação de taxa extra.
74. Construa o padrão **Chain of Responsibility** para aprovação de despesas. Crie classes `Supervisor`, `Gerente` e `Diretor`, cada um com limite de aprovação (por exemplo, R$ 1.000, R$ 10.000 e acima disso). Cada classe tenta aprovar e, se não conseguir, encaminha para o próximo. Registre quem aprovou cada solicitação e trate o caso em que ninguém consegue aprovar.
75. Implemente o padrão **Repository** para gerenciar clientes. Defina `ClienteRepository` com métodos `save`, `findById`, `findAll` e `delete`. Crie uma implementação em memória e outra simulando persistência em arquivo. Mostre que a camada de serviço consegue trocar a implementação sem alterações no código.
76. Crie um valor-objeto `CPF` imutável. No construtor, valide formato e dígitos verificadores. Guarde apenas os números, sem pontos ou traços. Implemente `equals` e `hashCode` baseados no valor. Crie também `toString()` que retorna o CPF mascarado (ex.: 123..-99). Demonstre que CPFs formatados de formas diferentes são tratados como iguais.
77. Modele uma entidade `Livro` com atributos de identificação (ID, título, autor) e associe a ela um valor-objeto `ISBN`. O `ISBN` deve ser imutável e validado. Demonstre que alterar o título não muda a identidade do livro, mas o ISBN garante a integridade do cadastro.
78. Esboce um pequeno **DDD (Domain Driven Design)** de biblioteca. Crie entidades `Livro` e `Usuario`, além de um agregado `Emprestimo` cuja raiz é o `Usuario`, controlando seus empréstimos. Regras: um usuário só pode pegar até 5 livros e deve pagar multa se devolver com atraso. A lógica de negócio deve estar em serviços de domínio e não na camada de infraestrutura.
79. Implemente `ServicoDeEmail` usando **injeção de dependência**. Defina a interface `EmailGateway` e crie implementações diferentes, como `SMTPFake` e `ConsoleGateway`. `ServicoDeEmail` deve depender apenas da interface. Demonstre enviando e trocando a implementação sem alterar o serviço.
80. Modele `ServicoDePagamento` com a interface `GatewayPagamento`. Crie implementações como `StripeFake` e `PaypalFake`. `CheckoutService` deve receber um `GatewayPagamento` no construtor e processar o pagamento sem saber qual implementação está sendo usada.
81. Crie um `Logger` Singleton que permita registrar mensagens com níveis `INFO`, `WARN` e `ERROR`. O logger deve incluir timestamp em cada mensagem. Demonstre que a mesma instância é usada em diferentes pontos da aplicação.
82. Modele uma `Configuracao` Singleton que carregue um arquivo JSON ao ser chamada pela primeira vez. Exponha um método `get(chave)` para acessar valores. Adicione a capacidade de detectar alterações no arquivo e recarregar automaticamente (hot reload).
83. Implemente uma `ProdutoFactory` que crie instâncias de produtos diferentes a partir de um identificador de tipo (ex.: “camiseta”, “caneca”). Use um mapa de registradores para evitar `if/else`. Mostre que é fácil adicionar novos tipos.
84. Modele `UsuarioFactory` para criação de perfis como `CLIENTE`, `ADMIN` e `VENDEDOR`. Cada perfil deve ter permissões padrão definidas automaticamente pela fábrica. Demonstre que mudar o perfil altera o conjunto de permissões.
85. Crie `RelatorioTemplate`, aplicando novamente o padrão Template Method. Subclasses `RelatorioPDF` e `RelatorioExcel` devem variar apenas a etapa de exportação. A coleta e o processamento dos dados permanecem fixos no template.
86. Modele o padrão **Observer** em um sistema de notificações. `AssuntoNotificacao` deve gerenciar observadores que recebem eventos como “pedido enviado” ou “pedido entregue”. Crie `EmailObserver` e `SMSObserver` e demonstre inscrição e remoção dinâmica.
87. Aplique **Decorator** em um carrinho de compras. Crie decoradores como `DescontoCupon` e `FreteGratisElegivel` que envolvem um `Carrinho` existente e modificam o cálculo final. Demonstre combinações diferentes e a influência da ordem em que os decoradores são aplicados.
88. Crie um **Composite** de arquivos e pastas chamado `ArquivoComposite`. `Pasta` pode conter arquivos e subpastas. Adicione operações como `remover(nome)` e `buscar(predicate)` que percorrem recursivamente. Demonstre busca por extensão de arquivo.
89. Modele `ProxyImagem` para otimizar o carregamento de imagens pesadas. O proxy deve adiar o carregamento real até que `exibir()` seja chamado pela primeira vez. Antes disso, deve exibir uma mensagem de “carregando imagem”. Mostre que após o primeiro carregamento as próximas exibições são instantâneas.
90. Implemente o padrão **Command** em uma impressora. Crie comandos `ImprimirComando`, `CancelarComando` e `PausarComando` que atuam sobre a classe `Impressora`. Mantenha uma fila de comandos a serem executados. Adicione também a possibilidade de desfazer o último comando quando aplicável.
91. Construa `PedidoBuilder` para permitir a criação de pedidos complexos. Inclua campos opcionais como endereço de entrega, cupom de desconto, observações e data programada. Garanta que o objeto `Pedido` final seja imutável e válido.
92. Modele `DocumentoPrototype` que funcione como um template de contratos. Permita clonar e substituir placeholders como `{{cliente}}` e `{{data}}`. Demonstre que ao alterar o clone o original permanece intacto.
93. Crie `ContaState` com estados `Ativa`, `Bloqueada` e `Encerrada`. Cada estado deve ter comportamento específico para operações de `sacar`, `depositar` e `fechar`. A conta deve mudar de estado conforme os métodos são chamados, recusando operações inválidas.
94. Implemente **Chain of Responsibility** em um sistema de suporte técnico. Crie classes `AtendenteN1`, `AtendenteN2` e `Especialista`. Cada um consegue resolver chamados até determinado nível de severidade. Se não conseguir, encaminha ao próximo. Registre o caminho percorrido.
95. Modele `ProdutoRepository` com interface e duas implementações: em memória e simulando persistência em arquivo. Inclua métodos `findByCategoria` e `buscarPaginado(offset, limit)`. Demonstre a troca entre as implementações sem alterar o código cliente.
96. Crie `UsuarioRepository` que armazena usuários em memória. Use índices para buscar rapidamente por `id` e `email`. Garanta que não existam e-mails duplicados. Implemente também `autenticar(email, senhaHash)`.
97. Implemente `OrdemDeServico` com padrão Builder. A ordem deve conter cliente, itens, técnico responsável, SLA e prioridade. Adicione método para gerar resumo com custo estimado e prazo. Valide que combinações incoerentes não sejam aceitas (ex.: SLA baixo com prioridade baixa).
98. Modele `ChatObserver` em uma sala de chat. `SalaChat` é o sujeito e `Participante` são os observadores. Quando alguém envia mensagem, todos recebem. Implemente métodos para silenciar ou remover participantes durante a sessão.
99. Aplique **Strategy** para pagamentos novamente, agora com `Pix`, `CartaoCredito` e `CartaoDebito`. Cada estratégia deve validar seus próprios dados (ex.: número do cartão, token Pix). `Checkout` deve funcionar apenas com a interface da estratégia.
100. Construa um **Composite** completo de sistema de arquivos chamado `SistemaDeArquivosComposite`. Inclua tipos diferentes como `ArquivoTexto`, `ArquivoBinario` e `Pasta`. Implemente operações de cópia e recorte (mover) no nível do composite, garantindo que ao copiar uma pasta toda a sua estrutura interna também seja copiada.
