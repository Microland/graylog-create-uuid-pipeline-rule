package com.uuid.plugins;

import com.fasterxml.uuid.Generators;
import org.graylog.plugins.pipelineprocessor.EvaluationContext;
import org.graylog.plugins.pipelineprocessor.ast.expressions.Expression;
import org.graylog.plugins.pipelineprocessor.ast.functions.Function;
import org.graylog.plugins.pipelineprocessor.ast.functions.FunctionArgs;
import org.graylog.plugins.pipelineprocessor.ast.functions.FunctionDescriptor;
import org.graylog.plugins.pipelineprocessor.ast.functions.ParameterDescriptor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * This is the plugin. Your class should implement one of the existing plugin
 * interfaces. (i.e. AlarmCallback, MessageInput, MessageOutput)
 */
public class GenerateUUIDFunction implements Function<UUID> {
    public static final String NAME = "create_uuid";
    private static final String PARAM = "string";
//    private Logger LOG = LoggerFactory.getLogger(this.getClass());

    private final ParameterDescriptor<String, String> valueParam = ParameterDescriptor
            .string(PARAM)
            .description("The string to calculate the length of. For example, passing 'foo' will return 3.")
            .build();

    @Override
    public Object preComputeConstantArgument(FunctionArgs functionArgs, String s, Expression expression) {
        return expression.evaluateUnsafe(EvaluationContext.emptyContext());
    }

    @Override
    public UUID evaluate(FunctionArgs functionArgs, EvaluationContext evaluationContext) {
//        String target = valueParam.required(functionArgs, evaluationContext);

//        if (target == null) {
//            return null;
//        }
        UUID uuid1 = Generators.timeBasedGenerator().generate();
        return uuid1;
    }

    @Override
    public FunctionDescriptor<UUID> descriptor() {
        return FunctionDescriptor.<UUID>builder()
                .name(NAME)
                .description("Generate UUID of a object")
                .params(valueParam)
                .returnType(UUID.class)
                .build();
    }
}
