/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4076;

public final class Source1 {
    private final String foo;
    private final boolean bar;

    public Source1(String foo, boolean bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public boolean isBar() {
        return bar;
    }

}
