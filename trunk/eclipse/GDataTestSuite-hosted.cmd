@java -Dgwt.args="-out www-test" -Xmx256M -cp "%~dp0\src;%~dp0\test;%~dp0\war\WEB-INF\classes;C:\Program Files\Eclipse\Eclipse Ganymede\plugins\org.junit_3.8.2.v20080602-1318\junit.jar;C:/Program Files/Eclipse/Eclipse Ganymede/plugins/com.google.gwt.eclipse.sdkbundle.win32_1.6.4.v200904062334/gwt-windows-1.6.4/gwt-user.jar;C:/Program Files/Eclipse/Eclipse Ganymede/plugins/com.google.gwt.eclipse.sdkbundle.win32_1.6.4.v200904062334/gwt-windows-1.6.4/gwt-dev-windows.jar" junit.textui.TestRunner com.google.gwt.gdata.GDataTestSuite %*
