package infiniteTerrainSimulator;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Grid {

	private int pointsOfInterest = 1;
	private int gridSize = 10;
	private boolean[][] grid;
	private int xPositionOfPOI, yPositionOfPOI;
	
	private Random rand = new Random();

	public Grid() {
		populateGrid();

	}

	public void populateGridTestMethod(int x, int y){

		grid[xPositionOfPOI][yPositionOfPOI] = false;

		grid[x][y] = true;

	}


	public void populateGrid() {

		grid = new boolean[gridSize][gridSize];

		xPositionOfPOI = rand.nextInt(gridSize-1);;
		yPositionOfPOI = rand.nextInt(gridSize-1);;

		grid[xPositionOfPOI][yPositionOfPOI] = true;

	}


	public boolean[][] getGrid() {
		return grid;
	}

	public double distanceFromNearestPOI() {

		double distanceSQRD;
		double x = 0.0;
		double y = 0.0;

		for(int i = 0; i < grid.length-1; i++) {
			for(int j = 0; j < grid.length-1; j++) {
				if(grid[i][j]) {

					x = Math.abs(i - 4);
					y = Math.abs(j - 4);

					distanceSQRD =  (x*x) + (y*y);

					return Math.sqrt(distanceSQRD);
				} 
			}
		}
		return 0.0; 
	}

	public void playerMove(String move) {

		if(move.equalsIgnoreCase("North")||move.equalsIgnoreCase("n")) {

			//System.out.println(xPositionOfPOI + " " + yPositionOfPOI);

			grid[xPositionOfPOI][yPositionOfPOI] = false;
			if(yPositionOfPOI != 0) {
				
				yPositionOfPOI =- 1;	
				
			}

			grid[xPositionOfPOI][yPositionOfPOI] = true;

			//System.out.println(xPositionOfPOI + " " + yPositionOfPOI);

		}
		else if(move.equalsIgnoreCase("South")||move.equalsIgnoreCase("s")) {
			grid[xPositionOfPOI][yPositionOfPOI] = false;
			yPositionOfPOI =+ 1;
			grid[xPositionOfPOI][yPositionOfPOI] = true;

		}
		else if(move.equalsIgnoreCase("East")||move.equalsIgnoreCase("e")) {
			grid[xPositionOfPOI][yPositionOfPOI] = false;
			xPositionOfPOI =- 1;
			grid[xPositionOfPOI][yPositionOfPOI] = true;
		}
		else if(move.equalsIgnoreCase("West")||move.equalsIgnoreCase("w")) {
			grid[xPositionOfPOI][yPositionOfPOI] = false;
			xPositionOfPOI =+ 1;
			grid[xPositionOfPOI][yPositionOfPOI] = true;

		}			
	}

	public int getxPositionOfPOI() {
		return xPositionOfPOI;
	}

	public void setxPositionOfPOI(int xPositionOfPOI) {
		this.xPositionOfPOI = xPositionOfPOI;
	}

	public int getyPositionOfPOI() {
		return yPositionOfPOI;
	}

	public void setyPositionOfPOI(int yPositionOfPOI) {
		this.yPositionOfPOI = yPositionOfPOI;
	}

}

