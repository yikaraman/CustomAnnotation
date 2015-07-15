
package com.ex.ann;

public class MasterMain {

   public static void main(String[] args) {
      String test = "17.12.5";
      String[] versionDataStrArr = test.split("\\.");

      int majorVersion = Integer.parseInt(versionDataStrArr[0]);
      int minorVersion = Integer.parseInt(versionDataStrArr[1]);
      int maintenanceVersion = Integer.parseInt(versionDataStrArr[2]);

      System.out.println("majorVersion " + majorVersion + "\n" + "minorVersion " + minorVersion + "\n" + "maintenanceVersion " + maintenanceVersion);

   }
   
   @Version(date = "", major = 0)
   public void getVerison(){
      
   }

}
