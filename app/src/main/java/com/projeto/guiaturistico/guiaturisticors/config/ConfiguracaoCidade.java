package com.projeto.guiaturistico.guiaturisticors.config;

import com.projeto.guiaturistico.guiaturisticors.model.Cidade;

import java.util.ArrayList;

public final class ConfiguracaoCidade {

    private String[] nomeCidades = {
            "Aceguá",
            "Água Santa",
            "Agudo",
            "Ajuricaba",
            "Alecrim",
            "Alegrete",
            "Alegria",
            "Almirante Tamandaré do Sul",
            "Alpestre",
            "Alto Alegre",
            "Alto Feliz",
            "Alvorada",
            "Amaral Ferrador",
            "Ametista do Sul",
            "André da Rocha",
            "Anta Gorda",
            "Antônio Prado",
            "Arambaré",
            "Araricá",
            "Aratiba",
            "Arroio do Meio",
            "Arroio do Padre",
            "Arroio do Sal",
            "Arroio do Tigre",
            "Arroio dos Ratos",
            "Arroio Grande",
            "Arvorezinha",
            "Augusto Pestana",
            "Áurea",
            "Bagé",
            "Balneário Pinhal",
            "Barão",
            "Barão de Cotegipe",
            "Barão do Triunfo",
            "Barra do Guarita",
            "Barra do Quaraí",
            "Barra do Ribeiro",
            "Barra do Rio Azul",
            "Barra Funda",
            "Barracão",
            "Barros Cassal",
            "Benjamin Constant do Sul",
            "Bento Gonçalves",
            "Boa Vista das Missões",
            "Boa Vista do Buricá",
            "Boa Vista do Cadeado",
            "Boa Vista do Incra",
            "Boa Vista do Sul",
            "Bom Jesus",
            "Bom Princípio",
            "Bom Progresso",
            "Bom Retiro do Sul",
            "Boqueirão do Leão",
            "Bossoroca",
            "Bozano",
            "Braga",
            "Brochier",
            "Butiá",
            "Caçapava do Sul",
            "Cacequi",
            "Cachoeira do Sul",
            "Cachoeirinha",
            "Cacique Doble",
            "Caibaté",
            "Caiçara",
            "Camaquã",
            "Camargo",
            "Cambará do Sul",
            "Campestre da Serra",
            "Campina das Missões",
            "Campinas do Sul",
            "Campo Bom",
            "Campo Novo",
            "Campos Borges",
            "Candelária",
            "Cândido Godói",
            "Candiota",
            "Canela",
            "Canguçu",
            "Canoas",
            "Canudos do Vale",
            "Capão Bonito do Sul",
            "Capão da Canoa",
            "Capão do Cipó",
            "Capão do Leão",
            "Capela de Santana",
            "Capitão",
            "Capivari do Sul",
            "Caraá",
            "Carazinho",
            "Carlos Barbosa",
            "Carlos Gomes",
            "Casca",
            "Caseiros",
            "Catuípe",
            "Caxias do Sul",
            "Centenário",
            "Cerrito",
            "Cerro Branco",
            "Cerro Grande",
            "Cerro Grande do Sul",
            "Cerro Largo",
            "Chapada",
            "Charqueadas",
            "Charrua",
            "Chiapetta",
            "Chuí",
            "Chuvisca",
            "Cidreira",
            "Ciríaco",
            "Colinas",
            "Colorado",
            "Condor",
            "Constantina",
            "Coqueiro Baixo",
            "Coqueiros do Sul",
            "Coronel Barros",
            "Coronel Bicaco",
            "Coronel Pilar",
            "Cotiporã",
            "Coxilha",
            "Crissiumal",
            "Cristal",
            "Cristal do Sul",
            "Cruz Alta",
            "Cruzaltense",
            "Cruzeiro do Sul",
            "David Canabarro",
            "Derrubadas",
            "Dezesseis de Novembro",
            "Dilermando de Aguiar",
            "Dois Irmãos",
            "Dois Irmãos das Missões",
            "Dois Lajeados",
            "Dom Feliciano",
            "Dom Pedrito",
            "Dom Pedro de Alcântara",
            "Dona Francisca",
            "Doutor Maurício Cardoso",
            "Doutor Ricardo",
            "Eldorado do Sul",
            "Encantado",
            "Encruzilhada do Sul",
            "Engenho Velho",
            "Entre Rios do Sul",
            "Entre-Ijuís",
            "Erebango",
            "Erechim",
            "Ernestina",
            "Erval Grande",
            "Erval Seco",
            "Esmeralda",
            "Esperança do Sul",
            "Espumoso",
            "Estação",
            "Estância Velha",
            "Esteio",
            "Estrela",
            "Estrela Velha",
            "Eugênio de Castro",
            "Fagundes Varela",
            "Farroupilha",
            "Faxinal do Soturno",
            "Faxinalzinho",
            "Fazenda Vilanova",
            "Feliz",
            "Flores da Cunha",
            "Floriano Peixoto",
            "Fontoura Xavier",
            "Formigueiro",
            "Forquetinha",
            "Fortaleza dos Valos",
            "Frederico Westphalen",
            "Garibaldi",
            "Garruchos",
            "Gaurama",
            "General Câmara",
            "Gentil",
            "Getúlio Vargas",
            "Giruá",
            "Glorinha",
            "Gramado",
            "Gramado dos Loureiros",
            "Gramado Xavier",
            "Gravataí",
            "Guabiju",
            "Guaíba",
            "Guaporé",
            "Guarani das Missões",
            "Harmonia",
            "Herval",
            "Herveiras",
            "Horizontina",
            "Hulha Negra",
            "Humaitá",
            "Ibarama",
            "Ibiaçá",
            "Ibiraiaras",
            "Ibirapuitã",
            "Ibirubá",
            "Igrejinha",
            "Ijuí",
            "Ilópolis",
            "Imbé",
            "Imigrante",
            "Independência",
            "Inhacorá",
            "Ipê",
            "Ipiranga do Sul",
            "Iraí",
            "Itaara",
            "Itacurubi",
            "Itapuca",
            "Itaqui",
            "Itati",
            "Itatiba do Sul",
            "Ivorá",
            "Ivoti",
            "Jaboticaba",
            "Jacuizinho",
            "Jacutinga",
            "Jaguarão",
            "Jaguari",
            "Jaquirana",
            "Jari",
            "Jóia",
            "Júlio de Castilhos",
            "Lagoa Bonita do Sul",
            "Lagoa dos Três Cantos",
            "Lagoa Vermelha",
            "Lagoão",
            "Lajeado",
            "Lajeado do Bugre",
            "Lavras do Sul",
            "Liberato Salzano",
            "Lindolfo Collor",
            "Linha Nova",
            "Maçambará",
            "Machadinho",
            "Mampituba",
            "Manoel Viana",
            "Maquiné",
            "Maratá",
            "Marau",
            "Marcelino Ramos",
            "Mariana Pimentel",
            "Mariano Moro",
            "Marques de Souza",
            "Mata",
            "Mato Castelhano",
            "Mato Leitão",
            "Mato Queimado",
            "Maximiliano de Almeida",
            "Minas do Leão",
            "Miraguaí",
            "Montauri",
            "Monte Alegre dos Campos",
            "Monte Belo do Sul",
            "Montenegro",
            "Mormaço",
            "Morrinhos do Sul",
            "Morro Redondo",
            "Morro Reuter",
            "Mostardas",
            "Muçum",
            "Muitos Capões",
            "Muliterno",
            "Não-Me-Toque",
            "Nicolau Vergueiro",
            "Nonoai",
            "Nova Alvorada",
            "Nova Araçá",
            "Nova Bassano",
            "Nova Boa Vista",
            "Nova Bréscia",
            "Nova Candelária",
            "Nova Esperança do Sul",
            "Nova Hartz",
            "Nova Pádua",
            "Nova Palma",
            "Nova Petrópolis",
            "Nova Prata",
            "Nova Ramada",
            "Nova Roma do Sul",
            "Nova Santa Rita",
            "Novo Barreiro",
            "Novo Cabrais",
            "Novo Hamburgo",
            "Novo Machado",
            "Novo Tiradentes",
            "Novo Xingu",
            "Osório",
            "Paim Filho",
            "Palmares do Sul",
            "Palmeira das Missões",
            "Palmitinho",
            "Panambi",
            "Pantano Grande",
            "Paraí",
            "Paraíso do Sul",
            "Pareci Novo",
            "Parobé",
            "Passa-Sete",
            "Passo do Sobrado",
            "Passo Fundo",
            "Paulo Bento",
            "Paverama",
            "Pedras Altas",
            "Pedro Osório",
            "Pejuçara",
            "Pelotas",
            "Picada Café",
            "Pinhal",
            "Pinhal da Serra",
            "Pinhal Grande",
            "Pinheirinho do Vale",
            "Pinheiro Machado",
            "Pinto Bandeira",
            "Pirapó",
            "Piratini",
            "Planalto",
            "Poço das Antas",
            "Pontão",
            "Ponte Preta",
            "Portão",
            "Porto Alegre",
            "Porto Lucena",
            "Porto Mauá",
            "Porto Vera Cruz",
            "Porto Xavier",
            "Pouso Novo",
            "Presidente Lucena",
            "Progresso",
            "Protásio Alves",
            "Putinga",
            "Quaraí",
            "Quatro Irmãos",
            "Quevedos",
            "Quinze de Novembro",
            "Redentora",
            "Relvado",
            "Restinga Seca",
            "Rio dos Índios",
            "Rio Grande",
            "Rio Pardo",
            "Riozinho",
            "Roca Sales",
            "Rodeio Bonito",
            "Rolador",
            "Rolante",
            "Ronda Alta",
            "Rondinha",
            "Roque Gonzales",
            "Rosário do Sul",
            "Sagrada Família",
            "Saldanha Marinho",
            "Salto do Jacuí",
            "Salvador das Missões",
            "Salvador do Sul",
            "Sananduva",
            "Santa Bárbara do Sul",
            "Santa Cecília do Sul",
            "Santa Clara do Sul",
            "Santa Cruz do Sul",
            "Santa Margarida do Sul",
            "Santa Maria",
            "Santa Maria do Herval",
            "Santa Rosa",
            "Santa Tereza",
            "Santa Vitória do Palmar",
            "Santana da Boa Vista",
            "Santana do Livramento",
            "Santiago",
            "Santo Ângelo",
            "Santo Antônio da Patrulha",
            "Santo Antônio das Missões",
            "Santo Antônio do Palma",
            "Santo Antônio do Planalto",
            "Santo Augusto",
            "Santo Cristo",
            "Santo Expedito do Sul",
            "São Borja",
            "São Domingos do Sul",
            "São Francisco de Assis",
            "São Francisco de Paula",
            "São Gabriel",
            "São Jerônimo",
            "São João da Urtiga",
            "São João do Polêsine",
            "São Jorge",
            "São José das Missões",
            "São José do Herval",
            "São José do Hortêncio",
            "São José do Inhacorá",
            "São José do Norte",
            "São José do Ouro",
            "São José do Sul",
            "São José dos Ausentes",
            "São Leopoldo",
            "São Lourenço do Sul",
            "São Luiz Gonzaga",
            "São Marcos",
            "São Martinho",
            "São Martinho da Serra",
            "São Miguel das Missões",
            "São Nicolau",
            "São Paulo das Missões",
            "São Pedro da Serra",
            "São Pedro das Missões",
            "São Pedro do Butiá",
            "São Pedro do Sul",
            "São Sebastião do Caí",
            "São Sepé",
            "São Valentim",
            "São Valentim do Sul",
            "São Valério do Sul",
            "São Vendelino",
            "São Vicente do Sul",
            "Sapiranga",
            "Sapucaia do Sul",
            "Sarandi",
            "Seberi",
            "Sede Nova",
            "Segredo",
            "Selbach",
            "Senador Salgado Filho",
            "Sentinela do Sul",
            "Serafina Corrêa",
            "Sério",
            "Sertão",
            "Sertão Santana",
            "Sete de Setembro",
            "Severiano de Almeida",
            "Silveira Martins",
            "Sinimbu",
            "Sobradinho",
            "Soledade",
            "Tabaí",
            "Tapejara",
            "Tapera",
            "Tapes",
            "Taquara",
            "Taquari",
            "Taquaruçu do Sul",
            "Tavares",
            "Tenente Portela",
            "Terra de Areia",
            "Teutônia",
            "Tio Hugo",
            "Tiradentes do Sul",
            "Toropi",
            "Torres",
            "Tramandaí",
            "Travesseiro",
            "Três Arroios",
            "Três Cachoeiras",
            "Três Coroas",
            "Três de Maio",
            "Três Forquilhas",
            "Três Palmeiras",
            "Três Passos",
            "Trindade do Sul",
            "Triunfo",
            "Tucunduva",
            "Tunas",
            "Tupanci do Sul",
            "Tupanciretã",
            "Tupandi",
            "Tuparendi",
            "Turuçu",
            "Ubiretama",
            "União da Serra",
            "Unistalda",
            "Uruguaiana",
            "Vacaria",
            "Vale do Sol",
            "Vale Real",
            "Vale Verde",
            "Vanini",
            "Venâncio Aires",
            "Vera Cruz",
            "Veranópolis",
            "Vespasiano Corrêa",
            "Viadutos",
            "Viamão",
            "Vicente Dutra",
            "Victor Graeff",
            "Vila Flores",
            "Vila Lângaro",
            "Vila Maria",
            "Vila Nova do Sul",
            "Vista Alegre",
            "Vista Alegre do Prata",
            "Vista Gaúcha",
            "Vitória das Missões",
            "Westfália",
            "Xangri-lá"};

