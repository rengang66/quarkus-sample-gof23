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
package com.iiit.quarkus.sample.gof23.creationalpattern.factorymethod;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CompanyA implements Company{
	
	public Product bulidProduct(String Parameter){
		if (Parameter.equals("A")) return new ProductA();
		else if  (Parameter.equals("B")) return new ProductB();
		else return null;
		
	}

}
