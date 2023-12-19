package ma.spring.learningproject.controller;

import ma.spring.learningproject.entity.DealEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/dealsss")
public class DealController {
    @GetMapping(path = "/{dealId}", produces = {"application/xml", "application/json"})
    public DealEntity getDeal(@PathVariable("dealId") String dealId) {
        return new DealEntity(dealId, "Deal Name");
    }


}
