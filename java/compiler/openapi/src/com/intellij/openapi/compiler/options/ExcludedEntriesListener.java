/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.compiler.options;

import com.intellij.util.messages.Topic;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface ExcludedEntriesListener {
  Topic<ExcludedEntriesListener> TOPIC = Topic.create("Compiler's excluded entries modification notification", ExcludedEntriesListener.class);

  default void onEntryAdded(@NotNull ExcludeEntryDescription description) {}

  default void onEntryRemoved(@NotNull ExcludeEntryDescription description) {}
}