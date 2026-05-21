1. Crie a nova classe dentro do pacote `model` e utilize as anotações do JPA (`@Entity`, `@Id`, etc.).
2. Crie uma interface correspondente dentro do pacote `repository`.

---

1. **Alterar os dados de teste:** Se quiser modificar os itens ou as locações geradas automaticamente, altere as instruções dentro da classe `Teste.java` (`src/main/java/com/example/locatehub/Teste.java`).
   
2. **Rodar a aplicação:**
   Abra a classe principal do projeto: `LocatehubOrmApplication.java`.
   Clique no ícone de **Play (Run)** do IntelliJ para iniciar o servidor.

3. **Verificar no Banco de Dados:**
   Abra o MySQL Workbench (ou o gerenciador de sua preferência) no schema `locatehuborm` e execute as consultas para verificar o mapeamento:
   ```sql
   SELECT * FROM tabela_criada;
