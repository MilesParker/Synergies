package edu.osu.synergies.spatial;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;

import org.eclipse.swt.graphics.Color;
import org.eclipse.jface.viewers.IColorProvider;

import org.ascape.model.Agent;
import org.ascape.model.Cell;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.rule.Rule;
import org.ascape.model.rule.ExecuteThenUpdate;
import org.ascape.model.space.CollectionSpace;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Location;
import org.ascape.model.space.Singleton;
import org.ascape.runtime.NonGraphicRunner;
import org.ascape.util.Conditional;
import org.ascape.util.data.DataPoint;
import org.ascape.util.data.DataPointConcrete;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.ascape.view.vis.GraphView;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;
import org.eclipse.amp.escape.runtime.extension.IAgentChildProvider;

/**
 * <!-- begin-user-doc -->
 * Resource Interaction Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies 
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInteraction extends CellOccupant
		implements
			IAgentChildProvider {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private double strength = 0.0;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int resourceID = 0;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int learnerID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private List<IAgentChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IAgentChild> getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new Resource Interaction.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInteraction() {

		children = new ArrayList<IAgentChild>();

	}
	//todo, make this a useful value for evaluating compatibility of different versions of generated classes

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 89989998L;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static long nextUniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private long uniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUID() {
		if (uniqueID == 0) {
			uniqueID = nextUniqueID++;
		}
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Clones the agent, ensuring that a unique id is assigned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object clone() {
		try {
			ResourceInteraction clone = (ResourceInteraction) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialResources getSpatialResources() {
		return (SpatialResources) getScape().getScape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void startSimulationAgentChild(int timeStep) {
		if (timeStep == getRoot().getRunner().getEarliestPeriod()) {
			for (IAgentChild tmp : children) {
				tmp.startSimulation(timeStep);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void calculateTimeStep(int timeStep) {
		for (IAgentChild tmp : children) {
			tmp.calculate(timeStep);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Strength property for Resource Interaction.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Strength property for Resource Interaction.
	 * 
	 * @param _strength the new Strength value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(double _strength) {
		strength = _strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Resource ID property for Resource Interaction.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceID() {
		return resourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Resource ID property for Resource Interaction.
	 * 
	 * @param _resourceID the new Resource ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceID(int _resourceID) {
		resourceID = _resourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Learner ID property for Resource Interaction.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLearnerID() {
		return learnerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Learner ID property for Resource Interaction.
	 * 
	 * @param _learnerID the new Learner ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearnerID(int _learnerID) {
		learnerID = _learnerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Resource Interaction " + getUID();
		} else {
			return name;
		}
	}
}
