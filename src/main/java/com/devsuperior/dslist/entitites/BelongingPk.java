package com.devsuperior.dslist.entitites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        result = prime * result + ((gameList == null) ? 0 : gameList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPk other = (BelongingPk) obj;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        if (gameList == null) {
            if (other.gameList != null)
                return false;
        } else if (!gameList.equals(other.gameList))
            return false;
        return true;
    }

}
