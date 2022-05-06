package testing;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
	//
	private Integer numberOfFaces;
	private Integer currentFaceValue;

	// constructors
	public Die(Integer numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}

	public void Roll() {
		//
		ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
		//
		Integer randomFaceValue = randomNumberGenerator.nextInt(1, numberOfFaces);
		//
		this.currentFaceValue = randomFaceValue;
	}

	public Integer getNumberOfFaces() {
		return numberOfFaces;
	}

	public Integer getCurrentFaceValue() {
		return currentFaceValue;
	}

}
