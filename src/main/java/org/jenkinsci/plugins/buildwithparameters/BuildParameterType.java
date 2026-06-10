package org.jenkinsci.plugins.buildwithparameters;

/**
 * Type of a build parameter.
 *
 * @author Miroslav Cupak (mirocupak@gmail.com)
 * @version 1.0
 */
public enum BuildParameterType {

    STRING, PASSWORD, TEXT, BOOLEAN, CHOICE,
    /**
     * FILE - File upload parameter. Files are stored in the build's workspace after upload.
     * Note: File parameters are not cached/pre-filled in the form as the actual files
     * are temporary and stored in the build directory.
     * @see hudson.model.FileParameterDefinition
     */
    FILE
}
