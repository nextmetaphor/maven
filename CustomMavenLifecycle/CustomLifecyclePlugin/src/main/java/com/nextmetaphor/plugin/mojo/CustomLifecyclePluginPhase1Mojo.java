package com.nextmetaphor.plugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
* Forks a zip lifecycle.
* @goal phase1Goal
*/
public class CustomLifecyclePluginPhase1Mojo extends AbstractMojo {
  public void execute() throws MojoExecutionException {
    getLog().info("Doing Phase 1 stuff. Oh yeah baby.");
  }
}
