package com.mvc.demo.service.implementation;

import com.mvc.demo.entity.CommandeItem;
import com.mvc.demo.entity.Product;
import com.mvc.demo.repositories.CommandeItemRepository;
import com.mvc.demo.service.CommanItemService;
import com.mvc.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class CommandItemServiceImp implements CommanItemService {
    @Autowired
    CommandeItemRepository commandeItemRepository;
    @Autowired
    ProductService productService;

    @Override
    public Optional<CommandeItem> getById(Long id) {return commandeItemRepository.findById(id);}

    @Override
    public List<CommandeItem> getAll() {
        return commandeItemRepository.findAll();
    }

    @Override
    public int count() {
        return commandeItemRepository.findAll().size();
    }

    @Override
    public CommandeItem save(CommandeItem commandeItem) {
        Optional<Product> p = productService.getById(commandeItem.getProduct().getId());
        commandeItem.setProduct(p.get());
        return commandeItemRepository.save(commandeItem);
    }

    @Override
    public CommandeItem update(CommandeItem t) {return null;}

    @Override
    public void deleteById(Long id) {commandeItemRepository.deleteById(id);}
}
