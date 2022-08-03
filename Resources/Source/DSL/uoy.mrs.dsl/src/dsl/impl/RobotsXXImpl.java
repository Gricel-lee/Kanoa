/**
 */
package dsl.impl;

import dsl.DslPackage;
import dsl.Robot;
import dsl.RobotsXX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robots XX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.RobotsXXImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.impl.RobotsXXImpl#getXy1 <em>Xy1</em>}</li>
 *   <li>{@link dsl.impl.RobotsXXImpl#getXy2 <em>Xy2</em>}</li>
 *   <li>{@link dsl.impl.RobotsXXImpl#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotsXXImpl extends QoSImpl implements RobotsXX {
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
	 * The default value of the '{@link #getXy1() <em>Xy1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy1()
	 * @generated
	 * @ordered
	 */
	protected static final double XY1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXy1() <em>Xy1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy1()
	 * @generated
	 * @ordered
	 */
	protected double xy1 = XY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getXy2() <em>Xy2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy2()
	 * @generated
	 * @ordered
	 */
	protected static final double XY2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXy2() <em>Xy2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXy2()
	 * @generated
	 * @ordered
	 */
	protected double xy2 = XY2_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotsXXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ROBOTS_XX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_XX__COORDINATE, oldCoordinate, coordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXy1() {
		return xy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXy1(double newXy1) {
		double oldXy1 = xy1;
		xy1 = newXy1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_XX__XY1, oldXy1, xy1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXy2() {
		return xy2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXy2(double newXy2) {
		double oldXy2 = xy2;
		xy2 = newXy2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_XX__XY2, oldXy2, xy2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ROBOTS_XX__ROBOT, oldRobot, robot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROBOTS_XX__ROBOT, oldRobot, robot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.ROBOTS_XX__COORDINATE:
				return getCoordinate();
			case DslPackage.ROBOTS_XX__XY1:
				return getXy1();
			case DslPackage.ROBOTS_XX__XY2:
				return getXy2();
			case DslPackage.ROBOTS_XX__ROBOT:
				if (resolve) return getRobot();
				return basicGetRobot();
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
			case DslPackage.ROBOTS_XX__COORDINATE:
				setCoordinate((String)newValue);
				return;
			case DslPackage.ROBOTS_XX__XY1:
				setXy1((Double)newValue);
				return;
			case DslPackage.ROBOTS_XX__XY2:
				setXy2((Double)newValue);
				return;
			case DslPackage.ROBOTS_XX__ROBOT:
				setRobot((Robot)newValue);
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
			case DslPackage.ROBOTS_XX__COORDINATE:
				setCoordinate(COORDINATE_EDEFAULT);
				return;
			case DslPackage.ROBOTS_XX__XY1:
				setXy1(XY1_EDEFAULT);
				return;
			case DslPackage.ROBOTS_XX__XY2:
				setXy2(XY2_EDEFAULT);
				return;
			case DslPackage.ROBOTS_XX__ROBOT:
				setRobot((Robot)null);
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
			case DslPackage.ROBOTS_XX__COORDINATE:
				return COORDINATE_EDEFAULT == null ? coordinate != null : !COORDINATE_EDEFAULT.equals(coordinate);
			case DslPackage.ROBOTS_XX__XY1:
				return xy1 != XY1_EDEFAULT;
			case DslPackage.ROBOTS_XX__XY2:
				return xy2 != XY2_EDEFAULT;
			case DslPackage.ROBOTS_XX__ROBOT:
				return robot != null;
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
		result.append(", xy1: ");
		result.append(xy1);
		result.append(", xy2: ");
		result.append(xy2);
		result.append(')');
		return result.toString();
	}

} //RobotsXXImpl
