/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robots2tasks Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getAt <em>At</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getProb <em>Prob</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobots2tasksPerformance()
 * @model
 * @generated
 */
public interface Robots2tasksPerformance extends EObject
{
  /**
   * Returns the value of the '<em><b>At</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' reference.
   * @see #setAt(AtomicTask)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobots2tasksPerformance_At()
   * @model
   * @generated
   */
  AtomicTask getAt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getAt <em>At</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' reference.
   * @see #getAt()
   * @generated
   */
  void setAt(AtomicTask value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobots2tasksPerformance_Time()
   * @model
   * @generated
   */
  double getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(double value);

  /**
   * Returns the value of the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prob</em>' attribute.
   * @see #setProb(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRobots2tasksPerformance_Prob()
   * @model
   * @generated
   */
  double getProb();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Robots2tasksPerformance#getProb <em>Prob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prob</em>' attribute.
   * @see #getProb()
   * @generated
   */
  void setProb(double value);

} // Robots2tasksPerformance
