package br.com.myapi.ecommerceapiproducts.service;

import br.com.myapi.ecommerceapiproducts.model.Segment;
import br.com.myapi.ecommerceapiproducts.repository.SegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentServiceImpl implements SegmentService {

    private final SegmentRepository segmentRepository;

    @Autowired
    public SegmentServiceImpl(SegmentRepository segmentRepository) {
        this.segmentRepository = segmentRepository;
    }

    @Override
    public List<Segment> getAllSegments() {
        return segmentRepository.findAll();
    }

    @Override
    public Segment createSegment(Segment segment) {
        return segmentRepository.save(segment);
    }

    @Override
    public Segment getSegmentById(Long id) {
        return segmentRepository.findById(id).orElse(null);
    }

    @Override
    public Segment updateSegment(Long id, Segment segment) {
        Segment existingSegment = segmentRepository.findById(id).orElse(null);
        if (existingSegment != null) {
            existingSegment.setTitle(segment.getTitle());
            // Atualize outros campos, se necessário
            return segmentRepository.save(existingSegment);
        }
        return null;
    }

    @Override
    public boolean deleteSegment(Long id) {
        Segment segment = segmentRepository.findById(id).orElse(null);
        if (segment != null) {
            segmentRepository.delete(segment);
            return true;
        }
        return false;
    }
}

