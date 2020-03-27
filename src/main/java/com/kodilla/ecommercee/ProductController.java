package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.Product;
import com.kodilla.ecommercee.domain.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET, value = "getProducts")
    public List<ProductDto> getProducts() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getProduct")
    public ProductDto getProduct(Long productId) {
        return new ProductDto(1L, "Sample product", "sample description", 1);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
    public boolean deleteProduct(Long productId) {
        System.out.println("Product has been deleted");
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateProduct")
    public ProductDto updateProduct(ProductDto productDto){
        return new ProductDto(1L, "Edited product", "Edited description", 2);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createProduct")
    public boolean createProduct(ProductDto productDto){
        System.out.println("Product was created");
        return true;
    }
}
