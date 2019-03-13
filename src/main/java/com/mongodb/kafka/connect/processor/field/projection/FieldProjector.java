/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Original Work: Apache License, Version 2.0, Copyright 2017 Hans-Peter Grahsl.
 */
package com.mongodb.kafka.connect.processor.field.projection;

import org.bson.BsonDocument;

import com.mongodb.kafka.connect.MongoSinkConnectorConfig;
import com.mongodb.kafka.connect.processor.PostProcessor;

public abstract class FieldProjector extends PostProcessor {

    static final String SINGLE_WILDCARD = "*";
    static final String DOUBLE_WILDCARD = "**";
    static final String SUB_FIELD_DOT_SEPARATOR = ".";

    public FieldProjector(final MongoSinkConnectorConfig config, final String collection) {
        super(config, collection);
    }

    protected abstract void doProjection(String field, BsonDocument doc);

}