package com.lec.spring.controller;


import com.lec.spring.domain.CampingData;
import com.lec.spring.domain.DTO.TouristDetailResponse;
import com.lec.spring.domain.TouristData;
import com.lec.spring.service.TouristServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SerchDetailContoller {


    @Autowired
    private TouristServiceImpl touristServiceImpl;





    @GetMapping("/searchDetail")
    public void tourdDetails(){}



    @GetMapping("/searchDetail/{contentid}/{contenttypeid}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> showTourDetails(@PathVariable String contentid, @PathVariable String contenttypeid) {
        Map<String, Object> response = new HashMap<>();
        TouristData tour = touristServiceImpl.getTourById(contentid,contenttypeid);
        TouristDetailResponse tourDetail = touristServiceImpl.getTourDetailById(contentid,contenttypeid);

        response.put("tour", tour);
        response.put("tourDetail", tourDetail);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    좋아요
    @GetMapping("/searchDetail1/{doNm}/{camping_contentid}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> showCompingDetails( @PathVariable String doNm, @PathVariable String camping_contentid) {
        Map<String, Object> response = new HashMap<>();
        CampingData tour = touristServiceImpl.getCompingById(doNm,camping_contentid);

        response.put("tour", tour);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }




}



