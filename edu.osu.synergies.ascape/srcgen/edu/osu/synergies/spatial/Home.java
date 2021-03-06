package edu.osu.synergies.spatial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
import org.ascape.model.space.Singleton;
import org.ascape.model.space.Location;
import org.ascape.util.Conditional;

/**
 * <!-- begin-user-doc -->
 * Home Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class Home extends CellOccupant {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int homeID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new Home.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Home() {
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
			Home clone = (Home) super.clone();
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
	public Color getColor() {
		return Color.LIGHT_GRAY;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize Location Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeLocation() {
		final Object home = (Object) ((org.ascape.model.space.Discrete) getSpatialResources()
				.getDistrict().getSpace()).findRandomAvailable();
		if (home != null) {
			if (getHostScape() != ((Agent) home).getScape()) {
				die();
				getSpatialResources().getHomeScape().add(this);
			}
			moveTo(((HostCell) home));
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize ID Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeID() {
		setHomeID(getSpatialResources().getNextHomeID());
		int incrementNextHomeID = //increment
		getSpatialResources().getNextHomeID() + 1;

		getSpatialResources().setNextHomeID(incrementNextHomeID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Home ID property for Home.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomeID() {
		return homeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Home ID property for Home.
	 * 
	 * @param _homeID the new Home ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeID(int _homeID) {
		homeID = _homeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Home " + getUID();
		} else {
			return name;
		}
	}
}
