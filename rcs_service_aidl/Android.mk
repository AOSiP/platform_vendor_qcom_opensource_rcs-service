LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_AIDL_INCLUDES := $(LOCAL_PATH)/src

# Important: Must not contain any aidl files for parcelables
LOCAL_SRC_FILES := \
    $(call all-java-files-under, src) \
    src/com/suntek/mway/rcs/client/aidl/autoconfig/IAutoConfigApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/blacklist/IBlackListApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/capability/ICapabilityApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/capability/IRcsCapabilityApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/emoticon/IEmoticonApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IGroupManagerApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IInstantMessageApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IPaMessageApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/IRCSServiceListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/login/ILoginApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/login/ILoginEventListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/mcloud/IMcloudFileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/mcontact/IMcontactApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/ICapabiltyListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IConferenceCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonCallbackApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonCanSendCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonPackagesNetCallbackApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonSetSuccessDownListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudAuthListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudConfListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudFileListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudMsgListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudOperationCtrl.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudSdkListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudShareListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudTransListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMContactSyncListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfileGetCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfileListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfilePutCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IPublicAccountCallbackAPI.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IMcloudFileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IProfileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IPublicAccountAPI.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IRichScreenApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugincenter/IPluginCenterApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/registration/IRegistrationApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/setting/callback/IAccountEventListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/setting/IRcsSettingApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/specialnumber/ISpecialServiceNumApi.aidl

LOCAL_MODULE_TAGS := optional
LOCAL_MODULE := rcs_service_aidl

include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)

LOCAL_AIDL_INCLUDES := $(LOCAL_PATH)/src

# Important: Must not contain any aidl files for parcelables
LOCAL_SRC_FILES := \
    $(call all-java-files-under, src) \
    src/com/suntek/mway/rcs/client/aidl/autoconfig/IAutoConfigApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/blacklist/IBlackListApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/capability/ICapabilityApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/capability/IRcsCapabilityApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/emoticon/IEmoticonApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IGroupManagerApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IInstantMessageApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/im/IPaMessageApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/IRCSServiceListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/login/ILoginApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/login/ILoginEventListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/mcloud/IMcloudFileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/mcontact/IMcontactApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/ICapabiltyListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IConferenceCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonCallbackApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonCanSendCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonPackagesNetCallbackApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IEmoticonSetSuccessDownListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudAuthListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudConfListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudFileListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudMsgListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudOperationCtrl.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudSdkListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudShareListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMcloudTransListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IMContactSyncListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfileGetCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfileListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IProfilePutCallback.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/callback/IPublicAccountCallbackAPI.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IMcloudFileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IProfileApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IPublicAccountAPI.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugin/IRichScreenApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/plugincenter/IPluginCenterApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/registration/IRegistrationApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/setting/callback/IAccountEventListener.aidl \
    src/com/suntek/mway/rcs/client/aidl/setting/IRcsSettingApi.aidl \
    src/com/suntek/mway/rcs/client/aidl/specialnumber/ISpecialServiceNumApi.aidl

LOCAL_MODULE_TAGS := optional
LOCAL_MODULE := rcs_service_aidl_static

include $(BUILD_STATIC_JAVA_LIBRARY)


#MAKE_XML
include $(CLEAR_VARS)
LOCAL_MODULE := rcs_service_aidl.xml
LOCAL_MODULE_CLASS := ETC
LOCAL_MODULE_PATH := $(TARGET_OUT_ETC)/permissions
LOCAL_SRC_FILES := $(LOCAL_MODULE)
LOCAL_MODULE_TAGS := optional
include $(BUILD_PREBUILT)
