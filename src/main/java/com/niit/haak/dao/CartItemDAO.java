package com.niit.haak.dao;

import java.util.List;

import com.niit.haak.model.Cart;
import com.niit.haak.model.CartItem;


public interface CartItemDAO {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);
    
    List<CartItem> getCartItemByItemName (String itemName);

    public List<CartItem> list();
}
