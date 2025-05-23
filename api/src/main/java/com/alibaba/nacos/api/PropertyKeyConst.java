/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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

package com.alibaba.nacos.api;

/**
 * Property Key Const.
 *
 * @author Nacos
 */
public class PropertyKeyConst {
    
    public static final String IS_USE_CLOUD_NAMESPACE_PARSING = "isUseCloudNamespaceParsing";
    
    public static final String IS_USE_ENDPOINT_PARSING_RULE = "isUseEndpointParsingRule";
    
    public static final String ENDPOINT = "endpoint";
    
    public static final String ENDPOINT_QUERY_PARAMS = "endpointQueryParams";
    
    public static final String ENDPOINT_PORT = "endpointPort";
    
    public static final String ENDPOINT_CONTEXT_PATH = "endpointContextPath";
    
    public static final String ENDPOINT_CLUSTER_NAME = "endpointClusterName";
    
    public static final String ENDPOINT_REFRESH_INTERVAL_SECONDS = "endpointRefreshIntervalSeconds";
    
    @Deprecated
    public static final String SERVER_NAME = "serverName";
    
    public static final String NAMESPACE = "namespace";
    
    public static final String USERNAME = "username";
    
    public static final String PASSWORD = "password";
    
    public static final String ACCESS_KEY = "accessKey";
    
    public static final String SECRET_KEY = "secretKey";
    
    public static final String RAM_ROLE_NAME = "ramRoleName";
    
    public static final String SERVER_ADDR = "serverAddr";
    
    public static final String CONTEXT_PATH = "contextPath";
    
    /**
     * Please use {@link #ENDPOINT_CLUSTER_NAME} replaced.
     */
    @Deprecated
    public static final String CLUSTER_NAME = "clusterName";
    
    /**
     * Default is {@code "false"}, if true, and without {@link #ENDPOINT_CLUSTER_NAME}, use {@link #CLUSTER_NAME} to set
     * endpoint cluster name.
     */
    @Deprecated
    public static final String IS_ADAPT_CLUSTER_NAME_USAGE = "isAdaptClusterNameUsage";
    
    public static final String ENCODE = "encode";
    
    public static final String CONFIG_LONG_POLL_TIMEOUT = "configLongPollTimeout";
    
    public static final String CONFIG_RETRY_TIME = "configRetryTime";
    
    public static final String CONFIG_REQUEST_TIMEOUT = "configRequestTimeout";
    
    public static final String CLIENT_WORKER_MAX_THREAD_COUNT = "clientWorkerMaxThreadCount";
    
    public static final String CLIENT_WORKER_THREAD_COUNT = "clientWorkerThreadCount";
    
    public static final String MAX_RETRY = "maxRetry";
    
    public static final String ENABLE_REMOTE_SYNC_CONFIG = "enableRemoteSyncConfig";
    
    public static final String NAMING_LOAD_CACHE_AT_START = "namingLoadCacheAtStart";
    
    public static final String NAMING_CACHE_REGISTRY_DIR = "namingCacheRegistryDir";
    
    public static final String NAMING_CLIENT_BEAT_THREAD_COUNT = "namingClientBeatThreadCount";
    
    public static final String NAMING_POLLING_MAX_THREAD_COUNT = "namingPollingMaxThreadCount";
    
    public static final String NAMING_POLLING_THREAD_COUNT = "namingPollingThreadCount";
    
    public static final String NAMING_REQUEST_DOMAIN_RETRY_COUNT = "namingRequestDomainMaxRetryCount";
    
    public static final String NAMING_PUSH_EMPTY_PROTECTION = "namingPushEmptyProtection";
    
    public static final String NAMING_ASYNC_QUERY_SUBSCRIBE_SERVICE = "namingAsyncQuerySubscribeService";
    
    public static final String REDO_DELAY_TIME = "redoDelayTime";
    
    public static final String REDO_DELAY_THREAD_COUNT = "redoDelayThreadCount";
    
    public static final String SIGNATURE_REGION_ID = "signatureRegionId";
    
    public static final String LOG_ALL_PROPERTIES = "logAllProperties";
    
    /**
     * Since 2.3.3, For some situation like java agent using nacos-client which can't use env ram info.
     */
    public static final String IS_USE_RAM_INFO_PARSING = "isUseRamInfoParsing";
    
    /**
     * Get the key value of some variable value from the system property.
     */
    public static class SystemEnv {
        
        public static final String ALIBABA_ALIWARE_ENDPOINT_PORT = "ALIBABA_ALIWARE_ENDPOINT_PORT";
        
        public static final String ALIBABA_ALIWARE_ENDPOINT_CONTEXT_PATH = "ALIBABA_ALIWARE_ENDPOINT_CONTEXT_PATH";
        
        public static final String ALIBABA_ALIWARE_NAMESPACE = "ALIBABA_ALIWARE_NAMESPACE";
        
        public static final String ALIBABA_ALIWARE_ENDPOINT_URL = "ALIBABA_ALIWARE_ENDPOINT_URL";
    }
    
    /**
     * Client Metric Switch.
     */
    public static final String ENABLE_CLIENT_METRICS = "enableClientMetrics";
    
}