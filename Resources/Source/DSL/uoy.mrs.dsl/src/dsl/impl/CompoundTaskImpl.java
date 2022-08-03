/**
 */
package dsl.impl;

import dsl.CompoundTask;
import dsl.DslPackage;
import dsl.Location;
import dsl.TasksModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.CompoundTaskImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link dsl.impl.CompoundTaskImpl#isCriticality <em>Criticality</em>}</li>
 *   <li>{@link dsl.impl.CompoundTaskImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link dsl.impl.CompoundTaskImpl#isConsecutive <em>Consecutive</em>}</li>
 *   <li>{@link dsl.impl.CompoundTaskImpl#getCanDoTask <em>Can Do Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundTaskImpl extends TasksModelImpl implements CompoundTask {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

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
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isConsecutive() <em>Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsecutive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSECUTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConsecutive() <em>Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsecutive()
	 * @generated
	 * @ordered
	 */
	protected boolean consecutive = CONSECUTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCanDoTask() <em>Can Do Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanDoTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TasksModel> canDoTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.COMPOUND_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.COMPOUND_TASK__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMPOUND_TASK__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMPOUND_TASK__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMPOUND_TASK__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsecutive() {
		return consecutive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsecutive(boolean newConsecutive) {
		boolean oldConsecutive = consecutive;
		consecutive = newConsecutive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMPOUND_TASK__CONSECUTIVE, oldConsecutive, consecutive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TasksModel> getCanDoTask() {
		if (canDoTask == null) {
			canDoTask = new EObjectResolvingEList<TasksModel>(TasksModel.class, this, DslPackage.COMPOUND_TASK__CAN_DO_TASK);
		}
		return canDoTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.COMPOUND_TASK__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case DslPackage.COMPOUND_TASK__CRITICALITY:
				return isCriticality();
			case DslPackage.COMPOUND_TASK__ORDERED:
				return isOrdered();
			case DslPackage.COMPOUND_TASK__CONSECUTIVE:
				return isConsecutive();
			case DslPackage.COMPOUND_TASK__CAN_DO_TASK:
				return getCanDoTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPackage.COMPOUND_TASK__LOCATION:
				setLocation((Location)newValue);
				return;
			case DslPackage.COMPOUND_TASK__CRITICALITY:
				setCriticality((Boolean)newValue);
				return;
			case DslPackage.COMPOUND_TASK__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case DslPackage.COMPOUND_TASK__CONSECUTIVE:
				setConsecutive((Boolean)newValue);
				return;
			case DslPackage.COMPOUND_TASK__CAN_DO_TASK:
				getCanDoTask().clear();
				getCanDoTask().addAll((Collection<? extends TasksModel>)newValue);
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
			case DslPackage.COMPOUND_TASK__LOCATION:
				setLocation((Location)null);
				return;
			case DslPackage.COMPOUND_TASK__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case DslPackage.COMPOUND_TASK__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case DslPackage.COMPOUND_TASK__CONSECUTIVE:
				setConsecutive(CONSECUTIVE_EDEFAULT);
				return;
			case DslPackage.COMPOUND_TASK__CAN_DO_TASK:
				getCanDoTask().clear();
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
			case DslPackage.COMPOUND_TASK__LOCATION:
				return location != null;
			case DslPackage.COMPOUND_TASK__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case DslPackage.COMPOUND_TASK__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case DslPackage.COMPOUND_TASK__CONSECUTIVE:
				return consecutive != CONSECUTIVE_EDEFAULT;
			case DslPackage.COMPOUND_TASK__CAN_DO_TASK:
				return canDoTask != null && !canDoTask.isEmpty();
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
		result.append(" (criticality: ");
		result.append(criticality);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", consecutive: ");
		result.append(consecutive);
		result.append(')');
		return result.toString();
	}

} //CompoundTaskImpl
