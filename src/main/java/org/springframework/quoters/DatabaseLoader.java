/*
 * Copyright 2014-2018 the original author or authors.
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

package org.springframework.quoters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {

	@Bean
	CommandLineRunner init(QuoteRepository repository) {

		return args -> {
			repository.save(new Quote("Life is like a box of chocolates. You never know what you're gonna get."));
			repository.save(new Quote("My mama always said: ‘You’ve got to put the past behind you before you can move on.’"));
			repository.save(new Quote("Stupid is as stupid does."));
			repository.save(new Quote("Run, Forrest! Run!"));
			repository.save(new Quote("I’m not a smart man, but I know what love is."));
			repository.save(new Quote("Forrest, we’re like peas and carrots."));
			repository.save(new Quote("I had a destiny to fulfill, Mama said so."));
			repository.save(new Quote("Mama says they can’t find it, I can’t help them, I just can’t help them!"));
			repository.save(new Quote("I may not be a smart man, but I know what love is."));
			repository.save(new Quote("My mama always said: ‘You’ve got to put the past behind you before you can move on.’"));
			repository.save(new Quote("Life was like a box of chocolates, you never know what you’re gonna get."));
			repository.save(new Quote("It’s funny what a young man recollects, because I don’t really remember being born, I just remember the little things."));
		};
	}
}
