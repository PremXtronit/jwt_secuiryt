package com.jwtsecurity.controller;


import com.jwtsecurity.comman.Apis;
import com.jwtsecurity.service.NYTimesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NYTimesController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NYTimesService nyTimesService;


    @GetMapping(value = Apis.GET_ARTICLE)
    public ResponseEntity<String> getNYTimesArticles(@PathVariable Long period) {


        return ResponseEntity.ok(nyTimesService.getNYTimesArticles());
    }

}
