package br.com.myapi.ecommerceapiproducts.service;

import br.com.myapi.ecommerceapiproducts.model.Segment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SegmentService {

    List<Segment> getAllSegments();
    Segment createSegment(Segment segment);
    Segment getSegmentById(Long id);
    Segment updateSegment(Long id, Segment segment);
    boolean deleteSegment(Long id);
}
