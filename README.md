&nbsp;&nbsp;&nbsp;&nbsp;[![Download](https://api.bintray.com/packages/niranjan94/maven/Ln-AndroidLoggingSimplified/images/download.svg)](https://bintray.com/niranjan94/maven/Ln-AndroidLoggingSimplified/_latestVersion) [![StyleCI](https://styleci.io/repos/35885989/shield)](https://styleci.io/repos/35885989)<br>
![Ln Logo](https://raw.githubusercontent.com/niranjan94/ln/master/icons/icon144x144.png)
### Ln - Android Logging Simplified
**Ln** is a simple wrapper for Android's default Log implementation (`android.util.Log`). It is derived from RoboGuice's internal logging utility.

###### Including it in your project
make sure you're using jcenter as your central repository and just add the below line to the ```dependencies``` section of your module's ```build.gradle``` file.

	compile 'com.niranjan.ln:ln:+'
    
###### Usage
> The usage is the same as [RoboGuice's wrapper](https://github.com/roboguice/roboguice/wiki/Logging-via-Ln).

RoboGuice's Ln logger is similar to Log, but has the following advantages:

* Debug and verbose logging are automatically disabled for release builds.
* Your app name, file and line of the log message, time stamp, thread, and other useful information is automatically logged for you. (Some of this information is disabled for release builds to improve performance).
* Performance of disabled logging is faster than Log due to the use of the varargs. Since your most expensive logging will often be debug or verbose logging, this can lead to a minor performance win.
* You can override where the logs are written to and the format of the logging.

###### Examples

	Ln.v("hello there");
	Ln.d("%s %s", "hello", "there");
    Ln.e( exception, "Error during some operation");  
    Ln.w( exception, "Error during %s operation", "some other");
    
For all avaliable methods, refer to [Ln.java](https://github.com/niranjan94/ln/blob/master/ln/src/main/java/com/onemarker/ln/logger/Ln.java).

###### Common Pitfalls when using Ln

Ln's syntax is slightly different than Log's. Be aware of the following:

* Make sure you put the exception FIRST in the call. A common mistake is to place it last as is the android.util.Log convention, but then it will get treated as varargs parameter.
* vararg parameters are not appended to the log message! You must insert them into the log message using %s or another similar format parameter. If you forget, the parameter will be dropped.

###### License and Credits

This library is entirely based upon [Roboguice's Ln Implementation](https://github.com/roboguice/roboguice/blob/master/roboguice/src/main/java/roboguice/util/Ln.java). And is licenced under Apache 2.0 License.

    Copyright 2009-2014 roboguice committers

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
