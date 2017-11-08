package com.millinder.foosball;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoosballController {
    @RequestMapping(path="/foos", method= RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String newMatchRequest(SlackCommandData data) {
         return data.getUser_name() + " is looking for players";
    }

    @RequestMapping(path="/play", method= RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String joinMatch(SlackCommandData data) {
         return data.getUser_name() + " wants to play";
    }

    
}
