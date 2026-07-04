/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._4081;

import org.jspecify.annotations.NonNull;

public class Target {

    private final Integer payload;

    public Target(@NonNull Integer payload) {
        this.payload = payload;
    }

    public Integer getPayload() {
        return payload;
    }
}
