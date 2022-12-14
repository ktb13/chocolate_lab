package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "chocolates")
public class ChocolateController {

//    @Autowired
//    Chocolate chocolate;

//    @Autowired
//    Estate estates;

    @Autowired
    ChocolateRepository chocolateRepository;

//    @Autowired
//    EstateRepository estateRepository;

    @GetMapping()
    public ResponseEntity<List<Chocolate>> getAllChocolates(){
        List<Chocolate> chocolates = chocolateRepository.findAll();
        return new ResponseEntity<>(chocolates, HttpStatus.OK);
    }

//    @GetMapping(value = "/estates")
//    public ResponseEntity<List<Estate>> getAllEstates(){
//        List<Estate> estates = estateRepository.findAll();
//        return new ResponseEntity<>(estates, HttpStatus.OK);

//    }






}
