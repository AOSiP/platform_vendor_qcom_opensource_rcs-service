LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_MODULE_TAGS := optional
LOCAL_MODULE := rcs_service_api

LOCAL_STATIC_JAVA_LIBRARIES := \
    rcs_service_aidl

include $(BUILD_STATIC_JAVA_LIBRARY)