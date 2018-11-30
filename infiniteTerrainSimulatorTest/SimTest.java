package infiniteTerrainSimulatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import infiniteTerrainSimulator.Grid;

public class SimTest {
	

	@Test
	public void testPopulateGrid() {
		
		Grid grid = new Grid();
		grid.populateGridTestMethod(0, 0);
		
		assertTrue("Grid not populated", grid.getGrid()[0][0]);
		
	}
	@Test
	public void testNearestPOI() {
		Grid grid = new Grid();
		
		grid.populateGridTestMethod(0, 0);
		
		assertEquals("Not correct distance", 5.56, grid.distanceFromNearestPOI(), 0.1);
		 
	}
	@Test
	public void testPlayerAtPOI() {
		Grid grid = new Grid();
		
		grid.populateGridTestMethod(4, 4);
		
		assertEquals("Not correct distance", 0.0, grid.distanceFromNearestPOI(), 0.1);
		 
	}
	@Test
	public void testPlayerMove() {
		Grid grid = new Grid();
		
		grid.populateGridTestMethod(4, 4);
		
		grid.playerMove("North");
		
		assertEquals("Not correct distance", 1, grid.distanceFromNearestPOI(), 0.1); 
		
		
	}

}
 