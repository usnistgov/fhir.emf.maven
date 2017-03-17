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
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getIsBrand <em>Is Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationImpl extends DomainResourceImpl implements Medication {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getIsBrand() <em>Is Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBrand()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isBrand;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected MedicationProduct product;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected MedicationPackage package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsBrand() {
		return isBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsBrand(org.hl7.fhir.Boolean newIsBrand, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsBrand = isBrand;
		isBrand = newIsBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_BRAND, oldIsBrand, newIsBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBrand(org.hl7.fhir.Boolean newIsBrand) {
		if (newIsBrand != isBrand) {
			NotificationChain msgs = null;
			if (isBrand != null)
				msgs = ((InternalEObject)isBrand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_BRAND, null, msgs);
			if (newIsBrand != null)
				msgs = ((InternalEObject)newIsBrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_BRAND, null, msgs);
			msgs = basicSetIsBrand(newIsBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_BRAND, newIsBrand, newIsBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(MedicationProduct newProduct, NotificationChain msgs) {
		MedicationProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(MedicationProduct newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(MedicationPackage newPackage, NotificationChain msgs) {
		MedicationPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(MedicationPackage newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICATION__IS_BRAND:
				return basicSetIsBrand(null, msgs);
			case FhirPackage.MEDICATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.MEDICATION__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.MEDICATION__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case FhirPackage.MEDICATION__CODE:
				return getCode();
			case FhirPackage.MEDICATION__IS_BRAND:
				return getIsBrand();
			case FhirPackage.MEDICATION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICATION__PRODUCT:
				return getProduct();
			case FhirPackage.MEDICATION__PACKAGE:
				return getPackage();
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
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION__IS_BRAND:
				setIsBrand((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.MEDICATION__PRODUCT:
				setProduct((MedicationProduct)newValue);
				return;
			case FhirPackage.MEDICATION__PACKAGE:
				setPackage((MedicationPackage)newValue);
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
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION__IS_BRAND:
				setIsBrand((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.MEDICATION__PRODUCT:
				setProduct((MedicationProduct)null);
				return;
			case FhirPackage.MEDICATION__PACKAGE:
				setPackage((MedicationPackage)null);
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
			case FhirPackage.MEDICATION__CODE:
				return code != null;
			case FhirPackage.MEDICATION__IS_BRAND:
				return isBrand != null;
			case FhirPackage.MEDICATION__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.MEDICATION__PRODUCT:
				return product != null;
			case FhirPackage.MEDICATION__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationImpl
