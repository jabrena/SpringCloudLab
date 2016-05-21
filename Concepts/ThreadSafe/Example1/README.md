``` bash
threadsafe.properties

# THREADSAFE GLOBAL CONFIGURATION

# ThreadSafe License key.
licenseKey=XXX
projectName=Example1
sources=src/main/java
binaries=build/classes
outputDirectory=threadsafe-html

```
``` bash
INFO: Running Checker_ReusableObjectSync at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_UnsafeIteration at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_TryLock at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_GetCheckPut at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_UnsafeContent at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_UnreleasedLocks at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_Deadlock at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_ConsistentlyGuarded at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_InconsistentSync (fields) at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_InconsistentSync (arrays) at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_InconsistentSync (collections) at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_UnsafeRemoval at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_LockedBlocking at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_FieldLockOverwritten at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_UnsafeReplacement at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_ReadOnlyVolatile at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_BadCatches at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_GuardedBy at 2016-04-21 17:47:16 (UTC)
INFO: Running Checker_Deadlock at 2016-04-21 17:47:16 (UTC)
```

``` bash
java -jar ./threadsafe.jar \
    -c ./threadsafe.properties \
    -DbaseDirectory=/Users/jabrena/Documents/DATA/2015/RESEARCH/robotics/ev3dev/java/SpringCloudLab/Concepts/ThreadSafe/Example1
```
