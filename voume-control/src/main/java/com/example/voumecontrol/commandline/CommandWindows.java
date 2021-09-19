package com.example.voumecontrol.commandline;


import com.profesorfalken.jpowershell.PowerShell;

import java.io.IOException;

public  class CommandWindows {

    private final String VOLUME_UP = "powershell.exe $obj = new-object -com wscript.shell; $obj.SendKeys([char]175)";
    private final String VOLUME_DOWN = "powershell.exe $obj = new-object -com wscript.shell; $obj.SendKeys([char]174)";

    public void volumeUpOrDown(String command) throws IOException {

        if (command.equals("+")){
            sendCommand(VOLUME_UP);
        }else{
            sendCommand(VOLUME_DOWN);
        }

    }

    public void sendCommand(String command) throws IOException {
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        powerShellProcess.getOutputStream().close();
    }

}
