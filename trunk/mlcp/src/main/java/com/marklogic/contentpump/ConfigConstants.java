/*
 * Copyright 2003-2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.contentpump;

/**
 * Constants for configuration option names and values.
 * 
 * @author jchen
 *
 */
public interface ConfigConstants {
    // property names
    static final String HADOOP_HOME_ENV_NAME = "HADOOP_HOME";
    static final String CONTENTPUMP_HOME_PROPERTY_NAME = "CONTENTPUMP_HOME";
    static final String CONTENTPUMP_VERSION_PROPERTY_NAME = 
        "CONTENTPUMP_VERSION";
    static final String CONTENTPUMP_JAR_NAME = 
        "marklogic-contentpump-<VERSION>-SNAPSHOT.jar";
    
    // common
    static final String MODE = "mode";
    static final String MODE_DISTRIBUTED = "distributed";
    static final String MODE_LOCAL = "local";
    static final String HADOOP_HOME = "hadoop_home";    
    static final String THREAD_COUNT = "thread_count";
    static final String MAX_SPLIT_SIZE = "max_split_size";
    
    // command-specific
    static final String INPUT_FILE_PATH = "input_file_path";
    static final String INPUT_FILE_PATTERN = "input_file_pattern";
    static final String INPUT_RECORD_NAME = "input_record_name";
    static final String INPUT_RECORD_NAMESPACE = "input_record_namespace";
    static final String INPUT_METADATA_OPTIONAL = 
        "input_metadata_optional";
    static final String INPUT_TYPE = "input_type";
    static final String INPUT_TYPE_DEFAULT = "documents";
    static final String INPUT_COMPRESSED = "input_compressed";
    static final String INPUT_COMPRESSION_CODEC = "input_compression_codec";
    static final String INPUT_SEQUENCEFILE_KEY_CLASS = 
        "input_sequencefile_key_class";
    static final String INPUT_SEQUENCEFILE_VALUE_CLASS = 
        "input_sequencefile_value_class";
    static final String INPUT_SEQUENCEFILE_VALUE_TYPE =
        "input_sequencefile_value_type";
    static final String USERNAME = "username";
    static final String PASSWORD = "password";
    static final String HOST = "host";
    static final String PORT = "port";
    static final String OUTPUT_DIRECTORY = "output_directory";
    static final String OUTPUT_COLLECTIONS = "output_collections";
    static final String OUTPUT_PERMISSIONS = "output_permissions";
    static final String OUTPUT_QUALITY = "output_quality";
    static final String OUTPUT_CLEANDIR = "output_cleandir";
    static final String BATCH_SIZE = "batch_size";
    static final String TRANSACTION_SIZE = "transaction_size";
    static final String STREAMING = "streaming";
    static final String NAMESPACE = "namespace";
    static final String DOCUMENT_TYPE = "document_type";
    static final String OUTPUT_IDNAME = "output_idname";
    static final String OUTPUT_LANGUAGE = "output_language";
    static final String OUTPUT_URI_REPLACE = "output_uri_replace";
    static final String OUTPUT_URI_PREFIX = "output_uri_prefix";
    static final String OUTPUT_URI_SUFFIX = "output_uri_suffix";
    static final String OUTPUT_FILENAME_AS_COLLECTION = 
        "output_filename_as_collection";
    static final String XML_REPAIR_LEVEL = "xml_repair_level";
    static final String COPY_COLLECTIONS = "copy_collections";
    static final String COPY_PERMISSIONS = "copy_permissions";
    static final String COPY_PROPERTIES = "copy_properties";
    static final String COPY_QUALITY = "copy_quality";
    static final String DOCUMENT_FILTER = "document_filter";
    static final String DOCUMENT_NAMESPACE = "document_namespace";
    static final String OUTPUT_TYPE = "output_type";
    static final String OUTPUT_FILE_PATH = "output_file_path";
    static final String OUTPUT_COMPRESS = "compress";
    static final String OUTPUT_INDENTED = "indented";
    static final String INPUT_USERNAME = "input_username";
    static final String INPUT_PASSWORD = "input_password";
    static final String INPUT_HOST = "input_host";
    static final String INPUT_PORT = "input_port";
    static final String OUTPUT_USERNAME = "output_username";
    static final String OUTPUT_PASSWORD = "output_password";
    static final String OUTPUT_HOST = "output_host";
    static final String OUTPUT_PORT = "output_port";      
}
