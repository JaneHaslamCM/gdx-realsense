/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCAudioSource extends PXCBase {
  private long swigCPtr;

  protected PXCAudioSource(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCAudioSource_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCAudioSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static public class DeviceInfo {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected DeviceInfo(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(DeviceInfo obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCAudioSource_DeviceInfo(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setName(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCAudioSource_DeviceInfo_name_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getName() {
      long cPtr = realsenseJNI.PXCAudioSource_DeviceInfo_name_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setDid(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCAudioSource_DeviceInfo_did_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getDid() {
      long cPtr = realsenseJNI.PXCAudioSource_DeviceInfo_did_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCAudioSource_DeviceInfo_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCAudioSource_DeviceInfo_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public DeviceInfo() {
      this(realsenseJNI.new_PXCAudioSource_DeviceInfo(), true);
    }
  
  }

  public void ScanDevices() {
    realsenseJNI.PXCAudioSource_ScanDevices(swigCPtr, this);
  }

  public int QueryDeviceNum() {
    return realsenseJNI.PXCAudioSource_QueryDeviceNum(swigCPtr, this);
  }

  public pxcStatus QueryDeviceInfo(int didx, PXCAudioSource.DeviceInfo dinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudioSource_QueryDeviceInfo__SWIG_0(swigCPtr, this, didx, PXCAudioSource.DeviceInfo.getCPtr(dinfo), dinfo));
  }

  public pxcStatus QueryDeviceInfo(PXCAudioSource.DeviceInfo dinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudioSource_QueryDeviceInfo__SWIG_1(swigCPtr, this, PXCAudioSource.DeviceInfo.getCPtr(dinfo), dinfo));
  }

  public pxcStatus SetDevice(PXCAudioSource.DeviceInfo dinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudioSource_SetDevice(swigCPtr, this, PXCAudioSource.DeviceInfo.getCPtr(dinfo), dinfo));
  }

  public float QueryVolume() {
    return realsenseJNI.PXCAudioSource_QueryVolume(swigCPtr, this);
  }

  public pxcStatus SetVolume(float volume) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudioSource_SetVolume(swigCPtr, this, volume));
  }

}
