/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.mapstruct.Mapper;

@Mapper
@NullMarked
public interface ErroneousIssue4081Mapper {
    Target map(Source source);

    default Target.@Nullable Nested mapNested(Source.Nested source) {
        if ( source.getFoo() == null ) {
            return null;
        }
        return new Target.Nested( source.getFoo() );
    }
}
