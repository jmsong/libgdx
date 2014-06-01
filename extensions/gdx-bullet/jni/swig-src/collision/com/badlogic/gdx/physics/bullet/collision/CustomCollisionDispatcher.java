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

public class CustomCollisionDispatcher extends btCollisionDispatcher {
	private long swigCPtr;
	
	protected CustomCollisionDispatcher(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.CustomCollisionDispatcher_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new CustomCollisionDispatcher, normally you should not need this constructor it's intended for low-level usage. */
	public CustomCollisionDispatcher(long cPtr, boolean cMemoryOwn) {
		this("CustomCollisionDispatcher", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.CustomCollisionDispatcher_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(CustomCollisionDispatcher obj) {
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
				CollisionJNI.delete_CustomCollisionDispatcher(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.CustomCollisionDispatcher_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.CustomCollisionDispatcher_change_ownership(this, swigCPtr, true);
  }

  public CustomCollisionDispatcher(btCollisionConfiguration collisionConfiguration) {
    this(CollisionJNI.new_CustomCollisionDispatcher(btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
    CollisionJNI.CustomCollisionDispatcher_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean needsCollision(btCollisionObject body0, btCollisionObject body1) {
    return (getClass() == CustomCollisionDispatcher.class) ? CollisionJNI.CustomCollisionDispatcher_needsCollision(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1) : CollisionJNI.CustomCollisionDispatcher_needsCollisionSwigExplicitCustomCollisionDispatcher(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public boolean needsResponse(btCollisionObject body0, btCollisionObject body1) {
    return (getClass() == CustomCollisionDispatcher.class) ? CollisionJNI.CustomCollisionDispatcher_needsResponse(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1) : CollisionJNI.CustomCollisionDispatcher_needsResponseSwigExplicitCustomCollisionDispatcher(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

}
