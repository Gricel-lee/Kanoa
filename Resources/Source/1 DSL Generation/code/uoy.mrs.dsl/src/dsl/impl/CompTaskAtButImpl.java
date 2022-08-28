/**
 */
package dsl.impl;

import dsl.CompTaskAtBut;
import dsl.CompoundTask;
import dsl.DslPackage;
import dsl.Location;
import dsl.LocationOrSpace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Task At But</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.CompTaskAtButImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link dsl.impl.CompTaskAtButImpl#getLocationList <em>Location List</em>}</li>
 *   <li>{@link dsl.impl.CompTaskAtButImpl#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompTaskAtButImpl extends MissionImpl implements CompTaskAtBut {
	/**
	 * The cached value of the '{@link #getCt() <em>Ct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCt()
	 * @generated
	 * @ordered
	 */
	protected CompoundTask ct;

	/**
	 * The cached value of the '{@link #getLocationList() <em>Location List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationList()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locationList;

	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected LocationOrSpace loc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompTaskAtButImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.COMP_TASK_AT_BUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundTask getCt() {
		if (ct != null && ct.eIsProxy()) {
			InternalEObject oldCt = (InternalEObject)ct;
			ct = (CompoundTask)eResolveProxy(oldCt);
			if (ct != oldCt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.COMP_TASK_AT_BUT__CT, oldCt, ct));
			}
		}
		return ct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundTask basicGetCt() {
		return ct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCt(CompoundTask newCt) {
		CompoundTask oldCt = ct;
		ct = newCt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMP_TASK_AT_BUT__CT, oldCt, ct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocationList() {
		if (locationList == null) {
			locationList = new EObjectResolvingEList<Location>(Location.class, this, DslPackage.COMP_TASK_AT_BUT__LOCATION_LIST);
		}
		return locationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationOrSpace getLoc() {
		if (loc != null && loc.eIsProxy()) {
			InternalEObject oldLoc = (InternalEObject)loc;
			loc = (LocationOrSpace)eResolveProxy(oldLoc);
			if (loc != oldLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.COMP_TASK_AT_BUT__LOC, oldLoc, loc));
			}
		}
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationOrSpace basicGetLoc() {
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoc(LocationOrSpace newLoc) {
		LocationOrSpace oldLoc = loc;
		loc = newLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMP_TASK_AT_BUT__LOC, oldLoc, loc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.COMP_TASK_AT_BUT__CT:
				if (resolve) return getCt();
				return basicGetCt();
			case DslPackage.COMP_TASK_AT_BUT__LOCATION_LIST:
				return getLocationList();
			case DslPackage.COMP_TASK_AT_BUT__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
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
			case DslPackage.COMP_TASK_AT_BUT__CT:
				setCt((CompoundTask)newValue);
				return;
			case DslPackage.COMP_TASK_AT_BUT__LOCATION_LIST:
				getLocationList().clear();
				getLocationList().addAll((Collection<? extends Location>)newValue);
				return;
			case DslPackage.COMP_TASK_AT_BUT__LOC:
				setLoc((LocationOrSpace)newValue);
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
			case DslPackage.COMP_TASK_AT_BUT__CT:
				setCt((CompoundTask)null);
				return;
			case DslPackage.COMP_TASK_AT_BUT__LOCATION_LIST:
				getLocationList().clear();
				return;
			case DslPackage.COMP_TASK_AT_BUT__LOC:
				setLoc((LocationOrSpace)null);
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
			case DslPackage.COMP_TASK_AT_BUT__CT:
				return ct != null;
			case DslPackage.COMP_TASK_AT_BUT__LOCATION_LIST:
				return locationList != null && !locationList.isEmpty();
			case DslPackage.COMP_TASK_AT_BUT__LOC:
				return loc != null;
		}
		return super.eIsSet(featureID);
	}

} //CompTaskAtButImpl
