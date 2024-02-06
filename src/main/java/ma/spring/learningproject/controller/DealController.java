package ma.spring.learningproject.controller;

import ma.spring.learningproject.entity.DealEntity;
import ma.spring.learningproject.entity.ImageEntity;
import ma.spring.learningproject.service.DealService;
import ma.spring.learningproject.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/deals")
public class DealController {
    private final DealService dealService;
    private final ImageService imageService;
    @Autowired
    public DealController(DealService dealService, ImageService imageService) {
        this.dealService = dealService;
        this.imageService = imageService;
    }

    @GetMapping(path = "/{dealId}", produces = {"application/xml", "application/json"})
    public ResponseEntity<DealEntity> getDeal(@PathVariable("dealId") Long dealId) {
        return new ResponseEntity<>(new DealEntity(dealId, "Hello",12L), HttpStatus.OK);
    }

    @GetMapping(path = "/{dealId}/images", produces = {"application/xml", "application/json"})
    public ResponseEntity<List<ImageEntity>> getDealimages(@PathVariable("dealId") Long dealId) {
        return new ResponseEntity<>(imageService.getImages(dealId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DealEntity> createDeal(@RequestPart("deal") DealEntity deal,
                                                 @RequestPart("images") List<MultipartFile> images) {
        try {
            // Save the deal with associated images
            DealEntity savedDeal = dealService.saveDealWithImages(deal, images);
            return new ResponseEntity<>(savedDeal, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle IO exception
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // Dummy changes


}
