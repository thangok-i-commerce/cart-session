package thangok.icommerce.cartsession.service;

import org.springframework.data.domain.Page;
import thangok.icommerce.cartsession.dto.CartDTO;

import java.util.Optional;

public interface CartService {

    Page<CartDTO> getAllCarts();

    Page<CartDTO> searchCarts(String searchText);

    Optional<CartDTO> getByCode(String cartCode);

    CartDTO createCart(CartDTO cartDTO);

    CartDTO updateCart(CartDTO cartDTO);

    CartDTO deleteCart(String cartCode);

}
