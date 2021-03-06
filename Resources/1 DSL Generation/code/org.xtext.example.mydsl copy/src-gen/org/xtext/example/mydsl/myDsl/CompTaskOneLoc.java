/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Task One Loc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getCt <em>Ct</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getLoc <em>Loc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getCriticality <em>Criticality</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskOneLoc()
 * @model
 * @generated
 */
public interface CompTaskOneLoc extends Mission
{
  /**
   * Returns the value of the '<em><b>Ct</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ct</em>' reference.
   * @see #setCt(CompoundTask)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskOneLoc_Ct()
   * @model
   * @generated
   */
  CompoundTask getCt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getCt <em>Ct</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ct</em>' reference.
   * @see #getCt()
   * @generated
   */
  void setCt(CompoundTask value);

  /**
   * Returns the value of the '<em><b>Loc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc</em>' reference.
   * @see #setLoc(Location)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskOneLoc_Loc()
   * @model
   * @generated
   */
  Location getLoc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getLoc <em>Loc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc</em>' reference.
   * @see #getLoc()
   * @generated
   */
  void setLoc(Location value);

  /**
   * Returns the value of the '<em><b>Criticality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criticality</em>' attribute.
   * @see #setCriticality(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCompTaskOneLoc_Criticality()
   * @model
   * @generated
   */
  String getCriticality();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CompTaskOneLoc#getCriticality <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criticality</em>' attribute.
   * @see #getCriticality()
   * @generated
   */
  void setCriticality(String value);

} // CompTaskOneLoc
