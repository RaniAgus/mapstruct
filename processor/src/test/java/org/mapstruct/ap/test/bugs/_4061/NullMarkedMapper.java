/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4061;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
@NullMarked
public interface NullMarkedMapper {

    @Mapping(target = "foo", source = "source1.foo")
    @Mapping(target = "bar", source = "source1.bar")
    @Mapping(target = "baz", source = "source2.baz")
    Target map(Source1 source1, @Nullable Source2 source2);
}
