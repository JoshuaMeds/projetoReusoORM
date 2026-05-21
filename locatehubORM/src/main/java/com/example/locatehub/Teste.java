package com.example.locatehub;

import com.example.locatehub.model.*;
import com.example.locatehub.repository.ItemRepository;
import com.example.locatehub.repository.LocacaoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class Teste implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final LocacaoRepository locacaoRepository;

    // O Spring injeta os repositórios automaticamente aqui
    public Teste(ItemRepository itemRepository, LocacaoRepository locacaoRepository) {
        this.itemRepository = itemRepository;
        this.locacaoRepository = locacaoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("====== INICIANDO TESTE DO LOCATEHUB ======");

        // 1. Criando instâncias das subclasses de Item
        Automovel carro = new Automovel();
        carro.setNome("Fiat Uno 2013");
        carro.setDescricao("Com escada no teto, corre muito.");
        carro.setPreco(new BigDecimal("90.00"));

        Imovel apartamento = new Imovel();
        apartamento.setNome("Ap no Centro");
        apartamento.setDescricao("Próximo à faculdade, mobiliado.");
        apartamento.setPreco(new BigDecimal("150.00"));

        // 2. Salvando os itens no banco de dados
        carro = itemRepository.save(carro);
        apartamento = itemRepository.save(apartamento);
        System.out.println("✔ Itens salvos com sucesso!");

        // 3. Criando uma locação vinculando o item salvo e um ID fictício de usuário
        Locacao locacao = new Locacao();
        locacao.setItem(carro); // Vincula o objeto carro à locação (ORM em ação)
        locacao.setUsuarioId(123L); // ID fictício do usuário que alugou
        locacao.setDataInicio(LocalDate.now());
        locacao.setDataFim(LocalDate.now().plusDays(5)); // Aluguel de 5 dias

        // 4. Salvando a locação no banco de dados
        locacaoRepository.save(locacao);
        System.out.println("✔ Locação registrada com sucesso vinculada ao Item ID: " + carro.getId());

        System.out.println("====== TESTE FINALIZADO COM SUCESSO ======");
    }
}