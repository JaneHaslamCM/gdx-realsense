/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXC3DScan extends PXCBase {
  private long swigCPtr;

  protected PXC3DScan(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXC3DScan_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXC3DScan obj) {
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

  public PXC3DScan.Mode QueryMode() {
    return PXC3DScan.Mode.swigToEnum(realsenseJNI.PXC3DScan_QueryMode(swigCPtr, this));
  }

  public pxcStatus SetMode(PXC3DScan.Mode in_mode) {
    return pxcStatus.swigToEnum(realsenseJNI.PXC3DScan_SetMode(swigCPtr, this, in_mode.swigValue()));
  }

  public PXCImage AcquirePreviewImage() {
    long cPtr = realsenseJNI.PXC3DScan_AcquirePreviewImage(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCImage(cPtr, false);
  }

  public pxcStatus Reconstruct(PXC3DScan.FileFormat in_type, SWIGTYPE_p_wchar_t in_filename) {
    return pxcStatus.swigToEnum(realsenseJNI.PXC3DScan_Reconstruct(swigCPtr, this, in_type.swigValue(), SWIGTYPE_p_wchar_t.getCPtr(in_filename)));
  }

  public static SWIGTYPE_p_wchar_t FileFormatToString(PXC3DScan.FileFormat format) {
    long cPtr = realsenseJNI.PXC3DScan_FileFormatToString(format.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public final static class Mode {
    public final static PXC3DScan.Mode TARGETING = new PXC3DScan.Mode("TARGETING");
    public final static PXC3DScan.Mode SCANNING = new PXC3DScan.Mode("SCANNING");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Mode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Mode.class + " with value " + swigValue);
    }

    private Mode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Mode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Mode(String swigName, Mode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Mode[] swigValues = { TARGETING, SCANNING };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class FileFormat {
    public final static PXC3DScan.FileFormat OBJ = new PXC3DScan.FileFormat("OBJ");
    public final static PXC3DScan.FileFormat PLY = new PXC3DScan.FileFormat("PLY");
    public final static PXC3DScan.FileFormat STL = new PXC3DScan.FileFormat("STL");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static FileFormat swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + FileFormat.class + " with value " + swigValue);
    }

    private FileFormat(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private FileFormat(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private FileFormat(String swigName, FileFormat swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static FileFormat[] swigValues = { OBJ, PLY, STL };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
