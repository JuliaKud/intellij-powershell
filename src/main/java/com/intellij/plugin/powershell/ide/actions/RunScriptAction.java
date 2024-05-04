package com.intellij.plugin.powershell.ide.actions;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunScriptAction extends AnAction {

  private static final Logger LOG = Logger.getInstance(RunScriptAction.class);

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    String scriptPath = "debugger.ps1";
    String result;
    try {
      result = executeScript(scriptPath);
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
    LOG.info("Script result: " + result);
  }

  private String executeScript(String scriptPath) throws IOException {
    ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe", "-File", scriptPath);
    Process process = processBuilder.start();
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

    String line;
    StringBuilder resultBuilder = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      resultBuilder.append(line);
    }

    return resultBuilder.toString();
  }
}
