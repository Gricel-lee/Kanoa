/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Capability;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Robot;
import org.xtext.example.mydsl.myDsl.RobotsModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robots Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotsModelImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotsModelImpl#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotsModelImpl extends MinimalEObjectImpl.Container implements RobotsModel
{
  /**
   * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapability()
   * @generated
   * @ordered
   */
  protected EList<Capability> capability;

  /**
   * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots()
   * @generated
   * @ordered
   */
  protected EList<Robot> robots;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotsModelImpl()
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
    return MyDslPackage.Literals.ROBOTS_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Capability> getCapability()
  {
    if (capability == null)
    {
      capability = new EObjectContainmentEList<Capability>(Capability.class, this, MyDslPackage.ROBOTS_MODEL__CAPABILITY);
    }
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Robot> getRobots()
  {
    if (robots == null)
    {
      robots = new EObjectContainmentEList<Robot>(Robot.class, this, MyDslPackage.ROBOTS_MODEL__ROBOTS);
    }
    return robots;
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
      case MyDslPackage.ROBOTS_MODEL__CAPABILITY:
        return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROBOTS_MODEL__ROBOTS:
        return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ROBOTS_MODEL__CAPABILITY:
        return getCapability();
      case MyDslPackage.ROBOTS_MODEL__ROBOTS:
        return getRobots();
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
      case MyDslPackage.ROBOTS_MODEL__CAPABILITY:
        getCapability().clear();
        getCapability().addAll((Collection<? extends Capability>)newValue);
        return;
      case MyDslPackage.ROBOTS_MODEL__ROBOTS:
        getRobots().clear();
        getRobots().addAll((Collection<? extends Robot>)newValue);
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
      case MyDslPackage.ROBOTS_MODEL__CAPABILITY:
        getCapability().clear();
        return;
      case MyDslPackage.ROBOTS_MODEL__ROBOTS:
        getRobots().clear();
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
      case MyDslPackage.ROBOTS_MODEL__CAPABILITY:
        return capability != null && !capability.isEmpty();
      case MyDslPackage.ROBOTS_MODEL__ROBOTS:
        return robots != null && !robots.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RobotsModelImpl