    private ArrayList<String> nomeCidadesList;
    public void setNomeCidadesList(){
        nomeCidadesList = new ArrayList<>();
        for(String nome : nomeCidades){
            nomeCidadesList.add(nome);
        }
    }

    private String[] descricaoCidades = {
            "https://pt.wikipedia.org/wiki/Acegu%C3%A1",
            "https://pt.wikipedia.org/wiki/%C3%81gua_Santa_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Agudo",
            "https://pt.wikipedia.org/wiki/Ajuricaba",
            "https://pt.wikipedia.org/wiki/Alecrim_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Alegrete_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Alegria_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Almirante_Tamandar%C3%A9_do_Sul",
            "https://pt.wikipedia.org/wiki/Alpestre",
            "https://pt.wikipedia.org/wiki/Alto_Alegre_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Alto_Feliz",
            "https://pt.wikipedia.org/wiki/Alvorada_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Amaral_Ferrador",
            "https://pt.wikipedia.org/wiki/Ametista_do_Sul",
            "https://pt.wikipedia.org/wiki/Andr%C3%A9_da_Rocha",
            "https://pt.wikipedia.org/wiki/Anta_Gorda",
            "https://pt.wikipedia.org/wiki/Ant%C3%B4nio_Prado",
            "https://pt.wikipedia.org/wiki/Arambar%C3%A9",
            "https://pt.wikipedia.org/wiki/Araric%C3%A1",
            "https://pt.wikipedia.org/wiki/Aratiba",
            "https://pt.wikipedia.org/wiki/Arroio_do_Meio",
            "https://pt.wikipedia.org/wiki/Arroio_do_Padre",
            "https://pt.wikipedia.org/wiki/Arroio_do_Sal",
            "https://pt.wikipedia.org/wiki/Arroio_do_Tigre",
            "https://pt.wikipedia.org/wiki/Arroio_dos_Ratos",
            "https://pt.wikipedia.org/wiki/Arroio_Grande",
            "https://pt.wikipedia.org/wiki/Arvorezinha",
            "https://pt.wikipedia.org/wiki/Augusto_Pestana_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/%C3%81urea",
            "https://pt.wikipedia.org/wiki/Bag%C3%A9",
            "https://pt.wikipedia.org/wiki/Balne%C3%A1rio_Pinhal",
            "https://pt.wikipedia.org/wiki/Bar%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Bar%C3%A3o_de_Cotegipe",
            "https://pt.wikipedia.org/wiki/Bar%C3%A3o_do_Triunfo",
            "https://pt.wikipedia.org/wiki/Barra_do_Guarita",
            "https://pt.wikipedia.org/wiki/Barra_do_Quara%C3%AD",
            "https://pt.wikipedia.org/wiki/Barra_do_Ribeiro",
            "https://pt.wikipedia.org/wiki/Barra_do_Rio_Azul",
            "https://pt.wikipedia.org/wiki/Barra_Funda",
            "https://pt.wikipedia.org/wiki/Barrac%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Barros_Cassal",
            "https://pt.wikipedia.org/wiki/Benjamin_Constant_do_Sul",
            "https://pt.wikipedia.org/wiki/Bento_Gon%C3%A7alves_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Boa_Vista_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Boa_Vista_do_Buric%C3%A1",
            "https://pt.wikipedia.org/wiki/Boa_Vista_do_Cadeado",
            "https://pt.wikipedia.org/wiki/Boa_Vista_do_Incra",
            "https://pt.wikipedia.org/wiki/Boa_Vista_do_Sul",
            "https://pt.wikipedia.org/wiki/Bom_Jesus_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Bom_Princ%C3%ADpio",
            "https://pt.wikipedia.org/wiki/Bom_Progresso",
            "https://pt.wikipedia.org/wiki/Bom_Retiro_do_Sul",
            "https://pt.wikipedia.org/wiki/Boqueir%C3%A3o_do_Le%C3%A3o",
            "https://pt.wikipedia.org/wiki/Bossoroca",
            "https://pt.wikipedia.org/wiki/Bozano",
            "https://pt.wikipedia.org/wiki/Braga_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Brochier",
            "https://pt.wikipedia.org/wiki/Buti%C3%A1_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Ca%C3%A7apava_do_Sul",
            "https://pt.wikipedia.org/wiki/Cacequi",
            "https://pt.wikipedia.org/wiki/Cachoeira_do_Sul",
            "https://pt.wikipedia.org/wiki/Cachoeirinha_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cacique_Doble",
            "https://pt.wikipedia.org/wiki/Caibat%C3%A9",
            "https://pt.wikipedia.org/wiki/Cai%C3%A7ara_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Camaqu%C3%A3",
            "https://pt.wikipedia.org/wiki/Camargo_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cambar%C3%A1_do_Sul",
            "https://pt.wikipedia.org/wiki/Campestre_da_Serra",
            "https://pt.wikipedia.org/wiki/Campina_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Campinas_do_Sul",
            "https://pt.wikipedia.org/wiki/Campo_Bom",
            "https://pt.wikipedia.org/wiki/Campo_Novo",
            "https://pt.wikipedia.org/wiki/Campos_Borges",
            "https://pt.wikipedia.org/wiki/Candel%C3%A1ria_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/C%C3%A2ndido_God%C3%B3i",
            "https://pt.wikipedia.org/wiki/Candiota",
            "https://pt.wikipedia.org/wiki/Canela_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cangu%C3%A7u",
            "https://pt.wikipedia.org/wiki/Canoas",
            "https://pt.wikipedia.org/wiki/Canudos_do_Vale",
            "https://pt.wikipedia.org/wiki/Cap%C3%A3o_Bonito_do_Sul",
            "https://pt.wikipedia.org/wiki/Cap%C3%A3o_da_Canoa",
            "https://pt.wikipedia.org/wiki/Cap%C3%A3o_do_Cip%C3%B3",
            "https://pt.wikipedia.org/wiki/Cap%C3%A3o_do_Le%C3%A3o",
            "https://pt.wikipedia.org/wiki/Capela_de_Santana",
            "https://pt.wikipedia.org/wiki/Capit%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Capivari_do_Sul",
            "https://pt.wikipedia.org/wiki/Cara%C3%A1",
            "https://pt.wikipedia.org/wiki/Carazinho",
            "https://pt.wikipedia.org/wiki/Carlos_Barbosa",
            "https://pt.wikipedia.org/wiki/Carlos_Gomes_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Casca_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Caseiros",
            "https://pt.wikipedia.org/wiki/Catu%C3%ADpe",
            "https://pt.wikipedia.org/wiki/Caxias_do_Sul",
            "https://pt.wikipedia.org/wiki/Centen%C3%A1rio_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cerrito",
            "https://pt.wikipedia.org/wiki/Cerro_Branco",
            "https://pt.wikipedia.org/wiki/Cerro_Grande",
            "https://pt.wikipedia.org/wiki/Cerro_Grande_do_Sul",
            "https://pt.wikipedia.org/wiki/Cerro_Largo_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Chapada_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Charqueadas_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Charrua_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Chiapetta",
            "https://pt.wikipedia.org/wiki/Chu%C3%AD",
            "https://pt.wikipedia.org/wiki/Chuvisca",
            "https://pt.wikipedia.org/wiki/Cidreira_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cir%C3%ADaco_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Colinas_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Colorado_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Condor_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Constantina_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Coqueiro_Baixo",
            "https://pt.wikipedia.org/wiki/Coqueiros_do_Sul",
            "https://pt.wikipedia.org/wiki/Coronel_Barros",
            "https://pt.wikipedia.org/wiki/Coronel_Bicaco",
            "https://pt.wikipedia.org/wiki/Coronel_Pilar",
            "https://pt.wikipedia.org/wiki/Cotipor%C3%A3",
            "https://pt.wikipedia.org/wiki/Coxilha_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Crissiumal",
            "https://pt.wikipedia.org/wiki/Cristal_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cristal_do_Sul",
            "https://pt.wikipedia.org/wiki/Cruz_Alta_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Cruzaltense",
            "https://pt.wikipedia.org/wiki/Cruzeiro_do_Sul_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/David_Canabarro_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Derrubadas",
            "https://pt.wikipedia.org/wiki/Dezesseis_de_Novembro",
            "https://pt.wikipedia.org/wiki/Dilermando_de_Aguiar",
            "https://pt.wikipedia.org/wiki/Dois_Irm%C3%A3os",
            "https://pt.wikipedia.org/wiki/Dois_Irm%C3%A3os_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Dois_Lajeados",
            "https://pt.wikipedia.org/wiki/Dom_Feliciano",
            "https://pt.wikipedia.org/wiki/Dom_Pedrito",
            "https://pt.wikipedia.org/wiki/Dom_Pedro_de_Alc%C3%A2ntara",
            "https://pt.wikipedia.org/wiki/Dona_Francisca",
            "https://pt.wikipedia.org/wiki/Doutor_Maur%C3%ADcio_Cardoso",
            "https://pt.wikipedia.org/wiki/Doutor_Ricardo",
            "https://pt.wikipedia.org/wiki/Eldorado_do_Sul",
            "https://pt.wikipedia.org/wiki/Encantado",
            "https://pt.wikipedia.org/wiki/Encruzilhada_do_Sul",
            "https://pt.wikipedia.org/wiki/Engenho_Velho",
            "https://pt.wikipedia.org/wiki/Entre_Rios_do_Sul",
            "https://pt.wikipedia.org/wiki/Entre-Iju%C3%ADs",
            "https://pt.wikipedia.org/wiki/Erebango",
            "https://pt.wikipedia.org/wiki/Erechim",
            "https://pt.wikipedia.org/wiki/Ernestina_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Erval_Grande",
            "https://pt.wikipedia.org/wiki/Erval_Seco",
            "https://pt.wikipedia.org/wiki/Esmeralda_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Esperan%C3%A7a_do_Sul",
            "https://pt.wikipedia.org/wiki/Espumoso",
            "https://pt.wikipedia.org/wiki/Esta%C3%A7%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Est%C3%A2ncia_Velha",
            "https://pt.wikipedia.org/wiki/Esteio",
            "https://pt.wikipedia.org/wiki/Estrela_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Estrela_Velha",
            "https://pt.wikipedia.org/wiki/Eug%C3%AAnio_de_Castro_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Fagundes_Varela_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Farroupilha",
            "https://pt.wikipedia.org/wiki/Faxinal_do_Soturno",
            "https://pt.wikipedia.org/wiki/Faxinalzinho",
            "https://pt.wikipedia.org/wiki/Fazenda_Vilanova",
            "https://pt.wikipedia.org/wiki/Feliz",
            "https://pt.wikipedia.org/wiki/Flores_da_Cunha",
            "https://pt.wikipedia.org/wiki/Floriano_Peixoto_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Fontoura_Xavier",
            "https://pt.wikipedia.org/wiki/Formigueiro_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Forquetinha",
            "https://pt.wikipedia.org/wiki/Fortaleza_dos_Valos",
            "https://pt.wikipedia.org/wiki/Frederico_Westphalen",
            "https://pt.wikipedia.org/wiki/Garibaldi",
            "https://pt.wikipedia.org/wiki/Garruchos",
            "https://pt.wikipedia.org/wiki/Gaurama",
            "https://pt.wikipedia.org/wiki/General_C%C3%A2mara",
            "https://pt.wikipedia.org/wiki/Gentil_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Get%C3%BAlio_Vargas_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Giru%C3%A1",
            "https://pt.wikipedia.org/wiki/Glorinha",
            "https://pt.wikipedia.org/wiki/Gramado",
            "https://pt.wikipedia.org/wiki/Gramado_dos_Loureiros",
            "https://pt.wikipedia.org/wiki/Gramado_Xavier",
            "https://pt.wikipedia.org/wiki/Gravata%C3%AD",
            "https://pt.wikipedia.org/wiki/Guabiju",
            "https://pt.wikipedia.org/wiki/Gua%C3%ADba",
            "https://pt.wikipedia.org/wiki/Guapor%C3%A9_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Guarani_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Harmonia_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Herval",
            "https://pt.wikipedia.org/wiki/Herveiras",
            "https://pt.wikipedia.org/wiki/Horizontina",
            "https://pt.wikipedia.org/wiki/Hulha_Negra",
            "https://pt.wikipedia.org/wiki/Humait%C3%A1_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Ibarama",
            "https://pt.wikipedia.org/wiki/Ibia%C3%A7%C3%A1",
            "https://pt.wikipedia.org/wiki/Ibiraiaras_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Ibirapuit%C3%A3",
            "https://pt.wikipedia.org/wiki/Ibirub%C3%A1",
            "https://pt.wikipedia.org/wiki/Igrejinha",
            "https://pt.wikipedia.org/wiki/Iju%C3%AD",
            "https://pt.wikipedia.org/wiki/Il%C3%B3polis",
            "https://pt.wikipedia.org/wiki/Imb%C3%A9",
            "https://pt.wikipedia.org/wiki/Imigrante",
            "https://pt.wikipedia.org/wiki/Independ%C3%AAncia_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Inhacor%C3%A1",
            "https://pt.wikipedia.org/wiki/Ip%C3%AA_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Ipiranga_do_Sul",
            "https://pt.wikipedia.org/wiki/Ira%C3%AD_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Itaara",
            "https://pt.wikipedia.org/wiki/Itacurubi",
            "https://pt.wikipedia.org/wiki/Itapuca",
            "https://pt.wikipedia.org/wiki/Itaqui",
            "https://pt.wikipedia.org/wiki/Itati",
            "https://pt.wikipedia.org/wiki/Itatiba_do_Sul",
            "https://pt.wikipedia.org/wiki/Ivor%C3%A1",
            "https://pt.wikipedia.org/wiki/Ivoti",
            "https://pt.wikipedia.org/wiki/Jaboticaba",
            "https://pt.wikipedia.org/wiki/Jacuizinho",
            "https://pt.wikipedia.org/wiki/Jacutinga_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Jaguar%C3%A3o",
            "https://pt.wikipedia.org/wiki/Jaguari",
            "https://pt.wikipedia.org/wiki/Jaquirana",
            "https://pt.wikipedia.org/wiki/Jari_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/J%C3%B3ia_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/J%C3%BAlio_de_Castilhos_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Lagoa_Bonita_do_Sul",
            "https://pt.wikipedia.org/wiki/Lagoa_dos_Tr%C3%AAs_Cantos",
            "https://pt.wikipedia.org/wiki/Lagoa_Vermelha",
            "https://pt.wikipedia.org/wiki/Lago%C3%A3o",
            "https://pt.wikipedia.org/wiki/Lajeado_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Lajeado_do_Bugre",
            "https://pt.wikipedia.org/wiki/Lavras_do_Sul",
            "https://pt.wikipedia.org/wiki/Liberato_Salzano",
            "https://pt.wikipedia.org/wiki/Lindolfo_Collor_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Linha_Nova",
            "https://pt.wikipedia.org/wiki/Ma%C3%A7ambar%C3%A1",
            "https://pt.wikipedia.org/wiki/Machadinho",
            "https://pt.wikipedia.org/wiki/Mampituba",
            "https://pt.wikipedia.org/wiki/Manoel_Viana",
            "https://pt.wikipedia.org/wiki/Maquin%C3%A9",
            "https://pt.wikipedia.org/wiki/Marat%C3%A1",
            "https://pt.wikipedia.org/wiki/Marau",
            "https://pt.wikipedia.org/wiki/Marcelino_Ramos",
            "https://pt.wikipedia.org/wiki/Mariana_Pimentel",
            "https://pt.wikipedia.org/wiki/Mariano_Moro",
            "https://pt.wikipedia.org/wiki/Marques_de_Souza",
            "https://pt.wikipedia.org/wiki/Mata_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Mato_Castelhano",
            "https://pt.wikipedia.org/wiki/Mato_Leit%C3%A3o",
            "https://pt.wikipedia.org/wiki/Mato_Queimado",
            "https://pt.wikipedia.org/wiki/Maximiliano_de_Almeida",
            "https://pt.wikipedia.org/wiki/Minas_do_Le%C3%A3o",
            "https://pt.wikipedia.org/wiki/Miragua%C3%AD",
            "https://pt.wikipedia.org/wiki/Montauri",
            "https://pt.wikipedia.org/wiki/Monte_Alegre_dos_Campos",
            "https://pt.wikipedia.org/wiki/Monte_Belo_do_Sul",
            "https://pt.wikipedia.org/wiki/Montenegro_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Morma%C3%A7o",
            "https://pt.wikipedia.org/wiki/Morrinhos_do_Sul",
            "https://pt.wikipedia.org/wiki/Morro_Redondo",
            "https://pt.wikipedia.org/wiki/Morro_Reuter",
            "https://pt.wikipedia.org/wiki/Mostardas",
            "https://pt.wikipedia.org/wiki/Mu%C3%A7um_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Muitos_Cap%C3%B5es",
            "https://pt.wikipedia.org/wiki/Muliterno",
            "https://pt.wikipedia.org/wiki/N%C3%A3o-Me-Toque",
            "https://pt.wikipedia.org/wiki/Nicolau_Vergueiro",
            "https://pt.wikipedia.org/wiki/Nonoai",
            "https://pt.wikipedia.org/wiki/Nova_Alvorada",
            "https://pt.wikipedia.org/wiki/Nova_Ara%C3%A7%C3%A1",
            "https://pt.wikipedia.org/wiki/Nova_Bassano",
            "https://pt.wikipedia.org/wiki/Nova_Boa_Vista",
            "https://pt.wikipedia.org/wiki/Nova_Br%C3%A9scia",
            "https://pt.wikipedia.org/wiki/Nova_Candel%C3%A1ria",
            "https://pt.wikipedia.org/wiki/Nova_Esperan%C3%A7a_do_Sul",
            "https://pt.wikipedia.org/wiki/Nova_Hartz",
            "https://pt.wikipedia.org/wiki/Nova_P%C3%A1dua",
            "https://pt.wikipedia.org/wiki/Nova_Palma",
            "https://pt.wikipedia.org/wiki/Nova_Petr%C3%B3polis",
            "https://pt.wikipedia.org/wiki/Nova_Prata",
            "https://pt.wikipedia.org/wiki/Nova_Ramada",
            "https://pt.wikipedia.org/wiki/Nova_Roma_do_Sul",
            "https://pt.wikipedia.org/wiki/Nova_Santa_Rita_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Novo_Barreiro",
            "https://pt.wikipedia.org/wiki/Novo_Cabrais",
            "https://pt.wikipedia.org/wiki/Novo_Hamburgo",
            "https://pt.wikipedia.org/wiki/Novo_Machado",
            "https://pt.wikipedia.org/wiki/Novo_Tiradentes",
            "https://pt.wikipedia.org/wiki/Novo_Xingu",
            "https://pt.wikipedia.org/wiki/Os%C3%B3rio_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Paim_Filho",
            "https://pt.wikipedia.org/wiki/Palmares_do_Sul",
            "https://pt.wikipedia.org/wiki/Palmeira_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Palmitinho",
            "https://pt.wikipedia.org/wiki/Panambi",
            "https://pt.wikipedia.org/wiki/Pantano_Grande",
            "https://pt.wikipedia.org/wiki/Para%C3%AD",
            "https://pt.wikipedia.org/wiki/Para%C3%ADso_do_Sul",
            "https://pt.wikipedia.org/wiki/Pareci_Novo",
            "https://pt.wikipedia.org/wiki/Parob%C3%A9",
            "https://pt.wikipedia.org/wiki/Passa-Sete",
            "https://pt.wikipedia.org/wiki/Passo_do_Sobrado",
            "https://pt.wikipedia.org/wiki/Passo_Fundo",
            "https://pt.wikipedia.org/wiki/Paulo_Bento",
            "https://pt.wikipedia.org/wiki/Paverama",
            "https://pt.wikipedia.org/wiki/Pedras_Altas",
            "https://pt.wikipedia.org/wiki/Pedro_Os%C3%B3rio",
            "https://pt.wikipedia.org/wiki/Peju%C3%A7ara",
            "https://pt.wikipedia.org/wiki/Pelotas",
            "https://pt.wikipedia.org/wiki/Picada_Caf%C3%A9",
            "https://pt.wikipedia.org/wiki/Pinhal_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Pinhal_da_Serra",
            "https://pt.wikipedia.org/wiki/Pinhal_Grande",
            "https://pt.wikipedia.org/wiki/Pinheirinho_do_Vale",
            "https://pt.wikipedia.org/wiki/Pinheiro_Machado_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Pinto_Bandeira",
            "https://pt.wikipedia.org/wiki/Pirap%C3%B3",
            "https://pt.wikipedia.org/wiki/Piratini",
            "https://pt.wikipedia.org/wiki/Planalto_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Po%C3%A7o_das_Antas",
            "https://pt.wikipedia.org/wiki/Pont%C3%A3o",
            "https://pt.wikipedia.org/wiki/Ponte_Preta_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Port%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Porto_Alegre",
            "https://pt.wikipedia.org/wiki/Porto_Lucena",
            "https://pt.wikipedia.org/wiki/Porto_Mau%C3%A1",
            "https://pt.wikipedia.org/wiki/Porto_Vera_Cruz",
            "https://pt.wikipedia.org/wiki/Porto_Xavier",
            "https://pt.wikipedia.org/wiki/Pouso_Novo",
            "https://pt.wikipedia.org/wiki/Presidente_Lucena",
            "https://pt.wikipedia.org/wiki/Progresso_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Prot%C3%A1sio_Alves_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Putinga",
            "https://pt.wikipedia.org/wiki/Quara%C3%AD",
            "https://pt.wikipedia.org/wiki/Quatro_Irm%C3%A3os",
            "https://pt.wikipedia.org/wiki/Quevedos",
            "https://pt.wikipedia.org/wiki/Quinze_de_Novembro",
            "https://pt.wikipedia.org/wiki/Redentora",
            "https://pt.wikipedia.org/wiki/Relvado",
            "https://pt.wikipedia.org/wiki/Restinga_Seca",
            "https://pt.wikipedia.org/wiki/Rio_dos_%C3%8Dndios",
            "https://pt.wikipedia.org/wiki/Rio_Grande_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Rio_Pardo",
            "https://pt.wikipedia.org/wiki/Riozinho",
            "https://pt.wikipedia.org/wiki/Roca_Sales",
            "https://pt.wikipedia.org/wiki/Rodeio_Bonito",
            "https://pt.wikipedia.org/wiki/Rolador",
            "https://pt.wikipedia.org/wiki/Rolante",
            "https://pt.wikipedia.org/wiki/Ronda_Alta",
            "https://pt.wikipedia.org/wiki/Rondinha",
            "https://pt.wikipedia.org/wiki/Roque_Gonzales",
            "https://pt.wikipedia.org/wiki/Ros%C3%A1rio_do_Sul",
            "https://pt.wikipedia.org/wiki/Sagrada_Fam%C3%ADlia_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Saldanha_Marinho_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Salto_do_Jacu%C3%AD",
            "https://pt.wikipedia.org/wiki/Salvador_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Salvador_do_Sul",
            "https://pt.wikipedia.org/wiki/Sananduva",
            "https://pt.wikipedia.org/wiki/Santa_B%C3%A1rbara_do_Sul",
            "https://pt.wikipedia.org/wiki/Santa_Cec%C3%ADlia_do_Sul",
            "https://pt.wikipedia.org/wiki/Santa_Clara_do_Sul",
            "https://pt.wikipedia.org/wiki/Santa_Cruz_do_Sul",
            "https://pt.wikipedia.org/wiki/Santa_Margarida_do_Sul",
            "https://pt.wikipedia.org/wiki/Santa_Maria_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Santa_Maria_do_Herval",
            "https://pt.wikipedia.org/wiki/Santa_Rosa",
            "https://pt.wikipedia.org/wiki/Santa_Tereza",
            "https://pt.wikipedia.org/wiki/Santa_Vit%C3%B3ria_do_Palmar",
            "https://pt.wikipedia.org/wiki/Santana_da_Boa_Vista",
            "https://pt.wikipedia.org/wiki/Santana_do_Livramento",
            "https://pt.wikipedia.org/wiki/Santiago_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Santo_%C3%82ngelo",
            "https://pt.wikipedia.org/wiki/Santo_Ant%C3%B4nio_da_Patrulha",
            "https://pt.wikipedia.org/wiki/Santo_Ant%C3%B4nio_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Santo_Ant%C3%B4nio_do_Palma",
            "https://pt.wikipedia.org/wiki/Santo_Ant%C3%B4nio_do_Planalto",
            "https://pt.wikipedia.org/wiki/Santo_Augusto",
            "https://pt.wikipedia.org/wiki/Santo_Cristo",
            "https://pt.wikipedia.org/wiki/Santo_Expedito_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Borja",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Domingos_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Francisco_de_Assis_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Francisco_de_Paula_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Gabriel_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jer%C3%B4nimo_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jo%C3%A3o_da_Urtiga",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jo%C3%A3o_do_Pol%C3%AAsine",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jorge_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Herval",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Hort%C3%AAncio",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Inhacor%C3%A1",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Norte",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Ouro",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Jos%C3%A9_dos_Ausentes",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Leopoldo",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Louren%C3%A7o_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Luiz_Gonzaga",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Marcos_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Martinho_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Martinho_da_Serra",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Miguel_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Nicolau_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Paulo_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Pedro_da_Serra_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Pedro_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Pedro_do_Buti%C3%A1",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Pedro_do_Sul_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Sebasti%C3%A3o_do_Ca%C3%AD",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Sep%C3%A9",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Valentim_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Valentim_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Val%C3%A9rio_do_Sul",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Vendelino",
            "https://pt.wikipedia.org/wiki/S%C3%A3o_Vicente_do_Sul",
            "https://pt.wikipedia.org/wiki/Sapiranga",
            "https://pt.wikipedia.org/wiki/Sapucaia_do_Sul",
            "https://pt.wikipedia.org/wiki/Sarandi_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Seberi",
            "https://pt.wikipedia.org/wiki/Sede_Nova",
            "https://pt.wikipedia.org/wiki/Segredo_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Selbach",
            "https://pt.wikipedia.org/wiki/Senador_Salgado_Filho",
            "https://pt.wikipedia.org/wiki/Sentinela_do_Sul",
            "https://pt.wikipedia.org/wiki/Serafina_Corr%C3%AAa",
            "https://pt.wikipedia.org/wiki/S%C3%A9rio",
            "https://pt.wikipedia.org/wiki/Sert%C3%A3o_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Sert%C3%A3o_Santana",
            "https://pt.wikipedia.org/wiki/Sete_de_Setembro",
            "https://pt.wikipedia.org/wiki/Severiano_de_Almeida",
            "https://pt.wikipedia.org/wiki/Silveira_Martins",
            "https://pt.wikipedia.org/wiki/Sinimbu",
            "https://pt.wikipedia.org/wiki/Sobradinho_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Soledade_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Taba%C3%AD",
            "https://pt.wikipedia.org/wiki/Tapejara_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Tapera",
            "https://pt.wikipedia.org/wiki/Tapes_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Taquara_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Taquari",
            "https://pt.wikipedia.org/wiki/Taquaru%C3%A7u_do_Sul",
            "https://pt.wikipedia.org/wiki/Tavares_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Tenente_Portela",
            "https://pt.wikipedia.org/wiki/Terra_de_Areia",
            "https://pt.wikipedia.org/wiki/Teut%C3%B4nia",
            "https://pt.wikipedia.org/wiki/Tio_Hugo",
            "https://pt.wikipedia.org/wiki/Tiradentes_do_Sul",
            "https://pt.wikipedia.org/wiki/Toropi",
            "https://pt.wikipedia.org/wiki/Torres_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Tramanda%C3%AD",
            "https://pt.wikipedia.org/wiki/Travesseiro_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Arroios",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Cachoeiras",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Coroas",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_de_Maio",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Forquilhas",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Palmeiras",
            "https://pt.wikipedia.org/wiki/Tr%C3%AAs_Passos",
            "https://pt.wikipedia.org/wiki/Trindade_do_Sul",
            "https://pt.wikipedia.org/wiki/Triunfo_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Tucunduva",
            "https://pt.wikipedia.org/wiki/Tunas",
            "https://pt.wikipedia.org/wiki/Tupanci_do_Sul",
            "https://pt.wikipedia.org/wiki/Tupanciret%C3%A3",
            "https://pt.wikipedia.org/wiki/Tupandi",
            "https://pt.wikipedia.org/wiki/Tuparendi",
            "https://pt.wikipedia.org/wiki/Turu%C3%A7u",
            "https://pt.wikipedia.org/wiki/Ubiretama",
            "https://pt.wikipedia.org/wiki/Uni%C3%A3o_da_Serra",
            "https://pt.wikipedia.org/wiki/Unistalda",
            "https://pt.wikipedia.org/wiki/Uruguaiana",
            "https://pt.wikipedia.org/wiki/Vacaria",
            "https://pt.wikipedia.org/wiki/Vale_do_Sol",
            "https://pt.wikipedia.org/wiki/Vale_Real",
            "https://pt.wikipedia.org/wiki/Vale_Verde_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Vanini",
            "https://pt.wikipedia.org/wiki/Ven%C3%A2ncio_Aires",
            "https://pt.wikipedia.org/wiki/Vera_Cruz_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Veran%C3%B3polis",
            "https://pt.wikipedia.org/wiki/Vespasiano_Corr%C3%AAa",
            "https://pt.wikipedia.org/wiki/Viadutos",
            "https://pt.wikipedia.org/wiki/Viam%C3%A3o",
            "https://pt.wikipedia.org/wiki/Vicente_Dutra",
            "https://pt.wikipedia.org/wiki/Victor_Graeff",
            "https://pt.wikipedia.org/wiki/Vila_Flores",
            "https://pt.wikipedia.org/wiki/Vila_L%C3%A2ngaro",
            "https://pt.wikipedia.org/wiki/Vila_Maria",
            "https://pt.wikipedia.org/wiki/Vila_Nova_do_Sul",
            "https://pt.wikipedia.org/wiki/Vista_Alegre",
            "https://pt.wikipedia.org/wiki/Vista_Alegre_do_Prata",
            "https://pt.wikipedia.org/wiki/Vista_Ga%C3%BAcha",
            "https://pt.wikipedia.org/wiki/Vit%C3%B3ria_das_Miss%C3%B5es",
            "https://pt.wikipedia.org/wiki/Westf%C3%A1lia_(Rio_Grande_do_Sul)",
            "https://pt.wikipedia.org/wiki/Xangri-l%C3%A1"};

