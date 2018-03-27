/*
 * Copyright (c) 2018 Outsource Cafe, Inc.
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

package com.javagen.schema.swift

import com.javagen.schema.common.PluralServiceNoop

/**
 * This class is only used for testing and development.
 *
 * @author Richard Easterling
 */
class SwiftGenMain
{
    SwiftGenMain()
    {
        super()
        schemaURL = new URL('file:../schema-gen-examples/wadl/src/main/resources/wadl.xsd')
        srcDir = new File('../schema-gen-examples/wadl/src/main/swift-gen')
        pluralService = new PluralServiceNoop()
        rootElements = ['application'] as Set
        //schemaURL = new URL('http://www.topografix.com/gpx/1/1/gpx.xsd')
        //schemaURL = new File('/Users/richard/dev/hs/hsf-data/hsf-1_1.xsd')
//		schemaURL = new File('../schema-gen-examples/swift-gpx/src/resources/gpx.xsd').toURI().toURL()
//		srcDir = new File('../schema-gen-examples/swift-gpx/src/swift-gen')
        //this.validateable = false
        //this.singleFile = false
        //this.packageName = 'com.hotspringsfinder.detail.model'
        //this.xmlPackageName = 'com.hotspringsfinder.detail.xml'
        //this.srcDir = new File('/Users/richard/dev/hs/sandbox/hsf-model2/src/main/java')
        //this.xmlMapper = true
//		this.rootTags = ['gpx', 'hotSpringsMetadata']
//		this.nsPrefix = 'p'
//		this.nsURL = 'http://www.hotspringsfinder.com/schema/meatadata/1/1'
//		this.schemaLocation = this.nsURL+' ../'+schemaURL+' '
//		this.defaultTextBodyProperty = 'note'
//		this.skipTags = ["facilities","services","photos"]
//		this.customTextPropertyNameForClass = ['Leg':'directions','Email':'address','Phone':'number']
//		//this.customElementPropertyName = ['cmt':'desc']
//		//def timeFormatter = 'new java.text.SimpleDateFormat("HH:mm:ss")'
//		//this.formatters = ['hours/close':timeFormatter, 'hours/open':timeFormatter]
//		this.customPluralMappings = ['hours':'hours'] //needed for irregular nouns: tooth->teeth, person->people
//		//enum handling
//		def enumCustomNames = ['primitive+':'PrimitivePlus','$':'Cheap','$$':'Moderate','$$$':'Pricy','$$$$':'Exclusive']
//		def unknownEnum = 'Unknown'
//		this.enumNameFunction = { text -> text.contains('?') ? unknownEnum : enumCustomNames[text] ?: GlobalFunctionsUtil.javaEnumName(text, false) }
////		def customEnumValues = ['???':'?', '??': '?']
//		this.enumValueFunction = { text -> text.contains('?') ? '?' : text }
    }

    static void main(String[] args) { new SwiftGenMain().gen() }

}
