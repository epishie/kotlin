/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.lang.resolve.calls.context;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.psi.Call;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.calls.autocasts.DataFlowInfo;
import org.jetbrains.jet.lang.resolve.calls.model.DataFlowInfoForArgumentsImpl;
import org.jetbrains.jet.lang.resolve.calls.model.MutableDataFlowInfoForArguments;
import org.jetbrains.jet.lang.resolve.scopes.JetScope;
import org.jetbrains.jet.lang.types.JetType;

public abstract class CallResolutionContext<Context extends CallResolutionContext<Context>> extends ResolutionContext<Context> {
    public final Call call;
    public final CheckValueArgumentsMode checkArguments;
    public final MutableDataFlowInfoForArguments dataFlowInfoForArguments;

    protected CallResolutionContext(
            @NotNull BindingTrace trace,
            @NotNull JetScope scope,
            @NotNull Call call,
            @NotNull JetType expectedType,
            @NotNull DataFlowInfo dataFlowInfo,
            @NotNull ResolveMode resolveMode,
            @NotNull CheckValueArgumentsMode checkArguments,
            @NotNull ExpressionPosition expressionPosition,
            @NotNull ResolutionResultsCache resolutionResultsCache
    ) {
        super(trace, scope, expectedType, dataFlowInfo, expressionPosition, resolveMode, resolutionResultsCache);
        this.call = call;
        this.checkArguments = checkArguments;
        if (checkArguments == CheckValueArgumentsMode.ENABLED) {
            dataFlowInfoForArguments = new DataFlowInfoForArgumentsImpl(call);
        }
        else {
            dataFlowInfoForArguments = MutableDataFlowInfoForArguments.WITHOUT_ARGUMENTS_CHECK;
        }
    }

    public BasicCallResolutionContext toBasic() {
        return BasicCallResolutionContext.create(this, call, checkArguments);
    }
}
