/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.build.gradle.internal.dsl;

import com.android.builder.model.AaptOptions
import org.gradle.api.tasks.Input

public class AaptOptionsImpl implements AaptOptions {

    @Input
    private String ignoreAssetsPattern

    @Input
    private List<String> noCompressList

    @Input
    private boolean useNewCruncher = false;

    @Input
    private boolean failOnMissingConfigEntry = false;

    public void setIgnoreAssetsPattern(String ignoreAssetsPattern) {
        this.ignoreAssetsPattern = ignoreAssetsPattern
    }

    @Override
    String getIgnoreAssets() {
        return ignoreAssetsPattern
    }

    public void setNoCompress(String noCompress) {
        noCompressList = Collections.singletonList(noCompress)
    }

    public void setNoCompress(String... noCompress) {
        noCompressList = Arrays.asList(noCompress)
    }

    @Override
    Collection<String> getNoCompress() {
        return noCompressList
    }

    public void useNewCruncher(boolean value) {
        useNewCruncher = value;
    }

    public void setUseNewCruncher(boolean value) {
        useNewCruncher = value;
    }

    public boolean getUseNewCruncher() {
        return useNewCruncher;
    }

    public void failOnMissingConfigEntry(boolean value) {
        failOnMissingConfigEntry = value;
    }

    public void setFailOnMissingConfigEntry(boolean value) {
        failOnMissingConfigEntry = value;
    }

    @Override
    public boolean getFailOnMissingConfigEntry() {
        return failOnMissingConfigEntry;
    }

    // -- DSL Methods. TODO remove once the instantiator does what I expect it to do.

    public void noCompress(String noCompress) {
        noCompressList = Collections.singletonList(noCompress)
    }

    public void noCompress(String... noCompress) {
        noCompressList = Arrays.asList(noCompress)
    }
}
