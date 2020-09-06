package com.goBots.Tradutor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TradutorController {
     //Aqui é criado o mapeamento para acessar o projeto no navegador
    @GetMapping("/")
    public String tradutorInicial(){
      return "tradutorInicial";}
    //Aqui é criado o mapeamento para o sistema receber a mensagem e processar/traduzir ela 
    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewTraducao (
            @RequestParam String traducao
        ) {
            TraducaoService t = new TraducaoService();
            return t.comparaPalavras(traducao) ;
        }
        }