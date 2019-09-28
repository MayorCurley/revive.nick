/**
 * 
 */
package com.curley.revive.nick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curley.revive.nick.model.Player;
import com.curley.revive.nick.repository.PlayerRepository;

/**
 * @author Mayor Curley
 *
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    
    @Override
    public Player getPlayerById(long id) {
        Optional<Player> player = playerRepository.findById(id);
        
        return player.isPresent() ? player.get() : null;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
