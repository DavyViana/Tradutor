package com.goBots.Tradutor;

public class TraducaoService {
    
    /***
     * Aqui sao criadas todas as Strings de digitação em internetês
    */
    //Strings para "Oi, tudo bem?":
    private String oitd = "oi, tudo bem?";
    private String oitd2 = "oi, td bm?";
    private String oitd3 = "oi, td bem?";
    //Strings para "Tudo bem?":
    private String tdbm1 = "tudo bem?";
    private String tdbm2 = "td bm?";
    private String tdbm3 = "td bem?";
    private String tdbm4 = "tudo bm?";
    //Strings para "Tudo ok?":
    private String tdok1 = "tudo ok?";
    private String tdok2 = "td ok?"; 
    //Strings para "Que dia é hoje?":
    private String qdia1 = "que dia é hoje?";
    private String qdia2 = "q dia eh hj?";
    private String qdia3 = "q dia é hj?";
    private String qdia4 = "que dia é hj?";
    private String qdia5 = "que dia eh hj?";
    private String qdia6 = "que dia eh hoje";
    //Strings para "Quanto custa?":
    private String qtcst1 = "quanto custa?";
    private String qtcst2 = "qto custa?";
    //Strings para "Quanto vale?":
    private String qtvl1 = "quanto vale?";
    private String qtvl2 = "qto vale?";
    //Strings para "Quando será enviado?":
    private String qnd1 = "quando será enviado?";
    private String qnd2 = "qdo será enviado?";
    //Strings para "Obrigado":
    private String obg1 = "obrigado";
    private String obg2 = "obg";
    //Strings para "Beleza":
    private String blz1 = "beleza";
    private String blz2 = "blz";
    //Strings para "Tudo beleza":
    private String tdblz1 = "tudo beleza";
    private String tdblz2 = "td blz";
    private String tdblz3 = "tudo blz";

    /***
     * Aqui são "linkadas" as Strings no internetês com a tradução no return
     */
    public String comparaPalavras(String traducao){
    //Returns para "Oi tudo bem?":
	if(oitd.equalsIgnoreCase(traducao)){
		return "Oi, tudo bem?";
	}else if(oitd2.equalsIgnoreCase(traducao)){
		return "Oi, tudo bem?";
    }else if(oitd3.equalsIgnoreCase(traducao)){
        return "Oi, tudo bem?";
    }
    //Returns para "Tudo bem?":
    else if(tdbm1.equalsIgnoreCase(traducao)){
        return "Tudo bem?";
    }else if(tdbm2.equalsIgnoreCase(traducao)){
        return "Tudo bem?";
    }else if(tdbm3.equalsIgnoreCase(traducao)){
        return "Tudo bem?";
    }else if(tdbm4.equalsIgnoreCase(traducao)){
        return "Tudo bem?";
    }
    //Returns para "Tudo ok?":
    else if(tdok1.equalsIgnoreCase(traducao)){
        return "Tudo ok?";
    }else if(tdok2.equalsIgnoreCase(traducao)){
        return "Tudo ok?";
    }
    //Returns para "Que dia é hoje?":
    else if(qdia1.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }else if(qdia2.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }else if(qdia3.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }else if(qdia4.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }else if(qdia5.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }else if(qdia6.equalsIgnoreCase(traducao)){
        return "Que dia é hoje?";
    }
    //Returns para "Quanto custa?":
    else if(qtcst1.equalsIgnoreCase(traducao)){
        return "Quanto custa?";
    }else if(qtcst2.equalsIgnoreCase(traducao)){
        return "Quanto custa?";
    }
    //Returns para "Quanto vale?":
    else if(qtvl1.equalsIgnoreCase(traducao)){
        return "Quanto vale?";
    }else if(qtvl2.equalsIgnoreCase(traducao)){
        return "Quanto vale?";
    }
    //Returns para "Quando será enviado?":
    else if(qnd1.equalsIgnoreCase(traducao)){
        return "Quando será enviado?";
    }else if(qnd2.equalsIgnoreCase(traducao)){
        return "Quando será enviado?";
    }
    //Returns para "Obrigado":
    else if(obg1.equalsIgnoreCase(traducao)){
        return "Obrigado";
    }else if(obg2.equalsIgnoreCase(traducao)){
        return "Obrigado";
    }
    //Returns para "Beleza":
    else if(blz1.equalsIgnoreCase(traducao)){
        return "Beleza";
    }else if(blz2.equalsIgnoreCase(traducao)){
        return "Beleza";
    }
    //Returns para "Tudo beleza":
    else if(tdblz1.equalsIgnoreCase(traducao)){
        return "Tudo beleza";
    }else if(tdblz2.equalsIgnoreCase(traducao)){
        return "Tudo beleza";
    }else if(tdblz3.equalsIgnoreCase(traducao)){
        return "Tudo beleza";
    }
    //Returns para caso não seja digitado algo no sistema
    return "você digitou algo que não é traduzido pelo sistema";
}
}
