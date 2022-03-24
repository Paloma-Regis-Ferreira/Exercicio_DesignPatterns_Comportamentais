package br.com.paloma.loja.imposto;

import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal efetuarCalculo(Orcamento orcamento);
}
