/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Task List Loc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskListLoc#getCt <em>Ct</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskListLoc#getLocationList <em>Location List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskListLoc#getCriticality <em>Criticality</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskListLoc()
 * @model
 * @generated
 */
public interface CompTaskListLoc extends Mission
{
  /**
   * Returns the value of the '<em><b>Ct</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ct</em>' reference.
   * @see #setCt(CompoundTask)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskListLoc_Ct()
   * @model
   * @generated
   */
  CompoundTask getCt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CompTaskListLoc#getCt <em>Ct</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ct</em>' reference.
   * @see #getCt()
   * @generated
   */
  void setCt(CompoundTask value);

  /**
   * Returns the value of the '<em><b>Location List</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location List</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskListLoc_LocationList()
   * @model
   * @generated
   */
  EList<Location> getLocationList();

  /**
   * Returns the value of the '<em><b>Criticality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criticality</em>' attribute.
   * @see #setCriticality(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskListLoc_Criticality()
   * @model
   * @generated
   */
  String getCriticality();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CompTaskListLoc#getCriticality <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criticality</em>' attribute.
   * @see #getCriticality()
   * @generated
   */
  void setCriticality(String value);

} // CompTaskListLoc
