/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4061;

import java.io.File;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mapstruct.ap.testutil.IssueKey;
import org.mapstruct.ap.testutil.ProcessorTest;
import org.mapstruct.ap.testutil.WithClasses;
import org.mapstruct.ap.testutil.WithJSpecify;
import org.mapstruct.ap.testutil.runner.GeneratedSource;

/**
 * Reproducer for https://github.com/mapstruct/mapstruct/issues/4061.
 *
 * @author Agustin Ranieri
 */
@IssueKey( "4061" )
@WithJSpecify
public class Issue4061Test {

    @RegisterExtension
    final GeneratedSource generatedSource = new GeneratedSource();

    @ProcessorTest
    @WithClasses( { NullMarkedMapper.class, Source1.class, Source2.class, Target.class } )
    public void shouldAnnotateNullMarkedMapper() {
        generatedSource.forMapper( NullMarkedMapper.class )
                .hasSameMapperContent(
                        new File("src/test/resources/fixtures/org/mapstruct/ap/test/bugs/_4061/NullMarkedMapperImpl.java")
                );
    }

    @ProcessorTest
    @WithClasses( { NullUnmarkedMapper.class, Source1.class, Source2.class, Target.class } )
    public void shouldAnnotateNullUnmarkedMapper() {
        generatedSource.forMapper( NullUnmarkedMapper.class )
                .hasSameMapperContent(
                        new File("src/test/resources/fixtures/org/mapstruct/ap/test/bugs/_4061/NullUnmarkedMapperImpl.java")
                );
    }
}