    private ArrayList<String> descricaoCidadesList;
    public void setDescricaoCidadesList(){
        descricaoCidadesList = new ArrayList<>();
        for(String descricao : descricaoCidades){
            descricaoCidadesList.add(descricao);
        }
    }

    private String[] altoDaSerraDoBotucarai = {
            "Barros Cassal",
            "Gramado Xavier",
            "Ibirapuitã",
            "Mormaço",
            "Nicolau Vergueiro",
            "São José do Herval",
            "Soledade"};

    private ArrayList<String> altoDaSerraDoBotucaraiList;
    public void setAltoDaSerraDoBotucaraiList(){
        altoDaSerraDoBotucaraiList = new ArrayList<>();
        for(String cidade : altoDaSerraDoBotucarai){
            altoDaSerraDoBotucaraiList.add(cidade);
        }
    }

    private String[]  camposDeCimaDaSerra = {
            "Bom Jesus",
            "Cambará do Sul",
            "Campestre da Serra",
            "Esmeralda",
            "Ipê",
            "Jaquirana",
            "Muitos Capões",
            "Pinhal da Serra",
            "São José dos Ausentes",
            "Vacaria"};

    private ArrayList<String> camposDeCimaDaSerraList;
    public void setCamposDeCimaDaSerraList(){
        camposDeCimaDaSerraList = new ArrayList<>();
        for(String cidade : camposDeCimaDaSerra){
            camposDeCimaDaSerraList.add(cidade);
        }
    }

