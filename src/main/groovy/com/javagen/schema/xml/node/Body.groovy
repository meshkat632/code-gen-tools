/*
 * Copyright (c) 2017 Outsource Cafe, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.javagen.schema.xml.node

/**
 * A Body element can be present in SimpleType and CompextType. It presents a challenge when mapping because it has
 * no name and may be of mixed content (text intermixed with child elements).
 *
 * @author Richard Easterling
 */
class Body extends Value
{
    /** can be a SimpleType or ComplexType */
    SimpleType parent
    /** can be an Element or Any */
    Element element
    @Override TextOnlyType getType() { super.type ?: element?.type }
    boolean mixedContent = false
}
