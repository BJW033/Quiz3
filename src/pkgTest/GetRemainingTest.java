package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Deck;
import pkgException.DeckException;
import pkgEnum.eRank;
import pkgEnum.eSuit;
public class GetRemainingTest {

	@Test
	public void GetRemainingTest() throws DeckException {
		Deck test = new Deck();
		for(int i= 0;i<25;i++) {test.Draw();}
		System.out.println(test.getiDeckCount());
		System.out.println(test.getRemaining(eRank.THREE));
		System.out.println(test.getRemaining(eSuit.HEARTS));
	}

}