    private String[] carbonifera = {
            "Arroio dos Ratos",
            "Charqueadas",
            "São Jerônimo",
            "Triunfo"};

    private ArrayList<String> carboniferaList;
    public void setCarboniferaList(){
        carboniferaList = new ArrayList<>();
        for(String cidade : carbonifera){
            carboniferaList.add(cidade);
        }
    }

    private String[] central = {
            "Agudo",
            "Dona Francisca",
            "Faxinal do Soturno",
            "Itaara",
            "Nova Palma",
            "Restinga Seca",
            "Santa Maria",
            "São João do Polêsine",
            "São Pedro do Sul",
            "São Sepé",
            "Silveira Martins"};

    private ArrayList<String> centralList;
    public void setCentralList(){
        centralList = new ArrayList<>();
        for(String cidade : central){
            centralList.add(cidade);
        }
    }

    private String[] centroSerra = {
            "Estrela Velha",
            "Ibarama",
            "Sobradinho"};

    private ArrayList<String> centroSerraList;
    public void setCentroSerraList(){
        centroSerraList = new ArrayList<>();
        for(String cidade : centroSerra){
            centroSerraList.add(cidade);
        }
    }

    private String[] costaDoce = {
            "Arambaré",
            "Arroio Grande",
            "Camaquã",
            "Canguçu",
            "Chuí",
            "Cristal",
            "Guaíba",
            "Jaguarão",
            "Morro Redondo",
            "Pedro Osório",
            "Pelotas",
            "Rio Grande",
            "Santa Vitória do Palmar",
            "São José do Norte",
            "São Lourenço do Sul",
            "Sertão Santana",
            "Tapes",
            "Tavares",
            "Turuçu"};

