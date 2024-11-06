package org.openapitools.codegen.languages;

import org.openapitools.codegen.*;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.parameters.Parameter;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApacheSeclangDocumentationCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    private final Logger LOGGER = LoggerFactory.getLogger(ApacheSeclangDocumentationCodegen.class);

    public CodegenType getTag() {
        return CodegenType.DOCUMENTATION;
    }

    public String getName() {
        return "apache-seclang";
    }

    public String getHelp() {
        return "Generates a apache-seclang documentation.";
    }

    public ApacheSeclangDocumentationCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "apache-seclang";
        modelTemplateFiles.put("model.mustache", ".zz");
        apiTemplateFiles.put("api.mustache", ".zz");
        embeddedTemplateDir = templateDir = "apache-seclang";
        apiPackage = "Apis";
        modelPackage = "Models";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }
}
