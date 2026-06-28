/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.NonNull;

public class Target {
    private final @NonNull Nested nested;

    public Target(@NonNull Nested nested) {
        this.nested = nested;
    }

    public @NonNull Nested getNested() {
        return nested;
    }

    public static class Nested {
        private final @NonNull String foo;

        public Nested(@NonNull String foo) {
            this.foo = foo;
        }

        public @NonNull String getFoo() {
            return foo;
        }
    }
}
