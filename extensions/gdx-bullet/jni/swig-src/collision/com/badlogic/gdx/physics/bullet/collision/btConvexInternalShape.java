/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConvexInternalShape extends btConvexShape {
	private long swigCPtr;
	
	protected btConvexInternalShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexInternalShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexInternalShape, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexInternalShape(long cPtr, boolean cMemoryOwn) {
		this("btConvexInternalShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexInternalShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexInternalShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btConvexInternalShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public Vector3 getImplicitShapeDimensions() {
	return CollisionJNI.btConvexInternalShape_getImplicitShapeDimensions(swigCPtr, this);
}

  public void setImplicitShapeDimensions(Vector3 dimensions) {
    CollisionJNI.btConvexInternalShape_setImplicitShapeDimensions(swigCPtr, this, dimensions);
  }

  public void setSafeMargin(float minDimension, float defaultMarginMultiplier) {
    CollisionJNI.btConvexInternalShape_setSafeMargin__SWIG_0(swigCPtr, this, minDimension, defaultMarginMultiplier);
  }

  public void setSafeMargin(float minDimension) {
    CollisionJNI.btConvexInternalShape_setSafeMargin__SWIG_1(swigCPtr, this, minDimension);
  }

  public void setSafeMargin(Vector3 halfExtents, float defaultMarginMultiplier) {
    CollisionJNI.btConvexInternalShape_setSafeMargin__SWIG_2(swigCPtr, this, halfExtents, defaultMarginMultiplier);
  }

  public void setSafeMargin(Vector3 halfExtents) {
    CollisionJNI.btConvexInternalShape_setSafeMargin__SWIG_3(swigCPtr, this, halfExtents);
  }

  public Vector3 getLocalScalingNV() {
	return CollisionJNI.btConvexInternalShape_getLocalScalingNV(swigCPtr, this);
}

  public float getMarginNV() {
    return CollisionJNI.btConvexInternalShape_getMarginNV(swigCPtr, this);
  }

}
