package edu.osu.synergies.simple.model1;

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
 * Learner Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies 
 * <!-- end-user-doc -->
 * @generated
 */
public class Learner extends CellOccupant implements IAgentChildProvider {

	/**
	 * <!-- begin-user-doc -->
	 * How engaged is the learner but the process of learning itelf?
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private double learningInterest = 0.0;
	/**
	 * <!-- begin-user-doc -->
	 * A unique identifier for the learner.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int learnerID = 0;
	/**
	 * <!-- begin-user-doc -->
	 * (Internal Use.)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private double learnerIndex = 0.0;
	/**
	 * <!-- begin-user-doc -->
	 * The total number of encounters a learner has had with any resource during the model period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int resourceEngagements = 0;
	/**
	 * <!-- begin-user-doc -->
	 * What is the learner currently doing? He or she is either at home or wandering, in which case they might activly be looking for a resource, wandering aimlessly, or returning home after the wandering period ends.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BehaviorEnum behavior = BehaviorEnum.notInterested;
	/**
	 * <!-- begin-user-doc -->
	 * A target resource that the learner may be seeking. Once a learner has identified a resource, the learner will seek this same resource out in the future unless they happen upon another resource. This id could be 0 in which case the learner hasn't identified a target learning resource.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int targetResourceID = 0;
	/**
	 * <!-- begin-user-doc -->
	 * The identifier for this learners home.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int homeID = 0;

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
	 * Constructs a new Learner.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Learner() {

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
			Learner clone = (Learner) super.clone();
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
	 * Initialize Location Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeLocation() {
		final Object learner = (Object) ((org.ascape.model.space.Discrete) getSpatialResources()
				.getDistrict().getSpace()).findRandomAvailable();
		if (learner != null) {
			if (getHostScape() != ((Agent) learner).getScape()) {
				die();
				getSpatialResources().getLearnerScape().add(this);
			}
			moveTo(((HostCell) learner));
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize State Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeState() {
		setLearnerID(getSpatialResources().getNextLearnerID());
		double initialInterest = initialInterest();
		int incrementNextLearnerID = getSpatialResources().getNextLearnerID() + 1;
		getSpatialResources().setNextLearnerID(incrementNextLearnerID);
		setLearningInterest(initialInterest);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Calculate Initial Interest.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double initialInterest() {
		double initialInterestMinimum = getSpatialResources()
				.getInitialInterestMinimum();
		double initialInterestMaximum = getSpatialResources()
				.getInitialInterestMaximum();
		return randomInRange(initialInterestMinimum, initialInterestMaximum);
	}
	/**
	 * <!-- begin-user-doc -->
	 * A learner may be at home, in which case they are not wandering, or engaged in another movement behavior. See the Behavior attribute for more details.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void movement() {
		if (getBehavior() == BehaviorEnum.seekingResource
				&& getSpatialResources().isWandering()) {
			Conditional targetLearningResourceCondition = new Conditional() {
				private static final long serialVersionUID = 1L;
				public boolean meetsCondition(Object targetLearningResourceCell) {
					targetLearningResourceCell = ((org.ascape.model.HostCell) targetLearningResourceCell)
							.getOccupant();
					if (targetLearningResourceCell instanceof LearningResource) {
						LearningResource targetLearningResource = (LearningResource) targetLearningResourceCell;
						return (targetLearningResource.getResourceID() == getTargetResourceID());
					} else {
						return false;
					}
				}
			};
			final Location targetLearningResourceLocation = ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace()).findNearest(
					((org.ascape.model.CellOccupant) this).getHostCell(),
					targetLearningResourceCondition, false, Double.MAX_VALUE);
			if (targetLearningResourceLocation != null) {
				final LearningResource targetLearningResource = (LearningResource) ((org.ascape.model.HostCell) targetLearningResourceLocation)
						.getOccupant();
				if (targetLearningResource != null) {
					moveToward(((org.ascape.model.CellOccupant) targetLearningResource)
							.getHostCell());
				}
			}
		}
		if (getBehavior() == BehaviorEnum.notInterested
				&& getSpatialResources().isWandering()) {
			final Object randomNeighboringLocation = (Object) ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace())
					.findRandomAvailableNeighbor(((org.ascape.model.CellOccupant) this)
							.getHostCell());
			if (randomNeighboringLocation != null) {
				if (getHostScape() != ((Agent) randomNeighboringLocation)
						.getScape()) {
					die();
					getSpatialResources().getLearnerScape().add(this);
				}
				moveTo(((HostCell) randomNeighboringLocation));
			}
		}
		if ((getBehavior() != BehaviorEnum.atHome && !getSpatialResources()
				.isWandering())) {
			Conditional returnedHomeCondition = new Conditional() {
				private static final long serialVersionUID = 1L;
				public boolean meetsCondition(Object returnedHomeCell) {
					if (returnedHomeCell instanceof Home) {
						Home returnedHome = (Home) returnedHomeCell;
						return (returnedHome.getHomeID() == getHomeID());
					} else {
						return false;
					}
				}
			};
			final Home returnedHome = (Home) ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace()).findRandomNeighbor(this,
					returnedHomeCondition);
			if (returnedHome != null) {
				setBehavior(BehaviorEnum.atHome);
			}
			Conditional learnerHomeCondition = new Conditional() {
				private static final long serialVersionUID = 1L;
				public boolean meetsCondition(Object learnerHomeCell) {
					learnerHomeCell = ((org.ascape.model.HostCell) learnerHomeCell)
							.getOccupant();
					if (learnerHomeCell instanceof Home) {
						Home learnerHome = (Home) learnerHomeCell;
						return (learnerHome.getHomeID() == getHomeID());
					} else {
						return false;
					}
				}
			};
			final Location learnerHomeLocation = ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace()).findNearest(
					((org.ascape.model.CellOccupant) this).getHostCell(),
					learnerHomeCondition, false, Double.MAX_VALUE);
			if (learnerHomeLocation != null) {
				final Home learnerHome = (Home) ((org.ascape.model.HostCell) learnerHomeLocation)
						.getOccupant();
				if (learnerHome != null) {
					moveToward(((org.ascape.model.CellOccupant) learnerHome)
							.getHostCell());
				}
			}
		}
		if ((getBehavior() != BehaviorEnum.atHome && getBehavior() != BehaviorEnum.atHome)) {
			final Object learnerCopy = (Object) ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace())
					.findRandomAvailableNeighbor(((org.ascape.model.CellOccupant) this)
							.getHostCell());
			if (learnerCopy != null) {
				if (getHostScape() != ((Agent) learnerCopy).getScape()) {
					die();
					getSpatialResources().getLearnerScape().add(this);
				}
				moveTo(((HostCell) learnerCopy));
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Resource Engagement Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resourceEngagement() {
		if ((getBehavior() == BehaviorEnum.notInterested || getBehavior() == BehaviorEnum.seekingResource)) {
			Conditional encounteredResourceCondition = new Conditional() {
				private static final long serialVersionUID = 1L;
				public boolean meetsCondition(Object encounteredResourceCell) {
					if (encounteredResourceCell instanceof LearningResource) {
						return true;
					} else {
						return false;
					}
				}
			};
			final LearningResource encounteredResource = (LearningResource) ((org.ascape.model.space.Discrete) getSpatialResources()
					.getDistrict().getSpace()).findRandomNeighbor(this,
					encounteredResourceCondition);
			if (encounteredResource != null) {
				double learningInterestAddEfficacy = getLearningInterest()
						+ encounteredResource.getEfficacy();
				Conditional allLearnerInteractionsCondition = new Conditional() {
					private static final long serialVersionUID = 1L;
					public boolean meetsCondition(
							Object allLearnerInteractionsCell) {
						if (allLearnerInteractionsCell instanceof ResourceInteraction) {
							ResourceInteraction allLearnerInteractions = (ResourceInteraction) allLearnerInteractionsCell;
							return (allLearnerInteractions.getResourceID() == encounteredResource
									.getResourceID() && allLearnerInteractions
									.getLearnerID() == getLearnerID());
						} else {
							return false;
						}
					}
				};
				final ResourceInteraction allLearnerInteractions = (ResourceInteraction) getSpatialResources()
						.getResourceInteractionScape().findRandom(
								allLearnerInteractionsCondition);
				if (allLearnerInteractions != null) {
					if ((allLearnerInteractions.getResourceID() == encounteredResource
							.getResourceID() && allLearnerInteractions
							.getLearnerID() == getLearnerID())) {
						double newStrength = allLearnerInteractions
								.getStrength() + 1;
						int incrementResourceEngagements = getResourceEngagements() + 1;
						allLearnerInteractions.setStrength(newStrength);
						setResourceEngagements(incrementResourceEngagements);
						setBehavior(BehaviorEnum.foundResource);
					}
				} else {

					ResourceInteraction createAgents = (ResourceInteraction) getSpatialResources()
							.getResourceInteractionScape().getSpace()
							.newLocation(false);
					createAgents.setLearnerID(getLearnerID());
					int resourceIDAddZero = encounteredResource.getResourceID() + 0;
					createAgents.setResourceID(resourceIDAddZero);
				}
				double minimum_LearningInterestAddEfficacyUnit_ = java.lang.Math
						.min(learningInterestAddEfficacy, 1);
				setLearningInterest(minimum_LearningInterestAddEfficacyUnit_);
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Derive Learner Index.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLearnerIndex() {
		return getLearnerID();
	}
	/**
	 * <!-- begin-user-doc -->
	 * Start Day Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startDay() {
		if (getSpatialResources().getTimeSegment() == 0) {
			setBehavior(BehaviorEnum.notInterested);
			setTargetResourceID(0);
			Conditional targetResourceCondition = new Conditional() {
				private static final long serialVersionUID = 1L;
				public boolean meetsCondition(Object targetResourceCell) {
					if (targetResourceCell instanceof ResourceInteraction) {
						ResourceInteraction targetResource = (ResourceInteraction) targetResourceCell;
						return (getLearnerID() == targetResource.getLearnerID());
					} else {
						return false;
					}
				}
			};
			final ResourceInteraction targetResource = (ResourceInteraction) getSpatialResources()
					.getResourceInteractionScape().findRandom(
							targetResourceCondition);
			if (targetResource != null) {
				if (getLearnerID() == targetResource.getLearnerID()) {
					double strengthMultiplySubsequentEngagementFactor = targetResource
							.getStrength()
							* targetResource.getSpatialResources()
									.getSubsequentEngagementFactor();
					double randomUnit = getRandom().nextDouble();
					if (randomUnit < strengthMultiplySubsequentEngagementFactor) {
						setBehavior(BehaviorEnum.seekingResource);
						int resourceIDAddZeroCopy = targetResource
								.getResourceID() + 0;
						setTargetResourceID(resourceIDAddZeroCopy);
					}
				}
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Find Home Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findHome() {
		Conditional homeLocationCondition = new Conditional() {
			private static final long serialVersionUID = 1L;
			public boolean meetsCondition(Object homeLocationCell) {
				homeLocationCell = ((org.ascape.model.HostCell) homeLocationCell)
						.getOccupant();
				if (homeLocationCell instanceof Home) {
					return true;
				} else {
					return false;
				}
			}
		};
		final Location homeLocationLocation = ((org.ascape.model.space.Discrete) getSpatialResources()
				.getDistrict().getSpace()).findNearest(
				((org.ascape.model.CellOccupant) this).getHostCell(),
				homeLocationCondition, false, Double.MAX_VALUE);
		if (homeLocationLocation != null) {
			final Home homeLocation = (Home) ((org.ascape.model.HostCell) homeLocationLocation)
					.getOccupant();
			if (homeLocation != null) {
				int homeIDAddZero = homeLocation.getHomeID() + 0;
				setHomeID(homeIDAddZero);
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Learning Interest property for Learner.
	 * @return How engaged is the learner but the process of learning itelf?
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLearningInterest() {
		return learningInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Learning Interest property for Learner.
	 * How engaged is the learner but the process of learning itelf?
	 * @param _learningInterest the new Learning Interest value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningInterest(double _learningInterest) {
		learningInterest = _learningInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Learner ID property for Learner.
	 * @return A unique identifier for the learner.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLearnerID() {
		return learnerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Learner ID property for Learner.
	 * A unique identifier for the learner.
	 * @param _learnerID the new Learner ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearnerID(int _learnerID) {
		learnerID = _learnerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Resource Engagements property for Learner.
	 * @return The total number of encounters a learner has had with any resource during the model period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceEngagements() {
		return resourceEngagements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Resource Engagements property for Learner.
	 * The total number of encounters a learner has had with any resource during the model period.
	 * @param _resourceEngagements the new Resource Engagements value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEngagements(int _resourceEngagements) {
		resourceEngagements = _resourceEngagements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Behavior property for Learner.
	 * @return What is the learner currently doing? He or she is either at home or wandering, in which case they might activly be looking for a resource, wandering aimlessly, or returning home after the wandering period ends.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorEnum getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Behavior property for Learner.
	 * What is the learner currently doing? He or she is either at home or wandering, in which case they might activly be looking for a resource, wandering aimlessly, or returning home after the wandering period ends.
	 * @param _behavior the new Behavior value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(BehaviorEnum _behavior) {
		behavior = _behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Target Resource ID property for Learner.
	 * @return A target resource that the learner may be seeking. Once a learner has identified a resource, the learner will seek this same resource out in the future unless they happen upon another resource. This id could be 0 in which case the learner hasn't identified a target learning resource.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetResourceID() {
		return targetResourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Target Resource ID property for Learner.
	 * A target resource that the learner may be seeking. Once a learner has identified a resource, the learner will seek this same resource out in the future unless they happen upon another resource. This id could be 0 in which case the learner hasn't identified a target learning resource.
	 * @param _targetResourceID the new Target Resource ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetResourceID(int _targetResourceID) {
		targetResourceID = _targetResourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Home ID property for Learner.
	 * @return The identifier for this learners home.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomeID() {
		return homeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Home ID property for Learner.
	 * The identifier for this learners home.
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
			return "Learner " + getUID();
		} else {
			return name;
		}
	}
}
