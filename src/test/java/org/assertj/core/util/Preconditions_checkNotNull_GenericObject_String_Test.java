/*
 * Created on Apr 29, 2007
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2007-2012 the original author or authors.
 */
package org.assertj.core.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.test.ExpectedException.none;

import org.assertj.core.test.ExpectedException;
import org.junit.Rule;
import org.junit.Test;

/**
 * Tests for <code>{@link Preconditions#checkNotNull(Object, String)}</code>.
 * 
 * @author Christian Rösch
 */
public class Preconditions_checkNotNull_GenericObject_String_Test {
  private final static String CUSTOM_MESSAGE = "Wow, that's an error dude ..";

  @Rule
  public ExpectedException thrown = none();

  @Test
  public void should_throw_nullpointerexception_if_object_is_null() {
    thrown.expectNullPointerException(CUSTOM_MESSAGE);
    Object object = null;
    Preconditions.checkNotNull(object, CUSTOM_MESSAGE);
  }

  @Test
  public void should_return_object_if_it_is_not_null_nor_empty() {
    String object = "4711";
    String result = Preconditions.checkNotNull(object, CUSTOM_MESSAGE);

    assertThat(result).isEqualTo(object);
  }
}
