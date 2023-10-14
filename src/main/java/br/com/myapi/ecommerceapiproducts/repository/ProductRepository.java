package br.com.myapi.ecommerceapiproducts.repository;

import br.com.myapi.ecommerceapiproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM products p WHERE p.segment_id = :segment_id AND p.is_active = true", nativeQuery = true)
    public List<Product> findProductsBySegment(@Param("segment_id") Long segment_id);
}
