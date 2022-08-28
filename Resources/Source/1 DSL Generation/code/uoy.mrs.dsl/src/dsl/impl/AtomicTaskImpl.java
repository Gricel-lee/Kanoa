/**
 */
package dsl.impl;

import dsl.AtomicTask;
import dsl.DslPackage;
import dsl.Location;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.AtomicTaskImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link dsl.impl.AtomicTaskImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link dsl.impl.AtomicTaskImpl#isCriticality <em>Criticality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicTaskImpl extends TasksModelImpl implements AtomicTask {
	/**
	 * The default value of the '{@link #getRobots() <em>Robots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected static final int ROBOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected int robots = ROBOTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected Location loc;

	/**
	 * The default value of the '{@link #isCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticality()
	 * @generated
	 * @ordered
	 */
	protected boolean criticality = CRITICALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ATOMIC_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRobots() {
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobots(int newRobots) {
		int oldRobots = robots;
		robots = newRobots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ATOMIC_TASK__ROBOTS, oldRobots, robots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLoc() {
		if (loc != null && loc.eIsProxy()) {
			InternalEObject oldLoc = (InternalEObject)loc;
			loc = (Location)eResolveProxy(oldLoc);
			if (loc != oldLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ATOMIC_TASK__LOC, oldLoc, loc));
			}
		}
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLoc() {
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoc(Location newLoc) {
		Location oldLoc = loc;
		loc = newLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ATOMIC_TASK__LOC, oldLoc, loc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(boolean newCriticality) {
		boolean oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ATOMIC_TASK__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.ATOMIC_TASK__ROBOTS:
				return getRobots();
			case DslPackage.ATOMIC_TASK__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
			case DslPackage.ATOMIC_TASK__CRITICALITY:
				return isCriticality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPackage.ATOMIC_TASK__ROBOTS:
				setRobots((Integer)newValue);
				return;
			case DslPackage.ATOMIC_TASK__LOC:
				setLoc((Location)newValue);
				return;
			case DslPackage.ATOMIC_TASK__CRITICALITY:
				setCriticality((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslPackage.ATOMIC_TASK__ROBOTS:
				setRobots(ROBOTS_EDEFAULT);
				return;
			case DslPackage.ATOMIC_TASK__LOC:
				setLoc((Location)null);
				return;
			case DslPackage.ATOMIC_TASK__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslPackage.ATOMIC_TASK__ROBOTS:
				return robots != ROBOTS_EDEFAULT;
			case DslPackage.ATOMIC_TASK__LOC:
				return loc != null;
			case DslPackage.ATOMIC_TASK__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (robots: ");
		result.append(robots);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(')');
		return result.toString();
	}

} //AtomicTaskImpl
