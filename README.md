# 📘 Lista de 100 Exercícios Práticos de Orientação a Objetos

Esta lista contém 100 exercícios **práticos** de Programação Orientada a Objetos, organizados por dificuldade crescente.

---

## Parte 1 – Fundamentos (1–20)
1. Crie uma classe `Carro` com atributos básicos e exiba seus valores.
2. Crie uma classe `Pessoa` com construtor e método `apresentar()`.
3. Modele uma classe `Produto` que calcule preço final com desconto.
4. Crie uma classe `Aluno` que calcule média de 3 notas.
5. Modele uma classe `Livro` que exiba título e autor.
6. Crie uma classe `Retangulo` com métodos `calcularArea()` e `calcularPerimetro()`.
7. Modele uma classe `Circulo` que calcule área e circunferência.
8. Crie uma classe `ContaBancaria` com métodos `depositar()` e `sacar()`.
9. Adicione verificação de saldo negativo na `ContaBancaria`.
10. Crie uma classe `Funcionario` com método para calcular salário com bônus.
11. Modele uma classe `Agenda` que armazene contatos.
12. Crie uma classe `Venda` que calcule o valor total de itens comprados.
13. Modele uma classe `Temperatura` que converta entre Celsius e Fahrenheit.
14. Crie uma classe `Moeda` que converta valores em dólar para real.
15. Modele uma classe `Data` com método que formate dia/mês/ano.
16. Crie uma classe `Endereco` e associe-a à classe `Pessoa`.
17. Modele uma classe `Pedido` que contenha vários produtos.
18. Crie uma classe `Cofre` que só abre com senha correta.
19. Modele uma classe `Telefone` que valide número com 11 dígitos.
20. Crie uma classe `Relogio` que exiba hora atual formatada.

---

## Parte 2 – Herança e Polimorfismo (21–40)
21. Modele `Animal` e crie `Cachorro` e `Gato` herdando dela.
22. Adicione método `emitirSom()` em `Animal` e sobrescreva nas subclasses.
23. Crie `Veiculo` abstrato e subclasses `Carro` e `Moto`.
24. Crie `Funcionario` abstrato e subclasses `Gerente` e `Desenvolvedor`.
25. Sobrescreva `calcularSalario()` em cada tipo de funcionário.
26. Crie `FormaGeometrica` abstrata e implemente `Quadrado` e `Triangulo`.
27. Armazene diferentes `FormaGeometrica` em uma lista e calcule áreas.
28. Crie interface `Autenticavel` e implemente em `Usuario` e `Administrador`.
29. Modele `InstrumentoMusical` e sobrescreva `tocar()` em `Violao` e `Bateria`.
30. Crie `Pagamento` abstrato e subclasses `Pix`, `Cartao`, `Dinheiro`.
31. Modele `Documento` com subclasses `Contrato` e `Relatorio`.
32. Crie `Imposto` abstrato e subclasses `ISS` e `ICMS`.
33. Modele `Jogo` com subclasses `Futebol` e `Basquete`.
34. Crie `AnimalMarinho` com `Peixe` e `Golfinho`.
35. Modele `Funcionario` com polimorfismo em `calcularBonus()`.
36. Crie método que recebe `Animal` e chame `emitirSom()` (polimorfismo).
37. Modele `Transporte` com subclasses `Onibus`, `Metro`, `Aviao`.
38. Crie `Arquivo` abstrato e subclasses `Texto` e `Imagem`.
39. Modele `Conta` com subclasses `ContaCorrente` e `ContaPoupanca`.
40. Crie `Pessoa` e subclasses `Aluno` e `Professor` com métodos distintos.

---

