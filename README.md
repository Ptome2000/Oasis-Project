# Oasis-Project


# Execution in console mode (in Windows):
    - Launch cmd from the location of runtime Engine (write cmd, in the path location)
    - Required Arguments:
        -runMode=console : Enable console mode
        -projectPath=<path> : Specify the project location (indluce .prj file). Must use the absolute path.
        -testSuitePath=<path> : Specify the test suite file (without extension .ts). Must use the relative path.
        -testSuiteCollection=<path> : Specify the test suite file (without extension .tsc). Must use the relative path.
        -browserType=<browser> : Specify the browser type used for test suite execution

    Easy use:
        To get the command to run on cmd, we can also use the "Generate Comand for console mode" in Katalon Studio and just paste it on the console

# Reports
    - For a organized report for each suite run, export the results in .html format

# Troubleshooting
    - For a more detailed view in logs, use the log.properties file on the Include -> config
