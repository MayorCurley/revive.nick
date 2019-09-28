/**
 * 
 */
package com.curley.revive.nick.service;

import java.util.List;

import com.curley.revive.nick.model.Player;

/**
 * Service layer for Player object
 * 
 * @author Mayor Curley
 *
 */
public interface PlayerService {
    Player getPlayerById(long id);
    List<Player> getAllPlayers();
}
