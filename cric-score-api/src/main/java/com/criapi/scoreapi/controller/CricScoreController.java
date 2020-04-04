package com.criapi.scoreapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criapi.scoreapi.dto.CricScoreResponse;
import com.criapi.scoreapi.dto.CricScoreWinner;
import com.criapi.scoreapi.dto.ScoreApiRequest;
import com.criapi.scoreapi.service.CricScoreService;

@RestController
@RequestMapping("/api")
public class CricScoreController {

	@Autowired
	private CricScoreService cricScoreService;
	@PostMapping("/cricWinnerTeamApi")
	public ResponseEntity<CricScoreWinner> getCricStatus(@RequestBody ScoreApiRequest  request ){
		
		CricScoreWinner cricScoreWinner = cricScoreService.getCricWinnerStat(request);
		return new ResponseEntity<>(cricScoreWinner,HttpStatus.OK);
	}
}
