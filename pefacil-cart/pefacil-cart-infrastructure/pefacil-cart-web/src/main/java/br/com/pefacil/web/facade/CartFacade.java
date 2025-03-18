package br.com.pefacil.web.facade;

import br.com.pefacil.domain.port.api.CreateCart;
import br.com.pefacil.domain.port.api.DeleteCart;
import br.com.pefacil.domain.port.api.FindCart;
import br.com.pefacil.domain.port.api.UpdateCart;
import br.com.pefacil.web.converter.CartConverter;
import br.com.pefacil.web.model.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartFacade {

    @Autowired
    CartConverter converter;

    @Autowired
    CreateCart createCart;

    @Autowired
    DeleteCart deleteCart;

    @Autowired
    FindCart findCart;

    @Autowired
    UpdateCart updateCart;

    public CartDTO create(CartDTO cartDTO){
        return this.converter.toDTO(this.createCart.create(this.converter.toDomain(cartDTO)));
    }

    public void deleteById(Long id){
        this.deleteCart.deleteById(id);
    }

    public CartDTO findById(Long id){
        return this.converter.toDTO(this.findCart.findById(id).get());
    }

    public CartDTO update(Long id, CartDTO cartDTO) {
        return this.converter.toDTO(this.updateCart.update(id, this.converter.toDomain(cartDTO)));
    }

}
