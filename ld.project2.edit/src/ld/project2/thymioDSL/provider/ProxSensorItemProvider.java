/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL.provider;


import java.util.Collection;
import java.util.List;

import ld.project2.thymioDSL.ProxSensor;
import ld.project2.thymioDSL.ThymioDSLPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ld.project2.thymioDSL.ProxSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProxSensorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxSensorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBackLeftSensorPropertyDescriptor(object);
			addBackRightSensorPropertyDescriptor(object);
			addFrontRightSensorPropertyDescriptor(object);
			addFrontCenterRightSensorPropertyDescriptor(object);
			addFrontCenterSensorPropertyDescriptor(object);
			addFrontCenterLeftSensorPropertyDescriptor(object);
			addFrontLeftSensorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Back Left Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackLeftSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_backLeftSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_backLeftSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__BACK_LEFT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Back Right Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackRightSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_backRightSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_backRightSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__BACK_RIGHT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Right Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontRightSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_frontRightSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_frontRightSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__FRONT_RIGHT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Center Right Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontCenterRightSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_frontCenterRightSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_frontCenterRightSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__FRONT_CENTER_RIGHT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Center Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontCenterSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_frontCenterSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_frontCenterSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__FRONT_CENTER_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Center Left Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontCenterLeftSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_frontCenterLeftSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_frontCenterLeftSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__FRONT_CENTER_LEFT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Front Left Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrontLeftSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProxSensor_frontLeftSensor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProxSensor_frontLeftSensor_feature", "_UI_ProxSensor_type"),
				 ThymioDSLPackage.Literals.PROX_SENSOR__FRONT_LEFT_SENSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ProxSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProxSensor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProxSensor)object).getBackLeftSensor();
		return label == null || label.length() == 0 ?
			getString("_UI_ProxSensor_type") :
			getString("_UI_ProxSensor_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProxSensor.class)) {
			case ThymioDSLPackage.PROX_SENSOR__BACK_LEFT_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__BACK_RIGHT_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__FRONT_RIGHT_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__FRONT_CENTER_RIGHT_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__FRONT_CENTER_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__FRONT_CENTER_LEFT_SENSOR:
			case ThymioDSLPackage.PROX_SENSOR__FRONT_LEFT_SENSOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ThymioDSLEditPlugin.INSTANCE;
	}

}
