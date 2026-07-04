/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.Nullable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface ErroneousIssue4081Mapper {

    @Mapping(target = "payload", source = "value", qualifiedByName = "mapValue")
    Target map(Source source);

    @Named("mapValue")
    default @Nullable Integer mapValue(String value) {
        if ( value.isEmpty() ) {
            return null;
        }
        return value.length();
    }
}
