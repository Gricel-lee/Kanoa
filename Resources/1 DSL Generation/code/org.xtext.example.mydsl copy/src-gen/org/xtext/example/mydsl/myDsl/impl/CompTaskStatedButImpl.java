/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.CompTaskStatedBut;
import org.xtext.example.mydsl.myDsl.CompoundTask;
import org.xtext.example.mydsl.myDsl.LocationOrSpace;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Task Stated But</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CompTaskStatedButImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CompTaskStatedButImpl#getLocationList <em>Location List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CompTaskStatedButImpl#getCriticality <em>Criticality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompTaskStatedButImpl extends MissionImpl implements CompTaskStatedBut
{
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
   * The cached value of the '{@link #getLocationList() <em>Location List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationList()
   * @generated
   * @ordered
   */
  protected EList<LocationOrSpace> locationList;

  /**
   * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticality()
   * @generated
   * @ordered
   */
  protected static final String CRITICALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticality()
   * @generated
   * @ordered
   */
  protected String criticality = CRITICALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompTaskStatedButImpl()
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
    return MyDslPackage.Literals.COMP_TASK_STATED_BUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompoundTask getCt()
  {
    if (ct != null && ct.eIsProxy())
    {
      InternalEObject oldCt = (InternalEObject)ct;
      ct = (CompoundTask)eResolveProxy(oldCt);
      if (ct != oldCt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMP_TASK_STATED_BUT__CT, oldCt, ct));
      }
    }
    return ct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundTask basicGetCt()
  {
    return ct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCt(CompoundTask newCt)
  {
    CompoundTask oldCt = ct;
    ct = newCt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMP_TASK_STATED_BUT__CT, oldCt, ct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LocationOrSpace> getLocationList()
  {
    if (locationList == null)
    {
      locationList = new EObjectContainmentEList<LocationOrSpace>(LocationOrSpace.class, this, MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST);
    }
    return locationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCriticality()
  {
    return criticality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCriticality(String newCriticality)
  {
    String oldCriticality = criticality;
    criticality = newCriticality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMP_TASK_STATED_BUT__CRITICALITY, oldCriticality, criticality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST:
        return ((InternalEList<?>)getLocationList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.COMP_TASK_STATED_BUT__CT:
        if (resolve) return getCt();
        return basicGetCt();
      case MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST:
        return getLocationList();
      case MyDslPackage.COMP_TASK_STATED_BUT__CRITICALITY:
        return getCriticality();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMP_TASK_STATED_BUT__CT:
        setCt((CompoundTask)newValue);
        return;
      case MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST:
        getLocationList().clear();
        getLocationList().addAll((Collection<? extends LocationOrSpace>)newValue);
        return;
      case MyDslPackage.COMP_TASK_STATED_BUT__CRITICALITY:
        setCriticality((String)newValue);
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
      case MyDslPackage.COMP_TASK_STATED_BUT__CT:
        setCt((CompoundTask)null);
        return;
      case MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST:
        getLocationList().clear();
        return;
      case MyDslPackage.COMP_TASK_STATED_BUT__CRITICALITY:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMP_TASK_STATED_BUT__CT:
        return ct != null;
      case MyDslPackage.COMP_TASK_STATED_BUT__LOCATION_LIST:
        return locationList != null && !locationList.isEmpty();
      case MyDslPackage.COMP_TASK_STATED_BUT__CRITICALITY:
        return CRITICALITY_EDEFAULT == null ? criticality != null : !CRITICALITY_EDEFAULT.equals(criticality);
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
    result.append(" (criticality: ");
    result.append(criticality);
    result.append(')');
    return result.toString();
  }

} //CompTaskStatedButImpl
