/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getSiteReference <em>Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getRateRange <em>Rate Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationDosageImpl extends BackboneElementImpl implements MedicationAdministrationDosage {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getSiteCodeableConcept() <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept siteCodeableConcept;

	/**
	 * The cached value of the '{@link #getSiteReference() <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteReference()
	 * @generated
	 * @ordered
	 */
	protected Reference siteReference;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getRateRatio() <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio rateRatio;

	/**
	 * The cached value of the '{@link #getRateRange() <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRange()
	 * @generated
	 * @ordered
	 */
	protected Range rateRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationAdministrationDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSiteCodeableConcept() {
		return siteCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteCodeableConcept(CodeableConcept newSiteCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSiteCodeableConcept = siteCodeableConcept;
		siteCodeableConcept = newSiteCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT, oldSiteCodeableConcept, newSiteCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteCodeableConcept(CodeableConcept newSiteCodeableConcept) {
		if (newSiteCodeableConcept != siteCodeableConcept) {
			NotificationChain msgs = null;
			if (siteCodeableConcept != null)
				msgs = ((InternalEObject)siteCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT, null, msgs);
			if (newSiteCodeableConcept != null)
				msgs = ((InternalEObject)newSiteCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSiteCodeableConcept(newSiteCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT, newSiteCodeableConcept, newSiteCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSiteReference() {
		return siteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteReference(Reference newSiteReference, NotificationChain msgs) {
		Reference oldSiteReference = siteReference;
		siteReference = newSiteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE, oldSiteReference, newSiteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteReference(Reference newSiteReference) {
		if (newSiteReference != siteReference) {
			NotificationChain msgs = null;
			if (siteReference != null)
				msgs = ((InternalEObject)siteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE, null, msgs);
			if (newSiteReference != null)
				msgs = ((InternalEObject)newSiteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE, null, msgs);
			msgs = basicSetSiteReference(newSiteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE, newSiteReference, newSiteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(SimpleQuantity newQuantity, NotificationChain msgs) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRateRatio() {
		return rateRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRatio(Ratio newRateRatio, NotificationChain msgs) {
		Ratio oldRateRatio = rateRatio;
		rateRatio = newRateRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO, oldRateRatio, newRateRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateRatio(Ratio newRateRatio) {
		if (newRateRatio != rateRatio) {
			NotificationChain msgs = null;
			if (rateRatio != null)
				msgs = ((InternalEObject)rateRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO, null, msgs);
			if (newRateRatio != null)
				msgs = ((InternalEObject)newRateRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO, null, msgs);
			msgs = basicSetRateRatio(newRateRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO, newRateRatio, newRateRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRateRange() {
		return rateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRange(Range newRateRange, NotificationChain msgs) {
		Range oldRateRange = rateRange;
		rateRange = newRateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE, oldRateRange, newRateRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateRange(Range newRateRange) {
		if (newRateRange != rateRange) {
			NotificationChain msgs = null;
			if (rateRange != null)
				msgs = ((InternalEObject)rateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE, null, msgs);
			if (newRateRange != null)
				msgs = ((InternalEObject)newRateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE, null, msgs);
			msgs = basicSetRateRange(newRateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE, newRateRange, newRateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT:
				return basicSetSiteCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE:
				return basicSetSiteReference(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO:
				return basicSetRateRatio(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE:
				return basicSetRateRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return getText();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT:
				return getSiteCodeableConcept();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE:
				return getSiteReference();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return getRoute();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return getMethod();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO:
				return getRateRatio();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE:
				return getRateRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE:
				setSiteReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO:
				setRateRatio((Ratio)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE:
				setRateRange((Range)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT:
				setSiteCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE:
				setSiteReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO:
				setRateRatio((Ratio)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE:
				setRateRange((Range)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return text != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_CODEABLE_CONCEPT:
				return siteCodeableConcept != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE_REFERENCE:
				return siteReference != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return route != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return method != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RATIO:
				return rateRatio != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE_RANGE:
				return rateRange != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationDosageImpl
