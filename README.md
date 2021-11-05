# testapp-dsp-bundling-experiment
Aanother JavaPackager test app.

This experiment builds a native app for Windows, Mac Os and Linux from the same platform:

## Steps

1. Download and extract JDKs for each platform in `${basedir}/jdks`.

	- Extract [AdoptOpenJDK 11 for Windows](https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_windows_hotspot_11.0.13_8.zip) in `${basedir}/jdks/win`.
	- Extract [AdoptOpenJDK 11 for Mac OS](https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_mac_hotspot_11.0.13_8.tar.gz) in `${basedir}/jdks/mac`. 
	- Extract [AdoptOpenJDK 11 for GNU/Linux](https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_linux_hotspot_11.0.13_8.tar.gz) in `${basedir}/jdks/linux`. 

	Remaining as follows:

	```
	${basedir}
	└───jdks
	    ├───linux
	    ├───mac
	    └───win
	```

2. And build for each platform:

	```bash
	mvn clean
	mvn -Djavafx.platform=linux package
	mvn -Djavafx.platform=mac package
	mvn -Djavafx.platform=win package
	```

	Thus generating the following artifacts in `${project.build.directory}` (`target` by default):

	```
	${basedir}
	└───target
	       TestApp-1.0.0_SNAPSHOT-linux.tar.gz
	       TestApp-1.0.0_SNAPSHOT-mac.tar.gz
	       TestApp-1.0.0_SNAPSHOT-windows.zip
	       TestApp_1.0.0_SNAPSHOT.deb
	       TestApp_1.0.0_SNAPSHOT.exe
	       TestApp_1.0.0_SNAPSHOT.rpm
	```

	> :warning: The above example is running the build from Windows!

