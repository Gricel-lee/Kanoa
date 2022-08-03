/**
 */
package dsl.impl;

import dsl.CompTaskListLoc;
import dsl.CompoundTask;
import dsl.DslPackage;
import dsl.Location;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Task List Loc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.CompTaskListLocImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link dsl.impl.CompTaskListLocImpl#getLocationList <em>Location List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompTaskListLocImpl extends MissionImpl implements CompTaskListLoc {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompTaskListLocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.COMP_TASK_LIST_LOC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.COMP_TASK_LIST_LOC__CT, oldCt, ct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMP_TASK_LIST_LOC__CT, oldCt, ct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocationList() {
		if (locationList == null) {
			locationList = new EObjectResolvingEList<Location>(Location.class, this, DslPackage.COMP_TASK_LIST_LOC__LOCATION_LIST);
		}
		return locationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.COMP_TASK_LIST_LOC__CT:
				if (resolve) return getCt();
				return basicGetCt();
			case DslPackage.COMP_TASK_LIST_LOC__LOCATION_LIST:
				return getLocationList();
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
			case DslPackage.COMP_TASK_LIST_LOC__CT:
				setCt((CompoundTask)newValue);
				return;
			case DslPackage.COMP_TASK_LIST_LOC__LOCATION_LIST:
				getLocationList().clear();
				getLocationList().addAll((Collection<? extends Location>)newValue);
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
			case DslPackage.COMP_TASK_LIST_LOC__CT:
				setCt((CompoundTask)null);
				return;
			case DslPackage.COMP_TASK_LIST_LOC__LOCATION_LIST:
				getLocationList().clear();
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
			case DslPackage.COMP_TASK_LIST_LOC__CT:
				return ct != null;
			case DslPackage.COMP_TASK_LIST_LOC__LOCATION_LIST:
				return locationList != null && !locationList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompTaskListLocImpl
