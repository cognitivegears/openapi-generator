package org.openapitools.codegen.apache.seclang;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.ApacheSeclangDocumentationCodegen;
import org.openapitools.codegen.options.ApacheSeclangDocumentationCodegenOptionsProvider;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApacheSeclangDocumentationCodegenOptionsTest extends AbstractOptionsTest {
    private ApacheSeclangDocumentationCodegen codegen = mock(ApacheSeclangDocumentationCodegen.class, mockSettings);

    public ApacheSeclangDocumentationCodegenOptionsTest() {
        super(new ApacheSeclangDocumentationCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void verifyOptions() {
        // TODO: Complete options using Mockito
        // verify(codegen).someMethod(arguments)
    }
}

