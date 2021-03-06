package edu.osu.synergies.spatial;

/**
 * <!-- begin-user-doc -->
 * Behavior Java Implementation.
 * What is the learner currently doing? He or she is either at home or wandering, in which case they might activly be looking for a resource, wandering aimlessly, or returning home after the wandering period ends.
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum BehaviorEnum {
	notInterested("Not Interested"), seekingResource("Seeking Resource"), foundResource(
			"Found Resource"), atHome("At Home");

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehaviorEnum(String name) {
		this.name = name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return name;
	}
}
