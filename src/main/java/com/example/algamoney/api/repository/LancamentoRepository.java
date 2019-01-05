package com.example.algamoney.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;
import com.example.algamoney.api.repository.projection.ResumoLancamento;
import com.example.algamoney.api.resource.filter.LancamentoFilter;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	Page<Lancamento> fitrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	/*
	 @Query("select l from Lancamento l join fetch l.categoria c " +
	           "join fetch l.pessoa p ")
	    List<Lancamento> findAll();
	    */
    Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
