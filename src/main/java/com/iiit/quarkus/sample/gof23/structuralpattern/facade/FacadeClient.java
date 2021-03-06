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
package com.iiit.quarkus.sample.gof23.structuralpattern.facade;

import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;


public class FacadeClient implements QuarkusApplication {

	@ConfigProperty(name = "gof23.structuralpattern.facade.title", defaultValue = "gof23")
	String title;
	
	@Inject
	Facade facade ;
	
	@Override
	public int run(String... args) {
		
		System.out.println("——————————————————" + title + "演示输出——————————————");	
		
		// 向前台要求访客
		facade.Operate("visit");
		// 向前台提交邮品
		facade.Operate("post");
		// 领导过来视察
		facade.Operate("inspection");
		// 员工上班
		facade.Operate("doWork");
		// study是没有对应的工作接口
		facade.Operate("study");
		return 0;

	}
	
	public static void main(String... args) {
		Quarkus.run(FacadeClient.class, args);
	}

}
