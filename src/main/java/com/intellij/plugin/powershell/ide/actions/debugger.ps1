$scriptPath = ".\script.ps1"
Set-PSBreakpoint -Script $scriptPath -Line 7 -Action { Get-PSCallStack }
. $scriptPath
