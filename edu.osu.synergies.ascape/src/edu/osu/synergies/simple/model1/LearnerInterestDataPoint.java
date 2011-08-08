package edu.osu.synergies.simple.model1;

import org.ascape.util.data.UnitIntervalDataPoint;

final class LearnerInterestDataPoint extends UnitIntervalDataPoint {
	/**
     * 
     */
	private static final long serialVersionUID = -6033261844239803432L;

	public double getValue(Object object) {
		Learner learner = (Learner) object;
		double interest = learner.getLearningInterest();
		if (interest > 1.0) {
			return 1.0;
		}
		return interest;
	}
}