    private ArrayList<String> costaDoceList;
    public void setCostaDoceList(){
        costaDoceList = new ArrayList<>();
        for(String cidade : costaDoce){
            costaDoceList.add(cidade);
        }
    }

    private String[] culturaETradicao = {
            "Constantina",
            "Passo Fundo",
            "Ronda Alta",
            "Rondinha",
            "Sarandi",
            "Sertão"};

    private ArrayList<String> culturaETradicaoList;
    public void setCulturaETradicaoList(){
        culturaETradicaoList = new ArrayList<>();
        for(String cidade : culturaETradicao){
            culturaETradicaoList.add(cidade);
        }
    }

    private String[] deltaDoJacui = {
            "Glorinha",
            "Gravataí",
            "Viamão"};

    private ArrayList<String> deltaDoJacuiList;
    public void setDeltaDoJacuiList(){
        deltaDoJacuiList = new ArrayList<>();
        for(String cidade : deltaDoJacui){
            deltaDoJacuiList.add(cidade);
        }
    }

    private String[] fronteira = {
            "Alegrete",
            "Barra do Quaraí",
            "Itaqui",
            "Manoel Viana",
            "Quaraí",
            "Rosário do Sul",
            "Sant'Ana do Livramento",
            "São Gabriel",
            "Uruguaiana"};

