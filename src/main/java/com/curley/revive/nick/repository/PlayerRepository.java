/**
 * 
 */
package com.curley.revive.nick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curley.revive.nick.model.Player;

/**
 * Repository for Player persistence
 * 
 * @author Mayor Curley
 */
@Repository("playerRepository")
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
