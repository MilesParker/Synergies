package edu.osu.synergies.simple.model1;

/**
 * <!-- begin-user-doc -->
 * Engagement Java Implementation.
 * 
 * Generated by AMF for model: SpatialResourcesSweep.metaabm in project: edu.osu.synergies 
 * <!-- end-user-doc -->
 * @generated
 */
public enum EngagementEnum {
	notInterested("Not Interested"), seekingResource("Seeking Resource"), foundResource(
			"Found Resource");

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
	private EngagementEnum(String name) {
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