    private ArrayList<String> fronteiraList;
    public void setFronteiraList(){
        fronteiraList = new ArrayList<>();
        for(String cidade : fronteira){
            fronteiraList.add(cidade);
        }
    }

    private String[] hortensias = {
            "Canela",
            "Gramado",
            "Nova Petrópolis",
            "Picada Café",
            "São Francisco de Paula"};

    private ArrayList<String> hortensiasList;
    public void setHortensiasList(){
        hortensiasList = new ArrayList<>();
        for(String cidade : hortensias){
            hortensiasList.add(cidade);
        }
    }

    private String[] litoralNorteGaucho = {
            "Arroio do Sal",
            "Balneário Pinhal",
            "Capão da Canoa",
            "Caraá",
            "Cidreira",
            "Imbé",
            "Itati",
            "Mampituba",
            "Maquiné",
            "Morrinhos do Sul",
            "Mostardas",
            "Osório",
            "Palmares do Sul",
            "Santo Antônio da Patrulha",
            "Terra de Areia",
            "Torres",
            "Tramandaí",
            "Xangri-lá"};

    private ArrayList<String> litoralNorteGauchoList;
    public void setLitoralNorteGauchoList(){
        litoralNorteGauchoList = new ArrayList<>();
        for(String cidade : litoralNorteGaucho){
            litoralNorteGauchoList.add(cidade);
        }
    }

