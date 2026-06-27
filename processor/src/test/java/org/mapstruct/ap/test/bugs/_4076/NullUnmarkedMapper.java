/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4076;

import org.jspecify.annotations.NonNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NullUnmarkedMapper {

    @Mapping(target = "foo", source = "source1.foo")
    @Mapping(target = "bar", source = "source1.bar")
    @Mapping(target = "baz", source = "source2.baz")
    Target map(@NonNull Source1 source1, Source2 source2);
}
