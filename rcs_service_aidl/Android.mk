LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_AIDL_INCLUDES := $(LOCAL_PATH)/src

# Important: Must not contain any aidl files for parcelables
LOCAL_SRC_FILES := \
	$(call all-java-files-under, src) \
	src/com/suntek/mway/rcs/client/api/autoconfig/IAutoConfigApi.aidl \
	src/com/suntek/mway/rcs/client/api/blacklist/IBlackListApi.aidl \
	src/com/suntek/mway/rcs/client/api/capability/ICapabilityApi.aidl \
	src/com/suntek/mway/rcs/client/api/capability/IRcsCapabilityApi.aidl \
	src/com/suntek/mway/rcs/client/api/emoticon/IEmoticonApi.aidl \
	src/com/suntek/mway/rcs/client/api/im/IGroupManagerApi.aidl \
	src/com/suntek/mway/rcs/client/api/im/IInstantMessageApi.aidl \
	src/com/suntek/mway/rcs/client/api/im/IPaMessageApi.aidl \
	src/com/suntek/mway/rcs/client/api/IRCSServiceListener.aidl \
	src/com/suntek/mway/rcs/client/api/login/ILoginApi.aidl \
	src/com/suntek/mway/rcs/client/api/login/ILoginEventListener.aidl \
	src/com/suntek/mway/rcs/client/api/mcloud/IMcloudFileApi.aidl \
	src/com/suntek/mway/rcs/client/api/mcontact/IMcontactApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/ICapabiltyListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IConferenceCallback.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IEmoticonCallbackApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IEmoticonCanSendCallback.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IEmoticonPackagesNetCallbackApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IEmoticonSetSuccessDownListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudAuthListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudConfListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudFileListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudMsgListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudOperationCtrl.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudSdkListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudShareListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMcloudTransListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IMContactSyncListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IProfileGetCallback.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IProfileListener.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IProfilePutCallback.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/callback/IPublicAccountCallbackAPI.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/IMcloudFileApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/IProfileApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/IPublicAccountAPI.aidl \
	src/com/suntek/mway/rcs/client/api/plugin/IRichScreenApi.aidl \
	src/com/suntek/mway/rcs/client/api/plugincenter/IPluginCenterApi.aidl \
	src/com/suntek/mway/rcs/client/api/registration/IRegistrationApi.aidl \
	src/com/suntek/mway/rcs/client/api/setting/callback/IAccountEventListener.aidl \
	src/com/suntek/mway/rcs/client/api/setting/IRcsSettingApi.aidl \
	src/com/suntek/mway/rcs/client/api/specialnumber/ISpecialServiceNumApi.aidl

LOCAL_MODULE_TAGS := optional
LOCAL_MODULE := rcs_service_aidl

include $(BUILD_STATIC_JAVA_LIBRARY)