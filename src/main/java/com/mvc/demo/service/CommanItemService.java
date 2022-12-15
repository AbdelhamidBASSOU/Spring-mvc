package com.mvc.demo.service;

import com.mvc.demo.entity.CommandeItem;
import java.util.List;
import java.util.Optional;

public interface CommanItemService {
    Optional<CommandeItem> getById(Long id);
    List<CommandeItem> getAll() ;
    int count();
    CommandeItem save(CommandeItem t);
    CommandeItem update(CommandeItem t);
    void deleteById(Long id);
}