    private String[] pampaGaucho = {
            "Aceguá",
            "Bagé",
            "Caçapava do Sul",
            "Candiota",
            "Dom Pedrito",
            "Lavras do Sul",
            "Pinheiro Machado",
            "Piratini",
            "Santana da Boa Vista"};

    private ArrayList<String> pampaGauchoList;
    public void setPampaGauchoList(){
        pampaGauchoList = new ArrayList<>();
        for(String cidade : pampaGaucho){
            pampaGauchoList.add(cidade);
        }
    }

    private String[] portoAlegre = {"Porto Alegre"};

    private ArrayList<String> portoAlegreList;
    public void setPortoAlegreList(){
        portoAlegreList = new ArrayList<>();
        for(String cidade : portoAlegre){
            portoAlegreList.add(cidade);
        }
    }

    private String[] rotaAguasEPedras = {
            "Alpestre",
            "Ametista do Sul",
            "Caiçara",
            "Frederico Westphalen",
            "Iraí",
            "Nonoai",
            "Pinheirinho do Vale",
            "Vicente Dutra"};

    private ArrayList<String> rotaAguasEPedrasList;
    public void setRotaAguasEPedrasList(){
        rotaAguasEPedrasList = new ArrayList<>();
        for(String cidade : rotaAguasEPedras){
            rotaAguasEPedrasList.add(cidade);
        }
    }

    private String[] rotaDasAraucarias = {
            "Água Santa",
            "Barracão",
            "Ibiaçá",
            "Lagoa Vermelha",
            "Machadinho",
            "Maximiliano de Almeida",
            "Paim Filho",
            "Sananduva",
            "Santo Expedito do Sul",
            "São João da Urtiga"};

    private ArrayList<String> rotaDasAraucariasList;
    public void setRotaDasAraucariasList(){
        rotaDasAraucariasList = new ArrayList<>();
        for(String cidade : rotaDasAraucarias){
            rotaDasAraucariasList.add(cidade);
        }
    }

    private String[] rotaDasTerrasEncantadas = {
            "Boa Vista do Incra",
            "Colorado",
            "Fortaleza dos Valos",
            "Ibirubá",
            "Jacuizinho",
            "Não-Me-Toque",
            "Quinze de Novembro",
            "Saldanha Marinho",
            "Salto do Jacuí",
            "Selbach",
            "Tapera",
            "Tio Hugo",
            "Victor Graeff"};

    private ArrayList<String> rotaDasTerrasEncantadasList;
    public void setRotaDasTerrasEncantadasList(){
        rotaDasTerrasEncantadasList = new ArrayList<>();
        for(String cidade : rotaDasTerrasEncantadas){
            rotaDasTerrasEncantadasList.add(cidade);
        }
    }

    private String[] rotaDoRioUruguai = {
            "Alecrim",
            "Boa Vista do Buricá",
            "Cândido Godói",
            "Doutor Maurício Cardoso",
            "Horizontina",
            "Porto Mauá",
            "Porto Vera Cruz",
            "Santa Rosa",
            "Santo Cristo",
            "São José do Inhacorá",
            "Senador Salgado Filho",
            "Tuparendi"};

    private ArrayList<String> rotaDoRioUruguaiList;
    public void setRotaDoRioUruguaiList(){
        rotaDoRioUruguaiList = new ArrayList<>();
        for(String cidade : rotaDoRioUruguai){
            rotaDoRioUruguaiList.add(cidade);
        }
    }

    private String[] rotaDoYucuma = {
            "Ajuricaba",
            "Augusto Pestana",
            "Bom Progresso",
            "Bozano",
            "Braga",
            "Catuípe",
            "Chiapetta",
            "Coronel Bicaco",
            "Crissiumal",
            "Derrubadas",
            "Esperança do Sul",
            "Humaitá",
            "Ijuí",
            "Nova Ramada",
            "Panambi",
            "Redentora",
            "Santo Augusto",
            "São Martinho",
            "Sede Nova",
            "Tenente Portela",
            "Tiradentes do Sul",
            "Três Passos",
            "Vista Gaúcha"};

    private ArrayList<String> rotaDoYucumaList;
    public void setRotaDoYucumaList(){
        rotaDoYucumaList = new ArrayList<>();
        for(String cidade : rotaDoYucuma){
            rotaDoYucumaList.add(cidade);
        }
    }

    private String[] rotaMissoes = {
            "Caibaté",
            "Entre-Ijuís",
            "Giruá",
            "Guarani das Missões",
            "Mato Queimado",
            "Santo Ângelo",
            "São Borja",
            "São Luiz Gonzaga",
            "São Miguel das Missões",
            "São Nicolau",
            "São Pedro do Butiá"};

    private ArrayList<String> rotaMissoesList;
    public void setRotaMissoesList(){
        rotaMissoesList = new ArrayList<>();
        for(String cidade : rotaMissoes){
            rotaMissoesList.add(cidade);
        }
    }

    private String[] termasELagos = {
            "Aratiba",
            "Áurea",
            "Entre Rios do Sul",
            "Erechim",
            "Getúlio Vargas",
            "Marcelino Ramos",
            "Mariano Moro",
            "Paulo Bento",
            "Quatro Irmãos",
            "Severiano de Almeida",
            "Três Arroios",
            "Viadutos"};

    private ArrayList<String> termasELagosList;
    public void setTermasELagosList(){
        termasELagosList = new ArrayList<>();
        for(String cidade : termasELagos){
            termasELagosList.add(cidade);
        }
    }

    private String[] uvaEVinho = {
            "Antônio Prado",
            "Bento Gonçalves",
            "Carlos Barbosa",
            "Casca",
            "Caxias do Sul",
            "Coronel Pilar",
            "Cotiporã",
            "Farroupilha",
            "Flores da Cunha",
            "Garibaldi",
            "Guaporé",
            "Marau",
            "Monte Belo do Sul",
            "Nova Araçá",
            "Nova Bassano",
            "Nova Pádua",
            "Nova Prata",
            "Nova Roma do Sul",
            "Protásio Alves",
            "Santa Tereza",
            "Santo Antônio do Palma",
            "São Marcos",
            "Serafina Corrêa",
            "Veranópolis",
            "Vila Flores",
            "Vila Maria",
            "Vista Alegre do Prata"};

    private ArrayList<String> uvaEVinhoList;
    public void setUvaEVinhoList(){
        uvaEVinhoList = new ArrayList<>();
        for(String cidade : uvaEVinho){
            uvaEVinhoList.add(cidade);
        }
    }

    private String[] valeDoCai = {
            "Alto Feliz",
            "Barão",
            "Bom Princípio",
            "Brochier",
            "Capela de Santana",
            "Feliz",
            "Harmonia",
            "Linha Nova",
            "Maratá",
            "Montenegro",
            "Pareci Novo",
            "Portão",
            "Salvador do Sul",
            "São José do Sul",
            "São Pedro da Serra",
            "São Sebastião do Caí",
            "São Vendelino",
            "Vale Real"};

    private ArrayList<String> valeDoCaiList;
    public void setValeDoCaiList(){
        valeDoCaiList = new ArrayList<>();
        for(String cidade : valeDoCai){
            valeDoCaiList.add(cidade);
        }
    }

    private String[] valeDoJaguari = {
            "Cacequi",
            "Mata",
            "Nova Esperança do Sul",
            "Santiago",
            "São Vicente do Sul"};

    private ArrayList<String> valeDoJaguariList;
    public void setValeDoJaguariList(){
        valeDoJaguariList = new ArrayList<>();
        for(String cidade : valeDoJaguari){
            valeDoJaguariList.add(cidade);
        }
    }

    private String[] valeDoParanhana = {
            "Igrejinha",
            "Parobé",
            "Riozinho",
            "Rolante",
            "Taquara",
            "Três Coroas"};

