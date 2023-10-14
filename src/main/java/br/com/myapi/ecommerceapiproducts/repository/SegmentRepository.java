package br.com.myapi.ecommerceapiproducts.repository;

import br.com.myapi.ecommerceapiproducts.model.Segment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentRepository extends JpaRepository<Segment, Long> {
}
