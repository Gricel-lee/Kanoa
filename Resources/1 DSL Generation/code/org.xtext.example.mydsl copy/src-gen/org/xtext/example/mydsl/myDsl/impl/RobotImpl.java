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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Capability;
import org.xtext.example.mydsl.myDsl.Location;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Robot;
import org.xtext.example.mydsl.myDsl.Robots2tasksPerformance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getInitLoc <em>Init Loc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getRobots2tasksPerformance <em>Robots2tasks Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitLoc() <em>Init Loc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitLoc()
   * @generated
   * @ordered
   */
  protected Location initLoc;

  /**
   * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilities()
   * @generated
   * @ordered
   */
  protected EList<Capability> capabilities;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRobots2tasksPerformance() <em>Robots2tasks Performance</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots2tasksPerformance()
   * @generated
   * @ordered
   */
  protected EList<Robots2tasksPerformance> robots2tasksPerformance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotImpl()
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
    return MyDslPackage.Literals.ROBOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROBOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location getInitLoc()
  {
    if (initLoc != null && initLoc.eIsProxy())
    {
      InternalEObject oldInitLoc = (InternalEObject)initLoc;
      initLoc = (Location)eResolveProxy(oldInitLoc);
      if (initLoc != oldInitLoc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ROBOT__INIT_LOC, oldInitLoc, initLoc));
      }
    }
    return initLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location basicGetInitLoc()
  {
    return initLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitLoc(Location newInitLoc)
  {
    Location oldInitLoc = initLoc;
    initLoc = newInitLoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROBOT__INIT_LOC, oldInitLoc, initLoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Capability> getCapabilities()
  {
    if (capabilities == null)
    {
      capabilities = new EObjectResolvingEList<Capability>(Capability.class, this, MyDslPackage.ROBOT__CAPABILITIES);
    }
    return capabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROBOT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Robots2tasksPerformance> getRobots2tasksPerformance()
  {
    if (robots2tasksPerformance == null)
    {
      robots2tasksPerformance = new EObjectContainmentEList<Robots2tasksPerformance>(Robots2tasksPerformance.class, this, MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE);
    }
    return robots2tasksPerformance;
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
      case MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE:
        return ((InternalEList<?>)getRobots2tasksPerformance()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ROBOT__NAME:
        return getName();
      case MyDslPackage.ROBOT__INIT_LOC:
        if (resolve) return getInitLoc();
        return basicGetInitLoc();
      case MyDslPackage.ROBOT__CAPABILITIES:
        return getCapabilities();
      case MyDslPackage.ROBOT__DESCRIPTION:
        return getDescription();
      case MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE:
        return getRobots2tasksPerformance();
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
      case MyDslPackage.ROBOT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.ROBOT__INIT_LOC:
        setInitLoc((Location)newValue);
        return;
      case MyDslPackage.ROBOT__CAPABILITIES:
        getCapabilities().clear();
        getCapabilities().addAll((Collection<? extends Capability>)newValue);
        return;
      case MyDslPackage.ROBOT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE:
        getRobots2tasksPerformance().clear();
        getRobots2tasksPerformance().addAll((Collection<? extends Robots2tasksPerformance>)newValue);
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
      case MyDslPackage.ROBOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.ROBOT__INIT_LOC:
        setInitLoc((Location)null);
        return;
      case MyDslPackage.ROBOT__CAPABILITIES:
        getCapabilities().clear();
        return;
      case MyDslPackage.ROBOT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE:
        getRobots2tasksPerformance().clear();
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
      case MyDslPackage.ROBOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.ROBOT__INIT_LOC:
        return initLoc != null;
      case MyDslPackage.ROBOT__CAPABILITIES:
        return capabilities != null && !capabilities.isEmpty();
      case MyDslPackage.ROBOT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyDslPackage.ROBOT__ROBOTS2TASKS_PERFORMANCE:
        return robots2tasksPerformance != null && !robots2tasksPerformance.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //RobotImpl
