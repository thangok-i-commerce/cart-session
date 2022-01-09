package thangok.icommerce.cartsession.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import thangok.icommerce.cartsession.aop.executiontime.LogExecutionTime;
import thangok.icommerce.cartsession.aop.io.LogIO;
import thangok.icommerce.cartsession.dto.CartDTO;
import thangok.icommerce.cartsession.entity.Cart;
import thangok.icommerce.cartsession.repository.CartRepository;
import thangok.icommerce.cartsession.service.CartService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public Page<CartDTO> getAllCarts() {
        List<Cart> cartList = cartRepository.findAll();
        if (cartList.isEmpty()) {
            return Page.empty();
        }

        List<CartDTO> result = new ArrayList<>();
        cartList.stream().map(x -> new CartDTO() {{
            setCartCode(x.getCartCode());
            setCartName(x.getCartName());
            setDescription(x.getDescription());
        }}).forEach(result::add);

        return new PageImpl<>(result);
    }

    @Override
    public Page<CartDTO> searchCarts(String searchText) {
        return null;
    }

    @Override
    @LogExecutionTime
    @LogIO
    public Optional<CartDTO> getByCode(String cartCode) {
        Optional<Cart> cart = cartRepository.findByCartCode(cartCode);
        if (!cart.isPresent()) {
            return Optional.empty();
        }

        Cart result = cart.get();
        return Optional.of(new CartDTO() {{
            setCartCode(result.getCartCode());
            setCartName(result.getCartName());
            setDescription(result.getDescription());
        }});
    }

    @LogExecutionTime
    @LogIO
    @Override
    public CartDTO createCart(CartDTO cartDTO) {
        Cart cart = new Cart();
        cart.setCartCode(cartDTO.getCartCode());
        cart.setCartName(cartDTO.getCartName());
        cart.setDescription(cartDTO.getDescription());

        Cart result = cartRepository.save(cart);
        return new CartDTO() {{
            setCartCode(result.getCartCode());
            setCartName(result.getCartName());
            setDescription(result.getDescription());
        }};
    }

    @Override
    public CartDTO updateCart(CartDTO cartDTO) {
        return null;
    }

    @Override
    public CartDTO deleteCart(String cartCode) {
        return null;
    }
}
