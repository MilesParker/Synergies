package edu.osu.synergies.spatial;

/**
 * <!-- begin-user-doc -->
 * Resource Distribution Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum ResourceDistributionEnum {
	regular("Regular"), clumped("Clumped"), random("Random");

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
	private ResourceDistributionEnum(String name) {
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
