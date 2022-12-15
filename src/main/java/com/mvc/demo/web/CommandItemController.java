package com.mvc.demo.web;

import com.mvc.demo.service.CommanItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class CommandItemController {
    private CommanItemService ciService;
    @GetMapping(path = "/commandItem")
    public String getCiService() {
        return "commandItem.html";
    }
    @PostMapping("/item")
    public String getItem(@RequestBody String itemData, Model model) {
        // Process the data from local storage
        // ...

        // Add the data to the model
        model.addAttribute("item-data", itemData);

        // Return the name of the view to render
        return "commandItem";
    }
}
