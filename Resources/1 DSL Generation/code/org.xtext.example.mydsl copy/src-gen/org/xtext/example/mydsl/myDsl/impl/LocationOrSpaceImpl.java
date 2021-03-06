/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Location;
import org.xtext.example.mydsl.myDsl.LocationOrSpace;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Or Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LocationOrSpaceImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LocationOrSpaceImpl#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationOrSpaceImpl extends MinimalEObjectImpl.Container implements LocationOrSpace
{
  /**
   * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected static final String SPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected String space = SPACE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationOrSpaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.LOCATION_OR_SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSpace()
  {
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSpace(String newSpace)
  {
    String oldSpace = space;
    space = newSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOCATION_OR_SPACE__SPACE, oldSpace, space));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location getLoc()
  {
    if (loc != null && loc.eIsProxy())
    {
      InternalEObject oldLoc = (InternalEObject)loc;
      loc = (Location)eResolveProxy(oldLoc);
      if (loc != oldLoc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.LOCATION_OR_SPACE__LOC, oldLoc, loc));
      }
    }
    return loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location basicGetLoc()
  {
    return loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLoc(Location newLoc)
  {
    Location oldLoc = loc;
    loc = newLoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOCATION_OR_SPACE__LOC, oldLoc, loc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.LOCATION_OR_SPACE__SPACE:
        return getSpace();
      case MyDslPackage.LOCATION_OR_SPACE__LOC:
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.LOCATION_OR_SPACE__SPACE:
        setSpace((String)newValue);
        return;
      case MyDslPackage.LOCATION_OR_SPACE__LOC:
        setLoc((Location)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LOCATION_OR_SPACE__SPACE:
        setSpace(SPACE_EDEFAULT);
        return;
      case MyDslPackage.LOCATION_OR_SPACE__LOC:
        setLoc((Location)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.LOCATION_OR_SPACE__SPACE:
        return SPACE_EDEFAULT == null ? space != null : !SPACE_EDEFAULT.equals(space);
      case MyDslPackage.LOCATION_OR_SPACE__LOC:
        return loc != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (space: ");
    result.append(space);
    result.append(')');
    return result.toString();
  }

} //LocationOrSpaceImpl
