package com.PraticandoMVCSpringDevDojo.controller;

import com.PraticandoMVCSpringDevDojo.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeController {
    //localhost:8080/anime/list
    @GetMapping("/anime/list")
    public  List<Anime> list() {
        List<Anime> anime = List.of(new Anime("boll"), new Anime("Roayal"));
        return anime;

    }
}
