/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4076;

import org.jspecify.annotations.Nullable;

public final class Target {
    private final String foo;
    private final boolean bar;
    private final @Nullable Long baz;

    public Target(String foo, boolean bar, @Nullable Long baz) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
    }

    public String getFoo() {
        return foo;
    }

    public boolean getBar() {
        return bar;
    }

    public @Nullable Long getBaz() {
        return baz;
    }

}
