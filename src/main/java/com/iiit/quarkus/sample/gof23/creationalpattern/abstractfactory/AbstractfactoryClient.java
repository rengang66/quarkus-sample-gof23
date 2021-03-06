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
package com.iiit.quarkus.sample.gof23.creationalpattern.abstractfactory;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class AbstractfactoryClient implements QuarkusApplication {	
	
	@ConfigProperty(name = "gof23.creationalpattern.abstractfactory.title", defaultValue = "gof23")
	String title;
	
	@Inject
	CompanyA company1;

	@Override
	public int run(String... args) {	
		
		System.out.println("——————————————————" + title + "演示输出——————————————");		
		
		Computer computer1 = company1.bulidComputer("个人电脑");
		computer1.doUse();

		Computer computer2 = company1.bulidComputer("笔记本电脑");
		computer2.doUse();

		Telephone telephone1 = company1.bulidTelephone("座机电话");
		telephone1.doUse();

		Telephone telephone2 = company1.bulidTelephone("手机");
		telephone2.doUse();

		return 0;
	}

	public static void main(String... args) {
		Quarkus.run(AbstractfactoryClient.class, args);
	}
	
	
	

}
