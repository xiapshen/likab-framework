/**
 * Copyright 2017-2020.
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
package org.likabframework.registry.zookeeper;

import org.likabframework.registry.support.ZookeeperClient;

/**
 * ClassName:ZookeeperBaseRegistry
 * @author sxp
 * @date:2017年4月16日 下午1:41:20
 */
public abstract class ZookeeperBaseRegistry {
	
	private ZookeeperClient client;
	
	/**
	 * connect
	 * ZookeeperClient
	 */
	protected ZookeeperClient connect(String serverAddress) {
		client = new ZookeeperClient(serverAddress);
		return client;
	}
	
	protected void createNode() {
		
	}

}
