/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.AtomicTask;
import org.xtext.example.mydsl.myDsl.AtomicTaskLoc;
import org.xtext.example.mydsl.myDsl.Location;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Task Loc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtomicTaskLocImpl#getAt <em>At</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AtomicTaskLocImpl#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicTaskLocImpl extends MissionImpl implements AtomicTaskLoc
{
  /**
   * The cached value of the '{@link #getAt() <em>At</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAt()
   * @generated
   * @ordered
   */
  protected AtomicTask at;

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
  protected AtomicTaskLocImpl()
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
    return MyDslPackage.Literals.ATOMIC_TASK_LOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicTask getAt()
  {
    if (at != null && at.eIsProxy())
    {
      InternalEObject oldAt = (InternalEObject)at;
      at = (AtomicTask)eResolveProxy(oldAt);
      if (at != oldAt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ATOMIC_TASK_LOC__AT, oldAt, at));
      }
    }
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicTask basicGetAt()
  {
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAt(AtomicTask newAt)
  {
    AtomicTask oldAt = at;
    at = newAt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATOMIC_TASK_LOC__AT, oldAt, at));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ATOMIC_TASK_LOC__LOC, oldLoc, loc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATOMIC_TASK_LOC__LOC, oldLoc, loc));
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
      case MyDslPackage.ATOMIC_TASK_LOC__AT:
        if (resolve) return getAt();
        return basicGetAt();
      case MyDslPackage.ATOMIC_TASK_LOC__LOC:
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
      case MyDslPackage.ATOMIC_TASK_LOC__AT:
        setAt((AtomicTask)newValue);
        return;
      case MyDslPackage.ATOMIC_TASK_LOC__LOC:
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
      case MyDslPackage.ATOMIC_TASK_LOC__AT:
        setAt((AtomicTask)null);
        return;
      case MyDslPackage.ATOMIC_TASK_LOC__LOC:
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
      case MyDslPackage.ATOMIC_TASK_LOC__AT:
        return at != null;
      case MyDslPackage.ATOMIC_TASK_LOC__LOC:
        return loc != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicTaskLocImpl
