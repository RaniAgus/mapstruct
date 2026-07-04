/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.NonNull;

public class Source {

    private String value;

    @NonNull
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
