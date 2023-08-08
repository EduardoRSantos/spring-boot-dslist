package com.devsuperior.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameServices;

@RestController
@RequestMapping("/games")
public class GameController {

     @Autowired
     private GameServices gameService;

     @GetMapping("/{id}")
     public GameDTO findByID(@PathVariable Long id) {
          return gameService.findById(id);
     }

     @GetMapping
     public List<GameMinDTO> findAll() {
          return gameService.findAll();
     }

}
