package com.sortingvisualisation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sortingvisualisation.Model.SortRequest;
import com.sortingvisualisation.Service.SortingService;

@RestController
@RequestMapping("/api/sort")
public class SortingController {

    @Autowired
    private SortingService sortingService;

    @PostMapping
    public String[] sortData(@RequestBody SortRequest sortRequest) {
        return sortingService.sortData(sortRequest.getData(), sortRequest.getAlgorithm());
    }
}
