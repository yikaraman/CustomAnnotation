
package com.ex.ann;

//Declares the annotation .
public @interface Version {
   int major();
   int minor() default 0;
   String date();
   VersionState state() default VersionState.ONE;

}
