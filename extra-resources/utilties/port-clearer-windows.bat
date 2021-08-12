@ECHO OFF  

REM Prompt the User for port number
SET /P port=Enter Port #:
echo %port%

REM Loop through results of netstat, identify the last column
FOR /F "tokens=5" %%T IN ('netstat -ano ^| findstr %port% ') DO (
SET /A processID=%%T)

REM Terminate the process
echo ProcessId to kill = %processID%
taskkill /f /pid %processID%
PAUSE