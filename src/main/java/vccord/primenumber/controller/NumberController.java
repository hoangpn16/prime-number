package vccord.primenumber.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vccord.primenumber.service.NumberService;

import java.util.List;

@RestController
@RequestMapping("/prime-number")
public class NumberController {
    private static final Logger logger = LoggerFactory.getLogger(NumberController.class);

    @Autowired
    NumberService service;

    @GetMapping(value = "/{number}")
    public List<Integer> getListPrimeNumber(@PathVariable("number") Integer number){
        logger.info("Get list prime numbers < "+ number);
        return service.findPrimeNumbers(number);
    }
}
