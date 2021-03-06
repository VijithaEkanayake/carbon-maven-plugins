/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.maven.p2.feature.generate;

import org.wso2.maven.p2.beans.CarbonArtifact;
import org.wso2.maven.p2.utils.BundleUtils;

/**
 * Bean class representing a Bundle object provided as an input param to FeatureGenMojo.
 *
 * @since 2.0.0
 */
public class Bundle extends CarbonArtifact {
    /**
     * Returns the OSGi content in a string format.
     * <p>
     * {symbolic name} : {bundle version}
     * </p>
     *
     * @return String
     */
    public String toOSGIString() {
        return getSymbolicName() + ":" + getBundleVersion();
    }

    /**
     * Returns the OSGi version of the bundle.
     *
     * @return String
     */
    public String getOSGIVersion() {
        return BundleUtils.getOSGIVersion(super.getVersion());
    }
}
