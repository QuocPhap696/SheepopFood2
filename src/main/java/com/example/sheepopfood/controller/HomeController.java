package com.example.sheepopfood.controller;

import com.example.sheepopfood.service.CategoryService;
import com.example.sheepopfood.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    /**
    @GetMapping
    public String showIndex(){
        return "login";
    }

//    @GetMapping("/cart")
//    public String showCart(){
//        return "cart";
//    }
    @GetMapping("/checkout")
    public String showCheckout(){
        return "checkout";
    }

    @GetMapping("/shop")
//    public String showShop(){
//        return "shop";
//    }
    **/

    @GetMapping("/home1")
    public String showIndex(){
        return "home";
    }
    @GetMapping("/shop")
    public String showShop(){
        return "shop";
    }

}
