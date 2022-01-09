package thangok.icommerce.cartsession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import thangok.icommerce.cartsession.dto.CartDTO;
import thangok.icommerce.cartsession.service.CartService;

import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/")
    public Page<CartDTO> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/{cartCode}")
    public Optional<CartDTO> getByCode(@PathVariable("cartCode") String cartCode) {
        return cartService.getByCode(cartCode);
    }

    @GetMapping("/search/{searchText}")
    public Page<CartDTO> searchCarts(@PathVariable("searchText") String searchText) {
        return cartService.searchCarts(searchText);
    }

    @PostMapping("/")
    public CartDTO createCart(@RequestBody final CartDTO cartDTO) {
        return cartService.createCart(cartDTO);
    }
}
