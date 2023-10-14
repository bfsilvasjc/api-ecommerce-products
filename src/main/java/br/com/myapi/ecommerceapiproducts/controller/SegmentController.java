package br.com.myapi.ecommerceapiproducts.controller;

import br.com.myapi.ecommerceapiproducts.model.Segment;
import br.com.myapi.ecommerceapiproducts.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/segment")
public class SegmentController {

    private final SegmentService segmentService;

    @Autowired
    public SegmentController(SegmentService segmentService) {
        this.segmentService = segmentService;
    }

    @GetMapping("/")
    public List<Segment> getAllSegments() {
        return segmentService.getAllSegments();
    }

    @PostMapping("/")
    public Segment createSegment(@RequestBody Segment segment) {
        return segmentService.createSegment(segment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Segment> getSegmentById(@PathVariable Long id) {
        Segment segment = segmentService.getSegmentById(id);
        if (segment != null) {
            return ResponseEntity.ok(segment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Segment> updateSegment(@PathVariable Long id, @RequestBody Segment segment) {
        Segment updatedSegment = segmentService.updateSegment(id, segment);
        if (updatedSegment != null) {
            return ResponseEntity.ok(updatedSegment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSegment(@PathVariable Long id) {
        if (segmentService.deleteSegment(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


