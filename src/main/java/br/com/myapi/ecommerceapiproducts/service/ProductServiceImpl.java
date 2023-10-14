package br.com.myapi.ecommerceapiproducts.service;

import br.com.myapi.ecommerceapiproducts.model.Product;
import br.com.myapi.ecommerceapiproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setTitle(product.getTitle());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setDetails(product.getDetails());
            existingProduct.setSegment_id(product.getSegment_id());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    @Override
    public boolean deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            product.set_active(false);
            productRepository.save(product);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> getProductsBySegment(Long segment_id) {
        return productRepository.findProductsBySegment(segment_id);
    }
}