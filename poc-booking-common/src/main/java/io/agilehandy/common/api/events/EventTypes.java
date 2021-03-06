/*
 * Copyright 2017 the original author or authors.
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


package io.agilehandy.common.api.events;

/**
 * @author Haytham Mohamed
 **/

public interface EventTypes {

	String UNKNOWN_EVENT = "UNKNOWN";

	String BOOKING_CREATED = "BOOKING_CREATED";
	String BOOKING_UPDATED = "BOOKING_UPDATED";
	String BOOKING_CANCELED = "BOOKING_CANCELED";
	String BOOKING_STATUS_CHANGED = "BOOKING_STATUS_CHANGED";

	String CARGO_ADDED = "CARGO_ADDED";
	String CARGO_ROUTE_ASSIGNED = "CARGO_ROUTE_ASSIGNED";
	String CARGO_UPDATED = "CARGO_UPDATED";
	String CARGO_CANCELED = "CARGO_CANCELED";


}
