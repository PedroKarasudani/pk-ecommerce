package br.com.pefacil.stock.domain.port.api;

import br.com.pefacil.stock.domain.model.Stock;

public interface FindStock {

    Stock findById(Integer id);

}
