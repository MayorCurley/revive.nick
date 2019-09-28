/**
 * 
 */
package com.curley.revive.nick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curley.revive.nick.model.Player;
import com.curley.revive.nick.service.PlayerService;

/**
 * Rest Controller for Player requests
 * 
 * @author Mayor Curley
 */
@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    
    /**
     * @return
     */
    @RequestMapping(value="/employee", method=RequestMethod.GET)
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }
    
    /**
     * @param id
     * @return
     */
    @RequestMapping(value="/employee/{id}", method=RequestMethod.GET)
    public Player getPlayer(@PathVariable("id") long id) {
        return playerService.getPlayerById(id);
    }
}
