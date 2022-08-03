/**
 */
package dsl.impl;

import dsl.AllRobotsX;
import dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Robots X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.AllRobotsXImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.impl.AllRobotsXImpl#getType <em>Type</em>}</li>
 *   <li>{@link dsl.impl.AllRobotsXImpl#getXy <em>Xy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllRobotsXImpl extends QoSImpl implements AllRobotsX {
	/**
	 * The default value of the '{@link #getCoordinate() <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected String coordinate = COORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXy() <em>Xy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy()
	 * @generated
	 * @ordered
	 */
	protected static final double XY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXy() <em>Xy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy()
	 * @generated
	 * @ordered
	 */
	protected double xy = XY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllRobotsXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ALL_ROBOTS_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordinate() {
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinate(String newCoordinate) {
		String oldCoordinate = coordinate;
		coordinate = newCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ALL_ROBOTS_X__COORDINATE, oldCoordinate, coordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ALL_ROBOTS_X__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXy() {
		return xy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXy(double newXy) {
		double oldXy = xy;
		xy = newXy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ALL_ROBOTS_X__XY, oldXy, xy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.ALL_ROBOTS_X__COORDINATE:
				return getCoordinate();
			case DslPackage.ALL_ROBOTS_X__TYPE:
				return getType();
			case DslPackage.ALL_ROBOTS_X__XY:
				return getXy();
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
			case DslPackage.ALL_ROBOTS_X__COORDINATE:
				setCoordinate((String)newValue);
				return;
			case DslPackage.ALL_ROBOTS_X__TYPE:
				setType((String)newValue);
				return;
			case DslPackage.ALL_ROBOTS_X__XY:
				setXy((Double)newValue);
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
			case DslPackage.ALL_ROBOTS_X__COORDINATE:
				setCoordinate(COORDINATE_EDEFAULT);
				return;
			case DslPackage.ALL_ROBOTS_X__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DslPackage.ALL_ROBOTS_X__XY:
				setXy(XY_EDEFAULT);
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
			case DslPackage.ALL_ROBOTS_X__COORDINATE:
				return COORDINATE_EDEFAULT == null ? coordinate != null : !COORDINATE_EDEFAULT.equals(coordinate);
			case DslPackage.ALL_ROBOTS_X__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DslPackage.ALL_ROBOTS_X__XY:
				return xy != XY_EDEFAULT;
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
		result.append(" (coordinate: ");
		result.append(coordinate);
		result.append(", type: ");
		result.append(type);
		result.append(", xy: ");
		result.append(xy);
		result.append(')');
		return result.toString();
	}

} //AllRobotsXImpl