    private ArrayList<String> valeDoParanhanaList;
    public void setValeDoParanhanaList(){
        valeDoParanhanaList = new ArrayList<>();
        for(String cidade : valeDoParanhana){
            valeDoParanhanaList.add(cidade);
        }
    }

    private String[] valeDoRioDosSinos = {
            "Araricá",
            "Campo Bom",
            "Dois Irmãos",
            "Estância Velha",
            "Ivoti",
            "Lindolfo Collor",
            "Morro Reuter",
            "Nova Hartz",
            "Novo Hamburgo",
            "Presidente Lucena",
            "São Leopoldo",
            "Sapiranga"};

    private ArrayList<String> valeDoRioDosSinosList;
    public void setValeDoRioDosSinosList(){
        valeDoRioDosSinosList = new ArrayList<>();
        for(String cidade : valeDoRioDosSinos){
            valeDoRioDosSinosList.add(cidade);
        }
    }

    private String[] valeDoRioPardo = {
            "Candelária",
            "Encruzilhada do Sul",
            "General Câmara",
            "Herveiras",
            "Mato Leitão",
            "Rio Pardo",
            "Santa Cruz do Sul",
            "Sinimbu",
            "Vale do Sol",
            "Vale Verde",
            "Venâncio Aires",
            "Vera Cruz"};

    private ArrayList<String> valeDoRioPardoList;
    public void setValeDoRioPardoList(){
        valeDoRioPardoList = new ArrayList<>();
        for(String cidade : valeDoRioPardo){
            valeDoRioPardoList.add(cidade);
        }
    }

    private String[] valeDoTaquari = {
            "Anta Gorda",
            "Arroio do Meio",
            "Arvorezinha",
            "Boqueirão do Leão",
            "Colinas",
            "Dois Lajeados",
            "Doutor Ricardo",
            "Encantado",
            "Estrela",
            "Ilópolis",
            "Itapuca",
            "Lajeado",
            "Muçum",
            "Nova Bréscia",
            "Progresso",
            "Relvado",
            "Sério",
            "Teutônia",
            "Vespasiano Correa",
            "Westfalia"};

    private ArrayList<String> valeDoTaquariList;
    public void setValeDoTaquariList(){
        valeDoTaquariList = new ArrayList<>();
        for(String cidade : valeDoTaquari){
            valeDoTaquariList.add(cidade);
        }
    }

    private String[][] regioesTuristicas = {altoDaSerraDoBotucarai, camposDeCimaDaSerra, carbonifera, central, centroSerra, costaDoce, culturaETradicao, deltaDoJacui,
                                            fronteira, hortensias, litoralNorteGaucho, pampaGaucho, portoAlegre, rotaAguasEPedras, rotaDasAraucarias, rotaDasTerrasEncantadas,
                                            rotaDoRioUruguai, rotaDoYucuma, rotaMissoes, termasELagos, uvaEVinho, valeDoCai, valeDoJaguari, valeDoParanhana, valeDoRioDosSinos,
                                            valeDoRioPardo, valeDoTaquari};

    private ArrayList<ArrayList<String>> regioesTuristicasList;
    public void setRegioesTuristicasList(){
        regioesTuristicasList = new ArrayList<>();
        regioesTuristicasList.add(altoDaSerraDoBotucaraiList);
        regioesTuristicasList.add(camposDeCimaDaSerraList);
        regioesTuristicasList.add(carboniferaList);
        regioesTuristicasList.add(centralList);
        regioesTuristicasList.add(centroSerraList);
        regioesTuristicasList.add(costaDoceList);
        regioesTuristicasList.add(culturaETradicaoList);
        regioesTuristicasList.add(deltaDoJacuiList);
        regioesTuristicasList.add(fronteiraList);
        regioesTuristicasList.add(hortensiasList);
        regioesTuristicasList.add(litoralNorteGauchoList);
        regioesTuristicasList.add(pampaGauchoList);
        regioesTuristicasList.add(portoAlegreList);
        regioesTuristicasList.add(rotaAguasEPedrasList);
        regioesTuristicasList.add(rotaDasAraucariasList);
        regioesTuristicasList.add(rotaDasTerrasEncantadasList);
        regioesTuristicasList.add(rotaDoRioUruguaiList);
        regioesTuristicasList.add(rotaDoYucumaList);
        regioesTuristicasList.add(rotaMissoesList);
        regioesTuristicasList.add(termasELagosList);
        regioesTuristicasList.add(uvaEVinhoList);
        regioesTuristicasList.add(valeDoCaiList);
        regioesTuristicasList.add(valeDoJaguariList);
        regioesTuristicasList.add(valeDoParanhanaList);
        regioesTuristicasList.add(valeDoRioDosSinosList);
        regioesTuristicasList.add(valeDoRioPardoList);
        regioesTuristicasList.add(valeDoTaquariList);
    }

    private String[] tipos = {
            "Alto da Serra do Botucaraí",
            "Campos de Cima da Serra",
            "Carbonífera",
            "Central",
            "Centro-Serra",
            "Costa Doce",
            "Cultura e Tradição",
            "Delta do Jacuí",
            "Fronteira",
            "Hortênsias",
            "Litoral Norte Gaúcho",
            "Pampa Gaúcho",
            "Porto Alegre",
            "Rota Águas e Pedras",
            "Rota das Araucárias",
            "Rota das Terras Encantadas",
            "Rota do Rio Uruguai",
            "Rota do Yucumã",
            "Rota Missões",
            "Termas e Lagos",
            "Uva e Vinho",
            "Vale do Caí",
            "Vale do Jaguarí",
            "Vale do Paranhana",
            "Vale do Rio dos Sinos",
            "Vale do Rio Pardo",
            "Vale do Taquari"};

    private ArrayList<String> tiposList;
    public void setTiposList(){
        tiposList = new ArrayList<>();
        for(String tipo : tipos){
            tiposList.add(tipo);
        }
    }

    private ArrayList<Cidade> listaCidades;
    private ArrayList<String> cidadesTuristicasList;

    private void main() {

        listaCidades = new ArrayList<>();
        cidadesTuristicasList = new ArrayList<>();

        setAltoDaSerraDoBotucaraiList(); setCamposDeCimaDaSerraList(); setCarboniferaList(); setCentralList(); setCentroSerraList();
        setCostaDoceList(); setCulturaETradicaoList(); setDeltaDoJacuiList(); setFronteiraList(); setHortensiasList(); setLitoralNorteGauchoList();
        setPampaGauchoList(); setPortoAlegreList(); setRotaAguasEPedrasList(); setRotaDasAraucariasList(); setRotaDasTerrasEncantadasList();
        setRotaDoRioUruguaiList(); setRotaDoYucumaList(); setRotaMissoesList(); setTermasELagosList(); setUvaEVinhoList(); setValeDoCaiList();
        setValeDoJaguariList(); setValeDoParanhanaList(); setValeDoRioDosSinosList(); setValeDoRioPardoList(); setValeDoTaquariList();
        setNomeCidadesList(); setRegioesTuristicasList(); setDescricaoCidadesList(); setTiposList();

        for(String nome : nomeCidadesList){
            Cidade c = new Cidade();
            c.setNome(nome);
            listaCidades.add(c);
        }

        for(int i=0; i<descricaoCidadesList.size(); i++){
            listaCidades.get(i).setDescricao(descricaoCidadesList.get(i));
        }

        for(int i=0; i<regioesTuristicasList.size(); i++){ // Percorre lista de listas
            for(String cidade : regioesTuristicasList.get(i)){ // Percorre uma lista de nomes de cidades i
                for(Cidade c : listaCidades){ // Percorre lista de cidades
                    if(cidade.equals(c.getNome())){ // Compara nome da cidade atual com o nome da cidade da lista i
                        cidadesTuristicasList.add(cidade); // Se nome das cidades iguais adiciona
                        c.setRegiaoTuristica(tiposList.get(i)); // Set regiao turistica da cidade atual
                    }
                }
            }
        }

    }

    public ArrayList<Cidade> getCidades() {
        main();
        return listaCidades;
    }

    public ArrayList<String> getTiposList(){
        setTiposList();
        return tiposList;
    }

    public ArrayList<String> getCidadesRegiao(int index){
        setRegioesTuristicasList();
        return regioesTuristicasList.get(index);
    }

}
