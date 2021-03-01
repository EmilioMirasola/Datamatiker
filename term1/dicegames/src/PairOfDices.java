package term1.dicegames.src;

import term1.dicegames.inspiration.Die;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
	/**
	 * The first die in the pair.
	 */
	private Die die1;
	/**
	 * The second die in the pair.
	 */
	private Die die2;

	private int ones = 0;
	private int twos = 0;
	private int threes = 0;
	private int fours = 0;
	private int fives = 0;
	private int sixes = 0;
	private int numOfRolls = 0;
	private int diceMatches = 0;
	private int highestRoll = 0;

	/**
	 * Constructor for objects of class PairOfDices
	 */
	// TODO: put the constructor here!
	public PairOfDices() {
		this.die1 = new Die();
		this.die2 = new Die();
	}

	public PairOfDices(int sides) {
		this.die1 = new Die(sides);
		this.die2 = new Die(sides);
	}

	public int getDiceMatches() {
		return diceMatches;
	}

	public void setDiceMatches(int diceMatches) {
		this.diceMatches = diceMatches;
	}

	public int getSixes() {
		return sixes;
	}

	public void setNumOfRolls(int numOfRolls) {
		this.numOfRolls = numOfRolls;
	}

	public void rollBothDices() {
		this.die1.roll();
		this.die2.roll();
		this.numOfRolls++;
		checkFaceValues();
		diceMatches();
		checkIfHighestRoll();
	}

	// Metoden kan tjekke seksere. Man kunne have lavet denne metode for alle tal og
	// kalde alle metoderne efter et dice roll
	private void checkSixes() {
		if (this.die1.getFaceValue() == 6) {
			this.sixes++;
		}
		if (this.die2.getFaceValue() == 6) {
			this.sixes++;
		}
	}

	public void checkFaceValues() {
		for (int i = 1; i <= 6; i++) {
			switch (i) {
				case 1:
					this.setOnes(this.getOnes() + numOfFaceValueMatches(i));
					break;
				case 2:
					this.setTwos(this.getTwos() + numOfFaceValueMatches(i));
					break;
				case 3:
					this.setThrees(this.getThrees() + numOfFaceValueMatches(i));
					break;
				case 4:
					this.setFours(this.getFours() + numOfFaceValueMatches(i));
					break;
				case 5:
					this.setFives(this.getFives() + numOfFaceValueMatches(i));
					break;
				case 6:
					this.setSixes(this.getSixes() + numOfFaceValueMatches(i));
					break;
			}

			// Det samme lavet med ifelse statements i
			// if (i == 1) {
			// this.setOnes(this.getOnes() + numOfFaceValueMatches(i));
			// } else if (i == 2) {
			// this.setTwos(this.getTwos() + numOfFaceValueMatches(i));
			// } else if (i == 3) {
			// this.setThrees(this.getThrees() + numOfFaceValueMatches(i));
			// } else if (i == 4) {
			// this.setFours(this.getFours() + numOfFaceValueMatches(i));
			// } else if (i == 5) {
			// this.setFives(this.getFives() + numOfFaceValueMatches(i));
			// } else {
			// this.setSixes(this.getFives() + numOfFaceValueMatches(i));
			// }
		}
	}

	private int numOfFaceValueMatches(int i) {
		int die1FaceValue = this.die1.getFaceValue();
		int die2FaceValue = this.die2.getFaceValue();
		int numOfMatches = 0;
		if (die1FaceValue == i) {
			numOfMatches++;
		}
		if (die2FaceValue == i) {
			numOfMatches++;
		}
		return numOfMatches;
	}

	private void checkIfHighestRoll() {
		if (sumOfDices() > this.highestRoll) {
			this.highestRoll = sumOfDices();
		}
	}

	private void diceMatches() {
		if (this.die1.getFaceValue() == this.die2.getFaceValue()) {
			setDiceMatches(getDiceMatches() + 1);
		}
	}

	public int sumOfDices() {
		return this.die1.getFaceValue() + this.die2.getFaceValue();
	}

	public void resetPairOfDice() {
		setOnes(0);
		setTwos(0);
		setThrees(0);
		setFours(0);
		setFives(0);
		setSixes(0);
		this.diceMatches = 0;
		this.highestRoll = 0;
		this.numOfRolls = 0;
	}

	public int getHighestRoll() {
		return this.highestRoll;
	}

	public int getNumOfRolls() {
		return this.numOfRolls;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getFives() {
		return fives;
	}

	public void setFives(int fives) {
		this.fives = fives;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getThrees() {
		return threes;
	}

	public void setThrees(int threes) {
		this.threes = threes;
	}

	public int getTwos() {
		return twos;
	}

	public void setTwos(int twos) {
		this.twos = twos;
	}

	public int getOnes() {
		return this.ones;
	}

	public void setOnes(int ones) {
		this.ones = ones;
	}
}