## Parte 3 – Encapsulamento e Estruturas (41–60)
41. Refaça `ContaBancaria` com atributos privados e getters/setters.
42. Adicione exceção `SaldoInsuficienteException` ao `sacar()`.
43. Modele `CarrinhoDeCompras` que só permite adicionar produto com estoque.
44. Crie `Biblioteca` que armazene uma lista de `Livro`.
45. Modele `Agenda` que não permita contatos duplicados.
46. Crie `Cofre` que use encapsulamento para controlar senha.
47. Modele `Banco` que contenha várias `ContaBancaria`.
48. Crie `Empresa` que contenha lista de `Funcionario`.
49. Modele `Turma` que contenha lista de `Aluno` e calcule média geral.
50. Crie `Estoque` que adicione, remova e consulte `Produto`.
51. Modele `Restaurante` que tenha lista de `Pedido`.
52. Crie `Loja` que registre vendas e calcule faturamento.
53. Modele `Clinica` com lista de `Paciente`.
54. Crie `Hospital` que contenha `Medico` e `Enfermeiro`.
55. Modele `Cinema` que gerencie `Sessao` e `Ingresso`.
56. Crie `Time` com lista de `Jogador`.
57. Modele `Escola` que gerencie `Professor` e `Turma`.
58. Crie `BibliotecaDigital` que permita busca de `Livro` por título.
59. Modele `SistemaDeNotas` que não permita média > 10.
60. Crie `LojaVirtual` que registre pedidos com vários produtos.

---

## Parte 4 – Avançado e Padrões (61–100)
61. Implemente padrão **Singleton** em `ConfigSistema`.
62. Crie padrão **Factory** para instanciar diferentes `Veiculo`.
63. Implemente padrão **Observer** para `Estoque` notificar `Cliente`.
64. Modele padrão **Strategy** para formas de pagamento.
65. Crie padrão **Adapter** para tomada 110V funcionar em 220V.
66. Implemente padrão **Decorator** em `Bebida` com adicionais.
67. Modele padrão **Composite** para `Arquivo` e `Pasta`.
68. Crie padrão **Proxy** que simule acesso a banco de dados.
69. Implemente padrão **Command** para acender/apagar luz.
70. Modele padrão **Template Method** para geração de relatórios.
71. Crie padrão **Builder** para montar `Pedido`.
72. Implemente padrão **Prototype** clonando objetos `Documento`.
73. Modele padrão **State** para `ContaBancaria` (`Positiva`, `Negativa`).
74. Crie padrão **Chain of Responsibility** para aprovação de despesas.
75. Implemente padrão **Repository** para `Cliente`.
76. Crie valor-objeto `CPF` imutável.
77. Modele entidade `Livro` e valor-objeto `ISBN`.
78. Implemente `DDD` em sistema de biblioteca (entidades e agregados).
79. Crie `ServicoDeEmail` que use injeção de dependência.
80. Modele `ServicoDePagamento` com interface `GatewayPagamento`.
81. Crie `Logger` Singleton.
82. Modele `Configuracao` carregada de arquivo usando Singleton.
83. Implemente `ProdutoFactory` para criar produtos a partir de tipo.
84. Modele `UsuarioFactory` para criar perfis diferentes.
85. Crie `RelatorioTemplate` com subclasses `RelatorioPDF` e `RelatorioExcel`.
86. Modele `NotificacaoObserver` para `Email` e `SMS`.
87. Implemente `CarrinhoDecorator` que adiciona descontos extras.
88. Crie `ArquivoComposite` que agrupa `Texto` e `Imagem`.
89. Modele `ProxyImagem` que carrega apenas quando necessário.
90. Implemente `ComandoImpressora` (`Imprimir`, `Cancelar`).
91. Crie `PedidoBuilder` para pedidos complexos.
92. Modele `DocumentoPrototype` que permite duplicar contratos.
93. Crie `ContaState` com `Ativa`, `Bloqueada`, `Encerrada`.
94. Modele cadeia de aprovação em níveis hierárquicos.
95. Implemente `ProdutoRepository` que simula persistência.
96. Modele `UsuarioRepository` que armazena em memória.
97. Crie `OrdemDeServico` com padrão Builder.
98. Modele `ChatObserver` para receber mensagens em tempo real.
99. Implemente `PagamentoStrategy` com Pix/Cartão.
100. Modele `SistemaDeArquivosComposite` completo com arquivos/pastas.

---
