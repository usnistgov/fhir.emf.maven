/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion()
 * @model extendedMetaData="name='ValueSet.Expansion' kind='elementOnly'"
 * @generated
 */
public interface ValueSetExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Uri)
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Uri value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time at which the expansion was produced by the expanding system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimestamp();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTime value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Total()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getTotal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getOffset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetContains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codes that are contained in the value set expansion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetExpansion_Contains()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contains' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetContains> getContains();

} // ValueSetExpansion
