package graphics;

public class RockTile extends Tile{

	public RockTile(int cId) {
		super(ImageAssets.rock, cId);
	}
	public boolean isSolid(){
		return true;
	}

}
