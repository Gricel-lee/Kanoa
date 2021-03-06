/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robot#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robot#getInitLoc <em>Init Loc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robot#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robot#getRobots2tasksPerformance <em>Robots2tasks Performance</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Init Loc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Loc</em>' reference.
   * @see #setInitLoc(Location)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobot_InitLoc()
   * @model
   * @generated
   */
  Location getInitLoc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robot#getInitLoc <em>Init Loc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Loc</em>' reference.
   * @see #getInitLoc()
   * @generated
   */
  void setInitLoc(Location value);

  /**
   * Returns the value of the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Velocity</em>' attribute.
   * @see #setVelocity(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobot_Velocity()
   * @model
   * @generated
   */
  double getVelocity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robot#getVelocity <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Velocity</em>' attribute.
   * @see #getVelocity()
   * @generated
   */
  void setVelocity(double value);

  /**
   * Returns the value of the '<em><b>Robots2tasks Performance</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robots2tasks Performance</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobot_Robots2tasksPerformance()
   * @model containment="true"
   * @generated
   */
  EList<Robots2tasksPerformance> getRobots2tasksPerformance();

} // Robot
