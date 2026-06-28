/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class Source {
    private final @NonNull Nested nested;

    public Source(@NonNull Nested nested) {
        this.nested = nested;
    }

    public @NonNull Nested getNested() {
        return nested;
    }

    public static class Nested {
        private final @Nullable String foo;

        public Nested(@Nullable String foo) {
            this.foo = foo;
        }

        public @Nullable String getFoo() {
            return foo;
        }
    }
}
