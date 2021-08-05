package abstracts;

import entities.GameInfo;

public interface IGameService {
	void save(GameInfo gameInfo);
	void update(GameInfo gameInfo);
	void delete(GameInfo gameInfo);
	

}
