# Sistema de Gestão de Estoque

## O que é?

Sistema para controlar estoque de produtos. Ajuda a saber quando precisa comprar mais produtos.

## Integrantes do Grupo

- **RM 560812** - Gabriel Dos Santos Souza - Responsável por NoSQL e IOT
- **RM 560649** - Thomas Henrique Baute - Responsável por .NET, QA e DevOPS
- **RM 559999** - Bruno Mateus Tizer das Chagas - Responsável por Mobile e JAVA (toda implementação backend)

## Como rodar?

1. Abrir o projeto no IntelliJ
2. Rodar a classe `GestaoEstoqueApplication.java`
3. A aplicação vai subir na porta `http://localhost:8082`

## Como acessar o banco H2?

- Acessar: `http://localhost:8082/h2-console`
- JDBC URL: `jdbc:h2:mem:gestao-estoque-db`
- Usuario: `sa`
- Senha: (deixar em branco)

## Entidades do Sistema

### Fornecedor
- id: String
- nome: String
- cnpj: String
- telefone: String
- email: String
- ativo: Boolean

### Produto
- id: String
- codigoProduto: String
- nomeProduto: String
- quantidadeAtual: Integer
- dataUltimaAtualizacao: Date
- fornecedor: Fornecedor (relacionamento)
- marca: Marca (relacionamento)
- ativo: Boolean

### Marca
- id: String
- nome: String
- ativo: Boolean

### Saida Estoque
- id: String
- produto: Produto (relacionamento)
- quantidade: Integer
- dataSaida: Date

### Configuracoes Fornecedor
- id: String
- mesesPlanejamento: Integer
- mesesMinimos: Integer
- prazoEntregaDias: Integer
- ativo: Boolean
- createdAt: Date
- updatedAt: Date

## Relacionamentos

- Produto tem Fornecedor (ManyToOne)
- Produto tem Marca (ManyToOne)
- SaidaEstoque tem Produto (ManyToOne)
- ConfiguracoesFornecedor tem Fornecedor (OneToOne)

## Documentação da API

A documentação completa da API está disponível via Swagger:
- Acessar: `http://localhost:8082/swagger-ui.html`
E o arquivo collection do Postman está todo em JSON na raiz do projeto

## Testes da API

Para testar os endpoints, importe a collection do Postman:
- Arquivo: `Gestao-Estoque-API.postman_collection.json`


## Modelo DER
![img.png](img.png)

## Vídeo Pitch
https://www.loom.com/share/a613b40c79c244608f3542cf14f4f79c?sid=b49be580-427a-4031-99c3-a9c4e66bacb0

## Vídeo de Funcionalidades
https://app.guidde.com/share/playbooks/5QVsBRgF2wLtsgB5oGVJ3e?origin=FpQpm0BK0JcIFJS3zfGOLS7I1eG2

## Cronograma do Projeto

### Sprint 1 (Setembro - Outubro)
- Definição do tema e escopo
- Criação das entidades e banco de dados
- Controllers básicos (Fornecedor, Produto, Marca)
- Postman Collection inicial

### Sprint 2 (Outubro - Novembro)
- Refatoração: Services + DTOs
- Novos controllers (SaidaEstoque, ConfiguracoesFornecedor)
- Lógica de negócio (saída diminui estoque)
- Melhorias no modelo (estoque no produto)
- Postman Collection completa

## Evolução Sprint 1 → Sprint 2

**O que mudou:**

1. **Arquitetura:** Adicionamos Services e DTOs (antes era direto no controller)
2. **Estoque:** Integrado ao Produto (antes era entidade separada)
3. **Lógica:** Saída atualiza estoque automaticamente
4. **Endpoints:** 3 controllers → 5 controllers (12 endpoints → 22 endpoints)

## Endpoints da API

### Fornecedores
- `GET /api/v1/fornecedores` - Listar
- `GET /api/v1/fornecedores/{id}` - Buscar
- `POST /api/v1/fornecedores` - Criar
- `PUT /api/v1/fornecedores/{id}` - Atualizar
- `DELETE /api/v1/fornecedores/{id}` - Deletar

### Marcas
- `GET /api/v1/marcas` - Listar
- `GET /api/v1/marcas/{id}` - Buscar
- `POST /api/v1/marcas` - Criar
- `PUT /api/v1/marcas/{id}` - Atualizar
- `DELETE /api/v1/marcas/{id}` - Deletar

### Produtos
- `GET /api/v1/produtos` - Listar
- `GET /api/v1/produtos/{id}` - Buscar
- `POST /api/v1/produtos` - Criar (com estoque inicial)
- `PUT /api/v1/produtos/{id}` - Atualizar
- `DELETE /api/v1/produtos/{id}` - Deletar

### Saida Estoque
- `GET /api/v1/saida-estoque` - Listar
- `GET /api/v1/saida-estoque/{id}` - Buscar
- `POST /api/v1/saida-estoque` - Registrar (diminui estoque automaticamente)

### Configuracoes Fornecedor
- `GET /api/v1/configuracoes-fornecedor` - Listar
- `GET /api/v1/configuracoes-fornecedor/{id}` - Buscar
- `POST /api/v1/configuracoes-fornecedor` - Criar
- `PUT /api/v1/configuracoes-fornecedor/{id}` - Atualizar
- `DELETE /api/v1/configuracoes-fornecedor/{id}` - Deletar