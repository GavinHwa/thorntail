/**
 * Copyright 2015-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.jpa;

import org.wildfly.swarm.config.JPA;
import org.wildfly.swarm.spi.api.Fraction;
import org.wildfly.swarm.spi.api.annotations.MarshalDMR;
import org.wildfly.swarm.spi.api.annotations.WildFlyExtension;

/**
 * @author Ken Finnigan
 * @author Lance Ball
 */
@WildFlyExtension(module = "org.jboss.as.jpa")
@MarshalDMR
public class JPAFraction extends JPA<JPAFraction> implements Fraction<JPAFraction> {

    public static JPAFraction createDefaultFraction() {
        return new JPAFraction().applyDefaults();
    }

    public JPAFraction applyDefaults() {
        defaultExtendedPersistenceInheritance(DefaultExtendedPersistenceInheritance.DEEP);
        return this;
    }
}
