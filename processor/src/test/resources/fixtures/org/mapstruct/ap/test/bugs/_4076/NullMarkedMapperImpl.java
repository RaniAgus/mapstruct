/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4076;

import javax.annotation.processing.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "0000-00-00T00:00:00+0000",
    comments = "version: , compiler: javac, environment: Java 21"
)
@NullMarked
public class NullMarkedMapperImpl implements NullMarkedMapper {

    @Override
    public Target map(Source1 source1, @Nullable Source2 source2) {

        Long baz = null;
        if ( source2 != null ) {
            baz = source2.getBaz();
        }
        String foo = null;
        foo = source1.getFoo();
        boolean bar = false;
        bar = source1.isBar();

        Target target = new Target( foo, bar, baz );

        return target;
    }
}
