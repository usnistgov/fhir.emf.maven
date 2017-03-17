/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getTransactionMode <em>Transaction Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceRest#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceRest()
 * @model extendedMetaData="name='Conformance.Rest' kind='elementOnly'"
 * @generated
 */
public interface ConformanceRest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(RestfulConformanceMode)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	RestfulConformanceMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(RestfulConformanceMode value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the system's restful capabilities that apply across all applications, such as security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about security implementation from an interface perspective - what a client needs to know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(ConformanceSecurity)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceSecurity getSecurity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(ConformanceSecurity value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of the restful capabilities of the solution for a specific resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceResource> getResource();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceInteraction1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of restful operations supported by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceInteraction1> getInteraction();

	/**
	 * Returns the value of the '<em><b>Transaction Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how transactions are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Mode</em>' containment reference.
	 * @see #setTransactionMode(TransactionMode)
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_TransactionMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactionMode' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionMode getTransactionMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceRest#getTransactionMode <em>Transaction Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Mode</em>' containment reference.
	 * @see #getTransactionMode()
	 * @generated
	 */
	void setTransactionMode(TransactionMode value);

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceSearchParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_SearchParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchParam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceSearchParam> getSearchParam();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an operation or a named query and with its parameters and their meaning and type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI which is a reference to the definition of a compartment hosted by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceRest_Compartment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getCompartment();

} // ConformanceRest
