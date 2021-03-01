/*
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
package com.iiit.quarkus.sample.gof23.structuralpattern.composite;

public class AbstractOrganization {
	
	protected String organizationName;
	protected String organizationType;

	
	public void add(AbstractOrganization organization){};
	public void remove(AbstractOrganization organization){};
	public void showOrganizationStructure(String parentName){}
	
	public AbstractOrganization(){}
	
	public AbstractOrganization(String name){organizationName = name;}	
	
	public void addName (String name)
	{
		this.organizationName = name;
	}
	
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}


}