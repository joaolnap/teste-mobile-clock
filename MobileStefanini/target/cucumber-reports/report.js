$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Clock.feature");
formatter.feature({
  "name": "Clock mobile",
  "description": "Eu como um usuario gostaria de adicionar um novo alarme para que eu acorde mais cedo no dia seguinte",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Adicionar novo alarme",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acione o menu Alarme",
  "keyword": "Dado "
});
formatter.match({
  "location": "ClockSteps.acionarOMenuAlarme()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao Adicionar Alarme",
  "keyword": "Quando "
});
formatter.match({
  "location": "ClockSteps.oUsuarioAcionarOBotaoAdicionarAlarme()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "configurar a hora para \"22:15\"",
  "keyword": "E "
});
formatter.match({
  "location": "ClockSteps.configurarAHoraPara(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o app adiciona um novo alarme com as informacoes:",
  "rows": [
    {
      "cells": [
        "Repeat"
      ]
    },
    {
      "cells": [
        "Default (Homecoming)"
      ]
    },
    {
      "cells": [
        "Label"
      ]
    },
    {
      "cells": [
        "Google Assistant Routine"
      ]
    },
    {
      "cells": [
        "Delete"
      ]
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "ClockSteps.oAppAdicionaUmNovoAlarmeComAsInformacoes(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "exluir alarme",
  "keyword": "Entao "
});
formatter.match({
  "location": "ClockSteps.exluirAlarme()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});