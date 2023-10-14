package br.com.myapi.ecommerceapiproducts.service;

import br.com.myapi.ecommerceapiproducts.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getProductsBySegment(Long segment_id);
    Product createProduct(Product product);
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}
