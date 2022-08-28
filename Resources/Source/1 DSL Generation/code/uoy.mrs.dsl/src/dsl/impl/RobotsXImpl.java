/**
 */
package dsl.impl;

import dsl.DslPackage;
import dsl.Robot;
import dsl.RobotsX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robots X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.RobotsXImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.impl.RobotsXImpl#getXy <em>Xy</em>}</li>
 *   <li>{@link dsl.impl.RobotsXImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link dsl.impl.RobotsXImpl#getType <em>Type</em>}</li>
 *   <li>{@link dsl.impl.RobotsXImpl#getTyp <em>Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotsXImpl extends QoSImpl implements RobotsX {
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
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected Robot robot;

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
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotsXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ROBOTS_X;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_X__COORDINATE, oldCoordinate, coordinate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_X__XY, oldXy, xy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot getRobot() {
		if (robot != null && robot.eIsProxy()) {
			InternalEObject oldRobot = (InternalEObject)robot;
			robot = (Robot)eResolveProxy(oldRobot);
			if (robot != oldRobot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ROBOTS_X__ROBOT, oldRobot, robot));
			}
		}
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot basicGetRobot() {
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobot(Robot newRobot) {
		Robot oldRobot = robot;
		robot = newRobot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_X__ROBOT, oldRobot, robot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_X__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_X__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.ROBOTS_X__COORDINATE:
				return getCoordinate();
			case DslPackage.ROBOTS_X__XY:
				return getXy();
			case DslPackage.ROBOTS_X__ROBOT:
				if (resolve) return getRobot();
				return basicGetRobot();
			case DslPackage.ROBOTS_X__TYPE:
				return getType();
			case DslPackage.ROBOTS_X__TYP:
				return getTyp();
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
			case DslPackage.ROBOTS_X__COORDINATE:
				setCoordinate((String)newValue);
				return;
			case DslPackage.ROBOTS_X__XY:
				setXy((Double)newValue);
				return;
			case DslPackage.ROBOTS_X__ROBOT:
				setRobot((Robot)newValue);
				return;
			case DslPackage.ROBOTS_X__TYPE:
				setType((String)newValue);
				return;
			case DslPackage.ROBOTS_X__TYP:
				setTyp((String)newValue);
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
			case DslPackage.ROBOTS_X__COORDINATE:
				setCoordinate(COORDINATE_EDEFAULT);
				return;
			case DslPackage.ROBOTS_X__XY:
				setXy(XY_EDEFAULT);
				return;
			case DslPackage.ROBOTS_X__ROBOT:
				setRobot((Robot)null);
				return;
			case DslPackage.ROBOTS_X__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DslPackage.ROBOTS_X__TYP:
				setTyp(TYP_EDEFAULT);
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
			case DslPackage.ROBOTS_X__COORDINATE:
				return COORDINATE_EDEFAULT == null ? coordinate != null : !COORDINATE_EDEFAULT.equals(coordinate);
			case DslPackage.ROBOTS_X__XY:
				return xy != XY_EDEFAULT;
			case DslPackage.ROBOTS_X__ROBOT:
				return robot != null;
			case DslPackage.ROBOTS_X__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DslPackage.ROBOTS_X__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
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
		result.append(", xy: ");
		result.append(xy);
		result.append(", type: ");
		result.append(type);
		result.append(", typ: ");
		result.append(typ);
		result.append(')');
		return result.toString();
	}

} //RobotsXImpl
