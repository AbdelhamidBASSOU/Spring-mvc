package com.mvc.demo.web;

import com.mvc.demo.entity.Product;
import com.mvc.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping(path = "/product")
    public String product(Model model){
        List<Product> productList=productService.getAll();
        model.addAttribute("listProduct",productList);
        return "product";
    }
    @PostMapping(path = "/addProduct")
    public Product add(@RequestBody Product product){
        return product;
    }
}
